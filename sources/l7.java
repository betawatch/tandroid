// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class l7 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1;
    public final Object N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(Context context) {
        super(context);
        this.M1 = (byte) 11;
        this.N1 = new xl3((byte) 7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.M1) {
            case 11:
                xl3 xl3Var = (xl3) this.N1;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), kk7.d4, 31);
                    super.onDraw(canvas);
                    RectF rectF = gl.P;
                    rectF.set(getScrollX(), 0.0f, gl.L(12.0f) + getScrollX(), getHeight());
                    xl3Var.s(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - gl.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    xl3Var.s(canvas, rectF, 2, 1.0f);
                    canvas.restore();
                    break;
                } else {
                    super.onDraw(canvas);
                    break;
                }
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.M1;
        Object obj = this.N1;
        switch (b) {
            case 2:
                super.onFocusChanged(z, i, rect);
                if (!z) {
                    gl.t1(((xv3) obj).e);
                    break;
                }
                break;
            case 5:
                super.onFocusChanged(z, i, rect);
                dr7 dr7Var = (dr7) obj;
                float f = (z || isFocused()) ? 1.0f : 0.0f;
                dr7Var.b(f, f, true);
                break;
            default:
                super.onFocusChanged(z, i, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.M1) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) getText());
                f92 f92Var = (f92) this.N1;
                z82 z82Var = f92Var.h;
                if (z82Var != null && z82Var.getTextView() != null && !TextUtils.isEmpty(f92Var.h.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(f92Var.h.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        TextView textView;
        byte b = this.M1;
        Object obj = this.N1;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                if (i != 67 || r7Var.e.length() != 0 || ((r7Var.h.getVisibility() != 0 || r7Var.h.length() <= 0) && !r7Var.s())) {
                    return super.onKeyDown(i, keyEvent);
                }
                if (!r7Var.s()) {
                    r7Var.s.callOnClick();
                    return true;
                }
                rf4 rf4Var = (rf4) b00.f(1, r7Var.h0);
                n7 n7Var = r7Var.I;
                if (n7Var != null) {
                    n7Var.j(rf4Var);
                }
                r7Var.J(rf4Var);
                return true;
            case 3:
                no4 no4Var = (no4) obj;
                if (i != 67 || no4Var.r.length() != 0 || !no4Var.d()) {
                    return super.onKeyDown(i, keyEvent);
                }
                if (!no4Var.d()) {
                    return true;
                }
                rf4 rf4Var2 = (rf4) b00.f(1, no4Var.G);
                mo4 mo4Var = no4Var.I;
                if (mo4Var != null) {
                    ((di3) mo4Var).a(rf4Var2);
                }
                no4Var.f(rf4Var2);
                return true;
            case 7:
                pha phaVar = (pha) obj;
                if (i != 67 || length() != 0 || (textView = phaVar.x) == null || textView.getVisibility() != 0) {
                    return super.onKeyDown(i, keyEvent);
                }
                phaVar.m();
                return true;
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 0:
                super.onMeasure(i, i2);
                setMeasuredDimension(gl.L(3.0f) + Math.max(View.MeasureSpec.getSize(i), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 3:
                super.onMeasure(i, i2);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.M1) {
            case 10:
                super.onTextChanged(charSequence, i, i2, i3);
                iw1 iw1Var = ((ojc) this.N1).b;
                if (iw1Var != null) {
                    ChatActivityEnterView chatActivityEnterView = iw1Var.b;
                    int i4 = ChatActivityEnterView.r7;
                    ow1 ow1Var = chatActivityEnterView.K0;
                    if (ow1Var != null) {
                        ow1Var.setIconDimmed(chatActivityEnterView.K1 && chatActivityEnterView.U1);
                        break;
                    }
                }
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        switch (this.M1) {
            case 4:
                if (i == 16908322 || i == 16908337) {
                    ((qd6) this.N1).E = true;
                    postDelayed(new ql3(this, (byte) 26), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.M1;
        Object obj = this.N1;
        switch (b) {
            case 0:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !gl.F3(this)) {
                    clearFocus();
                    requestFocus();
                    break;
                }
                break;
            case 2:
                l7 l7Var = ((xv3) obj).e;
                if (!l7Var.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        l7Var.requestFocus();
                        gl.F3(l7Var);
                    }
                    break;
                }
            case 6:
                hz9 hz9Var = (hz9) obj;
                ya5 ya5Var = hz9Var.f;
                if (ya5Var != null) {
                    ya5Var.a();
                    hz9Var.f = null;
                }
                if (motionEvent.getAction() == 0 && !gl.F3(this)) {
                    hz9Var.fullScroll(kk7.N1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 8:
                v5b v5bVar = (v5b) obj;
                ya5 ya5Var2 = v5bVar.f;
                if (ya5Var2 != null) {
                    ya5Var2.a();
                    v5bVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !gl.F3(this)) {
                    v5bVar.fullScroll(kk7.N1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                ya5 ya5Var3 = usersSelectActivity.R;
                if (ya5Var3 != null) {
                    ya5Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !gl.F3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7(byte b, Context context, Object obj) {
        super(context);
        this.M1 = b;
        this.N1 = obj;
    }
}
