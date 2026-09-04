package ji;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.pr;
import v7.c9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class w4 extends a0 implements org.telegram.ui.ActionBar.z5, p9, l0 {
    public static Paint k0;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public final boolean H;
    public final gh.d I;
    public final na.d J;
    public final ArrayList K;
    public final HashMap L;
    public wh.g M;
    public o3 N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final org.telegram.ui.Components.e6 U;
    public int V;
    public int W;
    public float a0;
    public boolean b0;
    public float c0;
    public float d0;
    public int e0;
    public int f0;
    public int g0;
    public VelocityTracker h0;
    public ValueAnimator i0;
    public final Path j0;
    public final org.telegram.ui.ActionBar.f6 n;
    public final Paint r;
    public final Paint s;
    public final k0 v;
    public final ImageView w;
    public final ImageView x;
    public final ArrayList y;

    public w4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.y = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 >= 31 && SharedConfig.chatBlurEnabled();
        this.H = z10;
        this.K = new ArrayList();
        this.L = new HashMap();
        this.T = -1;
        this.U = new org.telegram.ui.Components.e6(this, 0L, 320L, pr.h);
        this.j0 = new Path();
        this.n = f6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        k0 k0Var = new k0(context, f6Var, new u4(this, 0));
        this.v = k0Var;
        addView(k0Var.a, w7.x5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i10 >= 31) {
            gh.d dVar = new gh.d(new gh.c());
            this.I = dVar;
            dVar.g(AndroidUtilities.dp(24.0f));
            this.J = new na.d();
        }
        ImageView h = h();
        this.w = h;
        h.setImageResource(R.drawable.iv_media_add);
        addView(h, w7.x5.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h.setOnClickListener(new s4(this, 1));
        ImageView h10 = h();
        this.x = h10;
        h10.setVisibility(8);
        addView(h10, w7.x5.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        h10.setOnClickListener(new s4(this, 2));
        d();
    }

    private wh.g getSpoilerEffect() {
        if (!this.O) {
            return null;
        }
        wh.g gVar = this.M;
        if (gVar != null && gVar.i) {
            this.M = null;
        }
        if (this.M == null) {
            this.M = wh.g.e(this);
        }
        return this.M;
    }

    private void settle(float f7) {
        int i10;
        int size = this.y.size();
        if (f7 >= 0.0f || this.W >= size - 1) {
            i10 = -1;
            if (f7 <= 0.0f || this.W <= 0) {
                float f10 = this.a0;
                if (f10 <= 0.5f || this.W >= size - 1) {
                    if (f10 >= -0.5f || this.W <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i11 = i10 + this.W;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, i11 - r7);
            this.i0 = ofFloat;
            ofFloat.setDuration(220L);
            this.i0.setInterpolator(pr.h);
            this.i0.addUpdateListener(new ah.d0(this, 29));
            this.i0.addListener(new fi.v2(this, i11, 2));
            this.i0.start();
        }
        i10 = 1;
        int i112 = i10 + this.W;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.a0, i112 - r7);
        this.i0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.i0.setInterpolator(pr.h);
        this.i0.addUpdateListener(new ah.d0(this, 29));
        this.i0.addListener(new fi.v2(this, i112, 2));
        this.i0.start();
    }

    @Override // ji.l0
    public final boolean a(int i10, int i11) {
        return this.v.f(i10, i11);
    }

    @Override // ji.l0
    public final void b() {
        this.v.i();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.j6.Gd;
        org.telegram.ui.ActionBar.f6 f6Var = this.n;
        this.r.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.s.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, f6Var));
        k0 k0Var = this.v;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.v.c(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (this.E.contains(view)) {
            a aVar = this.a;
            if ((aVar == null ? 0 : aVar.k.size()) > 0) {
                canvas.save();
                Path path = this.j0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.P, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // ji.a0
    public final int e() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.v.e(arrayList);
    }

    @Override // ji.l0
    public h1 getCaptionEditText() {
        return this.v.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // ji.l0
    public a getRow() {
        return this.a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (!this.H || Build.VERSION.SDK_INT < 31) {
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.f6 f6Var = this.n;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
            int i11 = org.telegram.ui.ActionBar.j6.d6;
            imageView.setBackground(new b2(org.telegram.ui.ActionBar.j6.Z(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var)), 20, 20)));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            dh.e eVar = (dh.e) this.I.k();
            eVar.n(this.J);
            eVar.p(AndroidUtilities.dp(16.0f));
            this.L.put(imageView, eVar);
        }
        w7.z5.a(imageView);
        this.K.add(imageView);
        return imageView;
    }

    public final void i(Canvas canvas, ImageView imageView) {
        dh.e eVar;
        if (imageView.getVisibility() == 0 && (eVar = (dh.e) this.L.get(imageView)) != null) {
            eVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
            eVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
            eVar.M = true;
            eVar.draw(canvas);
        }
    }

    public final void j(Canvas canvas) {
        int i10;
        w4 w4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = w4Var.getPaddingTop();
        int paddingLeft = w4Var.getPaddingLeft();
        int i11 = 0;
        int max = Math.max(0, (w4Var.getWidth() - paddingLeft) - w4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = w4Var.a;
        if ((aVar == null ? 0 : aVar.k.size()) > 0) {
            Path path = w4Var.j0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, w4Var.P + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, w4Var.P + paddingTop);
        }
        boolean l4 = w4Var.l();
        int i12 = 1;
        ArrayList arrayList = w4Var.y;
        boolean z10 = l4 && arrayList.size() >= 2;
        a aVar2 = w4Var.a;
        int dp = (aVar2 == null ? 0 : aVar2.k.size()) > 0 ? AndroidUtilities.dp(8.0f) : 0;
        Paint paint = w4Var.r;
        if (z10 && (((i10 = w4Var.W) == 0 && w4Var.a0 < 0.0f) || (i10 == arrayList.size() - 1 && w4Var.a0 > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, w4Var.P + paddingTop, paint);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = w4Var.G;
        if (size == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, max, paddingTop + w4Var.P);
                z4 z4Var = (z4) arrayList.get(0);
                ImageReceiver imageReceiver = z4Var.b;
                if (z4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(z4Var.a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i13 = 0;
        while (i13 < arrayList.size() && i13 < arrayList2.size()) {
            z4 z4Var2 = (z4) arrayList.get(i13);
            RectF rectF3 = (RectF) arrayList2.get(i13);
            if (z10) {
                int i14 = i13 == 0 ? dp : 0;
                int i15 = i13 == arrayList.size() - i12 ? dp : 0;
                int i16 = i13 == arrayList.size() - i12 ? dp : 0;
                int i17 = i13 == 0 ? dp : 0;
                z4Var2.a.setRoundRadius(i14, i15, i16, i17);
                z4Var2.b.setRoundRadius(i14, i15, i16, i17);
            } else {
                z4Var2.a.setRoundRadius(i11, i11, i11, i11);
                z4Var2.b.setRoundRadius(i11, i11, i11, i11);
            }
            boolean c10 = z4Var2.c();
            ImageReceiver imageReceiver2 = z4Var2.a;
            if (!c10) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (z4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = z4Var2.d;
            u uVar = z4Var2.e;
            if (uVar != null && uVar.a()) {
                int dp2 = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i18 = dp2 / 2;
                radialProgress2.q(round - i18, round2 - i18, round + i18, round2 + i18);
                radialProgress2.o(z4Var2.e.f, true);
                radialProgress2.draw(canvas2);
            }
            u uVar2 = z4Var2.e;
            if (uVar2 != null && uVar2.n && z4Var2.c()) {
                wh.g spoilerEffect = w4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = z4Var2.b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (z4Var2.b()) {
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.c(canvas2, w4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i13++;
            w4Var = this;
            canvas2 = canvas;
            i11 = 0;
            i12 = 1;
        }
        canvas.restore();
    }

    public final void k(int i10) {
        if (this.N == null || this.a == null) {
            return;
        }
        List m10 = m();
        if (m10.isEmpty() || (m10.size() == 1 && ((u) m10.get(0)).a == 0)) {
            o3 o3Var = this.N;
            a aVar = this.a;
            v3 v3Var = o3Var.a;
            v3Var.b4 = aVar;
            v3Var.h3.e(0);
            return;
        }
        if (i10 < 0 || i10 >= m10.size() || !((u) m10.get(i10)).a()) {
            return;
        }
        v3.M1(this.a, (u) m10.get(i10), this.N.a);
    }

    public final boolean l() {
        a aVar = this.a;
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockSlideshow);
    }

    public final List m() {
        a aVar = this.a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                return arrayList != null ? arrayList : Collections.EMPTY_LIST;
            }
        }
        u uVar = aVar.g;
        return uVar != null ? Collections.singletonList(uVar) : Collections.EMPTY_LIST;
    }

    public final void n() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List m10 = m();
        while (true) {
            arrayList = this.y;
            if (arrayList.size() >= m10.size()) {
                break;
            }
            z4 z4Var = new z4(this, this.n);
            if (this.O) {
                z4Var.a.onAttachedToWindow();
                z4Var.b.onAttachedToWindow();
                z4Var.a();
            }
            arrayList.add(z4Var);
        }
        while (arrayList.size() > m10.size()) {
            z4 z4Var2 = (z4) i2.g.z(1, arrayList);
            z4Var2.a.onDetachedFromWindow();
            z4Var2.b.onDetachedFromWindow();
            z4Var2.c = null;
        }
        for (int i10 = 0; i10 < m10.size(); i10++) {
            z4 z4Var3 = (z4) arrayList.get(i10);
            z4Var3.e = (u) m10.get(i10);
            z4Var3.a();
        }
        while (true) {
            arrayList2 = this.E;
            if (arrayList2.size() >= m10.size()) {
                break;
            }
            ImageView h = h();
            h.setImageResource(R.drawable.iv_media_dots);
            h.setOnClickListener(new s4(this, 0));
            addView(h, w7.x5.e(32, 32, 51));
            arrayList2.add(h);
        }
        this.w.bringToFront();
        this.x.bringToFront();
        while (arrayList2.size() > m10.size()) {
            ImageView imageView = (ImageView) i2.g.z(1, arrayList2);
            removeView(imageView);
            this.K.remove(imageView);
            this.L.remove(imageView);
        }
        if (this.M != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                u uVar = ((z4) arrayList.get(i11)).e;
                if (uVar != null && uVar.n) {
                    return;
                }
            }
            this.M.b(this);
            this.M = null;
        }
    }

    public final void o(boolean z10) {
        boolean z11 = this.y.size() >= 2;
        int i10 = z11 ? 0 : 8;
        ImageView imageView = this.x;
        imageView.setVisibility(i10);
        if (z11) {
            int i11 = l() ? R.drawable.iv_media_slideshow : R.drawable.iv_media_collage;
            if (i11 == this.V) {
                return;
            }
            this.V = i11;
            if (z10) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
            } else {
                imageView.setImageResource(i11);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i10 >= arrayList.size()) {
                return;
            }
            z4 z4Var = (z4) arrayList.get(i10);
            z4Var.a.onAttachedToWindow();
            z4Var.b.onAttachedToWindow();
            z4Var.a();
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.O = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.h0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.h0 = null;
        }
        this.b0 = false;
        while (true) {
            ArrayList arrayList = this.y;
            if (i10 >= arrayList.size()) {
                break;
            }
            z4 z4Var = (z4) arrayList.get(i10);
            z4Var.a.onDetachedFromWindow();
            z4Var.b.onDetachedFromWindow();
            z4Var.c = null;
            i10++;
        }
        wh.g gVar = this.M;
        if (gVar != null) {
            gVar.b(this);
            this.M = null;
        }
        ValueAnimator valueAnimator = this.i0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        gh.d dVar;
        ImageView imageView;
        ImageView imageView2;
        q9 textSelectionHelper;
        float f7;
        float f10;
        float f11;
        float clamp;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.e6 e6Var = this.U;
        float f12 = e6Var.c;
        ArrayList arrayList = this.y;
        if (arrayList.size() >= 2 && f12 > 0.001f) {
            if (k0 == null) {
                Paint paint = new Paint(1);
                k0 = paint;
                paint.setColor(-1);
                k0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), TLObject.FLAG_31);
            }
            int size = arrayList.size();
            float dp = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.P) - AndroidUtilities.dp(23.0f));
            int dp2 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.w1.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f13 = this.W + this.a0;
            if (dp2 < max) {
                f7 = 13.0f;
                clamp = ((max - dp2) / 2.0f) + paddingLeft;
                f10 = 23.0f;
                f11 = 4.0f;
            } else {
                f7 = 13.0f;
                float dp3 = AndroidUtilities.dp(4.0f) + paddingLeft;
                int dp4 = AndroidUtilities.dp(13.0f);
                f10 = 23.0f;
                f11 = 4.0f;
                clamp = dp3 - (Utilities.clamp(f13 - (((max - AndroidUtilities.dp(8.0f)) / 2) / dp4), Math.max(0, (size - (r12 * 2)) - 1), 0.0f) * dp4);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.P) - AndroidUtilities.dp(f10), max + paddingLeft, getPaddingTop() + this.P);
            for (int i10 = 0; i10 < size; i10++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i10 - f13));
                k0.setAlpha((int) com.google.android.gms.internal.vision.e2.B(max2, 95.0f, 160.0f, f12));
                canvas.drawCircle(AndroidUtilities.dp(f11) + clamp + (AndroidUtilities.dp(f7) * i10), dp, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), k0);
            }
            canvas.restore();
        }
        o3 o3Var = this.N;
        if (o3Var != null && (textSelectionHelper = o3Var.a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.P, this.s);
            }
        }
        if (this.H && (dVar = this.I) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.n) {
                    try {
                        j(dVar.a(width, height));
                    } finally {
                        dVar.b();
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.K;
                    int size2 = arrayList2.size();
                    imageView = this.x;
                    imageView2 = this.w;
                    if (i11 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i11);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        i(canvas, imageView3);
                    }
                    i11++;
                }
                i(canvas, imageView);
                i(canvas, imageView2);
            }
        }
        if (e6Var.i) {
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        int i15 = i14 - paddingRight;
        int dp = c9.b(this.a) > 0 ? AndroidUtilities.dp(16.0f) : 0;
        this.v.g(paddingLeft - dp, paddingRight - dp, i14, getPaddingTop() + this.P);
        int dp2 = AndroidUtilities.dp(6.0f);
        int i16 = i15 - dp2;
        ImageView imageView = this.w;
        imageView.layout(i16 - imageView.getMeasuredWidth(), getPaddingTop() + dp2, i16, imageView.getMeasuredHeight() + getPaddingTop() + dp2);
        int i17 = i16 - dp2;
        int measuredWidth = i17 - imageView.getMeasuredWidth();
        ImageView imageView2 = this.x;
        imageView2.layout(measuredWidth - imageView2.getMeasuredWidth(), getPaddingTop() + dp2, i17 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp2);
        List m10 = m();
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.E;
            if (i18 >= arrayList.size()) {
                return;
            }
            ImageView imageView3 = (ImageView) arrayList.get(i18);
            if (i18 < m10.size() && ((u) m10.get(i18)).a != 0) {
                ArrayList arrayList2 = this.G;
                if (i18 < arrayList2.size()) {
                    RectF rectF = (RectF) arrayList2.get(i18);
                    if (rectF.right <= 0.0f || rectF.left >= max || rectF.bottom <= getPaddingTop() || rectF.top >= getPaddingTop() + this.P) {
                        imageView3.setVisibility(8);
                    } else {
                        int i19 = ((int) rectF.left) + dp2 + paddingLeft;
                        int i20 = ((int) rectF.top) + dp2;
                        imageView3.layout(i19, i20, imageView3.getMeasuredWidth() + i19, imageView3.getMeasuredHeight() + i20);
                        float f7 = 1.0f;
                        if (this.H) {
                            int left = (imageView2.getVisibility() == 0 ? imageView2.getLeft() : imageView.getLeft()) - AndroidUtilities.dp(4.0f);
                            if (imageView3.getMeasuredWidth() + i19 > left) {
                                f7 = Math.max(0.0f, 1.0f - ((r9 - left) / imageView3.getMeasuredWidth()));
                            }
                        }
                        imageView3.setAlpha(f7);
                        imageView3.setVisibility(f7 > 0.01f ? 0 : 8);
                    }
                    i18++;
                }
            }
            imageView3.setVisibility(8);
            i18++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03f3 A[LOOP:1: B:24:0x03eb->B:26:0x03f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x040f A[EDGE_INSN: B:27:0x040f->B:28:0x040f BREAK  A[LOOP:1: B:24:0x03eb->B:26:0x03f3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03a1  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr;
        int round;
        int i16;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr2;
        int i17;
        float[] fArr;
        int i18;
        int i19;
        int dp;
        int i20;
        int size;
        int i21;
        ArrayList arrayList;
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size2 - paddingLeft) - paddingRight);
        float f7 = l() ? 1.0f : 0.0f;
        org.telegram.ui.Components.e6 e6Var = this.U;
        float d = e6Var.d(f7, false);
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        int paddingTop = getPaddingTop();
        ArrayList arrayList3 = this.y;
        int size3 = arrayList3.size();
        if (size3 == 0) {
            int dp2 = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
            this.S = dp2;
            this.Q = dp2;
            this.R = max;
        } else {
            if (size3 != 1) {
                float[] fArr2 = new float[size3];
                for (int i22 = 0; i22 < size3; i22++) {
                    z4 z4Var = (z4) arrayList3.get(i22);
                    int i23 = z4Var.e == null ? 0 : z4Var.d() ? z4Var.e.k : z4Var.e.j;
                    if (z4Var.e == null) {
                        i18 = 0;
                    } else {
                        boolean d10 = z4Var.d();
                        u uVar = z4Var.e;
                        i18 = d10 ? uVar.j : uVar.k;
                    }
                    fArr2[i22] = (i23 <= 0 || i18 <= 0) ? 1.0f : i23 / i18;
                }
                MessageObject.GroupedMessagePosition[] computeGrouped = RichMessageLayout.computeGrouped(fArr2);
                int i24 = 0;
                for (MessageObject.GroupedMessagePosition groupedMessagePosition : computeGrouped) {
                    i24 = Math.max(i24, (int) groupedMessagePosition.maxY);
                }
                int i25 = i24 + 1;
                float[] fArr3 = new float[i25];
                int length = computeGrouped.length;
                i12 = paddingLeft;
                int i26 = 0;
                while (i26 < length) {
                    int i27 = i26;
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = computeGrouped[i27];
                    int i28 = paddingRight;
                    byte b10 = groupedMessagePosition2.minY;
                    int i29 = i25;
                    if (b10 == groupedMessagePosition2.maxY) {
                        fArr3[b10] = Math.max(fArr3[b10], groupedMessagePosition2.ph);
                    }
                    i26 = i27 + 1;
                    paddingRight = i28;
                    i25 = i29;
                }
                i13 = paddingRight;
                int i30 = i25;
                int length2 = computeGrouped.length;
                int i31 = 0;
                while (i31 < length2) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = computeGrouped[i31];
                    int i32 = groupedMessagePosition3.minY;
                    int i33 = length2;
                    byte b11 = groupedMessagePosition3.maxY;
                    if (i32 != b11) {
                        int i34 = (b11 - i32) + 1;
                        i17 = i31;
                        float[] fArr4 = groupedMessagePosition3.siblingHeights;
                        if (fArr4 == null || fArr4.length != i34) {
                            fArr = fArr3;
                            float f10 = groupedMessagePosition3.ph / i34;
                            while (i32 <= groupedMessagePosition3.maxY) {
                                fArr[i32] = Math.max(fArr[i32], f10);
                                i32++;
                            }
                            i31 = i17 + 1;
                            length2 = i33;
                            fArr3 = fArr;
                        } else {
                            int i35 = 0;
                            while (i35 < i34) {
                                int i36 = groupedMessagePosition3.minY + i35;
                                int i37 = i35;
                                float[] fArr5 = fArr3;
                                fArr5[i36] = Math.max(fArr3[i36], groupedMessagePosition3.siblingHeights[i37]);
                                i35 = i37 + 1;
                                fArr3 = fArr5;
                            }
                        }
                    } else {
                        i17 = i31;
                    }
                    fArr = fArr3;
                    i31 = i17 + 1;
                    length2 = i33;
                    fArr3 = fArr;
                }
                float[] fArr6 = fArr3;
                Point point = AndroidUtilities.displaySize;
                float max2 = Math.max(point.x, point.y) * 0.5f;
                int[] iArr = new int[i24 + 2];
                float f11 = 0.0f;
                for (int i38 = 0; i38 <= i24; i38++) {
                    iArr[i38] = Math.round(f11 * max2);
                    f11 += fArr6[i38];
                }
                iArr[i30] = Math.round(f11 * max2);
                int dp3 = AndroidUtilities.dp(2.0f);
                int i39 = 0;
                while (i39 < computeGrouped.length) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = computeGrouped[i39];
                    int i40 = iArr[groupedMessagePosition4.minY];
                    int i41 = iArr[groupedMessagePosition4.maxY + 1] - i40;
                    int i42 = dp3;
                    if (groupedMessagePosition4.leftSpanOffset > 0) {
                        round = Math.round((r2 * max) / 1000.0f);
                        i15 = i41;
                        groupedMessagePositionArr = computeGrouped;
                    } else {
                        i15 = i41;
                        int i43 = 0;
                        int i44 = 0;
                        while (i43 < computeGrouped.length) {
                            if (i43 == i39) {
                                i16 = i43;
                                groupedMessagePositionArr2 = computeGrouped;
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition5 = computeGrouped[i43];
                                i16 = i43;
                                byte b12 = groupedMessagePosition5.minY;
                                groupedMessagePositionArr2 = computeGrouped;
                                byte b13 = groupedMessagePosition4.minY;
                                if (b12 <= b13 && groupedMessagePosition5.maxY >= b13 && groupedMessagePosition5.minX < groupedMessagePosition4.minX) {
                                    i44 += groupedMessagePosition5.pw;
                                }
                            }
                            i43 = i16 + 1;
                            computeGrouped = groupedMessagePositionArr2;
                        }
                        groupedMessagePositionArr = computeGrouped;
                        round = Math.round((i44 * max) / 1000.0f);
                    }
                    arrayList2.add(new RectF(round, i40 + paddingTop, Math.max(0, (groupedMessagePosition4.flags & 2) != 0 ? max - round : Math.round((groupedMessagePosition4.pw * max) / 1000.0f) - i42) + round, Math.max(0, (groupedMessagePosition4.flags & 8) == 0 ? i15 - i42 : i15) + r15));
                    i39++;
                    dp3 = i42;
                    iArr = iArr;
                    computeGrouped = groupedMessagePositionArr;
                }
                this.Q = iArr[i30];
                this.R = max;
                float f12 = 0.0f;
                for (int i45 = 0; i45 < size3; i45++) {
                    z4 z4Var2 = (z4) arrayList3.get(i45);
                    int i46 = z4Var2.e == null ? 0 : z4Var2.d() ? z4Var2.e.k : z4Var2.e.j;
                    if (z4Var2.e == null) {
                        i14 = 0;
                    } else {
                        boolean d11 = z4Var2.d();
                        u uVar2 = z4Var2.e;
                        i14 = d11 ? uVar2.j : uVar2.k;
                    }
                    f12 = ((i46 <= 0 || i14 <= 0) ? 1.0f : i46 / i14) + f12;
                }
                int max3 = (int) (this.R / Math.max(0.5f, f12 / size3));
                Point point2 = AndroidUtilities.displaySize;
                int max4 = (int) (Math.max(point2.x, point2.y) * 0.55f);
                if (max3 > max4) {
                    max3 = max4;
                }
                this.S = max3;
                this.P = Math.round(AndroidUtilities.lerp(this.Q, this.S, d));
                ArrayList arrayList4 = this.G;
                arrayList4.clear();
                size = arrayList3.size();
                if (size != 0) {
                    int paddingTop2 = getPaddingTop();
                    if (size == 1) {
                        arrayList4.add(new RectF((RectF) arrayList2.get(0)));
                    } else {
                        float f13 = (-this.a0) * this.R;
                        int i47 = 0;
                        while (i47 < size && i47 < arrayList2.size()) {
                            RectF rectF = (RectF) arrayList2.get(i47);
                            float f14 = ((i47 - this.W) * this.R) + f13;
                            arrayList4.add(new RectF(AndroidUtilities.lerp(rectF.left, f14, d), AndroidUtilities.lerp(rectF.top, paddingTop2, d), AndroidUtilities.lerp(rectF.right, f14 + this.R, d), AndroidUtilities.lerp(rectF.bottom, this.S + paddingTop2, d)));
                            i47++;
                            size = size;
                        }
                    }
                }
                int dp4 = c9.b(this.a) <= 0 ? AndroidUtilities.dp(16.0f) : 0;
                setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.P + this.v.h(i12 - dp4, i13 - dp4, size2));
                this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                this.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                i21 = 0;
                while (true) {
                    arrayList = this.E;
                    if (i21 < arrayList.size()) {
                        break;
                    }
                    ((ImageView) arrayList.get(i21)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                    i21++;
                }
                if (e6Var.i) {
                    return;
                }
                requestLayout();
                return;
            }
            z4 z4Var3 = (z4) arrayList3.get(0);
            int i48 = z4Var3.e == null ? 0 : z4Var3.d() ? z4Var3.e.k : z4Var3.e.j;
            if (z4Var3.e == null) {
                i19 = 0;
            } else {
                boolean d12 = z4Var3.d();
                u uVar3 = z4Var3.e;
                i19 = d12 ? uVar3.j : uVar3.k;
            }
            if (i48 <= 0 || i19 <= 0) {
                dp = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
            } else {
                dp = (int) ((max / Math.max(1, i48)) * i19);
                Point point3 = AndroidUtilities.displaySize;
                int max5 = (int) (Math.max(point3.x, point3.y) * 0.55f);
                if (dp > max5) {
                    i20 = (int) ((max5 / Math.max(1, i19)) * i48);
                    dp = max5;
                    arrayList2.add(new RectF((max - i20) / 2, paddingTop, r4 + i20, paddingTop + dp));
                    this.Q = dp;
                    this.R = i20;
                    this.S = dp;
                }
            }
            i20 = max;
            arrayList2.add(new RectF((max - i20) / 2, paddingTop, r4 + i20, paddingTop + dp));
            this.Q = dp;
            this.R = i20;
            this.S = dp;
        }
        i12 = paddingLeft;
        i13 = paddingRight;
        this.P = Math.round(AndroidUtilities.lerp(this.Q, this.S, d));
        ArrayList arrayList42 = this.G;
        arrayList42.clear();
        size = arrayList3.size();
        if (size != 0) {
        }
        if (c9.b(this.a) <= 0) {
        }
        setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.P + this.v.h(i12 - dp4, i13 - dp4, size2));
        this.w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
        this.x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
        i21 = 0;
        while (true) {
            arrayList = this.E;
            if (i21 < arrayList.size()) {
            }
            ((ImageView) arrayList.get(i21)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
            i21++;
        }
        if (e6Var.i) {
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        boolean z10 = y3 >= ((float) getPaddingTop()) && y3 < ((float) (getPaddingTop() + this.P));
        int i11 = -1;
        if (l() && !this.U.i) {
            ArrayList arrayList = this.y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.e0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.e0 = viewConfiguration.getScaledTouchSlop();
                        this.f0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.g0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.c0 = x10;
                    this.d0 = y3;
                    this.b0 = false;
                    VelocityTracker velocityTracker2 = this.h0;
                    if (velocityTracker2 == null) {
                        this.h0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.h0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.i0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.i0 = null;
                    }
                    this.T = this.W;
                    return true;
                }
                float f7 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.h0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f10 = x10 - this.c0;
                    float f11 = y3 - this.d0;
                    if (!this.b0 && Math.abs(f10) > this.e0 && Math.abs(f10) > Math.abs(f11)) {
                        this.b0 = true;
                        this.T = -1;
                    }
                    if (this.b0) {
                        float f12 = (-f10) / this.R;
                        int i12 = this.W;
                        if (i12 == 0 && f12 < 0.0f) {
                            f12 *= 0.3f;
                        }
                        if (i12 == arrayList.size() - 1 && f12 > 0.0f) {
                            f12 *= 0.3f;
                        }
                        this.a0 = f12;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.h0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.h0.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.g0);
                        float xVelocity = this.h0.getXVelocity();
                        float yVelocity = this.h0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f7 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.h0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.h0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.b0) {
                        this.b0 = false;
                        settle(f7);
                    } else if (actionMasked == 1) {
                        int i13 = this.T;
                        int i14 = this.W;
                        if (i13 == i14) {
                            k(i14);
                        }
                    }
                    this.T = -1;
                    return true;
                }
            }
        }
        ArrayList arrayList2 = this.G;
        if (actionMasked == 0) {
            if (!z10) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i10 >= arrayList2.size()) {
                    break;
                }
                if (((RectF) arrayList2.get(i10)).contains(x10, y3)) {
                    i11 = i10;
                    break;
                }
                i10++;
            }
            this.T = i11;
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 3) {
                this.T = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
        if (z10) {
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList2.size()) {
                    i15 = -1;
                    break;
                }
                if (((RectF) arrayList2.get(i15)).contains(x10, y3)) {
                    break;
                }
                i15++;
            }
            int i16 = this.T;
            if (i15 == i16) {
                k(i16);
            }
        }
        boolean z11 = this.T != -1 || z10;
        this.T = -1;
        return z11 || super.onTouchEvent(motionEvent);
    }
}
