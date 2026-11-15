package ah;

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
import hi.d2;
import hi.n8;
import jg.o0;
import org.telegram.messenger.g0;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.w4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.be;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.he;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.v00;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ao;
import org.telegram.ui.dc0;
import org.telegram.ui.ev;
import org.telegram.ui.ho;
import org.telegram.ui.iz;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i extends EditTextBoldCursor {
    public final /* synthetic */ int M1;
    public final Object N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i7, Context context, Object obj) {
        super(context);
        this.M1 = i7;
        this.N1 = obj;
    }

    @Override // org.telegram.ui.Components.kt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 8:
                ((jl0) this.N1).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.M1) {
            case 11:
                h6.m mVar = (h6.m) this.N1;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), ns.e4, 31);
                    super.onDraw(canvas);
                    RectF rectF = g0.P;
                    rectF.set(getScrollX(), 0.0f, g0.L(12.0f) + getScrollX(), getHeight());
                    mVar.m(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - g0.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    mVar.m(canvas, rectF, 2, 1.0f);
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
    public void onFocusChanged(boolean z10, int i7, Rect rect) {
        switch (this.M1) {
            case 1:
                super.onFocusChanged(z10, i7, rect);
                if (!z10) {
                    g0.v1(((d2) this.N1).e);
                    break;
                }
                break;
            case 7:
                super.onFocusChanged(z10, i7, rect);
                lb0 lb0Var = (lb0) this.N1;
                float f10 = (z10 || isFocused()) ? 1.0f : 0.0f;
                lb0Var.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i7, rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.M1) {
            case 5:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                ho hoVar = (ho) this.N1;
                ao aoVar = hoVar.h;
                if (aoVar != null && aoVar.getTextView() != null && !TextUtils.isEmpty(hoVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(hoVar.h.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        TextView textView;
        switch (this.M1) {
            case 3:
                q0 q0Var = (q0) this.N1;
                if (i7 != 67 || q0Var.e.length() != 0 || ((q0Var.h.getVisibility() != 0 || q0Var.h.length() <= 0) && !q0Var.s())) {
                    return super.onKeyDown(i7, keyEvent);
                }
                if (!q0Var.s()) {
                    q0Var.s.callOnClick();
                    return true;
                }
                o0 o0Var = (o0) i5.c.h(1, q0Var.h0);
                m0 m0Var = q0Var.I;
                if (m0Var != null) {
                    m0Var.j(o0Var);
                }
                q0Var.J(o0Var);
                return true;
            case 4:
                w4 w4Var = (w4) this.N1;
                if (i7 != 67 || length() != 0 || (textView = w4Var.x) == null || textView.getVisibility() != 0) {
                    return super.onKeyDown(i7, keyEvent);
                }
                w4Var.l();
                return true;
            case 5:
            default:
                return super.onKeyDown(i7, keyEvent);
            case 6:
                v00 v00Var = (v00) this.N1;
                if (i7 != 67 || v00Var.r.length() != 0 || !v00Var.d()) {
                    return super.onKeyDown(i7, keyEvent);
                }
                if (!v00Var.d()) {
                    return true;
                }
                o0 o0Var2 = (o0) i5.c.h(1, v00Var.G);
                u00 u00Var = v00Var.I;
                if (u00Var != null) {
                    ((ev) u00Var).g(o0Var2);
                }
                v00Var.f(o0Var2);
                return true;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.M1) {
            case 3:
                super.onMeasure(i7, i10);
                setMeasuredDimension(g0.L(3.0f) + Math.max(View.MeasureSpec.getSize(i7), getMeasuredWidth()), getMeasuredHeight());
                break;
            case 6:
                super.onMeasure(i7, i10);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.M1) {
            case 12:
                super.onTextChanged(charSequence, i7, i10, i11);
                be beVar = ((yh.a) this.N1).b;
                if (beVar != null) {
                    ChatActivityEnterView chatActivityEnterView = beVar.b;
                    int i12 = ChatActivityEnterView.N6;
                    he heVar = chatActivityEnterView.K0;
                    if (heVar != null) {
                        heVar.setIconDimmed(chatActivityEnterView.C1 && chatActivityEnterView.M1);
                        break;
                    }
                }
                break;
            default:
                super.onTextChanged(charSequence, i7, i10, i11);
                break;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        switch (this.M1) {
            case 9:
                if (i7 == 16908322 || i7 == 16908337) {
                    ((dc0) this.N1).E = true;
                    postDelayed(new iz(this, 24), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 0:
                o oVar = (o) this.N1;
                f20 f20Var = oVar.f;
                if (f20Var != null) {
                    f20Var.a();
                    oVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.J3(this)) {
                    oVar.fullScroll(ns.O1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 1:
                i iVar = ((d2) this.N1).e;
                if (!iVar.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        iVar.requestFocus();
                        g0.J3(iVar);
                    }
                    break;
                }
            case 2:
                n8 n8Var = (n8) this.N1;
                f20 f20Var2 = n8Var.f;
                if (f20Var2 != null) {
                    f20Var2.a();
                    n8Var.f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.J3(this)) {
                    n8Var.fullScroll(ns.O1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 3:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !g0.J3(this)) {
                    clearFocus();
                    requestFocus();
                    break;
                }
                break;
            case 8:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((jl0) this.N1).getClass();
                    }
                    break;
                }
                break;
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.N1;
                f20 f20Var3 = usersSelectActivity.R;
                if (f20Var3 != null) {
                    f20Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !g0.J3(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        this.M1 = 11;
        this.N1 = new h6.m(29);
    }
}
