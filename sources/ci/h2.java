package ci;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ap;
import org.telegram.ui.d10;
import org.telegram.ui.g80;
import org.telegram.ui.gp;
import org.telegram.ui.i80;
import org.telegram.ui.se0;
import org.telegram.ui.wx;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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

    @Override // org.telegram.ui.Components.eu, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 6:
                ((xm0) this.c).getClass();
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
                wc0 wc0Var = (wc0) this.c;
                float f7 = (z10 || isFocused()) ? 1.0f : 0.0f;
                wc0Var.b(f7, f7, true);
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
                gp gpVar = (gp) this.c;
                ap apVar = gpVar.f;
                if (apVar != null && apVar.getTextView() != null && !TextUtils.isEmpty(gpVar.f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(gpVar.f.getTextView().getText());
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
                gg.q0 q0Var = (gg.q0) hg.c.h(1, v0Var.g0);
                org.telegram.ui.ActionBar.f5 f5Var = v0Var.H;
                if (f5Var != null) {
                    f5Var.o(q0Var);
                }
                v0Var.C(q0Var);
                return true;
            case 4:
                c20 c20Var = (c20) this.c;
                if (i10 != 67 || c20Var.r.length() != 0 || !c20Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!c20Var.d()) {
                    return true;
                }
                gg.q0 q0Var2 = (gg.q0) hg.c.h(1, c20Var.F);
                b20 b20Var = c20Var.H;
                if (b20Var != null) {
                    ((wx) b20Var).h(q0Var2);
                }
                c20Var.g(q0Var2);
                return true;
            case 7:
                g80 g80Var = (g80) this.c;
                i80 i80Var = g80Var.f;
                if (i10 != 67 || g80Var.d.length() != 0 || i80Var.G.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                i80Var.f.a((n30) hg.c.h(1, i80Var.G));
                i80Var.c.e(!i80Var.G.isEmpty(), true);
                i80Var.c0();
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
                    ((se0) this.c).y = true;
                    postDelayed(new d10(this, 21), 1000L);
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
                ca caVar = (ca) this.c;
                n30 n30Var = caVar.e;
                if (n30Var != null) {
                    n30Var.a();
                    caVar.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    caVar.fullScroll(130);
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
                        ((xm0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                n30 n30Var2 = usersSelectActivity.P;
                if (n30Var2 != null) {
                    n30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 10:
                xg.i iVar = (xg.i) this.c;
                n30 n30Var3 = iVar.f;
                if (n30Var3 != null) {
                    n30Var3.a();
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
