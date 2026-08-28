package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tu extends FrameLayout {
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final y5 s;
    public ImageReceiver v;
    public boolean w;
    public final y5 x;
    public final /* synthetic */ dv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu(dv dvVar, Context context) {
        super(context);
        this.y = dvVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        gr grVar = gr.h;
        this.s = new y5(this, 0L, 350L, grVar);
        this.x = new y5(this, 0L, 320L, grVar);
    }

    public final void a() {
        t5[] t5VarArr;
        dv dvVar = this.y;
        kh.w wVar = dvVar.h;
        if (wVar == null) {
            t5VarArr = new t5[0];
        } else {
            t5[] t5VarArr2 = new t5[wVar.getChildCount()];
            for (int i9 = 0; i9 < wVar.getChildCount(); i9++) {
                View childAt = wVar.getChildAt(i9);
                if (childAt instanceof uu) {
                    t5VarArr2[i9] = ((uu) childAt).c;
                }
            }
            t5VarArr = t5VarArr2;
        }
        dvVar.b = t5.update(3, this, t5VarArr, (LongSparseArray<k5>) dvVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        float f10;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        su suVar;
        t5 t5Var;
        Canvas canvas2 = canvas;
        dv dvVar = this.y;
        jp jpVar = dvVar.B;
        kh.w wVar = dvVar.h;
        if (this.d) {
            int i9 = org.telegram.ui.ActionBar.f6.h5;
            int themedColor = dvVar.getThemedColor(i9);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.f6.m(paint);
            Path path = this.b;
            path.reset();
            float U = dvVar.U();
            viewGroup = ((org.telegram.ui.ActionBar.f3) dvVar).containerView;
            float e10 = this.s.e(U <= ((float) viewGroup.getPaddingTop()));
            float lerp = AndroidUtilities.lerp(U, 0.0f, e10);
            if (this.v != null) {
                float dp = AndroidUtilities.dp(140.0f);
                f10 = 20.0f;
                float dp2 = AndroidUtilities.dp(20.0f);
                if (lerp < dp + dp2) {
                    this.w = false;
                }
                this.v.setAlpha(this.x.e(this.w));
                if (this.v.getAlpha() > 0.0f) {
                    float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                    float f11 = (lerp - dp2) - (dp / 2.0f);
                    float f12 = alpha / 2.0f;
                    this.v.setImageCoords((getWidth() / 2.0f) - f12, f11 - f12, alpha, alpha);
                    this.v.draw(canvas2);
                } else {
                    this.v.onDetachedFromWindow();
                    this.v = null;
                }
            } else {
                f10 = 20.0f;
            }
            float f13 = 1.0f;
            float dp3 = AndroidUtilities.dp((1.0f - e10) * 14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
            path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z10 = e10 > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                boolean z11 = AndroidUtilities.computePerceivedBrightness(dvVar.getThemedColor(i9)) > 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.s8), 855638016)) > 0.721f;
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(dvVar, z11);
            }
            org.telegram.ui.ActionBar.f6.t0.setColor(dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.Ii));
            org.telegram.ui.ActionBar.f6.t0.setAlpha((int) (g7.n.a(lerp / AndroidUtilities.dp(f10), 0.0f, 1.0f) * org.telegram.ui.ActionBar.f6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
            dvVar.r.setVisibility((wVar.canScrollVertically(1) || dvVar.w.getVisibility() == 0) ? 0 : 4);
            if (wVar != null) {
                canvas2.save();
                canvas2.translate(wVar.getLeft(), wVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, wVar.getWidth(), wVar.getHeight());
                canvas2.saveLayerAlpha(0.0f, 0.0f, wVar.getWidth(), wVar.getHeight(), (int) (wVar.getAlpha() * 255.0f), 31);
                int i10 = 0;
                while (true) {
                    sparseArray = this.e;
                    int size = sparseArray.size();
                    arrayList = this.n;
                    if (i10 >= size) {
                        break;
                    }
                    ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i10);
                    arrayList3.clear();
                    arrayList.add(arrayList3);
                    i10++;
                }
                sparseArray.clear();
                int i11 = 0;
                while (i11 < wVar.getChildCount()) {
                    View childAt = wVar.getChildAt(i11);
                    if (childAt instanceof uu) {
                        uu uuVar = (uu) childAt;
                        if (uuVar.isPressed()) {
                            float f14 = uuVar.e;
                            if (f14 != f13) {
                                uuVar.e = Utilities.clamp(f14 + 0.16f, f13, 0.0f);
                                uuVar.invalidate();
                            }
                        }
                        if (dvVar.b != null && (t5Var = uuVar.c) != null) {
                            k5 k5Var = (k5) dvVar.b.get(t5Var.getDocumentId());
                            if (k5Var != null) {
                                int themedColor2 = dvVar.getThemedColor(org.telegram.ui.ActionBar.f6.G6);
                                if (themedColor2 != dvVar.Q || dvVar.P == null) {
                                    dvVar.Q = themedColor2;
                                    dvVar.P = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                }
                                k5Var.setColorFilter(dvVar.P);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) e2.c.k(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(uuVar);
                            }
                        }
                    } else {
                        canvas2.save();
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        childAt.draw(canvas2);
                        canvas2.restore();
                    }
                    i11++;
                    f13 = 1.0f;
                }
                ArrayList arrayList5 = this.h;
                arrayList5.clear();
                ArrayList arrayList6 = this.f;
                arrayList5.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                int i12 = 0;
                while (true) {
                    int size2 = sparseArray.size();
                    arrayList2 = this.r;
                    if (i12 >= size2) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i12);
                    View view = (View) arrayList7.get(0);
                    wVar.getClass();
                    int R = RecyclerView.R(view);
                    long j10 = currentTimeMillis;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList5.size()) {
                            suVar = null;
                            break;
                        } else {
                            if (((su) arrayList5.get(i13)).I == R) {
                                suVar = (su) arrayList5.get(i13);
                                arrayList5.remove(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                    if (suVar == null) {
                        if (arrayList2.isEmpty()) {
                            suVar = new su(this);
                            suVar.l(7);
                        } else {
                            suVar = (su) e2.c.k(1, arrayList2);
                        }
                        suVar.I = R;
                        suVar.e();
                    }
                    arrayList6.add(suVar);
                    suVar.J = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    su suVar2 = suVar;
                    currentTimeMillis = j10;
                    suVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i12++;
                }
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((su) arrayList5.get(i14));
                        ((su) arrayList5.get(i14)).J = null;
                        ((su) arrayList5.get(i14)).k();
                    } else {
                        ((su) arrayList5.get(i14)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (wVar.getAlpha() < 1.0f) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    jpVar.setAlpha((int) ((1.0f - wVar.getAlpha()) * 255.0f));
                    jpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                    jpVar.draw(canvas2);
                    invalidate();
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y10 = motionEvent.getY();
            dv dvVar = this.y;
            if (y10 < dvVar.U() - AndroidUtilities.dp(6.0f)) {
                dvVar.dismiss();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        int i9 = 0;
        this.d = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((su) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i9 >= arrayList2.size()) {
                break;
            }
            ((su) arrayList2.get(i9)).f();
            i9++;
        }
        arrayList.clear();
        t5.release(this, (LongSparseArray<k5>) this.y.b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
