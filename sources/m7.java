// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m7 extends EditTextBoldCursor {
    public final /* synthetic */ byte N1;
    public final Object O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(Context context) {
        super(context);
        this.N1 = (byte) 12;
        this.O1 = new pm3((byte) 7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.N1) {
            case 12:
                pm3 pm3Var = (pm3) this.O1;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), jn7.d4, 31);
                    super.onDraw(canvas);
                    RectF rectF = hl.P;
                    rectF.set(getScrollX(), 0.0f, hl.L(12.0f) + getScrollX(), getHeight());
                    pm3Var.r(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - hl.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    pm3Var.r(canvas, rectF, 2, 1.0f);
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
        byte b = this.N1;
        Object obj = this.O1;
        switch (b) {
            case 2:
                super.onFocusChanged(z, i, rect);
                if (!z) {
                    hl.t1(((sw3) obj).e);
                    break;
                }
                break;
            case 5:
                super.onFocusChanged(z, i, rect);
                ju7 ju7Var = (ju7) obj;
                float f = (z || isFocused()) ? 1.0f : 0.0f;
                ju7Var.b(f, f, true);
                break;
            default:
                super.onFocusChanged(z, i, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.N1) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) getText());
                v92 v92Var = (v92) this.O1;
                p92 p92Var = v92Var.h;
                if (p92Var != null && p92Var.getTextView() != null && !TextUtils.isEmpty(v92Var.h.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(v92Var.h.getTextView().getText());
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
        byte b = this.N1;
        Object obj = this.O1;
        switch (b) {
            case 0:
                s7 s7Var = (s7) obj;
                if (i != 67 || s7Var.e.length() != 0 || ((s7Var.h.getVisibility() != 0 || s7Var.h.length() <= 0) && !s7Var.s())) {
                    return super.onKeyDown(i, keyEvent);
                }
                if (!s7Var.s()) {
                    s7Var.s.callOnClick();
                    return true;
                }
                ph4 ph4Var = (ph4) c00.g(1, s7Var.h0);
                o7 o7Var = s7Var.I;
                if (o7Var != null) {
                    o7Var.j(ph4Var);
                }
                s7Var.J(ph4Var);
                return true;
            case 3:
                rq4 rq4Var = (rq4) obj;
                if (i != 67 || rq4Var.r.length() != 0 || !rq4Var.e()) {
                    return super.onKeyDown(i, keyEvent);
                }
                if (!rq4Var.e()) {
                    return true;
                }
                ph4 ph4Var2 = (ph4) c00.g(1, rq4Var.H);
                qq4 qq4Var = rq4Var.J;
                if (qq4Var != null) {
                    ((xi3) qq4Var).a(ph4Var2);
                }
                rq4Var.g(ph4Var2);
                return true;
            case 7:
                jla jlaVar = (jla) obj;
                if (i != 67 || length() != 0 || !jlaVar.C()) {
                    return super.onKeyDown(i, keyEvent);
                }
                jlaVar.n();
                return true;
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.N1) {
            case 0:
                super.onMeasure(i, i2);
                setMeasuredDimension(hl.L(3.0f) + Math.max(View.MeasureSpec.getSize(i), getMeasuredWidth()), getMeasuredHeight());
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

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.N1) {
            case 11:
                super.onTextChanged(charSequence, i, i2, i3);
                gx1 gx1Var = ((boc) this.O1).b;
                if (gx1Var != null) {
                    ChatActivityEnterView chatActivityEnterView = gx1Var.a;
                    int i4 = ChatActivityEnterView.X7;
                    chatActivityEnterView.M2();
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        switch (this.N1) {
            case 4:
                if (i == 16908322 || i == 16908337) {
                    ((sf6) this.O1).E = true;
                    postDelayed(new jm3(this, (byte) 28), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        byte b = this.N1;
        Object obj = this.O1;
        switch (b) {
            case 0:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !hl.E3(this)) {
                    clearFocus();
                    requestFocus();
                    break;
                }
                break;
            case 2:
                m7 m7Var = ((sw3) obj).e;
                if (!m7Var.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        m7Var.requestFocus();
                        hl.E3(m7Var);
                    }
                    break;
                }
            case 6:
                b3a b3aVar = (b3a) obj;
                zc5 zc5Var = b3aVar.f;
                if (zc5Var != null) {
                    zc5Var.a();
                    b3aVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !hl.E3(this)) {
                    b3aVar.fullScroll(jn7.N1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 8:
                t9b t9bVar = (t9b) obj;
                zc5 zc5Var2 = t9bVar.f;
                if (zc5Var2 != null) {
                    zc5Var2.a();
                    t9bVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !hl.E3(this)) {
                    t9bVar.fullScroll(jn7.N1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                zc5 zc5Var3 = usersSelectActivity.R;
                if (zc5Var3 != null) {
                    zc5Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !hl.E3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        switch (this.N1) {
            case 10:
                Layout layout = getLayout();
                knc kncVar = ((snc) this.O1).L;
                if (i2 != 0 && layout != null && kncVar != null) {
                    float maxTextHeight = kncVar.getMaxTextHeight();
                    if (maxTextHeight > 0.0f && layout.getHeight() <= maxTextHeight + 1.0f) {
                        i2 = 0;
                    }
                }
                super.scrollTo(i, i2);
                break;
            default:
                super.scrollTo(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(byte b, Context context, Object obj) {
        super(context);
        this.N1 = b;
        this.O1 = obj;
    }
}
