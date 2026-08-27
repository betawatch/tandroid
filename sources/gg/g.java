package gg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import lh.e2;
import lh.n9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.p10;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.je0;
import org.telegram.ui.lx;
import org.telegram.ui.r00;
import org.telegram.ui.r70;
import org.telegram.ui.ro;
import org.telegram.ui.t70;
import org.telegram.ui.xo;
import pf.e0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.nt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 7:
                ((km0) this.c).getClass();
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
                    AndroidUtilities.hideKeyboard(((e2) this.c).d);
                    break;
                }
                break;
            case 6:
                super.onFocusChanged(z10, i10, rect);
                ic0 ic0Var = (ic0) this.c;
                float f10 = (z10 || isFocused()) ? 1.0f : 0.0f;
                ic0Var.b(f10, f10, true);
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
                xo xoVar = (xo) this.c;
                ro roVar = xoVar.f;
                if (roVar != null && roVar.getTextView() != null && !TextUtils.isEmpty(xoVar.f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(xoVar.f.getTextView().getText());
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
                v0 v0Var = (v0) this.c;
                if (i10 != 67 || v0Var.e.length() != 0 || ((v0Var.h.getVisibility() != 0 || v0Var.h.length() <= 0) && !v0Var.p())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!v0Var.p()) {
                    v0Var.s.callOnClick();
                    return true;
                }
                e0 e0Var = (e0) i0.a.i(1, v0Var.c0);
                e5 e5Var = v0Var.D;
                if (e5Var != null) {
                    e5Var.o(e0Var);
                }
                v0Var.C(e0Var);
                return true;
            case 5:
                p10 p10Var = (p10) this.c;
                if (i10 != 67 || p10Var.r.length() != 0 || !p10Var.e()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!p10Var.e()) {
                    return true;
                }
                e0 e0Var2 = (e0) i0.a.i(1, p10Var.B);
                o10 o10Var = p10Var.D;
                if (o10Var != null) {
                    ((lx) o10Var).e(e0Var2);
                }
                p10Var.g(e0Var2);
                return true;
            case 8:
                r70 r70Var = (r70) this.c;
                t70 t70Var = r70Var.f;
                if (i10 != 67 || r70Var.d.length() != 0 || t70Var.C.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                t70Var.f.a((a30) i0.a.i(1, t70Var.C));
                t70Var.c.e(!t70Var.C.isEmpty(), true);
                t70Var.c0();
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
                    ((je0) this.c).y = true;
                    postDelayed(new r00(this, 21), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                l lVar = (l) this.c;
                a30 a30Var = lVar.f;
                if (a30Var != null) {
                    a30Var.a();
                    lVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    lVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 1:
                g gVar = ((e2) this.c).d;
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
                n9 n9Var = (n9) this.c;
                a30 a30Var2 = n9Var.e;
                if (a30Var2 != null) {
                    a30Var2.a();
                    n9Var.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    n9Var.fullScroll(130);
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
                        ((km0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                a30 a30Var3 = usersSelectActivity.L;
                if (a30Var3 != null) {
                    a30Var3.a();
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
