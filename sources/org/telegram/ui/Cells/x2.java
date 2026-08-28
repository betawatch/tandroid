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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.xz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x2 extends LinearLayout {
    public static final /* synthetic */ int w = 0;
    public float a;
    public Runnable b;
    public q0.a c;
    public boolean d;
    public ValueAnimator e;
    public final pi0 f;
    public final TextView h;
    public final xz0 n;
    public int r;
    public int s;
    public final int v;

    public x2(final Context context) {
        super(context);
        this.r = -1;
        this.v = UserConfig.selectedAccount;
        setGravity(17);
        setOrientation(1);
        setOnTouchListener(new jh.d(5));
        pi0 pi0Var = new pi0(context);
        this.f = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(pi0Var, g7.e6.d(100, 100.0f, 17, 52.0f, 4.0f, 52.0f, 0.0f));
        pi0Var.setOnClickListener(new a(this, 3));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.m9, false));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        addView(textView, g7.e6.d(-1, -2.0f, 51, 52.0f, 10.0f, 52.0f, 0.0f));
        xz0 xz0Var = new xz0(context);
        this.n = xz0Var;
        xz0Var.setFactory(new ViewSwitcher.ViewFactory() { // from class: org.telegram.ui.Cells.u2
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                TextView textView2 = new TextView(context);
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.g9, false));
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                return textView2;
            }
        });
        xz0Var.setInAnimation(context, R.anim.alpha_in);
        xz0Var.setOutAnimation(context, R.anim.alpha_out);
        addView(xz0Var, g7.e6.d(-1, -2.0f, 51, 52.0f, 7.0f, 52.0f, 0.0f));
    }

    public final void a(boolean z10) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = true;
        if (z10) {
            String string = LocaleController.getString(R.string.NoChatsContactsHelp);
            if (AndroidUtilities.isTablet() && !AndroidUtilities.isSmallTablet()) {
                string = string.replace('\n', ' ');
            }
            this.n.a(string, true, false);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.a, 1.0f).setDuration(250L);
        this.e = duration;
        duration.setInterpolator(xs.d);
        this.e.addUpdateListener(new v2(this, 0));
        this.e.addListener(new w2(this, 1));
        this.e.start();
    }

    public final void b() {
        int i9;
        int i10 = 0;
        if ((getParent() instanceof View) && (((i9 = this.r) == 2 || i9 == 3) && ((View) getParent()).getPaddingTop() != 0)) {
            i10 = 0 - (getTop() / 2);
        }
        int i11 = this.r;
        if (i11 == 0 || i11 == 1) {
            i10 -= (int) ((1.0f - this.a) * (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        }
        float f10 = i10;
        this.f.setTranslationY(f10);
        this.h.setTranslationY(f10);
        this.n.setTranslationY(f10);
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i9) {
        super.offsetTopAndBottom(i9);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        b();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size;
        int size2;
        int i11 = this.r;
        if (i11 == 0 || i11 == 1) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30);
            if (getParent() instanceof View) {
                View view = (View) getParent();
                size = (view.getMeasuredHeight() - view.getPaddingTop()) - view.getPaddingBottom();
            } else {
                size = View.MeasureSpec.getSize(i10);
            }
            if (size == 0) {
                size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
            }
            super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((AndroidUtilities.dp(320.0f) - size) * this.a) + size), TLObject.FLAG_30));
            return;
        }
        if (i11 != 2 && i11 != 3) {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), TLObject.FLAG_30));
            return;
        }
        if (getParent() instanceof View) {
            View view2 = (View) getParent();
            size2 = view2.getMeasuredHeight();
            if (view2.getPaddingTop() != 0) {
                size2 -= AndroidUtilities.statusBarHeight;
            }
        } else {
            size2 = View.MeasureSpec.getSize(i10);
        }
        if (size2 == 0) {
            size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
        }
        if (getParent() instanceof org.telegram.ui.Components.aa) {
            size2 -= ((org.telegram.ui.Components.aa) getParent()).T2;
        }
        ArrayList<TLRPC.RecentMeUrl> arrayList = MessagesController.getInstance(this.v).hintDialogs;
        if (!arrayList.isEmpty()) {
            size2 = ll.w(50.0f, (arrayList.size() + (arrayList.size() * AndroidUtilities.dp(72.0f))) - 1, size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
    }

    public void setOnUtyanAnimationEndListener(Runnable runnable) {
        this.b = runnable;
    }

    public void setOnUtyanAnimationUpdateListener(q0.a aVar) {
        this.c = aVar;
    }
}
