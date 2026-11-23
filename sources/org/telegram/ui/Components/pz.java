package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pz extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs {
    public static final /* synthetic */ int x1 = 0;
    public int m1;
    public final di.b1 n1;
    public final org.telegram.ui.l4 o1;
    public final TextView p1;
    public AnimatorSet q1;
    public final View r1;
    public int s1;
    public boolean t1;
    public org.telegram.ui.zr u1;
    public final ArrayList v1;
    public final ArrayList w1;

    public pz(org.telegram.ui.bx bxVar, ArrayList arrayList) {
        super(bxVar.getParentActivity(), false);
        O();
        this.w1 = arrayList;
        this.v1 = new ArrayList(bxVar.getMessagesController().Q0);
        int i7 = 0;
        while (i7 < this.v1.size()) {
            if (((org.telegram.messenger.ro) this.v1.get(i7)).d()) {
                this.v1.remove(i7);
                i7--;
            }
            i7++;
        }
        Activity parentActivity = bxVar.getParentActivity();
        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(this, parentActivity);
        this.b = x0Var;
        x0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i10 = this.u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(parentActivity);
        this.r1 = view;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        di.b1 b1Var = new di.b1(20, parentActivity, this);
        this.n1 = b1Var;
        b1Var.setTag(14);
        getContext();
        b1Var.setLayoutManager(new v4.c0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(3, this, parentActivity);
        this.o1 = l4Var;
        b1Var.setAdapter(l4Var);
        b1Var.setVerticalScrollBarEnabled(false);
        b1Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        b1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.u6.l(b1Var, 21, org.telegram.ui.ActionBar.n6.A5, null);
        b1Var.setOnScrollListener(new na(this, 11));
        b1Var.setOnItemClickListener(new n(this, 7));
        this.b.addView(b1Var, c8.na.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.p1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.u6.G(textView, org.telegram.ui.ActionBar.n6.k5, null);
        org.telegram.ui.ActionBar.u6.C(textView, org.telegram.ui.ActionBar.n6.l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.gd.N0(2131750781, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(textView, c8.na.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.l4);
    }

    public static void J0(pz pzVar) {
        View view = pzVar.r1;
        TextView textView = pzVar.p1;
        di.b1 b1Var = pzVar.n1;
        if (b1Var.getChildCount() <= 0) {
            int paddingTop = b1Var.getPaddingTop();
            pzVar.s1 = paddingTop;
            b1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(pzVar.s1);
            view.setTranslationY(pzVar.s1);
            pzVar.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || mj0Var == null || mj0Var.b() != 0) {
            pzVar.L0(true);
        } else {
            pzVar.L0(false);
            i7 = top;
        }
        if (pzVar.s1 != i7) {
            pzVar.s1 = i7;
            b1Var.setTopGlowOffset(i7);
            textView.setTranslationY(pzVar.s1);
            view.setTranslationY(pzVar.s1);
            pzVar.b.invalidate();
        }
    }

    public static ArrayList K0(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.ro roVar, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            long longValue = ((Long) arrayList.get(i7)).longValue();
            if (org.telegram.messenger.n5.C(longValue)) {
                TLRPC.EncryptedChat c12 = g2Var.getMessagesController().c1(Integer.valueOf((int) (longValue & 4294967295L)));
                if (c12 != null) {
                    longValue = c12.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (roVar == null || ((!z10 || !roVar.h.contains(Long.valueOf(longValue))) && (z10 || !roVar.i.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z11) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
        return false;
    }

    public final void L0(boolean z10) {
        View view = this.r1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.q1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.q1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.q1.setDuration(150L);
        this.q1.addListener(new org.telegram.ui.on(9, this, z10));
        this.q1.start();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.l4) {
            org.telegram.messenger.g0.d0(this.n1, new fi.e(13));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.l4);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        di.b1 b1Var = this.n1;
        if (b1Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.J0);
            if (w02 == this.m1) {
                return;
            }
            this.m1 = w02;
            for (int i7 = 0; i7 < b1Var.getChildCount(); i7++) {
                View childAt = b1Var.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.ActionBar.p2) && ((org.telegram.ui.ActionBar.p2) childAt).getTextView() != null) {
                    ((org.telegram.ui.ActionBar.p2) childAt).getTextView().setEmojiColor(w02);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
