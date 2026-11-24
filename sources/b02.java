// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b02 extends rt3 {
    public final /* synthetic */ x02 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b02(x02 x02Var, Context context, k02 k02Var, wjb wjbVar) {
        super(context, k02Var, null, 1, true, wjbVar);
        this.W = x02Var;
    }

    @Override // rt3
    public final void f() {
        super.f();
        t14 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(gl.n);
        }
    }

    @Override // rt3
    public final void i(ActionMode actionMode, Menu menu) {
        d dVar = this.W.Z1;
        if (dVar instanceof mu1) {
            mu1.v6(menu, ((mu1) dVar).h, true, true, true, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x02 x02Var = this.W;
        b02 b02Var = x02Var.M2;
        if (!x02Var.r3) {
            if (motionEvent.getX() <= b02Var.getEditText().getLeft() || motionEvent.getX() >= b02Var.getEditText().getRight() || motionEvent.getY() <= b02Var.getEditText().getTop() || motionEvent.getY() >= b02Var.getEditText().getBottom()) {
                x02Var.c1(b02Var.getEditText(), false);
            } else {
                x02Var.c1(b02Var.getEditText(), true);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.W.L1();
    }

    @Override // rt3
    public final void q(int i, int i2) {
        x02 x02Var = this.W;
        x02Var.L1();
        if (x02Var.W1) {
            x02Var.w1(i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim()));
        }
    }
}
