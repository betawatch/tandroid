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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bv0 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final bi.o0 b;
    public final zu0 c;
    public final Drawable d;
    public TextView e;
    public int f;
    public boolean h;
    public final av0 n;

    public bv0(Context context, av0 av0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.n = av0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        ah.y yVar = new ah.y(this, context, 20);
        this.containerView = yVar;
        yVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        bi.o0 o0Var = new bi.o0(this, context, 22);
        this.b = o0Var;
        getContext();
        o0Var.setLayoutManager(new s4.c0(1, false));
        zu0 zu0Var = new zu0(this, context);
        this.c = zu0Var;
        o0Var.setAdapter(zu0Var);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.setClipToPadding(false);
        o0Var.setEnabled(true);
        o0Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        o0Var.setOnScrollListener(new lb0(this, 5));
        o0Var.setOnItemClickListener(new k(this, 13));
        this.containerView.addView(o0Var, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, w7.x5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        rf0 rf0Var = new rf0(context);
        rf0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.j6.ii;
        com.google.android.gms.internal.vision.e2.p(i12, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        rf0Var.addView(textView, w7.x5.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        rf0Var.addView(linearLayout, w7.x5.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.wl.j(13.0f, 1, textView2);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ki, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView2, w7.x5.t(-2, 23, 16, 0, 0, 10, 0), context);
        h.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i12, null, false, h, 17);
        h.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        h.setText(LocaleController.getString(R.string.Send).toUpperCase());
        h.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(h, w7.x5.q(-2, -2, 16));
        rf0Var.setBackgroundColor(getThemedColor(i10));
        this.containerView.addView(rf0Var, w7.x5.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        final int i13 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yu0
            public final /* synthetic */ bv0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            bv0 bv0Var = this.b;
                            if (i14 >= 4) {
                                bv0Var.dismiss();
                                break;
                            } else {
                                bv0Var.getClass();
                                LocationController.getInstance(i14).removeAllLocationSharings();
                                i14++;
                            }
                        }
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        h.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.n5));
        h.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        final int i14 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yu0
            public final /* synthetic */ bv0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        int i142 = 0;
                        while (true) {
                            bv0 bv0Var = this.b;
                            if (i142 >= 4) {
                                bv0Var.dismiss();
                                break;
                            } else {
                                bv0Var.getClass();
                                LocationController.getInstance(i142).removeAllLocationSharings();
                                i142++;
                            }
                        }
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        textView2.setVisibility(8);
        zu0Var.l();
    }

    public static void m(bv0 bv0Var) {
        bi.o0 o0Var = bv0Var.b;
        if (o0Var.getChildCount() <= 0) {
            int paddingTop = o0Var.getPaddingTop();
            bv0Var.f = paddingTop;
            o0Var.setTopGlowOffset(paddingTop);
            bv0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = o0Var.getChildAt(0);
        vk0 vk0Var = (vk0) o0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && vk0Var != null && vk0Var.b() == 0) {
            i10 = top;
        }
        if (bv0Var.f != i10) {
            bv0Var.f = i10;
            o0Var.setTopGlowOffset(i10);
            bv0Var.containerView.invalidate();
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

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
