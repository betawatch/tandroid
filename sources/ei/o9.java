package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.v30;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public abstract class o9 extends ScrollView implements org.telegram.ui.ActionBar.b6 {
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.g6 a;
    public final e2 b;
    public final int c;
    public final n9 d;
    public final ArrayList e;
    public v30 f;
    public final a9 h;
    public boolean n;
    public Utilities.Callback r;
    public final org.telegram.ui.Components.f6 s;
    public final LinearGradient v;
    public final Paint w;
    public final Matrix x;
    public final org.telegram.ui.Components.f6 y;

    public o9(Context context, org.telegram.ui.ActionBar.g6 g6Var, a9 a9Var) {
        super(context);
        this.e = new ArrayList();
        bs bsVar = bs.h;
        this.s = new org.telegram.ui.Components.f6(this, 0L, 300L, bsVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.v = linearGradient;
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Matrix();
        this.y = new org.telegram.ui.Components.f6(this, 0L, 300L, bsVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.E = linearGradient2;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = g6Var;
        this.h = a9Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        n9 n9Var = new n9(this, context);
        this.d = n9Var;
        addView(n9Var, w7.z5.c(-2.0f, -1));
        e2 e2Var = new e2(this, context, 1);
        this.b = e2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            e2Var.setRevealOnFocusHint(false);
        }
        e2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.m(e2Var, 34, org.telegram.ui.ActionBar.k6.Xh, g6Var);
        org.telegram.ui.ActionBar.r6.W(e2Var, org.telegram.ui.ActionBar.k6.G6, g6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Yh;
        org.telegram.ui.ActionBar.r6.m(e2Var, 30, i10, g6Var);
        org.telegram.ui.ActionBar.r6.m(e2Var, 36, i10, g6Var);
        e2Var.setCursorWidth(1.5f);
        e2Var.setInputType(e2Var.getInputType() | 176);
        e2Var.setSingleLine(true);
        e2Var.setBackgroundDrawable(null);
        e2Var.setVerticalScrollBarEnabled(false);
        e2Var.setHorizontalScrollBarEnabled(false);
        e2Var.setTextIsSelectable(false);
        e2Var.setPadding(0, 0, 0, 0);
        e2Var.setImeOptions(268435462);
        e2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        n9Var.addView(e2Var);
        e2Var.setHintText(LocaleController.getString(R.string.Search));
        this.c = (int) e2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        e2Var.addTextChangedListener(new l9(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.s.e(canScrollVertically(-1));
        Matrix matrix = this.x;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY);
        this.v.setLocalMatrix(matrix);
        Paint paint = this.w;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY, getWidth(), AndroidUtilities.dp(8.0f) + r0, paint);
        float e7 = this.y.e(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (e7 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.H) {
            this.H = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.v0.C(20.0f, this.I, rect.top);
        rect.bottom = org.telegram.messenger.v0.C(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.J = f7;
        n9 n9Var = this.d;
        if (n9Var != null) {
            n9Var.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.r = callback;
    }

    public void setText(CharSequence charSequence) {
        this.n = true;
        this.b.setText(charSequence);
        this.n = false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        e2 e2Var = this.b;
        if (e2Var != null) {
            try {
                e2Var.setHintColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Xh, g6Var));
                int i10 = org.telegram.ui.ActionBar.k6.Yh;
                e2Var.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
                e2Var.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
