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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class jf0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final org.telegram.ui.Components.z8 d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final int f;
    public final boolean h;
    public final org.telegram.ui.Components.lz n;
    public boolean r;
    public e61 s;
    public int w;

    public jf0(Context context, int i7, org.telegram.messenger.ij ijVar, TLRPC.Chat chat) {
        super(context);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = i7;
        boolean z9 = ijVar.i4() || org.telegram.messenger.ij.S4(ijVar.k);
        this.h = z9;
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(context, null);
        this.n = lzVar;
        lzVar.e(org.telegram.ui.ActionBar.k6.G8, org.telegram.ui.ActionBar.k6.i6, -1);
        lzVar.setViewType(13);
        lzVar.setIsSingleCell(false);
        addView(lzVar, c8.ha.c(-1.0f, -2));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(true);
        k5Var.setRightPadding(org.telegram.messenger.g0.L(62.0f));
        addView(k5Var, c8.ha.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(context, false);
        this.d = z8Var;
        z8Var.setStyle(11);
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(22.0f));
        addView(z8Var, c8.ha.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = ijVar.f1();
        tL_messages_getMessageReadParticipants.peer = org.telegram.messenger.qp.s1(i7).j1(org.telegram.messenger.ij.B0(ijVar.k));
        ImageView imageView = new ImageView(context);
        addView(imageView, c8.ha.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        Drawable mutate = context.getDrawable(z9 ? R.drawable.msg_played : R.drawable.msg_seen).mutate();
        org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.F8, null, PorterDuff.Mode.MULTIPLY);
        imageView.setImageDrawable(mutate);
        z8Var.setAlpha(0.0f);
        k5Var.setAlpha(0.0f);
        TLRPC.Peer peer = ijVar.k.from_id;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getMessageReadParticipants, new bi.b0(this, peer != null ? peer.user_id : 0L, i7, chat));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
        this.w = x02;
        setBackground(org.telegram.ui.ActionBar.k6.a0(x02, 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.pj0 a() {
        e61 e61Var = this.s;
        if (e61Var != null) {
            return e61Var;
        }
        e61 e61Var2 = new e61(11, getContext(), null);
        this.s = e61Var2;
        getContext();
        e61Var2.setLayoutManager(new v4.b0());
        this.s.i(new fi.o1(this, 5));
        this.s.setAdapter(new bi.k5(this, 7));
        return this.s;
    }

    public final void b() {
        org.telegram.ui.Components.z8 z8Var;
        ArrayList arrayList = this.c;
        setEnabled(arrayList.size() > 0);
        int i7 = 0;
        while (true) {
            z8Var = this.d;
            if (i7 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i10 = this.f;
            if (i7 < size) {
                z8Var.b(i7, i10, (TLObject) arrayList.get(i7));
            } else {
                z8Var.b(i7, i10, null);
            }
            i7++;
        }
        if (arrayList.size() == 1) {
            z8Var.setTranslationX(org.telegram.messenger.g0.L(24.0f));
        } else if (arrayList.size() == 2) {
            z8Var.setTranslationX(org.telegram.messenger.g0.L(12.0f));
        } else {
            z8Var.setTranslationX(0.0f);
        }
        int L = org.telegram.messenger.g0.L((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        k5Var.setRightPadding(L);
        z8Var.a(false);
        ArrayList arrayList2 = this.a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            k5Var.l(org.telegram.messenger.g5.o((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            k5Var.l(org.telegram.messenger.hd.M0(2131748123, null), false);
        } else {
            k5Var.l(org.telegram.messenger.hd.G(arrayList2.size(), this.h ? "MessagePlayed" : "MessageSeen", new Object[0]), false);
        }
        k5Var.animate().alpha(1.0f).setDuration(220L).start();
        z8Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.lz lzVar = this.n;
        lzVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.t9(lzVar)).start();
        e61 e61Var = this.s;
        if (e61Var != null) {
            e61Var.getAdapter();
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
        org.telegram.ui.ActionBar.k5 k5Var = this.e;
        k5Var.setVisibility(8);
        if (z9) {
            lzVar.setVisibility(8);
        }
        super.onMeasure(i7, i10);
        if (z9) {
            lzVar.getLayoutParams().width = getMeasuredWidth();
            lzVar.setVisibility(0);
        }
        k5Var.setVisibility(0);
        k5Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(40.0f);
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

    @Override // org.telegram.ui.ActionBar.a6
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

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
