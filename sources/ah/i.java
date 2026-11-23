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
import hi.h9;
import hi.l2;
import jg.o0;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.m0;
import org.telegram.ui.ActionBar.q0;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bo;
import org.telegram.ui.dc0;
import org.telegram.ui.gv;
import org.telegram.ui.io;
import org.telegram.ui.kz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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

    @Override // org.telegram.ui.Components.pt, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.M1) {
            case 8:
                ((tl0) this.N1).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.M1) {
            case 11:
                i61 i61Var = (i61) this.N1;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), ks.e4, 31);
                    super.onDraw(canvas);
                    RectF rectF = g0.P;
                    rectF.set(getScrollX(), 0.0f, g0.L(12.0f) + getScrollX(), getHeight());
                    i61Var.u(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - g0.L(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    i61Var.u(canvas, rectF, 2, 1.0f);
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
                    g0.v1(((l2) this.N1).e);
                    break;
                }
                break;
            case 7:
                super.onFocusChanged(z10, i7, rect);
                tb0 tb0Var = (tb0) this.N1;
                float f10 = (z10 || isFocused()) ? 1.0f : 0.0f;
                tb0Var.b(f10, f10, true);
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
                io ioVar = (io) this.N1;
                bo boVar = ioVar.h;
                if (boVar != null && boVar.getTextView() != null && !TextUtils.isEmpty(ioVar.h.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(ioVar.h.getTextView().getText());
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
                z4 z4Var = (z4) this.N1;
                if (i7 != 67 || length() != 0 || (textView = z4Var.x) == null || textView.getVisibility() != 0) {
                    return super.onKeyDown(i7, keyEvent);
                }
                z4Var.n();
                return true;
            case 5:
            default:
                return super.onKeyDown(i7, keyEvent);
            case 6:
                c10 c10Var = (c10) this.N1;
                if (i7 != 67 || c10Var.r.length() != 0 || !c10Var.d()) {
                    return super.onKeyDown(i7, keyEvent);
                }
                if (!c10Var.d()) {
                    return true;
                }
                o0 o0Var2 = (o0) i5.c.h(1, c10Var.G);
                b10 b10Var = c10Var.I;
                if (b10Var != null) {
                    ((gv) b10Var).e(o0Var2);
                }
                c10Var.f(o0Var2);
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

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.pt, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.M1) {
            case 12:
                super.onTextChanged(charSequence, i7, i10, i11);
                le leVar = ((yh.a) this.N1).b;
                if (leVar != null) {
                    ChatActivityEnterView chatActivityEnterView = leVar.b;
                    int i12 = ChatActivityEnterView.s7;
                    se seVar = chatActivityEnterView.K0;
                    if (seVar != null) {
                        seVar.setIconDimmed(chatActivityEnterView.K1 && chatActivityEnterView.U1);
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
                    postDelayed(new kz(this, 24), 1000L);
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
                n20 n20Var = oVar.f;
                if (n20Var != null) {
                    n20Var.a();
                    oVar.f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.I3(this)) {
                    oVar.fullScroll(ks.O1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 1:
                i iVar = ((l2) this.N1).e;
                if (!iVar.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        iVar.requestFocus();
                        g0.I3(iVar);
                    }
                    break;
                }
            case 2:
                h9 h9Var = (h9) this.N1;
                n20 n20Var2 = h9Var.f;
                if (n20Var2 != null) {
                    n20Var2.a();
                    h9Var.f = null;
                }
                if (motionEvent.getAction() == 0 && !g0.I3(this)) {
                    h9Var.fullScroll(ks.O1);
                    clearFocus();
                    requestFocus();
                }
                break;
            case 3:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !g0.I3(this)) {
                    clearFocus();
                    requestFocus();
                    break;
                }
                break;
            case 8:
                if (isEnabled()) {
                    if (motionEvent.getAction() == 1) {
                        ((tl0) this.N1).getClass();
                    }
                    break;
                }
                break;
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.N1;
                n20 n20Var3 = usersSelectActivity.R;
                if (n20Var3 != null) {
                    n20Var3.a();
                    usersSelectActivity.R = null;
                }
                if (motionEvent.getAction() == 0 && !g0.I3(this)) {
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
        this.N1 = new i61(1);
    }
}
