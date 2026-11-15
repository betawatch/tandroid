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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jf0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final org.telegram.ui.Components.w8 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final int f;
    public final boolean h;
    public final org.telegram.ui.Components.pz n;
    public boolean r;
    public b61 s;
    public int w;

    public jf0(Context context, int i7, org.telegram.messenger.gj gjVar, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i7;
        boolean z10 = gjVar.h4() || org.telegram.messenger.gj.R4(gjVar.k);
        this.h = z10;
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.n = pzVar;
        pzVar.e(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.i6, -1);
        pzVar.setViewType(13);
        pzVar.setIsSingleCell(false);
        addView(pzVar, c8.ja.c(-1.0f, -2));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(j5Var, c8.ja.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false);
        this.d = w8Var;
        w8Var.setStyle(11);
        w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(w8Var, c8.ja.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = gjVar.e1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.np.s1(i7).j1(org.telegram.messenger.gj.B0(gjVar.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ja.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z10 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        org.telegram.ui.ActionBar.q6.x(this, mutate, org.telegram.ui.ActionBar.j6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        w8Var.setAlpha(0.0f);
        j5Var.setAlpha(0.0f);
        TLRPC.Peer peer = gjVar.k.from_id;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new di.v(this, peer != null ? peer.user_id : 0L, i7, chat));
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.I5, false);
        this.w = x02;
        setBackground(org.telegram.ui.ActionBar.j6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.uj0 a() {
        b61 b61Var = this.s;
        if (b61Var != null) {
            return b61Var;
        }
        b61 b61Var2 = new b61(11, getContext(), null);
        this.s = b61Var2;
        getContext();
        b61Var2.setLayoutManager(new v4.b0());
        this.s.i(new ai.i0(this, 6));
        this.s.setAdapter(new di.i4(this, 7));
        return this.s;
    }

    public final void b() {
        org.telegram.ui.Components.w8 w8Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i7 = 0;
        while (true) {
            w8Var = this.d;
            if (i7 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f;
            if (i7 < size) {
                w8Var.b(i7, i10, (TLObject) arrayList.get(i7));
            } else {
                w8Var.b(i7, i10, null);
            }
            i7++;
        }
        if (arrayList.size() == 1) {
            w8Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            w8Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            w8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        j5Var.setRightPadding(L);
        w8Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            j5Var.l(org.telegram.messenger.g5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            j5Var.l(org.telegram.messenger.hd.M0(2131748124, null), false);
        } else {
            j5Var.l(org.telegram.messenger.hd.G(arrayList2.size(), this.h ? "MessagePlayed" : "MessageSeen", new Object[0]), false);
        }
        j5Var.animate().alpha(1.0f).setDuration(220L).start();
        w8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.pz pzVar = this.n;
        pzVar.animate().alpha(0.0f).setDuration(220L).setListener(new nn(pzVar)).start();
        b61 b61Var = this.s;
        if (b61Var != null) {
            b61Var.getAdapter();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        this.r = true;
        org.telegram.ui.Components.pz pzVar = this.n;
        boolean z10 = pzVar.getVisibility() == 0;
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        j5Var.setVisibility(8);
        if (z10) {
            pzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z10) {
            pzVar.getLayoutParams().width = getMeasuredWidth();
            pzVar.setVisibility(0);
        }
        j5Var.setVisibility(0);
        j5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.I5, false);
            if (getBackground() != null && x02 != this.w) {
                this.w = x02;
                org.telegram.ui.ActionBar.j6.H1(getBackground(), x02, true);
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
