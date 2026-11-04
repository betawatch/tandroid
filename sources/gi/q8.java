package gi;

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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class q8 extends ScrollView implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u5 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.e6 a;
    public final bh.g b;
    public final int c;
    public final bh.l d;
    public final ArrayList e;
    public y10 f;
    public final c8 h;
    public boolean n;
    public u10 r;
    public final org.telegram.ui.Components.u5 s;
    public final LinearGradient w;
    public final Paint x;
    public final Matrix y;

    public q8(Context context, org.telegram.ui.ActionBar.e6 e6Var, c8 c8Var) {
        super(context);
        this.e = new ArrayList();
        xq xqVar = xq.h;
        this.s = new org.telegram.ui.Components.u5(this, 0L, 300L, xqVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.w = linearGradient;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Matrix();
        this.E = new org.telegram.ui.Components.u5(this, 0L, 300L, xqVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.F = linearGradient2;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.a = e6Var;
        this.h = c8Var;
        setVerticalScrollBarEnabled(false);
        org.telegram.messenger.g0.z3(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        bh.l lVar = new bh.l(this, context);
        this.d = lVar;
        addView(lVar, mf.c(-2.0f, -1));
        bh.g gVar = new bh.g(2, context, this);
        this.b = gVar;
        if (Build.VERSION.SDK_INT >= 25) {
            gVar.setRevealOnFocusHint(false);
        }
        gVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.m(gVar, 34, org.telegram.ui.ActionBar.k6.Li, e6Var);
        org.telegram.ui.ActionBar.r6.V(gVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        int i3 = org.telegram.ui.ActionBar.k6.Mi;
        org.telegram.ui.ActionBar.r6.m(gVar, 30, i3, e6Var);
        org.telegram.ui.ActionBar.r6.m(gVar, 36, i3, e6Var);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | hs.G2);
        gVar.setSingleLine(true);
        gVar.setBackgroundDrawable(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setTextIsSelectable(false);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setImeOptions(268435462);
        gVar.setGravity((bd.a0 ? 5 : 3) | 16);
        lVar.addView(gVar);
        gVar.setHintText(bd.M0(2131745846, null));
        this.c = (int) gVar.getPaint().measureText(bd.M0(2131745846, null));
        gVar.addTextChangedListener(new bh.h(this, 6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float scrollY = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY, getWidth(), getHeight() + r0, hs.e4, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.s.d(canScrollVertically(-1));
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY);
        this.w.setLocalMatrix(matrix);
        Paint paint = this.x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY, getWidth(), org.telegram.messenger.g0.L(8.0f) + r0, paint);
        float d10 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + r0) - org.telegram.messenger.g0.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
        paint2.setAlpha((int) (d10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + r0) - org.telegram.messenger.g0.L(8.0f), getWidth(), getHeight() + r0, paint2);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(150.0f), TLObject.FLAG_31));
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.I) {
            this.I = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = org.telegram.messenger.k5.C(20.0f, this.J, rect.top);
        rect.bottom = org.telegram.messenger.k5.C(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.K = f10;
        bh.l lVar = this.d;
        if (lVar != null) {
            lVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(u10 u10Var) {
        this.r = u10Var;
    }

    public void setText(CharSequence charSequence) {
        this.n = true;
        this.b.setText(charSequence);
        this.n = false;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        bh.g gVar = this.b;
        if (gVar != null) {
            try {
                gVar.setHintColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Li, e6Var));
                int i3 = org.telegram.ui.ActionBar.k6.Mi;
                gVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                gVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        org.telegram.messenger.g0.z3(this, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
