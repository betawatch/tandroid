// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c39 extends FrameLayout {
    public final tk4 a;
    public final TextView b;
    public final jc0 c;
    public final ImageView d;
    public final de0 e;
    public final int f;
    public boolean h;
    public final ArrayList n;
    public final ArrayList r;
    public final r47 s;
    public int w;
    public pt2 x;

    public c39(Context context, int i, r47 r47Var) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.f = i;
        this.s = r47Var;
        tk4 tk4Var = new tk4(context, null);
        this.a = tk4Var;
        tk4Var.e(aob.G8, aob.i6, -1);
        tk4Var.setViewType(13);
        tk4Var.setIsSingleCell(false);
        addView(tk4Var, tre.c(-1.0f, -2));
        TextView textView = new TextView(context);
        this.b = textView;
        yob.X(textView, aob.E8, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, tre.i(-2.0f, -2.0f, 8388627, 40.0f, 0.0f, 62.0f, 0.0f));
        jc0 jc0Var = new jc0(context, false);
        this.c = jc0Var;
        jc0Var.setStyle(11);
        jc0Var.setAvatarsTextSize(hl.L(22.0f));
        addView(jc0Var, tre.i(56.0f, -1.0f, 8388629, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        addView(imageView, tre.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(R.drawable.msg_reactions).mutate();
        yob.x(this, mutate, aob.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        imageView.setVisibility(8);
        de0 de0Var = new de0(context);
        this.e = de0Var;
        addView(de0Var, tre.i(24.0f, 24.0f, 8388627, 11.0f, 0.0f, 0.0f, 0.0f));
        textView.setAlpha(0.0f);
        jc0Var.setAlpha(0.0f);
        setBackground(aob.L0(false));
    }

    public final void a() {
        int i = this.f;
        uc7 s1 = uc7.s1(i);
        TLRPC.TL_messages_getMessageReactionsList tL_messages_getMessageReactionsList = new TLRPC.TL_messages_getMessageReactionsList();
        r47 r47Var = this.s;
        tL_messages_getMessageReactionsList.peer = s1.j1(r47.B0(r47Var.k));
        tL_messages_getMessageReactionsList.id = r47Var.e1();
        tL_messages_getMessageReactionsList.limit = 3;
        tL_messages_getMessageReactionsList.reaction = null;
        tL_messages_getMessageReactionsList.offset = null;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReactionsList, new w15(this, (byte) 24), 64);
    }

    public List<b39> getSeenUsers() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.f;
        uc7 s1 = uc7.s1(i);
        r47 r47Var = this.s;
        TLRPC.Chat M0 = s1.M0(Long.valueOf(r47Var.x0()));
        TLRPC.ChatFull N0 = s1.N0(r47Var.x0());
        if (M0 == null || !r47Var.O3() || !r47Var.p4() || r47Var.Y2() || r47Var.n4() || r47Var.m4() || r47Var.k.media_unread || r47Var.E4() || ConnectionsManager.getInstance(i).getCurrentTime() - r47Var.k.date >= 604800 || ((!xc2.n0(M0) && xc2.T(M0)) || N0 == null || N0.participants_count > uc7.s1(i).k4.V0.f() || (r47Var.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) {
            a();
            return;
        }
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = r47Var.e1();
        tL_messages_getMessageReadParticipants.peer = uc7.s1(i).j1(r47.B0(r47Var.k));
        TLRPC.Peer peer = r47Var.k.from_id;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getMessageReadParticipants, new p87((Object) this, peer != null ? peer.user_id : 0L, (Object) M0, (byte) 14), 64);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.w;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30);
        }
        tk4 tk4Var = this.a;
        if (tk4Var.getVisibility() != 0) {
            super.onMeasure(i, i2);
            return;
        }
        this.h = true;
        tk4Var.setVisibility(8);
        super.onMeasure(i, i2);
        tk4Var.getLayoutParams().width = getMeasuredWidth();
        tk4Var.setVisibility(0);
        this.h = false;
        super.onMeasure(i, i2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.h) {
            return;
        }
        super.requestLayout();
    }

    public void setSeenCallback(pt2 pt2Var) {
        this.x = pt2Var;
    }
}
