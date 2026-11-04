package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class df0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final org.telegram.ui.Components.x8 d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final int f;
    public final boolean h;
    public final org.telegram.ui.Components.iz n;
    public boolean r;
    public u51 s;
    public int w;

    public df0(Context context, int i3, org.telegram.messenger.zi ziVar, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i3;
        boolean z10 = ziVar.i4() || org.telegram.messenger.zi.S4(ziVar.k);
        this.h = z10;
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        this.n = izVar;
        izVar.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.i6, -1);
        izVar.setViewType(13);
        izVar.setIsSingleCell(false);
        addView(izVar, b8.mf.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(k5Var, b8.mf.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.x8 x8Var = new org.telegram.ui.Components.x8(context, false);
        this.d = x8Var;
        x8Var.setStyle(11);
        x8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(x8Var, b8.mf.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = ziVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.hp.s1(i3).j1(org.telegram.messenger.zi.B0(ziVar.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, b8.mf.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z10 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        x8Var.setAlpha(0.0f);
        k5Var.setAlpha(0.0f);
        TLRPC.Peer peer = ziVar.k.from_id;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getMessageReadParticipants, new ci.x(this, peer != null ? peer.user_id : 0L, i3, chat));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
        this.w = x02;
        setBackground(org.telegram.ui.ActionBar.k6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.tj0 a() {
        u51 u51Var = this.s;
        if (u51Var != null) {
            return u51Var;
        }
        u51 u51Var2 = new u51(10, getContext(), null);
        this.s = u51Var2;
        getContext();
        u51Var2.setLayoutManager(new u4.b0());
        this.s.i(new gi.o1(this, 5));
        this.s.setAdapter(new ci.r4(this, 6));
        return this.s;
    }

    public final void b() {
        org.telegram.ui.Components.x8 x8Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i3 = 0;
        while (true) {
            x8Var = this.d;
            if (i3 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f;
            if (i3 < size) {
                x8Var.b(i3, i10, (TLObject) arrayList.get(i3));
            } else {
                x8Var.b(i3, i10, null);
            }
            i3++;
        }
        if (arrayList.size() == 1) {
            x8Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            x8Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            x8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        k5Var.setRightPadding(L);
        x8Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            k5Var.l(org.telegram.messenger.g5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            k5Var.l(org.telegram.messenger.bd.M0(2131748132, null), false);
        } else {
            k5Var.l(org.telegram.messenger.bd.G(arrayList2.size(), this.h ? "MessagePlayed" : "MessageSeen", new Object[0]), false);
        }
        k5Var.animate().alpha(1.0f).setDuration(220L).start();
        x8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.iz izVar = this.n;
        izVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.s9(izVar)).start();
        u51 u51Var = this.s;
        if (u51Var != null) {
            u51Var.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        org.telegram.ui.Components.iz izVar = this.n;
        boolean z10 = izVar.getVisibility() == 0;
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        k5Var.setVisibility(8);
        if (z10) {
            izVar.setVisibility(8);
        }
        super.onMeasure(i3, i10);
        if (z10) {
            izVar.getLayoutParams().width = getMeasuredWidth();
            izVar.setVisibility(0);
        }
        k5Var.setVisibility(0);
        k5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
        this.r = false;
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
            if (getBackground() != null && x02 != this.w) {
                this.w = x02;
                org.telegram.ui.ActionBar.k6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
