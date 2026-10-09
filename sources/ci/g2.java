package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cp;
import org.telegram.ui.ip;
import org.telegram.ui.j20;
import org.telegram.ui.j80;
import org.telegram.ui.l80;
import org.telegram.ui.uz;
import org.telegram.ui.we0;
import org.telegram.ui.yx;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class g2 extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(Object obj, Context context, int i10) {
        super(context);
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.tu, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 6:
                ((co0) this.c).getClass();
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.tu, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.b) {
            case 10:
                j20 j20Var = (j20) this.c;
                if (length() != 0) {
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                    super.onDraw(canvas);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(12.0f) + getScrollX(), getHeight());
                    j20Var.b(canvas, rectF, 0, 1.0f);
                    rectF.set((getWidth() + getScrollX()) - AndroidUtilities.dp(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                    j20Var.b(canvas, rectF, 2, 1.0f);
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
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((k2) this.c).d);
                    break;
                }
                break;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                yd0 yd0Var = (yd0) this.c;
                float f7 = (z10 || isFocused()) ? 1.0f : 0.0f;
                yd0Var.b(f7, f7, true);
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
                ip ipVar = (ip) this.c;
                cp cpVar = ipVar.f;
                if (cpVar != null && cpVar.getTextView() != null && !TextUtils.isEmpty(ipVar.f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(ipVar.f.getTextView().getText());
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
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.c;
                if (i10 != 67 || v0Var.e.length() != 0 || ((v0Var.h.getVisibility() != 0 || v0Var.h.length() <= 0) && !v0Var.p())) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!v0Var.p()) {
                    v0Var.s.callOnClick();
                    return true;
                }
                gg.p0 p0Var = (gg.p0) hg.c.g(1, v0Var.g0);
                org.telegram.ui.ActionBar.g5 g5Var = v0Var.H;
                if (g5Var != null) {
                    g5Var.o(p0Var);
                }
                v0Var.C(p0Var);
                return true;
            case 4:
                s20 s20Var = (s20) this.c;
                if (i10 != 67 || s20Var.r.length() != 0 || !s20Var.d()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                if (!s20Var.d()) {
                    return true;
                }
                gg.p0 p0Var2 = (gg.p0) hg.c.g(1, s20Var.F);
                r20 r20Var = s20Var.H;
                if (r20Var != null) {
                    ((yx) r20Var).d(p0Var2);
                }
                s20Var.g(p0Var2);
                return true;
            case 7:
                j80 j80Var = (j80) this.c;
                l80 l80Var = j80Var.f;
                if (i10 != 67 || j80Var.d.length() != 0 || l80Var.G.isEmpty()) {
                    return super.onKeyDown(i10, keyEvent);
                }
                l80Var.f.a((d40) hg.c.g(1, l80Var.G));
                l80Var.c.e(!l80Var.G.isEmpty(), true);
                l80Var.c0();
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
                    ((we0) this.c).y = true;
                    postDelayed(new uz(this, 22), 1000L);
                }
                break;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                g2 g2Var = ((k2) this.c).d;
                if (!g2Var.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        g2Var.requestFocus();
                        AndroidUtilities.showKeyboard(g2Var);
                    }
                    break;
                }
            case 1:
                ca caVar = (ca) this.c;
                d40 d40Var = caVar.e;
                if (d40Var != null) {
                    d40Var.a();
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
                        ((co0) this.c).getClass();
                    }
                    break;
                }
                break;
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.c;
                d40 d40Var2 = usersSelectActivity.P;
                if (d40Var2 != null) {
                    d40Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                break;
            case 11:
                xg.i iVar = (xg.i) this.c;
                d40 d40Var3 = iVar.f;
                if (d40Var3 != null) {
                    d40Var3.a();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context) {
        super(context);
        this.b = 10;
        this.c = new j20();
    }
}
