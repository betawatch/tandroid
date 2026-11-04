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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cz extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static final /* synthetic */ int u1 = 0;
    public int j1;
    public final ci.j1 k1;
    public final org.telegram.ui.n4 l1;
    public final TextView m1;
    public AnimatorSet n1;
    public final View o1;
    public int p1;
    public boolean q1;
    public org.telegram.ui.ur r1;
    public final ArrayList s1;
    public final ArrayList t1;

    public cz(org.telegram.ui.uw uwVar, ArrayList arrayList) {
        super(uwVar.getParentActivity(), false);
        N();
        this.t1 = arrayList;
        this.s1 = new ArrayList(uwVar.getMessagesController().Q0);
        int i3 = 0;
        while (i3 < this.s1.size()) {
            if (((org.telegram.messenger.mo) this.s1.get(i3)).e()) {
                this.s1.remove(i3);
                i3--;
            }
            i3++;
        }
        Activity parentActivity = uwVar.getParentActivity();
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, parentActivity);
        this.b = v0Var;
        v0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i10 = this.u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(parentActivity);
        this.o1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        ci.j1 j1Var = new ci.j1(20, parentActivity, this);
        this.k1 = j1Var;
        j1Var.setTag(14);
        getContext();
        j1Var.setLayoutManager(new u4.b0(1, false));
        org.telegram.ui.n4 n4Var = new org.telegram.ui.n4(3, this, parentActivity);
        this.l1 = n4Var;
        j1Var.setAdapter(n4Var);
        j1Var.setVerticalScrollBarEnabled(false);
        j1Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        j1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.r6.m(j1Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        j1Var.setOnScrollListener(new ji(this, 10));
        j1Var.setOnItemClickListener(new k(this, 7));
        this.b.addView(j1Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.m1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.H(textView, org.telegram.ui.ActionBar.k6.k5, null);
        org.telegram.ui.ActionBar.r6.D(textView, org.telegram.ui.ActionBar.k6.l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.bd.M0(2131750794, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(textView, b8.mf.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
    }

    public static void I0(cz czVar) {
        View view = czVar.o1;
        TextView textView = czVar.m1;
        ci.j1 j1Var = czVar.k1;
        if (j1Var.getChildCount() <= 0) {
            int paddingTop = j1Var.getPaddingTop();
            czVar.p1 = paddingTop;
            j1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(czVar.p1);
            view.setTranslationY(czVar.p1);
            czVar.b.invalidate();
            return;
        }
        int i3 = 0;
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || bj0Var == null || bj0Var.b() != 0) {
            czVar.K0(true);
        } else {
            czVar.K0(false);
            i3 = top;
        }
        if (czVar.p1 != i3) {
            czVar.p1 = i3;
            j1Var.setTopGlowOffset(i3);
            textView.setTranslationY(czVar.p1);
            view.setTranslationY(czVar.p1);
            czVar.b.invalidate();
        }
    }

    public static ArrayList J0(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.mo moVar, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            long longValue = ((Long) arrayList.get(i3)).longValue();
            if (org.telegram.messenger.m5.C(longValue)) {
                TLRPC.EncryptedChat a12 = d2Var.getMessagesController().a1(Integer.valueOf((int) (longValue & 4294967295L)));
                if (a12 != null) {
                    longValue = a12.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (moVar == null || ((!z10 || !moVar.h.contains(Long.valueOf(longValue))) && (z10 || !moVar.i.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z11) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return false;
    }

    public final void K0(boolean z10) {
        View view = this.o1;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.n1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.n1.setDuration(150L);
        this.n1.addListener(new s9(8, this, z10));
        this.n1.start();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.i4) {
            org.telegram.messenger.g0.d0(this.k1, new ei.e(12));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        ci.j1 j1Var = this.k1;
        if (j1Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0);
            if (w02 == this.j1) {
                return;
            }
            this.j1 = w02;
            for (int i3 = 0; i3 < j1Var.getChildCount(); i3++) {
                View childAt = j1Var.getChildAt(i3);
                if ((childAt instanceof org.telegram.ui.ActionBar.m2) && ((org.telegram.ui.ActionBar.m2) childAt).getTextView() != null) {
                    ((org.telegram.ui.ActionBar.m2) childAt).getTextView().setEmojiColor(w02);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
