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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yz extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int w = 0;
    public final gh.f1 b;
    public final xz c;
    public final TextView d;
    public AnimatorSet e;
    public final View f;
    public int h;
    public boolean n;
    public org.telegram.ui.wt r;
    public final ArrayList s;
    public final ArrayList v;

    public yz(org.telegram.ui.dy dyVar, ArrayList arrayList) {
        super(dyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.s = new ArrayList(dyVar.getMessagesController().dialogFilters);
        int i9 = 0;
        while (i9 < this.s.size()) {
            if (((MessagesController.DialogFilter) this.s.get(i9)).isDefault()) {
                this.s.remove(i9);
                i9--;
            }
            i9++;
        }
        Activity parentActivity = dyVar.getParentActivity();
        wz wzVar = new wz(this, parentActivity);
        this.containerView = wzVar;
        wzVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        gh.f1 f1Var = new gh.f1(this, parentActivity, 17);
        this.b = f1Var;
        f1Var.setTag(14);
        getContext();
        f1Var.setLayoutManager(new f2.m0(1, false));
        xz xzVar = new xz(this, parentActivity);
        this.c = xzVar;
        f1Var.setAdapter(xzVar);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        f1Var.setClipToPadding(false);
        f1Var.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A5, false));
        f1Var.setOnScrollListener(new kn(this, 4));
        f1Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(f1Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, g7.e6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static void F(yz yzVar) {
        View view = yzVar.f;
        TextView textView = yzVar.d;
        gh.f1 f1Var = yzVar.b;
        if (f1Var.getChildCount() <= 0) {
            int paddingTop = f1Var.getPaddingTop();
            yzVar.h = paddingTop;
            f1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(yzVar.h);
            view.setTranslationY(yzVar.h);
            yzVar.containerView.invalidate();
            return;
        }
        int i9 = 0;
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || ik0Var == null || ik0Var.b() != 0) {
            yzVar.I(true);
        } else {
            yzVar.I(false);
            i9 = top;
        }
        if (yzVar.h != i9) {
            yzVar.h = i9;
            f1Var.setTopGlowOffset(i9);
            textView.setTranslationY(yzVar.h);
            view.setTranslationY(yzVar.h);
            yzVar.containerView.invalidate();
        }
    }

    public static ArrayList H(org.telegram.ui.ActionBar.o2 o2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            long longValue = ((Long) arrayList.get(i9)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(o2Var.getMessagesController(), longValue);
                if (l10 != null) {
                    longValue = l10.user_id;
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

    public final void I(boolean z10) {
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
        this.e.addListener(new u9(8, this, z10));
        this.e.start();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.b, (d5.d) new ih.e(7));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
