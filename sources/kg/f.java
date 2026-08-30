package kg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import kh.a2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.a80;
import org.telegram.ui.c10;
import org.telegram.ui.c80;
import org.telegram.ui.dp;
import org.telegram.ui.pe0;
import org.telegram.ui.tx;
import org.telegram.ui.xo;
import ph.c8;
import ph.s1;
import tf.e0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    @Override // org.telegram.ui.Components.xt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 5:
                ((en0) this.c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z4, int i10, Rect rect) {
        switch (this.b) {
            case 4:
                super.onFocusChanged(z4, i10, rect);
                zc0 zc0Var = (zc0) this.c;
                float f10 = (z4 || isFocused()) ? 1.0f : 0.0f;
                zc0Var.b(f10, f10, true);
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
                dp dpVar = (dp) this.c;
                xo xoVar = dpVar.f;
                if (xoVar != null && xoVar.getTextView() != null && !TextUtils.isEmpty(dpVar.f.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(dpVar.f.getTextView().getText());
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
                e0 e0Var = (e0) a2.i(1, w0Var.d0);
                h5 h5Var = w0Var.E;
                if (h5Var != null) {
                    h5Var.o(e0Var);
                }
                w0Var.C(e0Var);
                return true;
            case 3:
                c20 c20Var = (c20) this.c;
                if (i10 != 67 || c20Var.r.length() != 0 || !c20Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!c20Var.d()) {
                    return true;
                }
                e0 e0Var2 = (e0) a2.i(1, c20Var.C);
                b20 b20Var = c20Var.E;
                if (b20Var != null) {
                    ((tx) b20Var).d(e0Var2);
                }
                c20Var.g(e0Var2);
                return true;
            case 6:
                a80 a80Var = (a80) this.c;
                c80 c80Var = a80Var.f;
                if (i10 != 67 || a80Var.d.length() != 0 || c80Var.D.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                c80Var.f.a((n30) a2.i(1, c80Var.D));
                c80Var.c.e(!c80Var.D.isEmpty(), true);
                c80Var.c0();
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
                    ((pe0) this.c).y = true;
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
                n30 n30Var = kVar.f;
                if (n30Var != null) {
                    n30Var.a();
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
                        ((en0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                n30 n30Var2 = usersSelectActivity.M;
                if (n30Var2 != null) {
                    n30Var2.a();
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
                c8 c8Var = (c8) this.c;
                n30 n30Var3 = c8Var.e;
                if (n30Var3 != null) {
                    n30Var3.a();
                    c8Var.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    c8Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
