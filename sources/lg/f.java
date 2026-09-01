package lg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.b80;
import org.telegram.ui.c10;
import org.telegram.ui.d80;
import org.telegram.ui.ep;
import org.telegram.ui.qe0;
import org.telegram.ui.ux;
import org.telegram.ui.xo;
import qh.a8;
import qh.s1;
import uf.e0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.zt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 5:
                ((fn0) this.c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z4, int i10, Rect rect) {
        switch (this.b) {
            case 4:
                super.onFocusChanged(z4, i10, rect);
                bd0 bd0Var = (bd0) this.c;
                float f10 = (z4 || isFocused()) ? 1.0f : 0.0f;
                bd0Var.b(f10, f10, true);
                break;
            case 9:
                super.onFocusChanged(z4, i10, rect);
                if (!z4) {
                    AndroidUtilities.hideKeyboard(((s1) this.c).d);
                    break;
                }
                break;
            default:
                super.onFocusChanged(z4, i10, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.b) {
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) getText());
                ep epVar = (ep) this.c;
                xo xoVar = epVar.f;
                if (xoVar != null && xoVar.getTextView() != null && !TextUtils.isEmpty(epVar.f.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(epVar.f.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.b) {
            case 1:
                w0 w0Var = (w0) this.c;
                if (i10 != 67 || w0Var.e.length() != 0 || ((w0Var.h.getVisibility() != 0 || w0Var.h.length() <= 0) && !w0Var.p())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!w0Var.p()) {
                    w0Var.s.callOnClick();
                    return true;
                }
                e0 e0Var = (e0) l.d.i(1, w0Var.d0);
                i5 i5Var = w0Var.E;
                if (i5Var != null) {
                    i5Var.o(e0Var);
                }
                w0Var.C(e0Var);
                return true;
            case 3:
                d20 d20Var = (d20) this.c;
                if (i10 != 67 || d20Var.r.length() != 0 || !d20Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!d20Var.d()) {
                    return true;
                }
                e0 e0Var2 = (e0) l.d.i(1, d20Var.C);
                c20 c20Var = d20Var.E;
                if (c20Var != null) {
                    ((ux) c20Var).d(e0Var2);
                }
                d20Var.g(e0Var2);
                return true;
            case 6:
                b80 b80Var = (b80) this.c;
                d80 d80Var = b80Var.f;
                if (i10 != 67 || b80Var.d.length() != 0 || d80Var.D.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                d80Var.f.a((p30) l.d.i(1, d80Var.D));
                d80Var.c.e(!d80Var.D.isEmpty(), true);
                d80Var.c0();
                return true;
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.b) {
            case 1:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 2:
            default:
                super.onMeasure(i10, i11);
                break;
            case 3:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        switch (this.b) {
            case 7:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((qe0) this.c).y = true;
                    postDelayed(new c10(this, 21), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                k kVar = (k) this.c;
                p30 p30Var = kVar.f;
                if (p30Var != null) {
                    p30Var.a();
                    kVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    kVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 1:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                    break;
                }
                break;
            case 5:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((fn0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                p30 p30Var2 = usersSelectActivity.M;
                if (p30Var2 != null) {
                    p30Var2.a();
                    usersSelectActivity.M = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 9:
                f fVar = ((s1) this.c).d;
                if (!fVar.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        fVar.requestFocus();
                        AndroidUtilities.showKeyboard(fVar);
                    }
                    break;
                }
            case 10:
                a8 a8Var = (a8) this.c;
                p30 p30Var3 = a8Var.e;
                if (p30Var3 != null) {
                    p30Var3.a();
                    a8Var.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    a8Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
