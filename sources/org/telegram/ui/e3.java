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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ e3(m4 m4Var, int i10) {
        this.a = i10;
        this.b = m4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArticleViewer$WindowView articleViewer$WindowView;
        org.telegram.ui.Cells.j9 j9Var;
        switch (this.a) {
            case 0:
                m4 m4Var = this.b;
                if (m4Var.F0 && (articleViewer$WindowView = m4Var.b0) != null) {
                    m4Var.F0 = false;
                    if (m4Var.b != null) {
                        try {
                            articleViewer$WindowView.performHapticFeedback(0, 2);
                        } catch (Exception unused) {
                        }
                        m4Var.Z(((org.telegram.ui.Components.tz0) m4Var.b.i).b);
                        m4Var.b = null;
                        m4Var.d = null;
                        View view = m4Var.f;
                        if (view != null) {
                            view.invalidate();
                            break;
                        }
                    } else {
                        View view2 = m4Var.f;
                        if (view2 != null && m4Var.K0.g0(view2)) {
                            if (m4Var.f.getTag() == null || m4Var.f.getTag() != "bottomSheet" || (j9Var = m4Var.L0) == null) {
                                m4Var.K0.m0();
                            } else {
                                j9Var.m0();
                            }
                            if (m4Var.K0.y()) {
                                try {
                                    m4Var.b0.performHapticFeedback(0, 2);
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                        } else if (m4Var.d != null && m4Var.f != null) {
                            try {
                                m4Var.b0.performHapticFeedback(0, 2);
                            } catch (Exception unused3) {
                            }
                            int[] iArr = new int[2];
                            m4Var.f.getLocationInWindow(iArr);
                            int dp = (iArr[1] + m4Var.e) - AndroidUtilities.dp(54.0f);
                            if (dp < 0) {
                                dp = 0;
                            }
                            m4Var.f.invalidate();
                            m4Var.h = true;
                            View view3 = m4Var.f;
                            org.telegram.ui.ActionBar.n1 n1Var = m4Var.D;
                            if (n1Var == null || !n1Var.isShowing()) {
                                if (m4Var.w0 == null) {
                                    m4Var.y0 = new Rect();
                                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(m4Var.H, null);
                                    m4Var.w0 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                                    actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
                                    m4Var.w0.setBackgroundDrawable(m4Var.H.getResources().getDrawable(R.drawable.menu_copy));
                                    m4Var.w0.setAnimationEnabled(false);
                                    m4Var.w0.setOnTouchListener(new g0(m4Var, 0));
                                    m4Var.w0.setDispatchKeyEventListener(new u(m4Var));
                                    m4Var.w0.setShownFromBottom(false);
                                    TextView textView = new TextView(m4Var.H);
                                    m4Var.x0 = textView;
                                    textView.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 2, -1));
                                    m4Var.x0.setGravity(16);
                                    m4Var.x0.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
                                    m4Var.x0.setTextSize(1, 15.0f);
                                    m4Var.x0.setTypeface(AndroidUtilities.bold());
                                    m4Var.x0.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                                    m4Var.x0.setOnClickListener(new t(m4Var, 5));
                                    m4Var.w0.addView(m4Var.x0, h7.z5.c(48.0f, -2));
                                    org.telegram.ui.ActionBar.n1 n1Var2 = new org.telegram.ui.ActionBar.n1(m4Var.w0, -2, -2);
                                    m4Var.D = n1Var2;
                                    n1Var2.b = false;
                                    n1Var2.setAnimationStyle(R.style.PopupContextAnimation);
                                    m4Var.D.setOutsideTouchable(true);
                                    m4Var.D.setClippingEnabled(true);
                                    m4Var.D.setInputMethodMode(2);
                                    m4Var.D.setSoftInputMode(0);
                                    m4Var.D.getContentView().setFocusableInTouchMode(true);
                                    m4Var.D.setOnDismissListener(new h0(m4Var, 0));
                                }
                                m4Var.x0.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = m4Var.w0;
                                if (actionBarPopupWindow$ActionBarPopupWindowLayout2 != null) {
                                    actionBarPopupWindow$ActionBarPopupWindowLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false));
                                }
                                m4Var.w0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                                m4Var.D.setFocusable(true);
                                m4Var.D.showAtLocation(view3, 48, 0, dp);
                                m4Var.D.h();
                            } else {
                                m4Var.D.d(true);
                            }
                            m4Var.q0[0].b.setLayoutFrozen(true);
                            m4Var.q0[0].b.setLayoutFrozen(false);
                            break;
                        }
                    }
                }
                break;
            default:
                m4 m4Var2 = this.b;
                if (m4Var2.G0 == null) {
                    m4Var2.G0 = new e3(m4Var2, 0);
                }
                m4Var2.G0.getClass();
                ArticleViewer$WindowView articleViewer$WindowView2 = m4Var2.b0;
                if (articleViewer$WindowView2 != null) {
                    articleViewer$WindowView2.postDelayed(m4Var2.G0, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
                    break;
                }
                break;
        }
    }
}
