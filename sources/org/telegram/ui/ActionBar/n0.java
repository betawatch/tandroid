package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.g10;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cp;
import org.telegram.ui.iw;
import org.telegram.ui.ld0;
import org.telegram.ui.wo;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n0 extends EditTextBoldCursor {
    public final /* synthetic */ int G1;
    public final Object H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, Context context, int i10) {
        super(context);
        this.G1 = i10;
        this.H1 = obj;
    }

    @Override // org.telegram.ui.Components.qt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 5:
                ((hm0) this.H1).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.qt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G1) {
            case 8:
                li.k kVar = (li.k) this.H1;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), zs.e4, 31);
                    super.onDraw(canvas);
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(getScrollX(), 0.0f, org.telegram.messenger.i0.L(12.0f) + getScrollX(), getHeight());
                    kVar.o(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - org.telegram.messenger.i0.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    kVar.o(canvas, rectF, 2, 1.0f);
                    canvas.restore();
                    break;
                } else {
                    super.onDraw(canvas);
                    break;
                }
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G1) {
            case 4:
                super.onFocusChanged(z10, i10, rect);
                dc0 dc0Var = (dc0) this.H1;
                float f7 = (z10 || isFocused()) ? 1.0f : 0.0f;
                dc0Var.b(f7, f7, true);
                break;
            case 10:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    org.telegram.messenger.i0.v1(((vh.p1) this.H1).e);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.G1) {
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                cp cpVar = (cp) this.H1;
                wo woVar = cpVar.h;
                if (woVar != null && woVar.getTextView() != null && !TextUtils.isEmpty(cpVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(cpVar.h.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        TextView textView;
        switch (this.G1) {
            case 0:
                t0 t0Var = (t0) this.H1;
                if (i10 != 67 || t0Var.e.length() != 0 || ((t0Var.h.getVisibility() != 0 || t0Var.h.length() <= 0) && !t0Var.r())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!t0Var.r()) {
                    t0Var.s.callOnClick();
                    return true;
                }
                zf.e0 e0Var = (zf.e0) i0.a.g(1, t0Var.g0);
                p0 p0Var = t0Var.H;
                if (p0Var != null) {
                    p0Var.j(e0Var);
                }
                t0Var.I(e0Var);
                return true;
            case 1:
                i5 i5Var = (i5) this.H1;
                if (i10 != 67 || length() != 0 || (textView = i5Var.x) == null || textView.getVisibility() != 0) {
                    return super.onKeyDown(i10, keyEvent);
                }
                i5Var.i();
                return true;
            case 2:
            default:
                return super.onKeyDown(i10, keyEvent);
            case 3:
                h10 h10Var = (h10) this.H1;
                if (i10 != 67 || h10Var.r.length() != 0 || !h10Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!h10Var.d()) {
                    return true;
                }
                zf.e0 e0Var2 = (zf.e0) i0.a.g(1, h10Var.F);
                g10 g10Var = h10Var.H;
                if (g10Var != null) {
                    ((iw) g10Var).h(e0Var2);
                }
                h10Var.f(e0Var2);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G1) {
            case 0:
                super.onMeasure(i10, i11);
                setMeasuredDimension(org.telegram.messenger.i0.L(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 3:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        switch (this.G1) {
            case 6:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((ld0) this.H1).D = true;
                    postDelayed(new zy(this, 24), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 0:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !org.telegram.messenger.i0.J3(this)) {
                    clearFocus();
                    requestFocus();
                    break;
                }
                break;
            case 5:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((hm0) this.H1).getClass();
                    }
                    break;
                }
                break;
            case 7:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.H1;
                s20 s20Var = usersSelectActivity.P;
                if (s20Var != null) {
                    s20Var.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.i0.J3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 9:
                qg.h hVar = (qg.h) this.H1;
                s20 s20Var2 = hVar.f;
                if (s20Var2 != null) {
                    s20Var2.a();
                    hVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.i0.J3(this)) {
                    hVar.fullScroll(zs.O1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 10:
                n0 n0Var = ((vh.p1) this.H1).e;
                if (!n0Var.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        n0Var.requestFocus();
                        org.telegram.messenger.i0.J3(n0Var);
                    }
                    break;
                }
            case 11:
                vh.t6 t6Var = (vh.t6) this.H1;
                s20 s20Var3 = t6Var.f;
                if (s20Var3 != null) {
                    s20Var3.a();
                    t6Var.f = null;
                }
                if (motionEvent.getAction() == 0 && !org.telegram.messenger.i0.J3(this)) {
                    t6Var.fullScroll(zs.O1);
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context) {
        super(context);
        this.G1 = 8;
        this.H1 = new li.k(23);
    }
}
