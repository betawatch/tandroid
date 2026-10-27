package lh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jh.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.e0;
import org.telegram.ui.jf;
import org.telegram.ui.my0;
import org.telegram.ui.om;
import org.telegram.ui.qe;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        jf jfVar;
        boolean z10;
        tn0 tn0Var;
        switch (this.a) {
            case 0:
                b bVar = ((h) this.c).n;
                if (bVar != null) {
                    wn wnVar = ((qe) bVar).b;
                    int i10 = this.b;
                    if (i10 == 2) {
                        jfVar = new jf(wnVar, 10);
                        z10 = true;
                    } else if (i10 == 3) {
                        jfVar = new jf(wnVar, 11);
                        z10 = false;
                    } else if (i10 == 4) {
                        jfVar = new jf(wnVar, 12);
                        z10 = 2;
                    }
                    Activity parentActivity = wnVar.getParentActivity();
                    j5 parentLayout = wnVar.getParentLayout();
                    om omVar = wnVar.j1;
                    u6 resourceProvider = wnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1 g1Var = new g1(0, parentActivity, resourceProvider, true, true);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1Var.j(!z10 ? LocaleController.getString(R.string.ReadAllReactions) : z10 ? LocaleController.getString(R.string.ReadAllMentions) : LocaleController.getString(R.string.ReadAllPollVotes), R.drawable.msg_seen, null);
                    g1Var.setOnClickListener(new my0(1, jfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                    o1 o1Var = new o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
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
                    k.b(view, omVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var.showAtLocation(omVar, 51, (int) width, (int) measuredHeight);
                    wnVar.g9 = o1Var;
                    wnVar.o8(wnVar.v1, false);
                    wnVar.g9.setOnDismissListener(new e0(wnVar, 1));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.c;
                return (scrollSlidingTextTabStrip.n0 || (tn0Var = scrollSlidingTextTabStrip.b) == null || !tn0Var.h1(this.b, view)) ? false : true;
        }
    }
}
