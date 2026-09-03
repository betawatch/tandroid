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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ e3(n4 n4Var, int i10) {
        this.a = i10;
        this.b = n4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.l9 l9Var;
        switch (this.a) {
            case 0:
                n4 n4Var = this.b;
                if (n4Var.G0 && (articleViewer$WindowView = n4Var.c0) != null) {
                    n4Var.G0 = false;
                    if (n4Var.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        n4Var.Z(((org.telegram.ui.Components.o01) n4Var.b.i).b);
                        n4Var.b = null;
                        n4Var.d = null;
                        View view = n4Var.f;
                        if (view != null) {
                            view.invalidate();
                            break;
                        }
                    } else {
                        View view2 = n4Var.f;
                        if (view2 != null && n4Var.L0.g0(view2)) {
                            if (n4Var.f.getTag() == null || n4Var.f.getTag() != "bottomSheet" || (l9Var = n4Var.M0) == null) {
                                n4Var.L0.m0();
                            } else {
                                l9Var.m0();
                            }
                            if (n4Var.L0.y()) {
                                try {
                                    n4Var.c0.performHapticFeedback(0, 2);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                        } else if (n4Var.d != null && n4Var.f != null) {
                            try {
                                n4Var.c0.performHapticFeedback(0, 2);
                            } catch (Exception unused3) {
                            }
                            int[] iArr = new int[2];
                            n4Var.f.getLocationInWindow(iArr);
                            int dp = (iArr[1] + n4Var.e) - AndroidUtilities.dp(54.0f);
                            if (dp < 0) {
                                dp = 0;
                            }
                            n4Var.f.invalidate();
                            n4Var.h = true;
                            View view3 = n4Var.f;
                            org.telegram.ui.ActionBar.p1 p1Var = n4Var.E;
                            if (p1Var == null || !p1Var.isShowing()) {
                                if (n4Var.x0 == null) {
                                    n4Var.z0 = new Rect();
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(n4Var.I, null);
                                    n4Var.x0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                    n4Var.x0.setBackgroundDrawable(n4Var.I.getResources().getDrawable(R.drawable.menu_copy));
                                    n4Var.x0.setAnimationEnabled(false);
                                    n4Var.x0.setOnTouchListener(new g0(n4Var, 0));
                                    n4Var.x0.setDispatchKeyEventListener(new v(n4Var));
                                    n4Var.x0.setShownFromBottom(false);
                                    TextView textView = new TextView(n4Var.I);
                                    n4Var.y0 = textView;
                                    textView.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 2, -1));
                                    n4Var.y0.setGravity(16);
                                    n4Var.y0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                    n4Var.y0.setTextSize(1, 15.0f);
                                    n4Var.y0.setTypeface(AndroidUtilities.bold());
                                    n4Var.y0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                    n4Var.y0.setOnClickListener(new u(n4Var, 5));
                                    n4Var.x0.addView(n4Var.y0, k7.b6.c(48.0f, -2));
                                    org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(n4Var.x0, -2, -2);
                                    n4Var.E = p1Var2;
                                    p1Var2.b = false;
                                    p1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                    n4Var.E.setOutsideTouchable(true);
                                    n4Var.E.setClippingEnabled(true);
                                    n4Var.E.setInputMethodMode(2);
                                    n4Var.E.setSoftInputMode(0);
                                    n4Var.E.getContentView().setFocusableInTouchMode(true);
                                    n4Var.E.setOnDismissListener(new h0(n4Var, 0));
                                }
                                n4Var.y0.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = n4Var.x0;
                                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
                                }
                                n4Var.x0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                n4Var.E.setFocusable(true);
                                n4Var.E.showAtLocation(view3, 48, 0, dp);
                                n4Var.E.h();
                            } else {
                                n4Var.E.d(true);
                            }
                            n4Var.r0[0].b.setLayoutFrozen(true);
                            n4Var.r0[0].b.setLayoutFrozen(false);
                            break;
                        }
                    }
                }
                break;
            default:
                n4 n4Var2 = this.b;
                if (n4Var2.H0 == null) {
                    n4Var2.H0 = new e3(n4Var2, 0);
                }
                n4Var2.H0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = n4Var2.c0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(n4Var2.H0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
        }
    }
}
