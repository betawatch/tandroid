package di;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.fp;
import org.telegram.ui.g10;
import org.telegram.ui.j80;
import org.telegram.ui.l80;
import org.telegram.ui.lp;
import org.telegram.ui.xe0;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class h2 extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.bu, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 6:
                ((wm0) this.c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((l2) this.c).d);
                    break;
                }
                break;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                yc0 yc0Var = (yc0) this.c;
                float f7 = (z10 || isFocused()) ? 1.0f : 0.0f;
                yc0Var.b(f7, f7, true);
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
                lp lpVar = (lp) this.c;
                fp fpVar = lpVar.f;
                if (fpVar != null && fpVar.getTextView() != null && !TextUtils.isEmpty(lpVar.f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(lpVar.f.getTextView().getText());
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
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.c;
                if (i10 != 67 || v0Var.e.length() != 0 || ((v0Var.h.getVisibility() != 0 || v0Var.h.length() <= 0) && !v0Var.p())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!v0Var.p()) {
                    v0Var.s.callOnClick();
                    return true;
                }
                hg.q0 q0Var = (hg.q0) i2.g.h(1, v0Var.g0);
                org.telegram.ui.ActionBar.g5 g5Var = v0Var.H;
                if (g5Var != null) {
                    g5Var.o(q0Var);
                }
                v0Var.C(q0Var);
                return true;
            case 4:
                b20 b20Var = (b20) this.c;
                if (i10 != 67 || b20Var.r.length() != 0 || !b20Var.e()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!b20Var.e()) {
                    return true;
                }
                hg.q0 q0Var2 = (hg.q0) i2.g.h(1, b20Var.F);
                a20 a20Var = b20Var.H;
                if (a20Var != null) {
                    ((zx) a20Var).c(q0Var2);
                }
                b20Var.g(q0Var2);
                return true;
            case 7:
                j80 j80Var = (j80) this.c;
                l80 l80Var = j80Var.f;
                if (i10 != 67 || j80Var.d.length() != 0 || l80Var.G.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                l80Var.f.a((m30) i2.g.h(1, l80Var.G));
                l80Var.c.e(!l80Var.G.isEmpty(), true);
                l80Var.c0();
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
                    ((xe0) this.c).y = true;
                    postDelayed(new g10(this, 21), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                h2 h2Var = ((l2) this.c).d;
                if (!h2Var.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        h2Var.requestFocus();
                        AndroidUtilities.showKeyboard(h2Var);
                    }
                    break;
                }
            case 1:
                fa faVar = (fa) this.c;
                m30 m30Var = faVar.e;
                if (m30Var != null) {
                    m30Var.a();
                    faVar.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    faVar.fullScroll(130);
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
                        ((wm0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                m30 m30Var2 = usersSelectActivity.P;
                if (m30Var2 != null) {
                    m30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 10:
                yg.i iVar = (yg.i) this.c;
                m30 m30Var3 = iVar.f;
                if (m30Var3 != null) {
                    m30Var3.a();
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
}
