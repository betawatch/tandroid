package lh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jh.k;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.an;
import org.telegram.ui.ce;
import org.telegram.ui.d0;
import org.telegram.ui.ju0;
import org.telegram.ui.ol;
import org.telegram.ui.ye;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        ye yeVar;
        boolean z10;
        zk0 zk0Var;
        int i7 = this.a;
        int i10 = this.b;
        FrameLayout frameLayout = this.c;
        int i11 = 1;
        switch (i7) {
            case 0:
                b bVar = ((h) frameLayout).n;
                if (bVar != null) {
                    an anVar = ((ce) bVar).b;
                    if (i10 == 2) {
                        yeVar = new ye(anVar, 11);
                        z10 = true;
                    } else if (i10 == 3) {
                        yeVar = new ye(anVar, 12);
                        z10 = false;
                    } else if (i10 == 4) {
                        yeVar = new ye(anVar, 13);
                        z10 = 2;
                    }
                    Activity parentActivity = anVar.getParentActivity();
                    o4 parentLayout = anVar.getParentLayout();
                    ol olVar = anVar.m1;
                    e6 resourceProvider = anVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(g0.L(200.0f));
                    z0 z0Var = new z0(0, parentActivity, resourceProvider, true, true);
                    z0Var.setMinimumWidth(g0.L(200.0f));
                    z0Var.j(!z10 ? hd.M0(2131746372, null) : z10 ? hd.M0(2131746374, null) : hd.M0(2131746373, null), R.drawable.msg_seen, null);
                    z0Var.setOnClickListener(new ju0(1, yeVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(z0Var);
                    g1 g1Var = new g1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    g1Var.e = true;
                    g1Var.c = ns.x3;
                    g1Var.setOutsideTouchable(true);
                    g1Var.setClippingEnabled(true);
                    g1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    g1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(g0.L(1000.0f), TLObject.FLAG_31));
                    g1Var.setInputMethodMode(2);
                    g1Var.setSoftInputMode(0);
                    g1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    k.b(view, olVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + g0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (g0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    g1Var.showAtLocation(olVar, 51, (int) width, (int) measuredHeight);
                    anVar.f9 = g1Var;
                    anVar.w8(anVar.y1, false);
                    anVar.f9.setOnDismissListener(new d0(anVar, i11));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                return (scrollSlidingTextTabStrip.o0 || (zk0Var = scrollSlidingTextTabStrip.b) == null || !zk0Var.j1(i10, view)) ? false : true;
        }
    }
}
