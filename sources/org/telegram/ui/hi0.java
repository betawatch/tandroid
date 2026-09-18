package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class hi0 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final org.telegram.ui.Components.i9 d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final int f;
    public final boolean h;
    public final org.telegram.ui.Components.t00 n;
    public boolean r;
    public fc1 s;

    public hi0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i10;
        boolean z10 = messageObject.isRoundVideo() || messageObject.isVoice();
        this.h = z10;
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.n = t00Var;
        t00Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.i6, -1);
        t00Var.setViewType(13);
        t00Var.setIsSingleCell(false);
        addView(t00Var, w7.x5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(k5Var, w7.x5.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context, false);
        this.d = i9Var;
        i9Var.setStyle(11);
        i9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(i9Var, w7.x5.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.x5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z10 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        i9Var.setAlpha(0.0f);
        k5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new ai.j8(this, peer != null ? peer.user_id : 0L, i10, chat));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.ml0 a() {
        fc1 fc1Var = this.s;
        if (fc1Var != null) {
            return fc1Var;
        }
        fc1 fc1Var2 = new fc1(getContext(), 10, null);
        this.s = fc1Var2;
        getContext();
        fc1Var2.setLayoutManager(new s4.c0());
        this.s.i(new ci.r1(this, 5));
        this.s.setAdapter(new gg.n0(this, 3));
        return this.s;
    }

    public final void b() {
        org.telegram.ui.Components.i9 i9Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i10 = 0;
        while (true) {
            i9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f;
            if (i10 < size) {
                i9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                i9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            i9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            i9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            i9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        k5Var.setRightPadding(dp);
        i9Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            k5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            k5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            k5Var.l(LocaleController.formatPluralString(this.h ? "MessagePlayed" : "MessageSeen", arrayList2.size(), new Object[0]), false);
        }
        k5Var.animate().alpha(1.0f).setDuration(220L).start();
        i9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.t00 t00Var = this.n;
        t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.aa(t00Var)).start();
        fc1 fc1Var = this.s;
        if (fc1Var != null) {
            fc1Var.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        org.telegram.ui.Components.t00 t00Var = this.n;
        boolean z10 = t00Var.getVisibility() == 0;
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        k5Var.setVisibility(8);
        if (z10) {
            t00Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            t00Var.getLayoutParams().width = getMeasuredWidth();
            t00Var.setVisibility(0);
        }
        k5Var.setVisibility(0);
        k5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.r = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }
}
