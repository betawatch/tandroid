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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class n00 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int w = 0;
    public final bi.o0 b;
    public final m00 c;
    public final TextView d;
    public AnimatorSet e;
    public final View f;
    public int h;
    public boolean n;
    public org.telegram.ui.iu r;
    public final ArrayList s;
    public final ArrayList v;

    public n00(org.telegram.ui.uy uyVar, ArrayList arrayList) {
        super(uyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.s = new ArrayList(uyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.s.size()) {
            if (((MessagesController.DialogFilter) this.s.get(i10)).isDefault()) {
                this.s.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = uyVar.getParentActivity();
        l00 l00Var = new l00(this, parentActivity);
        this.containerView = l00Var;
        l00Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        bi.o0 o0Var = new bi.o0(this, parentActivity, 17);
        this.b = o0Var;
        o0Var.setTag(14);
        getContext();
        o0Var.setLayoutManager(new s4.c0(1, false));
        m00 m00Var = new m00(this, parentActivity);
        this.c = m00Var;
        o0Var.setAdapter(m00Var);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        o0Var.setClipToPadding(false);
        o0Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        o0Var.setOnScrollListener(new ah.e0(this, 28));
        o0Var.setOnItemClickListener(new k(this, 7));
        this.containerView.addView(o0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, w7.x5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static void G(n00 n00Var) {
        View view = n00Var.f;
        TextView textView = n00Var.d;
        bi.o0 o0Var = n00Var.b;
        if (o0Var.getChildCount() <= 0) {
            int paddingTop = o0Var.getPaddingTop();
            n00Var.h = paddingTop;
            o0Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(n00Var.h);
            view.setTranslationY(n00Var.h);
            n00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = o0Var.getChildAt(0);
        vk0 vk0Var = (vk0) o0Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || vk0Var == null || vk0Var.b() != 0) {
            n00Var.J(true);
        } else {
            n00Var.J(false);
            i10 = top;
        }
        if (n00Var.h != i10) {
            n00Var.h = i10;
            o0Var.setTopGlowOffset(i10);
            textView.setTranslationY(n00Var.h);
            view.setTranslationY(n00Var.h);
            n00Var.containerView.invalidate();
        }
    }

    public static ArrayList I(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(n2Var.getMessagesController(), longValue);
                if (m10 != null) {
                    longValue = m10.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (dialogFilter == null || ((!z10 || !dialogFilter.alwaysShow.contains(Long.valueOf(longValue))) && (z10 || !dialogFilter.neverShow.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z11) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    public final void J(boolean z10) {
        View view = this.f;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.e.setDuration(150L);
        this.e.addListener(new org.telegram.ui.to(9, this, z10));
        this.e.start();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new bi.f(23));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
