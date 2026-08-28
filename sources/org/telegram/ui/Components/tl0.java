package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ tl0(FrameLayout frameLayout, int i9, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i9;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        wl0 wl0Var;
        org.telegram.ui.gf gfVar;
        char c10;
        switch (this.a) {
            case 0:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.c;
                if (!scrollSlidingTextTabStrip.j0 && (wl0Var = scrollSlidingTextTabStrip.b) != null && wl0Var.k1(this.b, view)) {
                }
                break;
            default:
                rg.b bVar = ((rg.g) this.c).n;
                if (bVar != null) {
                    org.telegram.ui.qn qnVar = ((org.telegram.ui.oe) bVar).b;
                    int i9 = this.b;
                    if (i9 == 2) {
                        gfVar = new org.telegram.ui.gf(qnVar, 10);
                        c10 = 1;
                    } else if (i9 == 3) {
                        gfVar = new org.telegram.ui.gf(qnVar, 11);
                        c10 = 0;
                    } else if (i9 == 4) {
                        gfVar = new org.telegram.ui.gf(qnVar, 12);
                        c10 = 2;
                    }
                    Activity parentActivity = qnVar.getParentActivity();
                    org.telegram.ui.ActionBar.b5 parentLayout = qnVar.getParentLayout();
                    org.telegram.ui.im imVar = qnVar.T0;
                    org.telegram.ui.ActionBar.b6 resourceProvider = qnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, parentActivity, resourceProvider, true, true);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1Var.g(c10 == 0 ? LocaleController.getString(R.string.ReadAllReactions) : c10 == 1 ? LocaleController.getString(R.string.ReadAllMentions) : LocaleController.getString(R.string.ReadAllPollVotes), R.drawable.msg_seen, null);
                    g1Var.setOnClickListener(new org.telegram.ui.wx0(1, gfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    o1Var.e = true;
                    o1Var.c = 220;
                    o1Var.setOutsideTouchable(true);
                    o1Var.setClippingEnabled(true);
                    o1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    o1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    o1Var.setInputMethodMode(2);
                    o1Var.setSoftInputMode(0);
                    o1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    pg.i.b(view, imVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var.showAtLocation(imVar, 51, (int) width, (int) measuredHeight);
                    qnVar.M8 = o1Var;
                    qnVar.f8(qnVar.f1, false);
                    qnVar.M8.setOnDismissListener(new org.telegram.ui.g0(qnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        break;
                    }
                }
                break;
        }
        return false;
        return true;
    }
}
