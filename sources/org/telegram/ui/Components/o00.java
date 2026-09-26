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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o00 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int w = 0;
    public final ai.w0 b;
    public final n00 c;
    public final TextView d;
    public AnimatorSet e;
    public final View f;
    public int h;
    public boolean n;
    public org.telegram.ui.du r;
    public final ArrayList s;
    public final ArrayList v;

    public o00(org.telegram.ui.qy qyVar, ArrayList arrayList) {
        super(qyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.s = new ArrayList(qyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.s.size()) {
            if (((MessagesController.DialogFilter) this.s.get(i10)).isDefault()) {
                this.s.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = qyVar.getParentActivity();
        m00 m00Var = new m00(this, parentActivity);
        this.containerView = m00Var;
        m00Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        ai.w0 w0Var = new ai.w0(this, parentActivity, 17);
        this.b = w0Var;
        w0Var.setTag(14);
        getContext();
        w0Var.setLayoutManager(new s4.c0(1, false));
        n00 n00Var = new n00(this, parentActivity);
        this.c = n00Var;
        w0Var.setAdapter(n00Var);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        w0Var.setClipToPadding(false);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.A5, false));
        w0Var.setOnScrollListener(new ai.r(this, 27));
        w0Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(w0Var, w7.y5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, w7.y5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static void G(o00 o00Var) {
        View view = o00Var.f;
        TextView textView = o00Var.d;
        ai.w0 w0Var = o00Var.b;
        if (w0Var.getChildCount() <= 0) {
            int paddingTop = w0Var.getPaddingTop();
            o00Var.h = paddingTop;
            w0Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(o00Var.h);
            view.setTranslationY(o00Var.h);
            o00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = w0Var.getChildAt(0);
        gl0 gl0Var = (gl0) w0Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || gl0Var == null || gl0Var.b() != 0) {
            o00Var.J(true);
        } else {
            o00Var.J(false);
            i10 = top;
        }
        if (o00Var.h != i10) {
            o00Var.h = i10;
            w0Var.setTopGlowOffset(i10);
            textView.setTranslationY(o00Var.h);
            view.setTranslationY(o00Var.h);
            o00Var.containerView.invalidate();
        }
    }

    public static ArrayList I(org.telegram.ui.ActionBar.m2 m2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat l4 = org.telegram.messenger.f0.l(m2Var.getMessagesController(), longValue);
                if (l4 != null) {
                    longValue = l4.user_id;
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
        this.e.addListener(new ca(8, this, z10));
        this.e.start();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new ai.i(12));
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
