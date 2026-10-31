package bh;

import android.app.Activity;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.k1;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.e0;
import org.telegram.ui.km;
import org.telegram.ui.mf;
import org.telegram.ui.re;
import org.telegram.ui.un;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ j(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        mf mfVar;
        boolean z10;
        xl0 xl0Var;
        int i10 = this.a;
        int i11 = this.b;
        FrameLayout frameLayout = this.c;
        int i12 = 1;
        switch (i10) {
            case 0:
                b bVar = ((k) frameLayout).n;
                if (bVar != null) {
                    un unVar = ((re) bVar).b;
                    if (i11 == 2) {
                        mfVar = new mf(unVar, 11);
                        z10 = true;
                    } else if (i11 == 3) {
                        mfVar = new mf(unVar, 12);
                        z10 = false;
                    } else if (i11 == 4) {
                        mfVar = new mf(unVar, 13);
                        z10 = 2;
                    }
                    Activity parentActivity = unVar.getParentActivity();
                    z4 parentLayout = unVar.getParentLayout();
                    km kmVar = unVar.l1;
                    p6 resourceProvider = unVar.getResourceProvider();
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(parentActivity, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.setMinimumWidth(i0.L(200.0f));
                    b1 b1Var = new b1(0, parentActivity, resourceProvider, true, true);
                    b1Var.setMinimumWidth(i0.L(200.0f));
                    b1Var.j(!z10 ? cd.L0(2131746387, null) : z10 ? cd.L0(2131746389, null) : cd.L0(2131746388, null), R.drawable.msg_seen, null);
                    b1Var.setOnClickListener(new vv0(1, mfVar));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
                    k1 k1Var = new k1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                    k1Var.e = true;
                    k1Var.c = zs.x3;
                    k1Var.setOutsideTouchable(true);
                    k1Var.setClippingEnabled(true);
                    k1Var.setAnimationStyle(R.style.PopupContextAnimation);
                    k1Var.setFocusable(true);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(i0.L(1000.0f), TLObject.FLAG_31));
                    k1Var.setInputMethodMode(2);
                    k1Var.setSoftInputMode(0);
                    k1Var.getContentView().setFocusableInTouchMode(true);
                    PointF pointF = new PointF();
                    zg.h.b(view, kmVar, pointF);
                    float width = ((pointF.x + view.getWidth()) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i0.L(8.0f);
                    float measuredHeight = pointF.y - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                    if (i0.Q1()) {
                        ViewGroup view2 = parentLayout.getView();
                        width += view2.getX() + view2.getPaddingLeft();
                        measuredHeight += view2.getY() + view2.getPaddingTop();
                    }
                    k1Var.showAtLocation(kmVar, 51, (int) width, (int) measuredHeight);
                    unVar.e9 = k1Var;
                    unVar.n8(unVar.x1, false);
                    unVar.e9.setOnDismissListener(new e0(unVar, i12));
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    return true;
                }
                return false;
            default:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) frameLayout;
                return (scrollSlidingTextTabStrip.n0 || (xl0Var = scrollSlidingTextTabStrip.b) == null || !xl0Var.G1(i11, view)) ? false : true;
        }
    }
}
