package jh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import hh.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.f0;
import org.telegram.ui.of;
import org.telegram.ui.pe;
import org.telegram.ui.pm;
import org.telegram.ui.sy0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ g(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        of ofVar;
        char c10;
        xm0 xm0Var;
        switch (this.a) {
            case 0:
                b bVar = ((h) this.c).n;
                if (bVar != null) {
                    wn wnVar = ((pe) bVar).b;
                    int i10 = this.b;
                    if (i10 == 2) {
                        ofVar = new of(wnVar, 9);
                        c10 = 1;
                    } else if (i10 == 3) {
                        ofVar = new of(wnVar, 10);
                        c10 = 0;
                    } else if (i10 == 4) {
                        ofVar = new of(wnVar, 11);
                        c10 = 2;
                    }
                    Activity parentActivity = wnVar.getParentActivity();
                    b5 parentLayout = wnVar.getParentLayout();
                    pm pmVar = wnVar.X0;
                    d6 resourceProvider = wnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    e1 e1Var = new e1(0, parentActivity, resourceProvider, true, true);
                    e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    e1Var.g(c10 == 0 ? LocaleController.getString(R.string.ReadAllReactions) : c10 == 1 ? LocaleController.getString(R.string.ReadAllMentions) : LocaleController.getString(R.string.ReadAllPollVotes), R.drawable.msg_seen, null);
                    e1Var.setOnClickListener(new sy0(1, ofVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
                    m1 m1Var = new m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    m1Var.e = true;
                    m1Var.c = 220;
                    m1Var.setOutsideTouchable(true);
                    m1Var.setClippingEnabled(true);
                    m1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    m1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    m1Var.setInputMethodMode(2);
                    m1Var.setSoftInputMode(0);
                    m1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, pmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    m1Var.showAtLocation(pmVar, 51, (int) width, (int) measuredHeight);
                    wnVar.Q8 = m1Var;
                    wnVar.f8(wnVar.j1, false);
                    wnVar.Q8.setOnDismissListener(new f0(wnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        break;
                    }
                }
                break;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.c;
                if (!scrollSlidingTextTabStrip.n0 && (xm0Var = scrollSlidingTextTabStrip.b) != null && xm0Var.n1(this.b, view)) {
                }
                break;
        }
        return false;
        return true;
    }
}
