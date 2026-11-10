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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mf0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final org.telegram.ui.Components.y8 d;
    public final org.telegram.ui.ActionBar.m5 e;
    public final int f;
    public final boolean h;
    public final org.telegram.ui.Components.lz n;
    public boolean r;
    public g61 s;
    public int w;

    public mf0(Context context, int i7, org.telegram.messenger.ij ijVar, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i7;
        boolean z9 = ijVar.h4() || org.telegram.messenger.ij.R4(ijVar.k);
        this.h = z9;
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        this.n = lzVar;
        lzVar.e(org.telegram.ui.ActionBar.m6.G8, org.telegram.ui.ActionBar.m6.i6, -1);
        lzVar.setViewType(13);
        lzVar.setIsSingleCell(false);
        addView(lzVar, c8.ha.c(-1.0f, -2));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.e = m5Var;
        m5Var.setTextSize(16);
        m5Var.setEllipsizeByGradient(true);
        m5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(m5Var, c8.ha.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(context, false);
        this.d = y8Var;
        y8Var.setStyle(11);
        y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(y8Var, c8.ha.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = ijVar.e1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.qp.s1(i7).j1(org.telegram.messenger.ij.B0(ijVar.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z9 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        org.telegram.ui.ActionBar.t6.x(this, mutate, org.telegram.ui.ActionBar.m6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        y8Var.setAlpha(0.0f);
        m5Var.setAlpha(0.0f);
        TLRPC.Peer peer = ijVar.k.from_id;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new bi.b0(this, peer != null ? peer.user_id : 0L, i7, chat));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false);
        this.w = x02;
        setBackground(org.telegram.ui.ActionBar.m6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.pj0 a() {
        g61 g61Var = this.s;
        if (g61Var != null) {
            return g61Var;
        }
        g61 g61Var2 = new g61(11, getContext(), null);
        this.s = g61Var2;
        getContext();
        g61Var2.setLayoutManager(new v4.b0());
        this.s.i(new fi.o1(this, 5));
        this.s.setAdapter(new bi.k5(this, 7));
        return this.s;
    }

    public final void b() {
        org.telegram.ui.Components.y8 y8Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i7 = 0;
        while (true) {
            y8Var = this.d;
            if (i7 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f;
            if (i7 < size) {
                y8Var.b(i7, i10, (TLObject) arrayList.get(i7));
            } else {
                y8Var.b(i7, i10, null);
            }
            i7++;
        }
        if (arrayList.size() == 1) {
            y8Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            y8Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            y8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.m5 m5Var = this.e;
        m5Var.setRightPadding(L);
        y8Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            m5Var.l(org.telegram.messenger.g5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            m5Var.l(org.telegram.messenger.id.M0(2131748124, null), false);
        } else {
            m5Var.l(org.telegram.messenger.id.G(arrayList2.size(), this.h ? "MessagePlayed" : "MessageSeen", new Object[0]), false);
        }
        m5Var.animate().alpha(1.0f).setDuration(220L).start();
        y8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.lz lzVar = this.n;
        lzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.s9(lzVar)).start();
        g61 g61Var = this.s;
        if (g61Var != null) {
            g61Var.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        org.telegram.ui.Components.lz lzVar = this.n;
        boolean z9 = lzVar.getVisibility() == 0;
        org.telegram.ui.ActionBar.m5 m5Var = this.e;
        m5Var.setVisibility(8);
        if (z9) {
            lzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z9) {
            lzVar.getLayoutParams().width = getMeasuredWidth();
            lzVar.setVisibility(0);
        }
        m5Var.setVisibility(0);
        m5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
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
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.I5, false);
            if (getBackground() != null && x02 != this.w) {
                this.w = x02;
                org.telegram.ui.ActionBar.m6.H1(getBackground(), x02, true);
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
