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
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.bo;
import org.telegram.ui.cz0;
import org.telegram.ui.e0;
import org.telegram.ui.sf;
import org.telegram.ui.tm;
import org.telegram.ui.we;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        sf sfVar;
        char c10;
        mm0 mm0Var;
        switch (this.a) {
            case 0:
                b bVar = ((h) this.c).n;
                if (bVar != null) {
                    bo boVar = ((we) bVar).b;
                    int i10 = this.b;
                    if (i10 == 2) {
                        sfVar = new sf(boVar, 10);
                        c10 = 1;
                    } else if (i10 == 3) {
                        sfVar = new sf(boVar, 11);
                        c10 = 0;
                    } else if (i10 == 4) {
                        sfVar = new sf(boVar, 12);
                        c10 = 2;
                    }
                    Activity parentActivity = boVar.getParentActivity();
                    e5 parentLayout = boVar.getParentLayout();
                    tm tmVar = boVar.X0;
                    f6 resourceProvider = boVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1 g1Var = new g1(0, parentActivity, resourceProvider, true, true);
                    g1Var.setMinimumWidth(AndroidUtilities.dp(200.0f));
                    g1Var.g(c10 == 0 ? LocaleController.getString(R.string.ReadAllReactions) : c10 == 1 ? LocaleController.getString(R.string.ReadAllMentions) : LocaleController.getString(R.string.ReadAllPollVotes), R.drawable.msg_seen, null);
                    g1Var.setOnClickListener(new cz0(1, sfVar));
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
                    k.b(view, tmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (AndroidUtilities.isTablet()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    o1Var.showAtLocation(tmVar, 51, (int) width, (int) measuredHeight);
                    boVar.Q8 = o1Var;
                    boVar.f8(boVar.j1, false);
                    boVar.Q8.setOnDismissListener(new e0(boVar, 1));
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
                if (!scrollSlidingTextTabStrip.n0 && (mm0Var = scrollSlidingTextTabStrip.b) != null && mm0Var.n1(this.b, view)) {
                }
                break;
        }
        return false;
        return true;
    }
}
