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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ d3(l4 l4Var, int i9) {
        this.a = i9;
        this.b = l4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.n9 n9Var;
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                if (l4Var.F0 && (articleViewer$WindowView = l4Var.b0) != null) {
                    l4Var.F0 = false;
                    if (l4Var.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        l4Var.Z(((org.telegram.ui.Components.rz0) l4Var.b.i).b);
                        l4Var.b = null;
                        l4Var.d = null;
                        View view = l4Var.f;
                        if (view != null) {
                            view.invalidate();
                            break;
                        }
                    } else {
                        View view2 = l4Var.f;
                        if (view2 != null && l4Var.K0.g0(view2)) {
                            if (l4Var.f.getTag() == null || l4Var.f.getTag() != "bottomSheet" || (n9Var = l4Var.L0) == null) {
                                l4Var.K0.m0();
                            } else {
                                n9Var.m0();
                            }
                            if (l4Var.K0.y()) {
                                try {
                                    l4Var.b0.performHapticFeedback(0, 2);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                        } else if (l4Var.d != null && l4Var.f != null) {
                            try {
                                l4Var.b0.performHapticFeedback(0, 2);
                            } catch (Exception unused3) {
                            }
                            int[] iArr = new int[2];
                            l4Var.f.getLocationInWindow(iArr);
                            int dp = (iArr[1] + l4Var.e) - AndroidUtilities.dp(54.0f);
                            if (dp < 0) {
                                dp = 0;
                            }
                            l4Var.f.invalidate();
                            l4Var.h = true;
                            View view3 = l4Var.f;
                            org.telegram.ui.ActionBar.o1 o1Var = l4Var.D;
                            if (o1Var == null || !o1Var.isShowing()) {
                                if (l4Var.w0 == null) {
                                    l4Var.y0 = new Rect();
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(l4Var.H, null);
                                    l4Var.w0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                    l4Var.w0.setBackgroundDrawable(l4Var.H.getResources().getDrawable(R.drawable.menu_copy));
                                    l4Var.w0.setAnimationEnabled(false);
                                    l4Var.w0.setOnTouchListener(new f0(l4Var, 0));
                                    l4Var.w0.setDispatchKeyEventListener(new t(l4Var));
                                    l4Var.w0.setShownFromBottom(false);
                                    TextView textView = new TextView(l4Var.H);
                                    l4Var.x0 = textView;
                                    textView.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 2, -1));
                                    l4Var.x0.setGravity(16);
                                    l4Var.x0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                    l4Var.x0.setTextSize(1, 15.0f);
                                    l4Var.x0.setTypeface(AndroidUtilities.bold());
                                    l4Var.x0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                    l4Var.x0.setOnClickListener(new s(l4Var, 5));
                                    l4Var.w0.addView(l4Var.x0, g7.e6.c(48.0f, -2));
                                    org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(l4Var.w0, -2, -2);
                                    l4Var.D = o1Var2;
                                    o1Var2.b = false;
                                    o1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                    l4Var.D.setOutsideTouchable(true);
                                    l4Var.D.setClippingEnabled(true);
                                    l4Var.D.setInputMethodMode(2);
                                    l4Var.D.setSoftInputMode(0);
                                    l4Var.D.getContentView().setFocusableInTouchMode(true);
                                    l4Var.D.setOnDismissListener(new g0(l4Var, 0));
                                }
                                l4Var.x0.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E8, false));
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = l4Var.w0;
                                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G8, false));
                                }
                                l4Var.w0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                l4Var.D.setFocusable(true);
                                l4Var.D.showAtLocation(view3, 48, 0, dp);
                                l4Var.D.h();
                            } else {
                                l4Var.D.d(true);
                            }
                            l4Var.q0[0].b.setLayoutFrozen(true);
                            l4Var.q0[0].b.setLayoutFrozen(false);
                            break;
                        }
                    }
                }
                break;
            default:
                l4 l4Var2 = this.b;
                if (l4Var2.G0 == null) {
                    l4Var2.G0 = new d3(l4Var2, 0);
                }
                l4Var2.G0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = l4Var2.b0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(l4Var2.G0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
        }
    }
}
