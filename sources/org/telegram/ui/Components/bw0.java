package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class bw0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final ai.u1 b;
    public final zv0 c;
    public final Drawable d;
    public TextView e;
    public int f;
    public boolean h;
    public final aw0 n;
    public int r;

    public bw0(Context context, aw0 aw0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.n = aw0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        ah.x xVar = new ah.x(this, context, 22);
        this.containerView = xVar;
        xVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        ai.u1 u1Var = new ai.u1(this, context, 23);
        this.b = u1Var;
        getContext();
        u1Var.setLayoutManager(new s4.b0(1, false));
        zv0 zv0Var = new zv0(this, context);
        this.c = zv0Var;
        u1Var.setAdapter(zv0Var);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setClipToPadding(false);
        u1Var.setEnabled(true);
        org.telegram.ui.ActionBar.r6.m(u1Var, 21, org.telegram.ui.ActionBar.k6.A5, g6Var);
        u1Var.setOnScrollListener(new kv(this, 9));
        u1Var.setOnItemClickListener(new j(this, 13));
        this.containerView.addView(u1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, w7.z5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        qg0 qg0Var = new qg0(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, qg0Var, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.k6.ii;
        org.telegram.ui.ActionBar.r6.W(textView, i12, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i12, 15);
        textView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(textView, g02, null, h, null);
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        qg0Var.addView(textView, w7.z5.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.n6 h10 = org.telegram.ui.ActionBar.r6.h(i12, 15);
        linearLayout.setBackground(g03);
        org.telegram.ui.ActionBar.r6.k(linearLayout, g03, null, h10, null);
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        qg0Var.addView(linearLayout, w7.z5.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.sl.k(13.0f, 1, textView2);
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.li, null);
        textView2.setGravity(17);
        int dp = AndroidUtilities.dp(11.0f);
        int i13 = org.telegram.ui.ActionBar.k6.ki;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.x0(null, i13, false));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        textView2.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(textView2, c02, O, null, null);
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView f7 = org.telegram.messenger.sl.f(linearLayout, textView2, w7.z5.t(-2, 23, 16, 0, 0, 10, 0), context);
        f7.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(f7, i12, null);
        f7.setGravity(17);
        f7.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        f7.setText(LocaleController.getString(R.string.Send).toUpperCase());
        f7.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(f7, w7.z5.q(-2, -2, 16));
        org.telegram.ui.ActionBar.r6.i(i10, qg0Var, g6Var);
        this.containerView.addView(qg0Var, w7.z5.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, g6Var);
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        final int i14 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yv0
            public final /* synthetic */ bw0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        int i15 = 0;
                        while (true) {
                            bw0 bw0Var = this.b;
                            if (i15 >= 4) {
                                bw0Var.dismiss();
                                break;
                            } else {
                                bw0Var.getClass();
                                LocationController.getInstance(i15).removeAllLocationSharings();
                                i15++;
                            }
                        }
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.r6.W(f7, org.telegram.ui.ActionBar.k6.n5, g6Var);
        f7.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        final int i15 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yv0
            public final /* synthetic */ bw0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        int i152 = 0;
                        while (true) {
                            bw0 bw0Var = this.b;
                            if (i152 >= 4) {
                                bw0Var.dismiss();
                                break;
                            } else {
                                bw0Var.getClass();
                                LocationController.getInstance(i152).removeAllLocationSharings();
                                i152++;
                            }
                        }
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        textView2.setVisibility(8);
        zv0Var.l();
    }

    public static void m(bw0 bw0Var) {
        ai.u1 u1Var = bw0Var.b;
        if (u1Var.getChildCount() <= 0) {
            int paddingTop = u1Var.getPaddingTop();
            bw0Var.f = paddingTop;
            u1Var.setTopGlowOffset(paddingTop);
            bw0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = u1Var.getChildAt(0);
        wl0 wl0Var = (wl0) u1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && wl0Var != null && wl0Var.b() == 0) {
            i10 = top;
        }
        if (bw0Var.f != i10) {
            bw0Var.f = i10;
            u1Var.setTopGlowOffset(i10);
            bw0Var.containerView.invalidate();
        }
    }

    public static LocationController.SharingLocationInfo r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i11).sharingLocationsUI;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            i10 -= arrayList.size();
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.liveLocationsChanged) {
            if (LocationController.getLocationsCount() == 0) {
                dismiss();
            } else {
                this.c.l();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.h5);
            Drawable drawable = this.d;
            if (drawable == null || themedColor == this.r) {
                return;
            }
            this.r = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
