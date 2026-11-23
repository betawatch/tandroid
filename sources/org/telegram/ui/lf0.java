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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lf0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final org.telegram.ui.Components.d9 d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final int f;
    public final boolean h;
    public final org.telegram.ui.Components.vz n;
    public boolean r;
    public d61 s;
    public int w;

    public lf0(Context context, int i7, org.telegram.messenger.fj fjVar, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i7;
        boolean z10 = fjVar.h4() || org.telegram.messenger.fj.R4(fjVar.k);
        this.h = z10;
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        this.n = vzVar;
        vzVar.e(org.telegram.ui.ActionBar.n6.G8, org.telegram.ui.ActionBar.n6.i6, -1);
        vzVar.setViewType(13);
        vzVar.setIsSingleCell(false);
        addView(vzVar, c8.na.c(-1.0f, -2));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(true);
        n5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(n5Var, c8.na.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
        this.d = d9Var;
        d9Var.setStyle(11);
        d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(d9Var, c8.na.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = fjVar.e1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.mp.u1(i7).l1(org.telegram.messenger.fj.B0(fjVar.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.na.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z10 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        org.telegram.ui.ActionBar.u6.x(this, mutate, org.telegram.ui.ActionBar.n6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        d9Var.setAlpha(0.0f);
        n5Var.setAlpha(0.0f);
        TLRPC.Peer peer = fjVar.k.from_id;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new di.v(this, peer != null ? peer.user_id : 0L, i7, chat));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false);
        this.w = x02;
        setBackground(org.telegram.ui.ActionBar.n6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.ek0 a() {
        d61 d61Var = this.s;
        if (d61Var != null) {
            return d61Var;
        }
        d61 d61Var2 = new d61(11, getContext(), null);
        this.s = d61Var2;
        getContext();
        d61Var2.setLayoutManager(new v4.c0());
        this.s.i(new ai.f0(this, 6));
        this.s.setAdapter(new di.l4(this, 7));
        return this.s;
    }

    public final void b() {
        org.telegram.ui.Components.d9 d9Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i7 = 0;
        while (true) {
            d9Var = this.d;
            if (i7 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f;
            if (i7 < size) {
                d9Var.b(i7, i10, (TLObject) arrayList.get(i7));
            } else {
                d9Var.b(i7, i10, null);
            }
            i7++;
        }
        if (arrayList.size() == 1) {
            d9Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            d9Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            d9Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.n5 n5Var = this.e;
        n5Var.setRightPadding(L);
        d9Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            n5Var.l(org.telegram.messenger.i5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            n5Var.l(org.telegram.messenger.gd.N0(2131747931, null), false);
        } else {
            n5Var.l(org.telegram.messenger.gd.G(arrayList2.size(), this.h ? "MessagePlayed" : "MessageSeen", new Object[0]), false);
        }
        n5Var.animate().alpha(1.0f).setDuration(220L).start();
        d9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.vz vzVar = this.n;
        vzVar.animate().alpha(0.0f).setDuration(220L).setListener(new on(vzVar)).start();
        d61 d61Var = this.s;
        if (d61Var != null) {
            d61Var.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        org.telegram.ui.Components.vz vzVar = this.n;
        boolean z10 = vzVar.getVisibility() == 0;
        org.telegram.ui.ActionBar.n5 n5Var = this.e;
        n5Var.setVisibility(8);
        if (z10) {
            vzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z10) {
            vzVar.getLayoutParams().width = getMeasuredWidth();
            vzVar.setVisibility(0);
        }
        n5Var.setVisibility(0);
        n5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
        this.r = false;
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.r) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I5, false);
            if (getBackground() != null && x02 != this.w) {
                this.w = x02;
                org.telegram.ui.ActionBar.n6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
