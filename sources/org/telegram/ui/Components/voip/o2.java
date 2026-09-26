package org.telegram.ui.Components.voip;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.r90;
import org.telegram.ui.qg0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public class o2 extends TextView {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(q2 q2Var, Activity activity, r1 r1Var) {
        super(activity);
        this.d = q2Var;
        this.c = r1Var;
        this.b = new RectF();
        r1Var.a(this);
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public void c() {
        CharSequence text;
        r90 r90Var = (r90) this.c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        h90 h90Var = new h90(0);
        float dp = AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        h90Var.q = dp;
        h90Var.r = dp2;
        int length = text.length();
        h90Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, h90Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(h90Var.s, h90Var.u, h90Var.t, h90Var.v);
        ((org.telegram.ui.Cells.z) this.b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        r90Var.x = h90Var;
        r90Var.j(4.0f);
        int themedColor = ((qg0) this.d).getThemedColor(h6.Ld);
        r90Var.f(h6.l1(0.85f, themedColor), h6.l1(2.0f, themedColor), h6.l1(3.5f, themedColor), h6.l1(6.0f, themedColor));
        r90Var.k();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                q2 q2Var = (q2) this.d;
                float x11 = ((View) q2Var.getParent()).getX() + q2Var.getX() + x10;
                float y3 = ((View) q2Var.getParent()).getY() + q2Var.getY() + ((View) getParent()).getY() + getY();
                r1 r1Var = (r1) this.c;
                r1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), r1Var.b());
                super.onDraw(canvas);
                break;
            default:
                r90 r90Var = (r90) this.c;
                canvas.save();
                if ((getGravity() & 16) == 0 || getLayout() == null) {
                    paddingTop = getPaddingTop();
                } else {
                    paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
                }
                canvas.translate(getPaddingLeft(), paddingTop);
                ((org.telegram.ui.Cells.z) this.b).draw(canvas);
                canvas.restore();
                super.onDraw(canvas);
                if (a() || r90Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    r90Var.draw(canvas);
                    canvas.restore();
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                c();
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                org.telegram.ui.Cells.z zVar = (org.telegram.ui.Cells.z) this.b;
                if (b() && motionEvent.getAction() == 0) {
                    zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                    zVar.setState(new int[]{R.attr.state_enabled, R.attr.state_pressed});
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
                    zVar.setState(new int[0]);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 1:
                super.setText(charSequence, bufferType);
                c();
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 1:
                return drawable == ((org.telegram.ui.Cells.z) this.b) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(qg0 qg0Var, Context context) {
        super(context);
        this.d = qg0Var;
        org.telegram.ui.Cells.z f02 = h6.f0(h6.l1(0.1f, h6.w0(null, h6.I6, false)), 7, -1);
        this.b = f02;
        r90 r90Var = new r90();
        this.c = r90Var;
        f02.setCallback(this);
        r90Var.C = true;
        r90Var.u = 0.8f;
    }
}
