package bi;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.w30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cy;
import org.telegram.ui.gp;
import org.telegram.ui.i10;
import org.telegram.ui.i80;
import org.telegram.ui.k80;
import org.telegram.ui.mp;
import org.telegram.ui.xe0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class t2 extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(Object obj, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.hu, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 6:
                ((gn0) this.c).getClass();
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
                    AndroidUtilities.hideKeyboard(((x2) this.c).d);
                    break;
                }
                break;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                gd0 gd0Var = (gd0) this.c;
                float f7 = (z10 || isFocused()) ? 1.0f : 0.0f;
                gd0Var.b(f7, f7, true);
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
                mp mpVar = (mp) this.c;
                gp gpVar = mpVar.f;
                if (gpVar != null && gpVar.getTextView() != null && !TextUtils.isEmpty(mpVar.f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(mpVar.f.getTextView().getText());
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
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.c;
                if (i10 != 67 || w0Var.e.length() != 0 || ((w0Var.h.getVisibility() != 0 || w0Var.h.length() <= 0) && !w0Var.p())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!w0Var.p()) {
                    w0Var.s.callOnClick();
                    return true;
                }
                fg.q0 q0Var = (fg.q0) hc.b.i(1, w0Var.g0);
                org.telegram.ui.ActionBar.i5 i5Var = w0Var.H;
                if (i5Var != null) {
                    i5Var.o(q0Var);
                }
                w0Var.C(q0Var);
                return true;
            case 4:
                k20 k20Var = (k20) this.c;
                if (i10 != 67 || k20Var.r.length() != 0 || !k20Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!k20Var.d()) {
                    return true;
                }
                fg.q0 q0Var2 = (fg.q0) hc.b.i(1, k20Var.F);
                j20 j20Var = k20Var.H;
                if (j20Var != null) {
                    ((cy) j20Var).g(q0Var2);
                }
                k20Var.g(q0Var2);
                return true;
            case 7:
                i80 i80Var = (i80) this.c;
                k80 k80Var = i80Var.f;
                if (i10 != 67 || i80Var.d.length() != 0 || k80Var.G.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                k80Var.f.a((w30) hc.b.i(1, k80Var.G));
                k80Var.c.e(!k80Var.G.isEmpty(), true);
                k80Var.c0();
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
                    postDelayed(new i10(this, 21), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                t2 t2Var = ((x2) this.c).d;
                if (!t2Var.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        t2Var.requestFocus();
                        AndroidUtilities.showKeyboard(t2Var);
                    }
                    break;
                }
            case 1:
                ob obVar = (ob) this.c;
                w30 w30Var = obVar.e;
                if (w30Var != null) {
                    w30Var.a();
                    obVar.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    obVar.fullScroll(130);
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
                        ((gn0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                w30 w30Var2 = usersSelectActivity.P;
                if (w30Var2 != null) {
                    w30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 10:
                wg.h hVar = (wg.h) this.c;
                w30 w30Var3 = hVar.f;
                if (w30Var3 != null) {
                    w30Var3.a();
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
}
