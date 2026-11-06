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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class fz extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final /* synthetic */ int t1 = 0;
    public int i1;
    public final bi.q1 j1;
    public final org.telegram.ui.l4 k1;
    public final TextView l1;
    public AnimatorSet m1;
    public final View n1;
    public int o1;
    public boolean p1;
    public org.telegram.ui.wr q1;
    public final ArrayList r1;
    public final ArrayList s1;

    public fz(org.telegram.ui.ww wwVar, ArrayList arrayList) {
        super(wwVar.getParentActivity(), false);
        N();
        this.s1 = arrayList;
        this.r1 = new ArrayList(wwVar.getMessagesController().P0);
        int i7 = 0;
        while (i7 < this.r1.size()) {
            if (((org.telegram.messenger.vo) this.r1.get(i7)).e()) {
                this.r1.remove(i7);
                i7--;
            }
            i7++;
        }
        Activity parentActivity = wwVar.getParentActivity();
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(this, parentActivity);
        this.b = v0Var;
        v0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i10 = this.t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(parentActivity);
        this.n1 = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.b.addView(view, layoutParams);
        bi.q1 q1Var = new bi.q1(20, parentActivity, this);
        this.j1 = q1Var;
        q1Var.setTag(14);
        getContext();
        q1Var.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.l4 l4Var = new org.telegram.ui.l4(3, this, parentActivity);
        this.k1 = l4Var;
        q1Var.setAdapter(l4Var);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        q1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.r6.m(q1Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        q1Var.setOnScrollListener(new ui(this, 8));
        q1Var.setOnItemClickListener(new k(this, 7));
        this.b.addView(q1Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.l1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.H(textView, org.telegram.ui.ActionBar.k6.k5, null);
        org.telegram.ui.ActionBar.r6.D(textView, org.telegram.ui.ActionBar.k6.l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
        textView.setGravity(16);
        textView.setText(org.telegram.messenger.hd.M0(2131750794, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        this.b.addView(textView, c8.ha.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.i4);
    }

    public static void I0(fz fzVar) {
        View view = fzVar.n1;
        TextView textView = fzVar.l1;
        bi.q1 q1Var = fzVar.j1;
        if (q1Var.getChildCount() <= 0) {
            int paddingTop = q1Var.getPaddingTop();
            fzVar.o1 = paddingTop;
            q1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(fzVar.o1);
            view.setTranslationY(fzVar.o1);
            fzVar.b.invalidate();
            return;
        }
        int i7 = 0;
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || xi0Var == null || xi0Var.b() != 0) {
            fzVar.K0(true);
        } else {
            fzVar.K0(false);
            i7 = top;
        }
        if (fzVar.o1 != i7) {
            fzVar.o1 = i7;
            q1Var.setTopGlowOffset(i7);
            textView.setTranslationY(fzVar.o1);
            view.setTranslationY(fzVar.o1);
            fzVar.b.invalidate();
        }
    }

    public static ArrayList J0(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, ArrayList arrayList, boolean z9, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            long longValue = ((Long) arrayList.get(i7)).longValue();
            if (org.telegram.messenger.m5.C(longValue)) {
                TLRPC.EncryptedChat a12 = f2Var.getMessagesController().a1(Integer.valueOf((int) (longValue & 4294967295L)));
                if (a12 != null) {
                    longValue = a12.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (voVar == null || ((!z9 || !voVar.h.contains(Long.valueOf(longValue))) && (z9 || !voVar.i.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z10) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    public final void K0(boolean z9) {
        View view = this.n1;
        if ((!z9 || view.getTag() == null) && (z9 || view.getTag() != null)) {
            return;
        }
        view.setTag(z9 ? null : 1);
        if (z9) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.m1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.m1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z9 ? 1.0f : 0.0f));
        this.m1.setDuration(150L);
        this.m1.addListener(new t9(8, this, z9));
        this.m1.start();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.i4) {
            org.telegram.messenger.g0.d0(this.j1, new di.e(13));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.i4);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        bi.q1 q1Var = this.j1;
        if (q1Var == null) {
            return;
        }
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0);
            if (w02 == this.i1) {
                return;
            }
            this.i1 = w02;
            for (int i7 = 0; i7 < q1Var.getChildCount(); i7++) {
                View childAt = q1Var.getChildAt(i7);
                if ((childAt instanceof org.telegram.ui.ActionBar.o2) && ((org.telegram.ui.ActionBar.o2) childAt).getTextView() != null) {
                    ((org.telegram.ui.ActionBar.o2) childAt).getTextView().setEmojiColor(w02);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
