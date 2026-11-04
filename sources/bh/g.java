package bh;

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
import gi.d2;
import gi.q8;
import k2.p1;
import kg.l0;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.m00;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.y10;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.av;
import org.telegram.ui.bo;
import org.telegram.ui.cc0;
import org.telegram.ui.fz;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g extends EditTextBoldCursor {
    public final /* synthetic */ int H1;
    public final Object I1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, Context context, Object obj) {
        super(context);
        this.H1 = i3;
        this.I1 = obj;
    }

    @Override // org.telegram.ui.Components.bt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.H1) {
            case 8:
                ((il0) this.I1).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.bt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.H1) {
            case 11:
                k4.j jVar = (k4.j) this.I1;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), hs.e4, 31);
                    super.onDraw(canvas);
                    RectF rectF = g0.P;
                    rectF.set(getScrollX(), 0.0f, g0.L(12.0f) + getScrollX(), getHeight());
                    jVar.w(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - g0.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    jVar.w(canvas, rectF, 2, 1.0f);
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
    public void onFocusChanged(boolean z10, int i3, Rect rect) {
        switch (this.H1) {
            case 1:
                super.onFocusChanged(z10, i3, rect);
                if (!z10) {
                    g0.v1(((d2) this.I1).e);
                    break;
                }
                break;
            case 7:
                super.onFocusChanged(z10, i3, rect);
                fb0 fb0Var = (fb0) this.I1;
                float f10 = (z10 || isFocused()) ? 1.0f : 0.0f;
                fb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i3, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.H1) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                bo boVar = (bo) this.I1;
                vn vnVar = boVar.h;
                if (vnVar != null && vnVar.getTextView() != null && !TextUtils.isEmpty(boVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(boVar.h.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        TextView textView;
        switch (this.H1) {
            case 3:
                q0 q0Var = (q0) this.I1;
                if (i3 != 67 || q0Var.e.length() != 0 || ((q0Var.h.getVisibility() != 0 || q0Var.h.length() <= 0) && !q0Var.r())) {
                    return super.onKeyDown(i3, keyEvent);
                }
                if (!q0Var.r()) {
                    q0Var.s.callOnClick();
                    return true;
                }
                l0 l0Var = (l0) p1.h(1, q0Var.h0);
                m0 m0Var = q0Var.I;
                if (m0Var != null) {
                    m0Var.j(l0Var);
                }
                q0Var.I(l0Var);
                return true;
            case 4:
                y4 y4Var = (y4) this.I1;
                if (i3 != 67 || length() != 0 || (textView = y4Var.x) == null || textView.getVisibility() != 0) {
                    return super.onKeyDown(i3, keyEvent);
                }
                y4Var.i();
                return true;
            case 5:
            default:
                return super.onKeyDown(i3, keyEvent);
            case 6:
                n00 n00Var = (n00) this.I1;
                if (i3 != 67 || n00Var.r.length() != 0 || !n00Var.d()) {
                    return super.onKeyDown(i3, keyEvent);
                }
                if (!n00Var.d()) {
                    return true;
                }
                l0 l0Var2 = (l0) p1.h(1, n00Var.G);
                m00 m00Var = n00Var.I;
                if (m00Var != null) {
                    ((av) m00Var).g(l0Var2);
                }
                n00Var.f(l0Var2);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.H1) {
            case 3:
                super.onMeasure(i3, i10);
                setMeasuredDimension(g0.L(3.0f) + Math.max(View.MeasureSpec.getSize(i3), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 6:
                super.onMeasure(i3, i10);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i3) {
        switch (this.H1) {
            case 9:
                if (i3 == 16908322 || i3 == 16908337) {
                    ((cc0) this.I1).E = true;
                    postDelayed(new fz(this, 23), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.H1) {
            case 0:
                m mVar = (m) this.I1;
                y10 y10Var = mVar.f;
                if (y10Var != null) {
                    y10Var.a();
                    mVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    mVar.fullScroll(hs.O1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 1:
                g gVar = ((d2) this.I1).e;
                if (!gVar.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        gVar.requestFocus();
                        g0.K3(gVar);
                    }
                    break;
                }
            case 2:
                q8 q8Var = (q8) this.I1;
                y10 y10Var2 = q8Var.f;
                if (y10Var2 != null) {
                    y10Var2.a();
                    q8Var.f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    q8Var.fullScroll(hs.O1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 3:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !g0.K3(this)) {
                    clearFocus();
                    requestFocus();
                    break;
                }
                break;
            case 8:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((il0) this.I1).getClass();
                    }
                    break;
                }
                break;
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.I1;
                y10 y10Var3 = usersSelectActivity.R;
                if (y10Var3 != null) {
                    y10Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        this.H1 = 11;
        this.I1 = new k4.j(24);
    }
}
