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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o00 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int w = 0;
    public final lh.e1 b;
    public final n00 c;
    public final TextView d;
    public AnimatorSet e;
    public final View f;
    public int h;
    public boolean n;
    public org.telegram.ui.hu r;
    public final ArrayList s;
    public final ArrayList v;

    public o00(ArrayList arrayList, org.telegram.ui.qy qyVar) {
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
        lh.e1 e1Var = new lh.e1(this, parentActivity, 15);
        this.b = e1Var;
        e1Var.setTag(14);
        getContext();
        e1Var.setLayoutManager(new f2.i0(1, false));
        n00 n00Var = new n00(this, parentActivity);
        this.c = n00Var;
        e1Var.setAdapter(n00Var);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        e1Var.setClipToPadding(false);
        e1Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        e1Var.setOnScrollListener(new eg.f2(this, 28));
        e1Var.setOnItemClickListener(new k(this, 7));
        this.containerView.addView(e1Var, k7.b6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
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
        this.containerView.addView(textView, k7.b6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static void F(o00 o00Var) {
        View view = o00Var.f;
        TextView textView = o00Var.d;
        lh.e1 e1Var = o00Var.b;
        if (e1Var.getChildCount() <= 0) {
            int paddingTop = e1Var.getPaddingTop();
            o00Var.h = paddingTop;
            e1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(o00Var.h);
            view.setTranslationY(o00Var.h);
            o00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = e1Var.getChildAt(0);
        dl0 dl0Var = (dl0) e1Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || dl0Var == null || dl0Var.b() != 0) {
            o00Var.I(true);
        } else {
            o00Var.I(false);
            i10 = top;
        }
        if (o00Var.h != i10) {
            o00Var.h = i10;
            e1Var.setTopGlowOffset(i10);
            textView.setTranslationY(o00Var.h);
            view.setTranslationY(o00Var.h);
            o00Var.containerView.invalidate();
        }
    }

    public static ArrayList H(org.telegram.ui.ActionBar.p2 p2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z4, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat n10 = org.telegram.messenger.y3.n(p2Var.getMessagesController(), longValue);
                if (n10 != null) {
                    longValue = n10.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (dialogFilter == null || ((!z4 || !dialogFilter.alwaysShow.contains(Long.valueOf(longValue))) && (z4 || !dialogFilter.neverShow.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z10) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    public final void I(boolean z4) {
        View view = this.f;
        if ((!z4 || view.getTag() == null) && (z4 || view.getTag() != null)) {
            return;
        }
        view.setTag(z4 ? null : 1);
        int i10 = 0;
        if (z4) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.e = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z4 ? 1.0f : 0.0f));
        this.e.setDuration(150L);
        this.e.addListener(new m00(i10, this, z4));
        this.e.start();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.b, (h5.d) new nh.e(8));
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
