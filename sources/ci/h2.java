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
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.c10;
import org.telegram.ui.e80;
import org.telegram.ui.fp;
import org.telegram.ui.g80;
import org.telegram.ui.re0;
import org.telegram.ui.vx;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                ((jn0) this.c).getClass();
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
                id0 id0Var = (id0) this.c;
                float f7 = (z10 || isFocused()) ? 1.0f : 0.0f;
                id0Var.b(f7, f7, true);
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
                fp fpVar = (fp) this.c;
                zo zoVar = fpVar.f;
                if (zoVar != null && zoVar.getTextView() != null && !TextUtils.isEmpty(fpVar.f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(fpVar.f.getTextView().getText());
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
                gg.q0 q0Var = (gg.q0) hg.c.g(1, u0Var.g0);
                org.telegram.ui.ActionBar.e5 e5Var = u0Var.H;
                if (e5Var != null) {
                    e5Var.o(q0Var);
                }
                u0Var.C(q0Var);
                return true;
            case 4:
                c20 c20Var = (c20) this.c;
                if (i10 != 67 || c20Var.r.length() != 0 || !c20Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!c20Var.d()) {
                    return true;
                }
                gg.q0 q0Var2 = (gg.q0) hg.c.g(1, c20Var.F);
                b20 b20Var = c20Var.H;
                if (b20Var != null) {
                    ((vx) b20Var).h(q0Var2);
                }
                c20Var.g(q0Var2);
                return true;
            case 7:
                e80 e80Var = (e80) this.c;
                g80 g80Var = e80Var.f;
                if (i10 != 67 || e80Var.d.length() != 0 || g80Var.G.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                g80Var.f.a((n30) hg.c.g(1, g80Var.G));
                g80Var.c.e(!g80Var.G.isEmpty(), true);
                g80Var.c0();
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
                    ((re0) this.c).y = true;
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
                        ((jn0) this.c).getClass();
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
