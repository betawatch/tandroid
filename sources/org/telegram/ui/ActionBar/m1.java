package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.j60;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ee0;
import org.telegram.ui.hk0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class m1 extends ScrollView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(fs fsVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = fsVar;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                boolean drawChild = super.drawChild(canvas, view, j3);
                u1 u1Var = (u1) this.b;
                if (u1Var.E[0].getPaint().getAlpha() != 0) {
                    u1Var.E[0].setBounds(0, getScrollY(), getMeasuredWidth(), org.telegram.messenger.g0.L(3.0f) + getScrollY());
                    u1Var.E[0].draw(canvas);
                }
                if (u1Var.E[1].getPaint().getAlpha() != 0) {
                    u1Var.E[1].setBounds(0, (getMeasuredHeight() + getScrollY()) - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth(), getMeasuredHeight() + getScrollY());
                    u1Var.E[1].draw(canvas);
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                j60 j60Var = (j60) this.b;
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                if (org.telegram.messenger.g0.Q1() || size2 > size) {
                    j60Var.n2 = org.telegram.messenger.g0.L(144.0f);
                } else {
                    j60Var.n2 = org.telegram.messenger.g0.L(56.0f);
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(j60Var.n2, TLObject.FLAG_31));
                break;
            case 2:
                super.onMeasure(i7, i10);
                setMeasuredDimension(((fe0) this.b).getMeasuredWidth(), getMeasuredHeight());
                break;
            case 3:
            default:
                super.onMeasure(i7, i10);
                break;
            case 4:
                ((hk0) this.b).t0 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(30.0f);
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        switch (this.a) {
            case 4:
                return false;
            default:
                return super.onRequestFocusInDescendants(i7, rect);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        switch (this.a) {
            case 3:
                int i7 = ((ee0) this.b).a;
                if (i7 == 1 || i7 == 2 || i7 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                break;
            case 4:
                int i10 = ((hk0) this.b).J1;
                if (i10 == 1 || i10 == 2 || i10 == 4) {
                    rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                }
                break;
            case 5:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.b;
                if (!usersSelectActivity.w) {
                    rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
                    rect.top = org.telegram.messenger.f3.C(20.0f, usersSelectActivity.S, rect.top);
                    rect.bottom = org.telegram.messenger.f3.C(50.0f, usersSelectActivity.S, rect.bottom);
                    break;
                } else {
                    usersSelectActivity.w = false;
                    break;
                }
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Context context, fe0 fe0Var) {
        super(context, null, 0, R.style.scrollbarShapeStyle);
        this.a = 2;
        this.b = fe0Var;
    }
}
