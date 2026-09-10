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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gi0 extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final org.telegram.ui.Components.j9 d;
    public final org.telegram.ui.ActionBar.l5 e;
    public final int f;
    public final boolean h;
    public final org.telegram.ui.Components.a10 n;
    public boolean r;
    public ic1 s;

    public gi0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i10;
        boolean z10 = messageObject.isRoundVideo() || messageObject.isVoice();
        this.h = z10;
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context, null);
        this.n = a10Var;
        a10Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.i6, -1);
        a10Var.setViewType(13);
        a10Var.setIsSingleCell(false);
        addView(a10Var, w7.a6.c(-1.0f, -2));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.e = l5Var;
        l5Var.setTextSize(16);
        l5Var.setEllipsizeByGradient(true);
        l5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(l5Var, w7.a6.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(context, false);
        this.d = j9Var;
        j9Var.setStyle(11);
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(j9Var, w7.a6.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.a6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z10 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        j9Var.setAlpha(0.0f);
        l5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new org.telegram.messenger.u0(this, peer != null ? peer.user_id : 0L, i10, chat));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.vl0 a() {
        ic1 ic1Var = this.s;
        if (ic1Var != null) {
            return ic1Var;
        }
        ic1 ic1Var2 = new ic1(getContext(), 9, null);
        this.s = ic1Var2;
        getContext();
        ic1Var2.setLayoutManager(new s4.c0());
        this.s.i(new bi.z1(this, 5));
        this.s.setAdapter(new fg.n0(this, 3));
        return this.s;
    }

    public final void b() {
        org.telegram.ui.Components.j9 j9Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i10 = 0;
        while (true) {
            j9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f;
            if (i10 < size) {
                j9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                j9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            j9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            j9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            j9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.l5 l5Var = this.e;
        l5Var.setRightPadding(dp);
        j9Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            l5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            l5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            l5Var.l(LocaleController.formatPluralString(this.h ? "MessagePlayed" : "MessageSeen", arrayList2.size(), new Object[0]), false);
        }
        l5Var.animate().alpha(1.0f).setDuration(220L).start();
        j9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.a10 a10Var = this.n;
        a10Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.yo(a10Var)).start();
        ic1 ic1Var = this.s;
        if (ic1Var != null) {
            ic1Var.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        org.telegram.ui.Components.a10 a10Var = this.n;
        boolean z10 = a10Var.getVisibility() == 0;
        org.telegram.ui.ActionBar.l5 l5Var = this.e;
        l5Var.setVisibility(8);
        if (z10) {
            a10Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            a10Var.getLayoutParams().width = getMeasuredWidth();
            a10Var.setVisibility(0);
        }
        l5Var.setVisibility(0);
        l5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
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
