package lh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jh.k;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.af;
import org.telegram.ui.bn;
import org.telegram.ui.e0;
import org.telegram.ui.ee;
import org.telegram.ui.mu0;
import org.telegram.ui.pl;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ g(FrameLayout frameLayout, int i7, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i7;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        af afVar;
        boolean z10;
        hl0 hl0Var;
        int i7 = this.a;
        int i10 = this.b;
        FrameLayout frameLayout = this.c;
        int i11 = 1;
        switch (i7) {
            case 0:
                b bVar = ((h) frameLayout).n;
                if (bVar != null) {
                    bn bnVar = ((ee) bVar).b;
                    if (i10 == 2) {
                        afVar = new af(bnVar, 10);
                        z10 = true;
                    } else if (i10 == 3) {
                        afVar = new af(bnVar, 11);
                        z10 = false;
                    } else if (i10 == 4) {
                        afVar = new af(bnVar, 12);
                        z10 = 2;
                    }
                    Activity parentActivity = bnVar.getParentActivity();
                    s4 parentLayout = bnVar.getParentLayout();
                    pl plVar = bnVar.m1;
                    i6 resourceProvider = bnVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(g0.L(200.0f));
                    z0 z0Var = new z0(0, parentActivity, resourceProvider, true, true);
                    z0Var.setMinimumWidth(g0.L(200.0f));
                    z0Var.j(!z10 ? gd.M0(2131746177, null) : z10 ? gd.M0(2131746179, null) : gd.M0(2131746178, null), R.drawable.msg_seen, null);
                    z0Var.setOnClickListener(new mu0(1, afVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                    h1 h1Var = new h1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    h1Var.e = true;
                    h1Var.c = ks.x3;
                    h1Var.setOutsideTouchable(true);
                    h1Var.setClippingEnabled(true);
                    h1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    h1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), TLObject.FLAG_31));
                    h1Var.setInputMethodMode(2);
                    h1Var.setSoftInputMode(0);
                    h1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, plVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + g0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (g0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    h1Var.showAtLocation(plVar, 51, (int) width, (int) measuredHeight);
                    bnVar.g9 = h1Var;
                    bnVar.w8(bnVar.y1, false);
                    bnVar.g9.setOnDismissListener(new e0(bnVar, i11));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                return (scrollSlidingTextTabStrip.o0 || (hl0Var = scrollSlidingTextTabStrip.b) == null || !hl0Var.h1(i10, view)) ? false : true;
        }
    }
}
