package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.h20;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class l4 extends x implements org.telegram.ui.ActionBar.c6, i9, i0 {
    public static final /* synthetic */ int N = 0;
    public final ImageReceiver E;
    public final Drawable F;
    public final View G;
    public j4 H;
    public int I;
    public String J;
    public Drawable K;
    public int L;
    public final h0 M;
    public final int n;
    public final i6 r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final TextPaint y;

    public l4(int i7, Context context, i6 i6Var) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        this.n = i7;
        this.r = i6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.E = new ImageReceiver(this);
        this.F = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.0f));
        View view = new View(context);
        this.G = view;
        view.setOnClickListener(new hi.o0(this, 20));
        addView(view, ma.e(-1, -2, 51));
        h0 h0Var = new h0(context, i6Var, new hi.u5(this, 21));
        this.M = h0Var;
        addView(h0Var.a, ma.e(-2, -2, 51));
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

    @Override // oi.i0
    public final boolean a(int i7, int i10) {
        return this.M.f(i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.gf));
        hashSet.add(Integer.valueOf(n6.xe));
        hashSet.add(Integer.valueOf(n6.lg));
        hashSet.add(Integer.valueOf(n6.G6));
    }

    @Override // oi.i0
    public final void b() {
        this.M.i();
    }

    @Override // oi.x
    public final int d() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.M.c(canvas);
    }

    public final void g(a aVar, j4 j4Var) {
        this.a = aVar;
        this.H = j4Var;
        c(aVar);
        this.J = null;
        this.M.b();
        h();
        requestLayout();
        invalidate();
    }

    @Override // oi.i0
    public e1 getCaptionEditText() {
        return this.M.a;
    }

    @Override // oi.i0
    public a getRow() {
        return this.a;
    }

    public final void h() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.E;
        if (map == null || !(map.geo instanceof TLRPC.TL_geoPoint)) {
            imageReceiver.w0(null);
            this.J = null;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i7 = this.L;
        if (measuredWidth <= 0 || i7 <= 0) {
            return;
        }
        float f10 = org.telegram.messenger.g0.p;
        int i10 = (int) (measuredWidth / f10);
        int i11 = (int) (i7 / f10);
        String str = map.geo.lat + "_" + map.geo._long + "_" + i10 + "x" + i11;
        if (str.equals(this.J)) {
            return;
        }
        this.J = str;
        int i12 = mp.u1(this.n).p3;
        this.I = i12;
        if (i12 == 2) {
            imageReceiver.q0(fc.p(h20.b(map.geo, i10, i11, 15, Math.min(2, (int) Math.ceil(org.telegram.messenger.g0.p)))), null, null, null, null, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = map.geo;
        imageReceiver.o0(org.telegram.messenger.g0.e0(this.n, geoPoint.lat, geoPoint._long, i10, i11, true, 15, -1), null, null, null, 0L);
    }

    @Override // org.telegram.ui.Cells.i9
    public final void k(ArrayList arrayList) {
        this.M.e(arrayList);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.P();
        this.J = null;
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        j9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.E;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), this.s);
            int r10 = (int) imageReceiver.r();
            int s5 = (int) imageReceiver.s();
            Drawable drawable = this.F;
            if (drawable != null) {
                int C = org.telegram.ui.Cells.c0.C(2, r10, drawable);
                int A = org.telegram.ui.Cells.c0.A(2, s5, drawable);
                drawable.setBounds(C, A, drawable.getIntrinsicWidth() + C, drawable.getIntrinsicHeight() + A);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.h(canvas2, null);
                if (this.I == 2 && imageReceiver.L()) {
                    if (this.K == null) {
                        this.K = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth = (int) (this.K.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.K.getIntrinsicHeight() * 0.8f);
                    int r11 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s9 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.K.setAlpha((int) (imageReceiver.i1 * 255.0f));
                    this.K.setBounds(r11, s9, intrinsicWidth + r11, intrinsicHeight + s9);
                    this.K.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        j4 j4Var = this.H;
        if (j4Var != null && (textSelectionHelper = ((o3) j4Var).a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.p0 && R <= textSelectionHelper.s0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.L, this.x);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i13 = i11 - i7;
        int max = Math.max(0, (i13 - paddingLeft) - paddingRight);
        this.E.y0(paddingLeft, getPaddingTop(), max, this.L);
        this.G.layout(paddingLeft, getPaddingTop(), max + paddingLeft, getPaddingTop() + this.L);
        this.M.g(paddingLeft, paddingRight, i13, getPaddingTop() + this.L);
        h();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map == null || map.w <= 0 || map.h <= 0) {
            this.L = (org.telegram.messenger.g0.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        } else {
            this.L = Math.max(Math.min((int) (((max - org.telegram.messenger.g0.L(32.0f)) * map.h) / map.w), org.telegram.messenger.g0.L(420.0f)), org.telegram.messenger.g0.L(120.0f));
        }
        int h = this.M.h(paddingLeft, paddingRight, size);
        this.G.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.L, TLObject.FLAG_30));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.L + h);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = n6.gf;
        i6 i6Var = this.r;
        this.s.setColor(n6.w0(i7, i6Var));
        this.w.setColor(n6.w0(n6.xe, i6Var));
        this.x.setColor(n6.w0(n6.lg, i6Var));
        int i10 = n6.G6;
        this.y.setColor(n6.r1(0.5f, n6.w0(i10, i6Var)));
        this.F.setColorFilter(new PorterDuffColorFilter(n6.r1(0.5f, n6.w0(i10, i6Var)), PorterDuff.Mode.SRC_IN));
        h0 h0Var = this.M;
        if (h0Var != null) {
            h0Var.a();
        }
    }
}
