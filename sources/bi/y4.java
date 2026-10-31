package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b30;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class y4 extends c0 implements org.telegram.ui.ActionBar.k6, j9, o0 {
    public static final /* synthetic */ int M = 0;
    public final ImageReceiver D;
    public final Drawable E;
    public final View F;
    public w4 G;
    public int H;
    public String I;
    public Drawable J;
    public int K;
    public final n0 L;
    public final int n;
    public final org.telegram.ui.ActionBar.p6 r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final TextPaint y;

    public y4(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        this.n = i10;
        this.r = p6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.D = new ImageReceiver(this);
        this.E = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        f(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.0f));
        View view = new View(context);
        this.F = view;
        view.setOnClickListener(new ag.g(this, 6));
        addView(view, w7.b6.e(-1, -2, 51));
        n0 n0Var = new n0(context, p6Var, new za.c(this, 10));
        this.L = n0Var;
        addView(n0Var.a, w7.b6.e(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.a;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return (TL_iv.pageBlockMap) pageBlock;
        }
        return null;
    }

    @Override // bi.o0
    public final boolean a(int i10, int i11) {
        return this.L.f(i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.df));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ig));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
    }

    @Override // bi.o0
    public final void b() {
        this.L.i();
    }

    @Override // bi.c0
    public final int d() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.L.c(canvas);
    }

    public final void g(a aVar, w4 w4Var) {
        this.a = aVar;
        this.G = w4Var;
        c(aVar);
        this.I = null;
        this.L.b();
        j();
        requestLayout();
        invalidate();
    }

    @Override // bi.o0
    public n1 getCaptionEditText() {
        return this.L.a;
    }

    @Override // bi.o0
    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        this.L.e(arrayList);
    }

    public final void j() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.D;
        if (map == null || !(map.geo instanceof TLRPC.TL_geoPoint)) {
            imageReceiver.w0(null);
            this.I = null;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i10 = this.K;
        if (measuredWidth <= 0 || i10 <= 0) {
            return;
        }
        float f7 = org.telegram.messenger.i0.p;
        int i11 = (int) (measuredWidth / f7);
        int i12 = (int) (i10 / f7);
        String str = map.geo.lat + "_" + map.geo._long + "_" + i11 + "x" + i12;
        if (str.equals(this.I)) {
            return;
        }
        this.I = str;
        int i13 = vp.r1(this.n).m3;
        this.H = i13;
        if (i13 == 2) {
            imageReceiver.q0(ic.p(b30.b(map.geo, i11, i12, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.i0.p)))), null, null, null, null, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = map.geo;
        imageReceiver.o0(org.telegram.messenger.i0.e0(this.n, geoPoint.lat, geoPoint._long, i11, i12, true, 15, -1), null, null, null, 0L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.P();
        this.I = null;
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        k9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.D;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), this.s);
            int r10 = (int) imageReceiver.r();
            int s10 = (int) imageReceiver.s();
            Drawable drawable = this.E;
            if (drawable != null) {
                int z10 = org.telegram.ui.Cells.f1.z(2, r10, drawable);
                int y3 = org.telegram.ui.Cells.f1.y(2, s10, drawable);
                drawable.setBounds(z10, y3, drawable.getIntrinsicWidth() + z10, drawable.getIntrinsicHeight() + y3);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.h(canvas2, null);
                if (this.H == 2 && imageReceiver.L()) {
                    if (this.J == null) {
                        this.J = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth = (int) (this.J.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.J.getIntrinsicHeight() * 0.8f);
                    int r11 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s11 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.J.setAlpha((int) (imageReceiver.h1 * 255.0f));
                    this.J.setBounds(r11, s11, intrinsicWidth + r11, intrinsicHeight + s11);
                    this.J.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        w4 w4Var = this.G;
        if (w4Var != null && (textSelectionHelper = ((z3) w4Var).a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.K, this.x);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.D.y0(paddingLeft, getPaddingTop(), max, this.K);
        this.F.layout(paddingLeft, getPaddingTop(), max + paddingLeft, getPaddingTop() + this.K);
        this.L.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.K);
        j();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map == null || map.w <= 0 || map.h <= 0) {
            this.K = (org.telegram.messenger.i0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        } else {
            this.K = Math.max(Math.min((int) (((max - org.telegram.messenger.i0.L(32.0f)) * map.h) / map.w), org.telegram.messenger.i0.L(420.0f)), org.telegram.messenger.i0.L(120.0f));
        }
        int h = this.L.h(paddingLeft, paddingRight, size);
        this.F.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.K, TLObject.FLAG_30));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.K + h);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.df;
        org.telegram.ui.ActionBar.p6 p6Var = this.r;
        this.s.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.w.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ue, p6Var));
        this.x.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ig, p6Var));
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        this.y.setColor(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)));
        this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i11, p6Var)), PorterDuff.Mode.SRC_IN));
        n0 n0Var = this.L;
        if (n0Var != null) {
            n0Var.a();
        }
    }
}
