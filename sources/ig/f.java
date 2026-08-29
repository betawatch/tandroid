package ig;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j7.l1;
import nh.b9;
import nh.d2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.x10;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.fe0;
import org.telegram.ui.kx;
import org.telegram.ui.q00;
import org.telegram.ui.q70;
import org.telegram.ui.s70;
import org.telegram.ui.so;
import org.telegram.ui.yo;
import rf.f0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // org.telegram.ui.Components.ut, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 7:
                ((um0) this.c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.b) {
            case 1:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((d2) this.c).d);
                    break;
                }
                break;
            case 6:
                super.onFocusChanged(z10, i10, rect);
                tc0 tc0Var = (tc0) this.c;
                float f9 = (z10 || isFocused()) ? 1.0f : 0.0f;
                tc0Var.b(f9, f9, true);
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
            case 3:
                w0 w0Var = (w0) this.c;
                if (i10 != 67 || w0Var.e.length() != 0 || ((w0Var.h.getVisibility() != 0 || w0Var.h.length() <= 0) && !w0Var.p())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!w0Var.p()) {
                    w0Var.s.callOnClick();
                    return true;
                }
                f0 f0Var = (f0) l1.i(1, w0Var.c0);
                e5 e5Var = w0Var.D;
                if (e5Var != null) {
                    e5Var.o(f0Var);
                }
                w0Var.C(f0Var);
                return true;
            case 5:
                x10 x10Var = (x10) this.c;
                if (i10 != 67 || x10Var.r.length() != 0 || !x10Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!x10Var.d()) {
                    return true;
                }
                f0 f0Var2 = (f0) l1.i(1, x10Var.B);
                w10 w10Var = x10Var.D;
                if (w10Var != null) {
                    ((kx) w10Var).g(f0Var2);
                }
                x10Var.g(f0Var2);
                return true;
            case 8:
                q70 q70Var = (q70) this.c;
                s70 s70Var = q70Var.f;
                if (i10 != 67 || q70Var.d.length() != 0 || s70Var.C.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                s70Var.f.a((j30) l1.i(1, s70Var.C));
                s70Var.c.e(!s70Var.C.isEmpty(), true);
                s70Var.c0();
                return true;
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.b) {
            case 3:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 4:
            default:
                super.onMeasure(i10, i11);
                break;
            case 5:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        switch (this.b) {
            case 9:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((fe0) this.c).y = true;
                    postDelayed(new q00(this, 21), 1000L);
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
                j30 j30Var = kVar.f;
                if (j30Var != null) {
                    j30Var.a();
                    kVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    kVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 1:
                f fVar = ((d2) this.c).d;
                if (!fVar.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        fVar.requestFocus();
                        AndroidUtilities.showKeyboard(fVar);
                    }
                    break;
                }
            case 2:
                b9 b9Var = (b9) this.c;
                j30 j30Var2 = b9Var.e;
                if (j30Var2 != null) {
                    j30Var2.a();
                    b9Var.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    b9Var.fullScroll(130);
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
                        ((um0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                j30 j30Var3 = usersSelectActivity.L;
                if (j30Var3 != null) {
                    j30Var3.a();
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
