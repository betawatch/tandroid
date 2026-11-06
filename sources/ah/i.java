package ah;

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
import fi.e2;
import fi.p8;
import jg.o0;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.n0;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.q00;
import org.telegram.ui.Components.r00;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.dv;
import org.telegram.ui.ec0;
import org.telegram.ui.go;
import org.telegram.ui.hz;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i extends EditTextBoldCursor {
    public final /* synthetic */ int G1;
    public final Object H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i7, Context context, Object obj) {
        super(context);
        this.G1 = i7;
        this.H1 = obj;
    }

    @Override // org.telegram.ui.Components.ct, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 8:
                ((el0) this.H1).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ct, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G1) {
            case 11:
                h6.m mVar = (h6.m) this.H1;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), qs.e4, 31);
                    super.onDraw(canvas);
                    RectF rectF = g0.P;
                    rectF.set(getScrollX(), 0.0f, g0.L(12.0f) + getScrollX(), getHeight());
                    mVar.m(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - g0.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    mVar.m(canvas, rectF, 2, 1.0f);
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
    public void onFocusChanged(boolean z9, int i7, Rect rect) {
        switch (this.G1) {
            case 1:
                super.onFocusChanged(z9, i7, rect);
                if (!z9) {
                    g0.v1(((e2) this.H1).e);
                    break;
                }
                break;
            case 7:
                super.onFocusChanged(z9, i7, rect);
                kb0 kb0Var = (kb0) this.H1;
                float f10 = (z9 || isFocused()) ? 1.0f : 0.0f;
                kb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z9, i7, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.G1) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                go goVar = (go) this.H1;
                zn znVar = goVar.h;
                if (znVar != null && znVar.getTextView() != null && !TextUtils.isEmpty(goVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(goVar.h.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        TextView textView;
        switch (this.G1) {
            case 3:
                r0 r0Var = (r0) this.H1;
                if (i7 != 67 || r0Var.e.length() != 0 || ((r0Var.h.getVisibility() != 0 || r0Var.h.length() <= 0) && !r0Var.r())) {
                    return super.onKeyDown(i7, keyEvent);
                }
                if (!r0Var.r()) {
                    r0Var.s.callOnClick();
                    return true;
                }
                o0 o0Var = (o0) jg.g.i(1, r0Var.g0);
                n0 n0Var = r0Var.H;
                if (n0Var != null) {
                    n0Var.j(o0Var);
                }
                r0Var.I(o0Var);
                return true;
            case 4:
                y4 y4Var = (y4) this.H1;
                if (i7 != 67 || length() != 0 || (textView = y4Var.x) == null || textView.getVisibility() != 0) {
                    return super.onKeyDown(i7, keyEvent);
                }
                y4Var.i();
                return true;
            case 5:
            default:
                return super.onKeyDown(i7, keyEvent);
            case 6:
                r00 r00Var = (r00) this.H1;
                if (i7 != 67 || r00Var.r.length() != 0 || !r00Var.d()) {
                    return super.onKeyDown(i7, keyEvent);
                }
                if (!r00Var.d()) {
                    return true;
                }
                o0 o0Var2 = (o0) jg.g.i(1, r00Var.F);
                q00 q00Var = r00Var.H;
                if (q00Var != null) {
                    ((dv) q00Var).h(o0Var2);
                }
                r00Var.f(o0Var2);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.G1) {
            case 3:
                super.onMeasure(i7, i10);
                setMeasuredDimension(g0.L(3.0f) + Math.max(View.MeasureSpec.getSize(i7), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 6:
                super.onMeasure(i7, i10);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        switch (this.G1) {
            case 9:
                if (i7 == 16908322 || i7 == 16908337) {
                    ((ec0) this.H1).D = true;
                    postDelayed(new hz(this, 24), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.G1) {
            case 0:
                o oVar = (o) this.H1;
                c20 c20Var = oVar.f;
                if (c20Var != null) {
                    c20Var.a();
                    oVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    oVar.fullScroll(qs.O1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 1:
                i iVar = ((e2) this.H1).e;
                if (!iVar.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        iVar.requestFocus();
                        g0.K3(iVar);
                    }
                    break;
                }
            case 2:
                p8 p8Var = (p8) this.H1;
                c20 c20Var2 = p8Var.f;
                if (c20Var2 != null) {
                    c20Var2.a();
                    p8Var.f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.K3(this)) {
                    p8Var.fullScroll(qs.O1);
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
                        ((el0) this.H1).getClass();
                    }
                    break;
                }
                break;
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.H1;
                c20 c20Var3 = usersSelectActivity.Q;
                if (c20Var3 != null) {
                    c20Var3.a();
                    usersSelectActivity.Q = null;
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
    public i(Context context) {
        super(context);
        this.G1 = 11;
        this.H1 = new h6.m(28);
    }
}
