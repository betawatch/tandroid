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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.w80;
import org.telegram.ui.wg0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class n2 extends TextView {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(p2 p2Var, Activity activity, q1 q1Var) {
        super(activity);
        this.d = p2Var;
        this.c = q1Var;
        this.b = new RectF();
        q1Var.a(this);
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public void c() {
        CharSequence text;
        g90 g90Var = (g90) this.c;
        Layout layout = getLayout();
        if (layout == null || (text = layout.getText()) == null) {
            return;
        }
        w80 w80Var = new w80(0);
        float dp = AndroidUtilities.dp(3.0f);
        float dp2 = AndroidUtilities.dp(6.0f);
        w80Var.q = dp;
        w80Var.r = dp2;
        int length = text.length();
        w80Var.d(layout, 0, 0.0f);
        layout.getSelectionPath(0, length, w80Var);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(w80Var.s, w80Var.u, w80Var.t, w80Var.v);
        ((org.telegram.ui.Cells.z) this.b).setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        g90Var.x = w80Var;
        g90Var.j(4.0f);
        int themedColor = ((wg0) this.d).getThemedColor(i6.Ld);
        g90Var.f(i6.l1(0.85f, themedColor), i6.l1(2.0f, themedColor), i6.l1(3.5f, themedColor), i6.l1(6.0f, themedColor));
        g90Var.k();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingTop;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float x10 = ((View) getParent()).getX() + getX();
                p2 p2Var = (p2) this.d;
                float x11 = ((View) p2Var.getParent()).getX() + p2Var.getX() + x10;
                float y3 = ((View) p2Var.getParent()).getY() + p2Var.getY() + ((View) getParent()).getY() + getY();
                q1 q1Var = (q1) this.c;
                q1Var.d(x11, y3);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), q1Var.b());
                super.onDraw(canvas);
                break;
            default:
                g90 g90Var = (g90) this.c;
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
                if (a() || g90Var.c()) {
                    canvas.save();
                    canvas.translate(getPaddingLeft(), paddingTop);
                    g90Var.draw(canvas);
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
    public n2(wg0 wg0Var, Context context) {
        super(context);
        this.d = wg0Var;
        org.telegram.ui.Cells.z f02 = i6.f0(i6.l1(0.1f, i6.w0(null, i6.I6, false)), 7, -1);
        this.b = f02;
        g90 g90Var = new g90();
        this.c = g90Var;
        f02.setCallback(this);
        g90Var.C = true;
        g90Var.u = 0.8f;
    }
}
