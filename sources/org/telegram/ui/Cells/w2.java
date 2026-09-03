package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.u01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w2 extends LinearLayout {
    public static final /* synthetic */ int w = 0;
    public float a;
    public Runnable b;
    public q0.a c;
    public boolean d;
    public ValueAnimator e;
    public final jj0 f;
    public final TextView h;
    public final u01 n;
    public int r;
    public int s;
    public final int v;

    public w2(final Context context) {
        super(context);
        this.r = -1;
        this.v = UserConfig.selectedAccount;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new oh.d(5));
        jj0 jj0Var = new jj0(context);
        this.f = jj0Var;
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(jj0Var, k7.b6.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        jj0Var.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m9, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, k7.b6.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        u01 u01Var = new u01(context);
        this.n = u01Var;
        u01Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.Cells.t2
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                TextView textView2 = new TextView(context);
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g9, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                return textView2;
            }
        });
        u01Var.setInAnimation(context, R.anim.alpha_in);
        u01Var.setOutAnimation(context, R.anim.alpha_out);
        addView(u01Var, k7.b6.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z4) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z4) {
            String string = LocaleController.getString(R.string.NoChatsContactsHelp);
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            this.n.a(string, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(ft.d);
        this.e.addUpdateListener(new u2(this, 0));
        this.e.addListener(new v2(this, 1));
        this.e.start();
    }

    public final void b() {
        int i10;
        int i11 = 0;
        if ((getParent() instanceof View) && (((i10 = this.r) == 2 || i10 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i11 = 0 - (getTop() / 2);
        }
        int i12 = this.r;
        if (i12 == 0 || i12 == 1) {
            i11 -= (int) ((1.0f - this.a) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        }
        float f10 = i11;
        this.f.setTranslationY(f10);
        this.h.setTranslationY(f10);
        this.n.setTranslationY(f10);
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i10) {
        super.offsetTopAndBottom(i10);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size;
        int size2;
        int i12 = this.r;
        if (i12 == 0 || i12 == 1) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = View.MeasureSpec.getSize(i11);
            }
            if (size == 0) {
                size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((AndroidUtilities.dp(320.0f) - size) * this.a) + size), TLObject.FLAG_30));
            return;
        }
        if (i12 != 2 && i12 != 3) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), TLObject.FLAG_30));
            return;
        }
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size2 = view2.getMeasuredHeight();
            if (view2.getPaddingTop() != 0) {
                size2 -= AndroidUtilities.statusBarHeight;
            }
        } else {
            size2 = View.MeasureSpec.getSize(i11);
        }
        if (size2 == 0) {
            size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
        }
        if (getParent() instanceof org.telegram.ui.Components.aa) {
            size2 -= ((org.telegram.ui.Components.aa) getParent()).U2;
        }
        ArrayList<TLRPC.RecentMeUrl> arrayList = MessagesController.getInstance(this.v).hintDialogs;
        if (!arrayList.isEmpty()) {
            size2 = org.telegram.ui.b.t(50.0f, (arrayList.size() + (arrayList.size() * AndroidUtilities.dp(72.0f))) - 1, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.c = aVar;
    }
}
