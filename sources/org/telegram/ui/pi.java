package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pi implements View.OnTouchListener {
    public View a;
    public org.telegram.ui.ActionBar.f1 b;
    public final Rect c = new Rect();
    public boolean d;
    public boolean e;
    public final org.telegram.ui.Components.v00 f;
    public final int[] h;
    public View n;
    public float r;
    public float s;
    public final /* synthetic */ View w;
    public final /* synthetic */ wm x;

    public pi(wm wmVar, ImageView imageView) {
        this.x = wmVar;
        this.w = imageView;
        org.telegram.ui.Components.v00 v00Var = new org.telegram.ui.Components.v00((Context) null, new f(this, 22));
        this.f = v00Var;
        this.h = new int[2];
        v00Var.v = true;
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
            float y9 = motionEvent.getY() + iArr[1];
            this.b.getContentView().getLocationOnScreen(iArr);
            float f10 = x10 - iArr[0];
            float f11 = y9 - iArr[1];
            this.n = null;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b.getContentView();
            for (int i3 = 0; i3 < actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount(); i3++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                Rect rect = this.c;
                childAt.getHitRect(rect);
                childAt.getTag();
                if (childAt.getVisibility() == 0 && childAt.isClickable()) {
                    if (rect.contains((int) f10, (int) f11)) {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        childAt.drawableHotspotChanged(f10, f11 - childAt.getTop());
                        this.n = childAt;
                    } else {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                    }
                }
            }
        }
        if ((motionEvent.getAction() == 2 && Math.abs(motionEvent.getX() - this.r) > org.telegram.messenger.g0.e * 2.0f) || Math.abs(motionEvent.getY() - this.s) > org.telegram.messenger.g0.e * 2.0f) {
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
