package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.fz;
import org.telegram.ui.je0;
import org.telegram.ui.jx;
import org.telegram.ui.so;
import org.telegram.ui.u70;
import org.telegram.ui.w10;
import org.telegram.ui.x70;
import org.telegram.ui.yo;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class e2 extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(Object obj, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.ku, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 6:
                ((yn0) this.c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.b) {
            case 10:
                w10 w10Var = (w10) this.c;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                    super.onDraw(canvas);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(12.0f) + getScrollX(), getHeight());
                    w10Var.b(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - AndroidUtilities.dp(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    w10Var.b(canvas, rectF, 2, 1.0f);
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
                    AndroidUtilities.hideKeyboard(((h2) this.c).e);
                    break;
                }
                break;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                td0 td0Var = (td0) this.c;
                float f7 = (z10 || isFocused()) ? 1.0f : 0.0f;
                td0Var.b(f7, f7, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                yo yoVar = (yo) this.c;
                so soVar = yoVar.f;
                if (soVar != null && soVar.getTextView() != null && !TextUtils.isEmpty(yoVar.f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(yoVar.f.getTextView().getText());
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
        switch (this.b) {
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.c;
                if (i10 != 67 || u0Var.e.length() != 0 || ((u0Var.h.getVisibility() != 0 || u0Var.h.length() <= 0) && !u0Var.p())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!u0Var.p()) {
                    u0Var.s.callOnClick();
                    return true;
                }
                hg.o0 o0Var = (hg.o0) i2.o1.i(1, u0Var.g0);
                org.telegram.ui.ActionBar.k5 k5Var = u0Var.H;
                if (k5Var != null) {
                    k5Var.o(o0Var);
                }
                u0Var.C(o0Var);
                return true;
            case 4:
                k20 k20Var = (k20) this.c;
                if (i10 != 67 || k20Var.r.length() != 0 || !k20Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!k20Var.d()) {
                    return true;
                }
                hg.o0 o0Var2 = (hg.o0) i2.o1.i(1, k20Var.F);
                j20 j20Var = k20Var.H;
                if (j20Var != null) {
                    ((jx) j20Var).f(o0Var2);
                }
                k20Var.f(o0Var2);
                return true;
            case 7:
                u70 u70Var = (u70) this.c;
                x70 x70Var = u70Var.f;
                if (i10 != 67 || u70Var.d.length() != 0 || x70Var.G.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                x70Var.f.a((v30) i2.o1.i(1, x70Var.G));
                x70Var.c.e(!x70Var.G.isEmpty(), true);
                x70Var.c0();
                return true;
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.b) {
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 3:
            default:
                super.onMeasure(i10, i11);
                break;
            case 4:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        switch (this.b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((je0) this.c).y = true;
                    postDelayed(new fz(this, 23), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                e2 e2Var = ((h2) this.c).e;
                if (!e2Var.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        e2Var.requestFocus();
                        AndroidUtilities.showKeyboard(e2Var);
                    }
                    break;
                }
            case 1:
                o9 o9Var = (o9) this.c;
                v30 v30Var = o9Var.f;
                if (v30Var != null) {
                    v30Var.a();
                    o9Var.f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    o9Var.fullScroll(130);
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
            case 6:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((yn0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                v30 v30Var2 = usersSelectActivity.P;
                if (v30Var2 != null) {
                    v30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 11:
                yg.h hVar = (yg.h) this.c;
                v30 v30Var3 = hVar.f;
                if (v30Var3 != null) {
                    v30Var3.a();
                    hVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    hVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(Context context) {
        super(context);
        this.b = 10;
        this.c = new w10();
    }
}
