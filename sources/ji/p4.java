package ji;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class p4 extends a0 implements org.telegram.ui.ActionBar.z5, p9, l0 {
    public static final /* synthetic */ int M = 0;
    public final Drawable E;
    public final View F;
    public n4 G;
    public int H;
    public String I;
    public Drawable J;
    public int K;
    public final k0 L;
    public final int n;
    public final org.telegram.ui.ActionBar.f6 r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public final TextPaint x;
    public final ImageReceiver y;

    public p4(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.x = textPaint;
        this.n = i10;
        this.r = f6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.y = new ImageReceiver(this);
        this.E = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.F = view;
        view.setOnClickListener(new m4(this, 0));
        addView(view, w7.x5.e(-1, -2, 51));
        k0 k0Var = new k0(context, f6Var, new a6.i(this, 29));
        this.L = k0Var;
        addView(k0Var.a, w7.x5.e(-2, -2, 51));
        d();
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

    @Override // ji.l0
    public final boolean a(int i10, int i11) {
        return this.L.f(i10, i11);
    }

    @Override // ji.l0
    public final void b() {
        this.L.i();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.j6.pe;
        org.telegram.ui.ActionBar.f6 f6Var = this.r;
        this.s.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.v.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gd, f6Var));
        this.w.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        this.x.setColor(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)));
        this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var)), PorterDuff.Mode.SRC_IN));
        k0 k0Var = this.L;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.L.c(canvas);
    }

    @Override // ji.a0
    public final int e() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.L.e(arrayList);
    }

    @Override // ji.l0
    public h1 getCaptionEditText() {
        return this.L.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // ji.l0
    public a getRow() {
        return this.a;
    }

    public final void h(a aVar, n4 n4Var) {
        this.a = aVar;
        this.G = n4Var;
        c(aVar);
        this.I = null;
        this.L.b();
        i();
        requestLayout();
        invalidate();
    }

    public final void i() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.y;
        if (map == null || !(map.geo instanceof TLRPC.TL_geoPoint)) {
            imageReceiver.setImageBitmap((Drawable) null);
            this.I = null;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i10 = this.K;
        if (measuredWidth <= 0 || i10 <= 0) {
            return;
        }
        float f7 = AndroidUtilities.density;
        int i11 = (int) (measuredWidth / f7);
        int i12 = (int) (i10 / f7);
        String str = map.geo.lat + "_" + map.geo._long + "_" + i11 + "x" + i12;
        if (str.equals(this.I)) {
            return;
        }
        this.I = str;
        int i13 = MessagesController.getInstance(this.n).mapProvider;
        this.H = i13;
        if (i13 == 2) {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i11, i12, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = map.geo;
        imageReceiver.setImage(AndroidUtilities.formapMapUrl(this.n, geoPoint.lat, geoPoint._long, i11, i12, true, 15, -1), null, null, null, 0L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.onAttachedToWindow();
        this.I = null;
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        q9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.y;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.s);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.E;
            if (drawable != null) {
                int w10 = wl.w(2, centerX, drawable);
                int e7 = wl.e(2, centerY, drawable);
                drawable.setBounds(w10, e7, drawable.getIntrinsicWidth() + w10, drawable.getIntrinsicHeight() + e7);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.draw(canvas2);
                if (this.H == 2 && imageReceiver.hasNotThumb()) {
                    if (this.J == null) {
                        this.J = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth = (int) (this.J.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.J.getIntrinsicHeight() * 0.8f);
                    int centerX2 = (int) (imageReceiver.getCenterX() - (intrinsicWidth / 2.0f));
                    int centerY2 = (int) (imageReceiver.getCenterY() - intrinsicHeight);
                    this.J.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
                    this.J.setBounds(centerX2, centerY2, intrinsicWidth + centerX2, intrinsicHeight + centerY2);
                    this.J.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        n4 n4Var = this.G;
        if (n4Var != null && (textSelectionHelper = ((r3) n4Var).a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.K, this.w);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.y.setImageCoords(paddingLeft, getPaddingTop(), max, this.K);
        this.F.layout(paddingLeft, getPaddingTop(), max + paddingLeft, getPaddingTop() + this.K);
        this.L.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.K);
        i();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map == null || map.w <= 0 || map.h <= 0) {
            this.K = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        } else {
            this.K = Math.max(Math.min((int) (((max - AndroidUtilities.dp(32.0f)) * map.h) / map.w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        }
        int h = this.L.h(paddingLeft, paddingRight, size);
        this.F.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.K, TLObject.FLAG_30));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.K + h);
    }
}
