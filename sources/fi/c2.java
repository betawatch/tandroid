package fi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.l20;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.x30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cp;
import org.telegram.ui.ie0;
import org.telegram.ui.lx;
import org.telegram.ui.r00;
import org.telegram.ui.wo;
import org.telegram.ui.y10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c2 extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(Object obj, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.lu, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 7:
                ((eo0) this.c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.b) {
            case 10:
                y10 y10Var = (y10) this.c;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                    super.onDraw(canvas);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(12.0f) + getScrollX(), getHeight());
                    y10Var.b(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - AndroidUtilities.dp(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    y10Var.b(canvas, rectF, 2, 1.0f);
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
        switch (this.b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((f2) this.c).e);
                    break;
                }
                break;
            case 6:
                super.onFocusChanged(z10, i10, rect);
                qd0 qd0Var = (qd0) this.c;
                float f7 = (z10 || isFocused()) ? 1.0f : 0.0f;
                qd0Var.b(f7, f7, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.b) {
            case 4:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                cp cpVar = (cp) this.c;
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
        switch (this.b) {
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.c;
                if (i10 != 67 || w0Var.e.length() != 0 || ((w0Var.h.getVisibility() != 0 || w0Var.h.length() <= 0) && !w0Var.r())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!w0Var.r()) {
                    w0Var.s.callOnClick();
                    return true;
                }
                ig.p0 p0Var = (ig.p0) ic.a.g(1, w0Var.g0);
                org.telegram.ui.ActionBar.s0 s0Var = w0Var.H;
                if (s0Var != null) {
                    s0Var.j(p0Var);
                }
                w0Var.I(p0Var);
                return true;
            case 3:
                org.telegram.ui.ActionBar.r5 r5Var = (org.telegram.ui.ActionBar.r5) this.c;
                if (i10 != 67 || length() != 0 || (textView = r5Var.w) == null || textView.getVisibility() != 0) {
                    return super.onKeyDown(i10, keyEvent);
                }
                r5Var.e();
                return true;
            case 4:
            default:
                return super.onKeyDown(i10, keyEvent);
            case 5:
                m20 m20Var = (m20) this.c;
                if (i10 != 67 || m20Var.r.length() != 0 || !m20Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!m20Var.d()) {
                    return true;
                }
                ig.p0 p0Var2 = (ig.p0) ic.a.g(1, m20Var.F);
                l20 l20Var = m20Var.H;
                if (l20Var != null) {
                    ((lx) l20Var).f(p0Var2);
                }
                m20Var.f(p0Var2);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.b) {
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 5:
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
        switch (this.b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((ie0) this.c).y = true;
                    postDelayed(new r00(this, 23), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                c2 c2Var = ((f2) this.c).e;
                if (!c2Var.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        c2Var.requestFocus();
                        AndroidUtilities.showKeyboard(c2Var);
                    }
                    break;
                }
            case 1:
                k9 k9Var = (k9) this.c;
                x30 x30Var = k9Var.f;
                if (x30Var != null) {
                    x30Var.a();
                    k9Var.f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    k9Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 2:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                    break;
                }
                break;
            case 7:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((eo0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                x30 x30Var2 = usersSelectActivity.P;
                if (x30Var2 != null) {
                    x30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 11:
                zg.i iVar = (zg.i) this.c;
                x30 x30Var3 = iVar.f;
                if (x30Var3 != null) {
                    x30Var3.a();
                    iVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    iVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Context context) {
        super(context);
        this.b = 10;
        this.c = new y10();
    }
}
