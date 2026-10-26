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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ew0 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public final bi.r1 b;
    public final cw0 c;
    public final Drawable d;
    public TextView e;
    public int f;
    public boolean h;
    public final dw0 n;
    public int r;

    public ew0(Context context, dw0 dw0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(1, context, u6Var, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.n = dw0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.y6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        bh.r rVar = new bh.r(this, context, 23);
        this.containerView = rVar;
        rVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        bi.r1 r1Var = new bi.r1(this, context, 23);
        this.b = r1Var;
        getContext();
        r1Var.setLayoutManager(new s4.c0(1, false));
        cw0 cw0Var = new cw0(this, context);
        this.c = cw0Var;
        r1Var.setAdapter(cw0Var);
        r1Var.setVerticalScrollBarEnabled(false);
        r1Var.setClipToPadding(false);
        r1Var.setEnabled(true);
        org.telegram.ui.ActionBar.f7.m(r1Var, 21, org.telegram.ui.ActionBar.y6.A5, u6Var);
        int i12 = 13;
        r1Var.setOnScrollListener(new ml(this, i12));
        r1Var.setOnItemClickListener(new j(this, i12));
        this.containerView.addView(r1Var, gb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, gb1.h(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        ng0 ng0Var = new ng0(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, ng0Var, null);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i13 = org.telegram.ui.ActionBar.y6.ii;
        org.telegram.ui.ActionBar.f7.V(textView, i13, null);
        textView.setGravity(17);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i13, false) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i13, 15);
        textView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(textView, g02, null, h, null);
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        ng0Var.addView(textView, gb1.i(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i13, false) & 268435455, 0, -1);
        org.telegram.ui.ActionBar.b7 h10 = org.telegram.ui.ActionBar.f7.h(i13, 15);
        linearLayout.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(linearLayout, g03, null, h10, null);
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        ng0Var.addView(linearLayout, gb1.i(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.vh.j(13.0f, 1, textView2);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.li, null);
        textView2.setGravity(17);
        int dp = AndroidUtilities.dp(11.0f);
        int i14 = org.telegram.ui.ActionBar.y6.ki;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.x0(null, i14, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        textView2.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(textView2, c02, N, null, null);
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView e = org.telegram.messenger.vh.e(linearLayout, textView2, gb1.x(-2, 23, 16, 0, 0, 10, 0), context);
        e.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(e, i13, null);
        e.setGravity(17);
        e.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        e.setText(LocaleController.getString(R.string.Send).toUpperCase());
        e.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(e, gb1.u(-2, -2, 16));
        org.telegram.ui.ActionBar.f7.i(i10, ng0Var, u6Var);
        this.containerView.addView(ng0Var, gb1.i(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, u6Var);
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        final int i15 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bw0
            public final /* synthetic */ ew0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        int i16 = 0;
                        while (true) {
                            ew0 ew0Var = this.b;
                            if (i16 >= 4) {
                                ew0Var.dismiss();
                                break;
                            } else {
                                ew0Var.getClass();
                                LocationController.getInstance(i16).removeAllLocationSharings();
                                i16++;
                            }
                        }
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.n5, u6Var);
        e.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        final int i16 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bw0
            public final /* synthetic */ ew0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        int i162 = 0;
                        while (true) {
                            ew0 ew0Var = this.b;
                            if (i162 >= 4) {
                                ew0Var.dismiss();
                                break;
                            } else {
                                ew0Var.getClass();
                                LocationController.getInstance(i162).removeAllLocationSharings();
                                i162++;
                            }
                        }
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        textView2.setVisibility(8);
        cw0Var.l();
    }

    public static void m(ew0 ew0Var) {
        bi.r1 r1Var = ew0Var.b;
        if (r1Var.getChildCount() <= 0) {
            int paddingTop = r1Var.getPaddingTop();
            ew0Var.f = paddingTop;
            r1Var.setTopGlowOffset(paddingTop);
            ew0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = r1Var.getChildAt(0);
        vl0 vl0Var = (vl0) r1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
            i10 = top;
        }
        if (ew0Var.f != i10) {
            ew0Var.f = i10;
            r1Var.setTopGlowOffset(i10);
            ew0Var.containerView.invalidate();
        }
    }

    public static LocationController.SharingLocationInfo q(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i11).sharingLocationsUI;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            i10 -= arrayList.size();
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.k3
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

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.h5);
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
