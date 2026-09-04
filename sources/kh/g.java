package kh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ih.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.bz0;
import org.telegram.ui.co;
import org.telegram.ui.e0;
import org.telegram.ui.qf;
import org.telegram.ui.um;
import org.telegram.ui.ve;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        qf qfVar;
        char c10;
        lm0 lm0Var;
        switch (this.a) {
            case 0:
                b bVar = ((h) this.c).n;
                if (bVar != null) {
                    co coVar = ((ve) bVar).b;
                    int i10 = this.b;
                    if (i10 == 2) {
                        qfVar = new qf(coVar, 10);
                        c10 = 1;
                    } else if (i10 == 3) {
                        qfVar = new qf(coVar, 11);
                        c10 = 0;
                    } else if (i10 == 4) {
                        qfVar = new qf(coVar, 12);
                        c10 = 2;
                    }
                    Activity parentActivity = coVar.getParentActivity();
                    d5 parentLayout = coVar.getParentLayout();
                    um umVar = coVar.X0;
                    f6 resourceProvider = coVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    f1 f1Var = new f1(0, parentActivity, resourceProvider, true, true);
                    f1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    f1Var.g(c10 == 0 ? LocaleController.getString(R.string.ReadAllReactions) : c10 == 1 ? LocaleController.getString(R.string.ReadAllMentions) : LocaleController.getString(R.string.ReadAllPollVotes), R.drawable.msg_seen, null);
                    f1Var.setOnClickListener(new bz0(1, qfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
                    n1 n1Var = new n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    n1Var.e = true;
                    n1Var.c = 220;
                    n1Var.setOutsideTouchable(true);
                    n1Var.setClippingEnabled(true);
                    n1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    n1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
                    n1Var.setInputMethodMode(2);
                    n1Var.setSoftInputMode(0);
                    n1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, umVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    n1Var.showAtLocation(umVar, 51, (int) width, (int) measuredHeight);
                    coVar.Q8 = n1Var;
                    coVar.f8(coVar.j1, false);
                    coVar.Q8.setOnDismissListener(new e0(coVar, 1));
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
                if (!scrollSlidingTextTabStrip.n0 && (lm0Var = scrollSlidingTextTabStrip.b) != null && lm0Var.n1(this.b, view)) {
                }
                break;
        }
        return false;
        return true;
    }
}
