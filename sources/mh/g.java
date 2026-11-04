package mh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kh.k;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.cu0;
import org.telegram.ui.de;
import org.telegram.ui.f0;
import org.telegram.ui.kl;
import org.telegram.ui.wm;
import org.telegram.ui.xe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ g(FrameLayout frameLayout, int i3, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        xe xeVar;
        boolean z10;
        yk0 yk0Var;
        int i3 = this.a;
        int i10 = this.b;
        FrameLayout frameLayout = this.c;
        int i11 = 1;
        switch (i3) {
            case 0:
                b bVar = ((h) frameLayout).n;
                if (bVar != null) {
                    wm wmVar = ((de) bVar).b;
                    if (i10 == 2) {
                        xeVar = new xe(wmVar, 11);
                        z10 = true;
                    } else if (i10 == 3) {
                        xeVar = new xe(wmVar, 12);
                        z10 = false;
                    } else if (i10 == 4) {
                        xeVar = new xe(wmVar, 13);
                        z10 = 2;
                    }
                    Activity parentActivity = wmVar.getParentActivity();
                    q4 parentLayout = wmVar.getParentLayout();
                    kl klVar = wmVar.m1;
                    e6 resourceProvider = wmVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(g0.L(200.0f));
                    y0 y0Var = new y0(0, parentActivity, resourceProvider, true, true);
                    y0Var.setMinimumWidth(g0.L(200.0f));
                    y0Var.j(!z10 ? bd.M0(2131746380, null) : z10 ? bd.M0(2131746382, null) : bd.M0(2131746381, null), R.drawable.msg_seen, null);
                    y0Var.setOnClickListener(new cu0(1, xeVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(y0Var);
                    f1 f1Var = new f1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    f1Var.e = true;
                    f1Var.c = hs.x3;
                    f1Var.setOutsideTouchable(true);
                    f1Var.setClippingEnabled(true);
                    f1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    f1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), TLObject.FLAG_31));
                    f1Var.setInputMethodMode(2);
                    f1Var.setSoftInputMode(0);
                    f1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, klVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + g0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (g0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    f1Var.showAtLocation(klVar, 51, (int) width, (int) measuredHeight);
                    wmVar.f9 = f1Var;
                    wmVar.u8(wmVar.y1, false);
                    wmVar.f9.setOnDismissListener(new f0(wmVar, i11));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                return (scrollSlidingTextTabStrip.o0 || (yk0Var = scrollSlidingTextTabStrip.b) == null || !yk0Var.k1(i10, view)) ? false : true;
        }
    }
}
