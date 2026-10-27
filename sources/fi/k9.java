package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.x30;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public abstract class k9 extends ScrollView implements org.telegram.ui.ActionBar.p6 {
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.u6 a;
    public final c2 b;
    public final int c;
    public final j9 d;
    public final ArrayList e;
    public x30 f;
    public final w8 h;
    public boolean n;
    public Utilities.Callback r;
    public final org.telegram.ui.Components.h6 s;
    public final LinearGradient v;
    public final Paint w;
    public final Matrix x;
    public final org.telegram.ui.Components.h6 y;

    public k9(Context context, org.telegram.ui.ActionBar.u6 u6Var, w8 w8Var) {
        super(context);
        this.e = new ArrayList();
        ds dsVar = ds.h;
        this.s = new org.telegram.ui.Components.h6(this, 0L, 300L, dsVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.v = linearGradient;
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Matrix();
        this.y = new org.telegram.ui.Components.h6(this, 0L, 300L, dsVar);
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
        this.a = u6Var;
        this.h = w8Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
        j9 j9Var = new j9(this, context);
        this.d = j9Var;
        addView(j9Var, kb1.g(-2.0f, -1));
        c2 c2Var = new c2(this, context, 1);
        this.b = c2Var;
        if (Build.VERSION.SDK_INT >= 25) {
            c2Var.setRevealOnFocusHint(false);
        }
        c2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.m(c2Var, 34, org.telegram.ui.ActionBar.y6.Xh, u6Var);
        org.telegram.ui.ActionBar.f7.V(c2Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        int i10 = org.telegram.ui.ActionBar.y6.Yh;
        org.telegram.ui.ActionBar.f7.m(c2Var, 30, i10, u6Var);
        org.telegram.ui.ActionBar.f7.m(c2Var, 36, i10, u6Var);
        c2Var.setCursorWidth(1.5f);
        c2Var.setInputType(c2Var.getInputType() | 176);
        c2Var.setSingleLine(true);
        c2Var.setBackgroundDrawable(null);
        c2Var.setVerticalScrollBarEnabled(false);
        c2Var.setHorizontalScrollBarEnabled(false);
        c2Var.setTextIsSelectable(false);
        c2Var.setPadding(0, 0, 0, 0);
        c2Var.setImeOptions(268435462);
        c2Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        j9Var.addView(c2Var);
        c2Var.setHintText(LocaleController.getString(R.string.Search));
        this.c = (int) c2Var.getPaint().measureText(LocaleController.getString(R.string.Search));
        c2Var.addTextChangedListener(new h9(this));
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
        float e10 = this.y.e(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - AndroidUtilities.dp(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (e10 * 255.0f));
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
        rect.top = org.telegram.messenger.t.D(20.0f, this.I, rect.top);
        rect.bottom = org.telegram.messenger.t.D(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f7) {
        this.J = f7;
        j9 j9Var = this.d;
        if (j9Var != null) {
            j9Var.requestLayout();
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        c2 c2Var = this.b;
        if (c2Var != null) {
            try {
                c2Var.setHintColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Xh, u6Var));
                int i10 = org.telegram.ui.ActionBar.y6.Yh;
                c2Var.setCursorColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                c2Var.setHandlesColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        AndroidUtilities.setScrollViewEdgeEffectColor(this, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
