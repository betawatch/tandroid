package kg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import kf.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.o30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.c80;
import org.telegram.ui.d10;
import org.telegram.ui.e80;
import org.telegram.ui.fp;
import org.telegram.ui.re0;
import org.telegram.ui.vx;
import org.telegram.ui.zo;
import ph.b8;
import ph.r1;
import tf.e0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    @Override // org.telegram.ui.Components.wt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 5:
                ((dn0) this.c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z4, int i10, Rect rect) {
        switch (this.b) {
            case 4:
                super.onFocusChanged(z4, i10, rect);
                ad0 ad0Var = (ad0) this.c;
                float f10 = (z4 || isFocused()) ? 1.0f : 0.0f;
                ad0Var.b(f10, f10, true);
                break;
            case 9:
                super.onFocusChanged(z4, i10, rect);
                if (!z4) {
                    AndroidUtilities.hideKeyboard(((r1) this.c).d);
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
                fp fpVar = (fp) this.c;
                zo zoVar = fpVar.f;
                if (zoVar != null && zoVar.getTextView() != null && !TextUtils.isEmpty(fpVar.f.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(fpVar.f.getTextView().getText());
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
                e0 e0Var = (e0) k0.i(1, w0Var.d0);
                h5 h5Var = w0Var.E;
                if (h5Var != null) {
                    h5Var.o(e0Var);
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
                e0 e0Var2 = (e0) k0.i(1, d20Var.C);
                c20 c20Var = d20Var.E;
                if (c20Var != null) {
                    ((vx) c20Var).d(e0Var2);
                }
                d20Var.g(e0Var2);
                return true;
            case 6:
                c80 c80Var = (c80) this.c;
                e80 e80Var = c80Var.f;
                if (i10 != 67 || c80Var.d.length() != 0 || e80Var.D.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                e80Var.f.a((o30) k0.i(1, e80Var.D));
                e80Var.c.e(!e80Var.D.isEmpty(), true);
                e80Var.c0();
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
                    ((re0) this.c).y = true;
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
                k kVar = (k) this.c;
                o30 o30Var = kVar.f;
                if (o30Var != null) {
                    o30Var.a();
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
                        ((dn0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                o30 o30Var2 = usersSelectActivity.M;
                if (o30Var2 != null) {
                    o30Var2.a();
                    usersSelectActivity.M = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 9:
                f fVar = ((r1) this.c).d;
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
                b8 b8Var = (b8) this.c;
                o30 o30Var3 = b8Var.e;
                if (o30Var3 != null) {
                    o30Var3.a();
                    b8Var.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    b8Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
