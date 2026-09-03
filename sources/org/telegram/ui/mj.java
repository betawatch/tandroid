package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mj implements View.OnTouchListener {
    public View a;
    public org.telegram.ui.ActionBar.p1 b;
    public final Rect c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.l20 f;
    public final int[] h;
    public View n;
    public float r;
    public float s;
    public final /* synthetic */ View v;
    public final /* synthetic */ zn w;

    public mj(zn znVar, ImageView imageView) {
        this.w = znVar;
        this.v = imageView;
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20((Context) null, new h(this, 24));
        this.f = l20Var;
        this.h = new int[2];
        l20Var.v = true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        this.a = view;
        if (motionEvent.getAction() == 0) {
            this.r = motionEvent.getX();
            this.s = motionEvent.getY();
            this.e = false;
        }
        this.f.a(motionEvent);
        if (this.b != null && !this.d && motionEvent.getAction() == 2) {
            View view3 = this.a;
            int[] iArr = this.h;
            view3.getLocationOnScreen(iArr);
            float x10 = motionEvent.getX() + iArr[0];
            float y10 = motionEvent.getY() + iArr[1];
            this.b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y10 - iArr[1];
            this.n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b.getContentView();
            for (int i10 = 0; i10 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i10++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10);
                Rect rect = this.c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (rect.contains((int) f10, (int) f11)) {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(true, false);
                        }
                        childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                        this.n = childAt;
                    } else {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(false, false);
                        }
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.r) > AndroidUtilities.touchSlop * 2.0f) || Math.abs(motionEvent.getY() - this.s) > AndroidUtilities.touchSlop * 2.0f) {
            this.e = true;
            this.a.setPressed(false);
            this.a.setSelected(false);
        }
        if (motionEvent.getAction() == 1 && !this.d && !this.e) {
            View view4 = this.n;
            if (view4 != null) {
                view4.callOnClick();
                this.d = true;
                return true;
            }
            if (this.b == null && (view2 = this.a) != null) {
                view2.callOnClick();
            }
        }
        return true;
    }
}
