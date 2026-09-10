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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mv0 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final bi.y1 b;
    public final kv0 c;
    public final Drawable d;
    public TextView e;
    public int f;
    public boolean h;
    public final lv0 n;

    public mv0(Context context, lv0 lv0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        this.n = lv0Var;
        fixNavigationBar();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.d = mutate;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        bi.ld ldVar = new bi.ld(this, context, 17);
        this.containerView = ldVar;
        ldVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        bi.y1 y1Var = new bi.y1(this, context, 21);
        this.b = y1Var;
        getContext();
        y1Var.setLayoutManager(new s4.c0(1, false));
        kv0 kv0Var = new kv0(this, context);
        this.c = kv0Var;
        y1Var.setAdapter(kv0Var);
        y1Var.setVerticalScrollBarEnabled(false);
        y1Var.setClipToPadding(false);
        y1Var.setEnabled(true);
        y1Var.setGlowColor(getThemedColor(org.telegram.ui.ActionBar.j6.A5));
        y1Var.setOnScrollListener(new al0(this, 2));
        y1Var.setOnItemClickListener(new k(this, 13));
        this.containerView.addView(y1Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.containerView.addView(view, w7.a6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        ag0 ag0Var = new ag0(context);
        ag0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.j6.ii;
        com.google.android.gms.internal.vision.e2.p(i12, null, false, textView, 17);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false) & 268435455, 0, -1));
        textView.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        ag0Var.addView(textView, w7.a6.e(-2, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false) & 268435455, 0, -1));
        linearLayout.setPadding(AndroidUtilities.dp(33.0f), 0, AndroidUtilities.dp(33.0f), 0);
        ag0Var.addView(linearLayout, w7.a6.e(-2, -1, 53));
        TextView textView2 = new TextView(context);
        org.telegram.messenger.em.j(13.0f, 1, textView2);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.li, null, false, textView2, 17);
        textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(11.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ki, false)));
        textView2.setMinWidth(AndroidUtilities.dp(23.0f));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView2, w7.a6.t(-2, 23, 16, 0, 0, 10, 0), context);
        g10.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(i12, null, false, g10, 17);
        g10.setCompoundDrawablePadding(AndroidUtilities.dp(8.0f));
        g10.setText(LocaleController.getString(R.string.Send).toUpperCase());
        g10.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(g10, w7.a6.q(-2, -2, 16));
        ag0Var.setBackgroundColor(getThemedColor(i10));
        this.containerView.addView(ag0Var, w7.a6.e(-1, 48, 83));
        textView.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        textView.setText(LocaleController.getString(R.string.StopAllLocationSharings));
        final int i13 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jv0
            public final /* synthetic */ mv0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        int i14 = 0;
                        while (true) {
                            mv0 mv0Var = this.b;
                            if (i14 >= 4) {
                                mv0Var.dismiss();
                                break;
                            } else {
                                mv0Var.getClass();
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
        g10.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.n5));
        g10.setText(LocaleController.getString(R.string.Close).toUpperCase());
        linearLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        final int i14 = 1;
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jv0
            public final /* synthetic */ mv0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        int i142 = 0;
                        while (true) {
                            mv0 mv0Var = this.b;
                            if (i142 >= 4) {
                                mv0Var.dismiss();
                                break;
                            } else {
                                mv0Var.getClass();
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
        kv0Var.l();
    }

    public static void m(mv0 mv0Var) {
        bi.y1 y1Var = mv0Var.b;
        if (y1Var.getChildCount() <= 0) {
            int paddingTop = y1Var.getPaddingTop();
            mv0Var.f = paddingTop;
            y1Var.setTopGlowOffset(paddingTop);
            mv0Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && fl0Var != null && fl0Var.b() == 0) {
            i10 = top;
        }
        if (mv0Var.f != i10) {
            mv0Var.f = i10;
            y1Var.setTopGlowOffset(i10);
            mv0Var.containerView.invalidate();
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

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
    }
}
