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
import org.telegram.ui.ActionBar.e1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.e0;
import org.telegram.ui.hy0;
import org.telegram.ui.kf;
import org.telegram.ui.km;
import org.telegram.ui.pe;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
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
        kf kfVar;
        boolean z10;
        nn0 nn0Var;
        switch (this.a) {
            case 0:
                b bVar = ((h) this.c).n;
                if (bVar != null) {
                    sn snVar = ((pe) bVar).b;
                    int i10 = this.b;
                    if (i10 == 2) {
                        kfVar = new kf(snVar, 8);
                        z10 = true;
                    } else if (i10 == 3) {
                        kfVar = new kf(snVar, 9);
                        z10 = false;
                    } else if (i10 == 4) {
                        kfVar = new kf(snVar, 10);
                        z10 = 2;
                    }
                    Activity parentActivity = snVar.getParentActivity();
                    h5 parentLayout = snVar.getParentLayout();
                    km kmVar = snVar.j1;
                    g6 resourceProvider = snVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    e1 e1Var = new e1(0, parentActivity, resourceProvider, true, true);
                    e1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    e1Var.j(!z10 ? LocaleController.getString(R.string.ReadAllReactions) : z10 ? LocaleController.getString(R.string.ReadAllMentions) : LocaleController.getString(R.string.ReadAllPollVotes), R.drawable.msg_seen, null);
                    e1Var.setOnClickListener(new hy0(1, kfVar));
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
                    k.b(view, kmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    m1Var.showAtLocation(kmVar, 51, (int) width, (int) measuredHeight);
                    snVar.c9 = m1Var;
                    snVar.i8(snVar.v1, false);
                    snVar.c9.setOnDismissListener(new e0(snVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.c;
                return (scrollSlidingTextTabStrip.n0 || (nn0Var = scrollSlidingTextTabStrip.b) == null || !nn0Var.b1(this.b, view)) ? false : true;
        }
    }
}
