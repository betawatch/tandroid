package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uu0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final jh.e1 b;
    public final su0 c;
    public final Drawable d;
    public TextView e;
    public int f;
    public boolean h;
    public final tu0 n;

    public uu0(Context context, tu0 tu0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.n = tu0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        bg.x2 x2Var = new bg.x2(this, context, 27);
        this.containerView = x2Var;
        x2Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        jh.e1 e1Var = new jh.e1(this, context, 21);
        this.b = e1Var;
        getContext();
        e1Var.setLayoutManager(new f2.j0(1, false));
        su0 su0Var = new su0(this, context);
        this.c = su0Var;
        e1Var.setAdapter(su0Var);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setClipToPadding(false);
        e1Var.setEnabled(true);
        e1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.g6.A5));
        e1Var.setOnScrollListener(new h00(this, 7));
        e1Var.setOnItemClickListener(new k(this, 13));
        this.containerView.addView(e1Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, i7.f6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        nf0 nf0Var = new nf0(context);
        nf0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.g6.ii;
        org.telegram.ui.th.s(i12, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        nf0Var.addView(textView, i7.f6.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i12, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        nf0Var.addView(linearLayout, i7.f6.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.ui.b.g(13.0f, 1, textView2);
        org.telegram.ui.th.s(org.telegram.ui.ActionBar.g6.li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ki, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView i13 = org.telegram.ui.th.i(linearLayout, textView2, i7.f6.t(-2, 23, 16, 0, 0, 10, 0), context);
        i13.setTextSize(1, 14.0f);
        org.telegram.ui.th.s(i12, null, false, i13, 17);
        i13.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        i13.setText(LocaleController.getString(R.string.Send).toUpperCase());
        i13.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(i13, i7.f6.q(-2, -2, 16));
        nf0Var.setBackgroundColor(getThemedColor(i10));
        this.containerView.addView(nf0Var, i7.f6.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        final int i14 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ru0
            public final /* synthetic */ uu0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        int i15 = 0;
                        while (true) {
                            uu0 uu0Var = this.b;
                            if (i15 >= 4) {
                                uu0Var.dismiss();
                                break;
                            } else {
                                uu0Var.getClass();
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
        i13.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.n5));
        i13.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        final int i15 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ru0
            public final /* synthetic */ uu0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        int i152 = 0;
                        while (true) {
                            uu0 uu0Var = this.b;
                            if (i152 >= 4) {
                                uu0Var.dismiss();
                                break;
                            } else {
                                uu0Var.getClass();
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
        su0Var.l();
    }

    public static void m(uu0 uu0Var) {
        jh.e1 e1Var = uu0Var.b;
        if (e1Var.getChildCount() <= 0) {
            int paddingTop = e1Var.getPaddingTop();
            uu0Var.f = paddingTop;
            e1Var.setTopGlowOffset(paddingTop);
            uu0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = e1Var.getChildAt(0);
        vk0 vk0Var = (vk0) e1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        }
        if (uu0Var.f != i10) {
            uu0Var.f = i10;
            e1Var.setTopGlowOffset(i10);
            uu0Var.containerView.invalidate();
        }
    }

    public static LocationController.SharingLocationInfo p(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            ArrayList<LocationController.SharingLocationInfo> arrayList = LocationController.getInstance(i11).sharingLocationsUI;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            i10 -= arrayList.size();
        }
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f3
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
