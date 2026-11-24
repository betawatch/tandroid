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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l7 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1;
    public final Object N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(Context context) {
        super(context);
        this.M1 = (byte) 11;
        this.N1 = new in3((byte) 7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.M1) {
            case 11:
                in3 in3Var = (in3) this.N1;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), nm7.d4, 31);
                    super.onDraw(canvas);
                    RectF rectF = gm.P;
                    rectF.set(getScrollX(), 0.0f, gm.L(12.0f) + getScrollX(), getHeight());
                    in3Var.r(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - gm.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    in3Var.r(canvas, rectF, 2, 1.0f);
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
                    gm.t1(((ix3) obj).e);
                    break;
                }
                break;
            case 5:
                super.onFocusChanged(z, i, rect);
                ft7 ft7Var = (ft7) obj;
                float f = (z || isFocused()) ? 1.0f : 0.0f;
                ft7Var.b(f, f, true);
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
                qa2 qa2Var = (qa2) this.N1;
                ka2 ka2Var = qa2Var.h;
                if (ka2Var != null && ka2Var.getTextView() != null && !TextUtils.isEmpty(qa2Var.h.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(qa2Var.h.getTextView().getText());
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
                sh4 sh4Var = (sh4) b10.f(1, r7Var.h0);
                n7 n7Var = r7Var.I;
                if (n7Var != null) {
                    n7Var.j(sh4Var);
                }
                r7Var.J(sh4Var);
                return true;
            case 3:
                oq4 oq4Var = (oq4) obj;
                if (i != 67 || oq4Var.r.length() != 0 || !oq4Var.d()) {
                    return super.onKeyDown(i, keyEvent);
                }
                if (!oq4Var.d()) {
                    return true;
                }
                sh4 sh4Var2 = (sh4) b10.f(1, oq4Var.G);
                nq4 nq4Var = oq4Var.I;
                if (nq4Var != null) {
                    ((pj3) nq4Var).a(sh4Var2);
                }
                oq4Var.f(sh4Var2);
                return true;
            case 7:
                rja rjaVar = (rja) obj;
                if (i != 67 || length() != 0 || (textView = rjaVar.x) == null || textView.getVisibility() != 0) {
                    return super.onKeyDown(i, keyEvent);
                }
                rjaVar.n();
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
                setMeasuredDimension(gm.L(3.0f) + Math.max(View.MeasureSpec.getSize(i), getMeasuredWidth()), getMeasuredHeight());
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

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.M1) {
            case 10:
                super.onTextChanged(charSequence, i, i2, i3);
                vx1 vx1Var = ((olc) this.N1).b;
                if (vx1Var != null) {
                    ChatActivityEnterView chatActivityEnterView = vx1Var.b;
                    int i4 = ChatActivityEnterView.z7;
                    by1 by1Var = chatActivityEnterView.K0;
                    if (by1Var != null) {
                        by1Var.setIconDimmed(chatActivityEnterView.K1 && chatActivityEnterView.U1);
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
                    ((pf6) this.N1).E = true;
                    postDelayed(new bn3(this, (byte) 26), 1000L);
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
                if (motionEvent.getAction() == 1 && !gm.E3(this)) {
                    clearFocus();
                    requestFocus();
                    break;
                }
                break;
            case 2:
                l7 l7Var = ((ix3) obj).e;
                if (!l7Var.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        l7Var.requestFocus();
                        gm.E3(l7Var);
                    }
                    break;
                }
            case 6:
                j1a j1aVar = (j1a) obj;
                wc5 wc5Var = j1aVar.f;
                if (wc5Var != null) {
                    wc5Var.a();
                    j1aVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
                    j1aVar.fullScroll(nm7.N1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 8:
                x7b x7bVar = (x7b) obj;
                wc5 wc5Var2 = x7bVar.f;
                if (wc5Var2 != null) {
                    wc5Var2.a();
                    x7bVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
                    x7bVar.fullScroll(nm7.N1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                wc5 wc5Var3 = usersSelectActivity.R;
                if (wc5Var3 != null) {
                    wc5Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !gm.E3(this)) {
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
