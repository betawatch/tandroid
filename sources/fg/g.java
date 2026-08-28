package fg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j3.r0;
import kh.g2;
import kh.q9;
import of.m0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.w20;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ge0;
import org.telegram.ui.ix;
import org.telegram.ui.o00;
import org.telegram.ui.o70;
import org.telegram.ui.po;
import org.telegram.ui.q70;
import org.telegram.ui.vo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Context context, int i9) {
        super(context);
        this.b = i9;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.ot, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 7:
                ((hm0) this.c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i9, Rect rect) {
        switch (this.b) {
            case 1:
                super.onFocusChanged(z10, i9, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((g2) this.c).d);
                    break;
                }
                break;
            case 6:
                super.onFocusChanged(z10, i9, rect);
                ec0 ec0Var = (ec0) this.c;
                float f10 = (z10 || isFocused()) ? 1.0f : 0.0f;
                ec0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i9, rect);
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
                vo voVar = (vo) this.c;
                po poVar = voVar.f;
                if (poVar != null && poVar.getTextView() != null && !TextUtils.isEmpty(voVar.f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(voVar.f.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        switch (this.b) {
            case 3:
                w0 w0Var = (w0) this.c;
                if (i9 != 67 || w0Var.e.length() != 0 || ((w0Var.h.getVisibility() != 0 || w0Var.h.length() <= 0) && !w0Var.p())) {
                    return super.onKeyDown(i9, keyEvent);
                }
                if (!w0Var.p()) {
                    w0Var.s.callOnClick();
                    return true;
                }
                m0 m0Var = (m0) r0.j(1, w0Var.c0);
                e5 e5Var = w0Var.D;
                if (e5Var != null) {
                    e5Var.o(m0Var);
                }
                w0Var.C(m0Var);
                return true;
            case 5:
                m10 m10Var = (m10) this.c;
                if (i9 != 67 || m10Var.r.length() != 0 || !m10Var.e()) {
                    return super.onKeyDown(i9, keyEvent);
                }
                if (!m10Var.e()) {
                    return true;
                }
                m0 m0Var2 = (m0) r0.j(1, m10Var.B);
                l10 l10Var = m10Var.D;
                if (l10Var != null) {
                    ((ix) l10Var).e(m0Var2);
                }
                m10Var.g(m0Var2);
                return true;
            case 8:
                o70 o70Var = (o70) this.c;
                q70 q70Var = o70Var.f;
                if (i9 != 67 || o70Var.d.length() != 0 || q70Var.C.isEmpty()) {
                    return super.onKeyDown(i9, keyEvent);
                }
                q70Var.f.a((w20) r0.j(1, q70Var.C));
                q70Var.c.e(!q70Var.C.isEmpty(), true);
                q70Var.b0();
                return true;
            default:
                return super.onKeyDown(i9, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.b) {
            case 3:
                super.onMeasure(i9, i10);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i9), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 4:
            default:
                super.onMeasure(i9, i10);
                break;
            case 5:
                super.onMeasure(i9, i10);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i9) {
        switch (this.b) {
            case 9:
                if (i9 == 16908322 || i9 == 16908337) {
                    ((ge0) this.c).y = true;
                    postDelayed(new o00(this, 21), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i9);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                m mVar = (m) this.c;
                w20 w20Var = mVar.f;
                if (w20Var != null) {
                    w20Var.a();
                    mVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    mVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 1:
                g gVar = ((g2) this.c).d;
                if (!gVar.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        gVar.requestFocus();
                        AndroidUtilities.showKeyboard(gVar);
                    }
                    break;
                }
            case 2:
                q9 q9Var = (q9) this.c;
                w20 w20Var2 = q9Var.e;
                if (w20Var2 != null) {
                    w20Var2.a();
                    q9Var.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    q9Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 3:
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
                        ((hm0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                w20 w20Var3 = usersSelectActivity.L;
                if (w20Var3 != null) {
                    w20Var3.a();
                    usersSelectActivity.L = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
