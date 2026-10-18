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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class v00 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int w = 0;
    public final ai.u1 b;
    public final u00 c;
    public final TextView d;
    public AnimatorSet e;
    public final View f;
    public int h;
    public boolean n;
    public org.telegram.ui.wt r;
    public final ArrayList s;
    public final ArrayList v;

    public v00(org.telegram.ui.ey eyVar, ArrayList arrayList) {
        super(eyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.s = new ArrayList(eyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.s.size()) {
            if (((MessagesController.DialogFilter) this.s.get(i10)).isDefault()) {
                this.s.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = eyVar.getParentActivity();
        t00 t00Var = new t00(this, parentActivity);
        this.containerView = t00Var;
        t00Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        ai.u1 u1Var = new ai.u1(this, parentActivity, 18);
        this.b = u1Var;
        u1Var.setTag(14);
        getContext();
        u1Var.setLayoutManager(new s4.b0(1, false));
        u00 u00Var = new u00(this, parentActivity);
        this.c = u00Var;
        u1Var.setAdapter(u00Var);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        u1Var.setClipToPadding(false);
        u1Var.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false));
        u1Var.setOnScrollListener(new kv(this, 2));
        u1Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(u1Var, w7.z5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 51));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, w7.z5.a(50.0f, 0.0f, 0.0f, 40.0f, 0.0f, -1, 51));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static void H(v00 v00Var) {
        View view = v00Var.f;
        TextView textView = v00Var.d;
        ai.u1 u1Var = v00Var.b;
        if (u1Var.getChildCount() <= 0) {
            int paddingTop = u1Var.getPaddingTop();
            v00Var.h = paddingTop;
            u1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(v00Var.h);
            view.setTranslationY(v00Var.h);
            v00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = u1Var.getChildAt(0);
        sl0 sl0Var = (sl0) u1Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || sl0Var == null || sl0Var.b() != 0) {
            v00Var.K(true);
        } else {
            v00Var.K(false);
            i10 = top;
        }
        if (v00Var.h != i10) {
            v00Var.h = i10;
            u1Var.setTopGlowOffset(i10);
            textView.setTranslationY(v00Var.h);
            view.setTranslationY(v00Var.h);
            v00Var.containerView.invalidate();
        }
    }

    public static ArrayList J(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat l4 = org.telegram.messenger.g0.l(n2Var.getMessagesController(), longValue);
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

    public final void K(boolean z10) {
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
        this.e.addListener(new org.telegram.ui.ho(9, this, z10));
        this.e.start();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new ci.e(12));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
