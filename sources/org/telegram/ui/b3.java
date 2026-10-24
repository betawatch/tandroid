package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public /* synthetic */ b3(k4 k4Var, int i10) {
        this.a = i10;
        this.b = k4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.o9 o9Var;
        switch (this.a) {
            case 0:
                k4 k4Var = this.b;
                if (k4Var.K0 && (articleViewer$WindowView = k4Var.f0) != null) {
                    k4Var.K0 = false;
                    if (k4Var.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        k4Var.Z(((org.telegram.ui.Components.m11) k4Var.b.i).b);
                        k4Var.b = null;
                        k4Var.d = null;
                        View view = k4Var.f;
                        if (view != null) {
                            view.invalidate();
                            break;
                        }
                    } else {
                        View view2 = k4Var.f;
                        if (view2 != null && k4Var.P0.f0(view2)) {
                            if (k4Var.f.getTag() == null || k4Var.f.getTag() != "bottomSheet" || (o9Var = k4Var.Q0) == null) {
                                k4Var.P0.l0();
                            } else {
                                o9Var.l0();
                            }
                            if (k4Var.P0.x()) {
                                try {
                                    k4Var.f0.performHapticFeedback(0, 2);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                        } else if (k4Var.d != null && k4Var.f != null) {
                            try {
                                k4Var.f0.performHapticFeedback(0, 2);
                            } catch (Exception unused3) {
                            }
                            int[] iArr = new int[2];
                            k4Var.f.getLocationInWindow(iArr);
                            int dp = (iArr[1] + k4Var.e) - AndroidUtilities.dp(54.0f);
                            if (dp < 0) {
                                dp = 0;
                            }
                            k4Var.f.invalidate();
                            k4Var.h = true;
                            View view3 = k4Var.f;
                            org.telegram.ui.ActionBar.m1 m1Var = k4Var.H;
                            if (m1Var == null || !m1Var.isShowing()) {
                                if (k4Var.B0 == null) {
                                    k4Var.D0 = new Rect();
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(k4Var.L, null);
                                    k4Var.B0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                    k4Var.B0.setBackgroundDrawable(k4Var.L.getResources().getDrawable(R.drawable.menu_copy));
                                    k4Var.B0.setAnimationEnabled(false);
                                    k4Var.B0.setOnTouchListener(new d0(k4Var, 0));
                                    k4Var.B0.setDispatchKeyEventListener(new s(k4Var));
                                    k4Var.B0.setShownFromBottom(false);
                                    TextView textView = new TextView(k4Var.L);
                                    k4Var.C0 = textView;
                                    int i10 = org.telegram.ui.ActionBar.k6.i6;
                                    org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 2, -1);
                                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
                                    textView.setBackground(g02);
                                    org.telegram.ui.ActionBar.r6.k(textView, g02, null, O, null);
                                    k4Var.C0.setGravity(16);
                                    k4Var.C0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                    k4Var.C0.setTextSize(1, 15.0f);
                                    k4Var.C0.setTypeface(AndroidUtilities.bold());
                                    k4Var.C0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                    k4Var.C0.setOnClickListener(new r(k4Var, 5));
                                    k4Var.B0.addView(k4Var.C0, w7.z5.c(48.0f, -2));
                                    org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(k4Var.B0, -2, -2);
                                    k4Var.H = m1Var2;
                                    m1Var2.b = false;
                                    m1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                    k4Var.H.setOutsideTouchable(true);
                                    k4Var.H.setClippingEnabled(true);
                                    k4Var.H.setInputMethodMode(2);
                                    k4Var.H.setSoftInputMode(0);
                                    k4Var.H.getContentView().setFocusableInTouchMode(true);
                                    k4Var.H.setOnDismissListener(new e0(k4Var, 0));
                                }
                                org.telegram.ui.ActionBar.r6.W(k4Var.C0, org.telegram.ui.ActionBar.k6.E8, null);
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = k4Var.B0;
                                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.G8, actionBarPopupWindow$ActionBarPopupWindowLayout2, null);
                                }
                                k4Var.B0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                k4Var.H.setFocusable(true);
                                k4Var.H.showAtLocation(view3, 48, 0, dp);
                                k4Var.H.h();
                            } else {
                                k4Var.H.d(true);
                            }
                            k4Var.u0[0].b.setLayoutFrozen(true);
                            k4Var.u0[0].b.setLayoutFrozen(false);
                            break;
                        }
                    }
                }
                break;
            default:
                k4 k4Var2 = this.b;
                if (k4Var2.L0 == null) {
                    k4Var2.L0 = new b3(k4Var2, 0);
                }
                k4Var2.L0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = k4Var2.f0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(k4Var2.L0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
        }
    }
}
