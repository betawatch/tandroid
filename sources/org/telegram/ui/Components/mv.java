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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mv extends FrameLayout {
    public final Paint a;
    public final Path b;
    public Boolean c;
    public boolean d;
    public final SparseArray e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public final ArrayList r;
    public final d6 s;
    public ImageReceiver v;
    public boolean w;
    public final d6 x;
    public final /* synthetic */ wv y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv(wv wvVar, Context context) {
        super(context);
        this.y = wvVar;
        this.a = new Paint();
        this.b = new Path();
        this.c = null;
        this.e = new SparseArray();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = new ArrayList();
        wr wrVar = wr.h;
        this.s = new d6(this, 0L, 350L, wrVar);
        this.x = new d6(this, 0L, 320L, wrVar);
    }

    public final void a() {
        y5[] y5VarArr;
        wv wvVar = this.y;
        bi.z zVar = wvVar.h;
        if (zVar == null) {
            y5VarArr = new y5[0];
        } else {
            y5[] y5VarArr2 = new y5[zVar.getChildCount()];
            for (int i10 = 0; i10 < zVar.getChildCount(); i10++) {
                View childAt = zVar.getChildAt(i10);
                if (childAt instanceof nv) {
                    y5VarArr2[i10] = ((nv) childAt).c;
                }
            }
            y5VarArr = y5VarArr2;
        }
        wvVar.b = y5.update(3, this, y5VarArr, (LongSparseArray<p5>) wvVar.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        float f7;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        lv lvVar;
        y5 y5Var;
        Canvas canvas2 = canvas;
        wv wvVar = this.y;
        zp zpVar = wvVar.F;
        bi.z zVar = wvVar.h;
        if (this.d) {
            int i10 = org.telegram.ui.ActionBar.j6.h5;
            int themedColor = wvVar.getThemedColor(i10);
            Paint paint = this.a;
            paint.setColor(themedColor);
            org.telegram.ui.ActionBar.j6.m(paint);
            Path path = this.b;
            path.reset();
            float V = wvVar.V();
            viewGroup = ((org.telegram.ui.ActionBar.h3) wvVar).containerView;
            float e = this.s.e(V <= ((float) viewGroup.getPaddingTop()));
            float lerp = AndroidUtilities.lerp(V, 0.0f, e);
            if (this.v != null) {
                float dp = AndroidUtilities.dp(140.0f);
                f7 = 20.0f;
                float dp2 = AndroidUtilities.dp(20.0f);
                if (lerp < dp + dp2) {
                    this.w = false;
                }
                this.v.setAlpha(this.x.e(this.w));
                if (this.v.getAlpha() > 0.0f) {
                    float alpha = ((this.v.getAlpha() * 0.4f) + 0.6f) * dp;
                    float f10 = (lerp - dp2) - (dp / 2.0f);
                    float f11 = alpha / 2.0f;
                    this.v.setImageCoords((getWidth() / 2.0f) - f11, f10 - f11, alpha, alpha);
                    this.v.draw(canvas2);
                } else {
                    this.v.onDetachedFromWindow();
                    this.v = null;
                }
            } else {
                f7 = 20.0f;
            }
            float f12 = 1.0f;
            float dp3 = AndroidUtilities.dp((1.0f - e) * 14.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), lerp, getWidth() - getPaddingRight(), getBottom() + dp3);
            path.addRoundRect(rectF, dp3, dp3, Path.Direction.CW);
            canvas2.drawPath(path, paint);
            boolean z10 = e > 0.5f;
            Boolean bool = this.c;
            if (bool == null || z10 != bool.booleanValue()) {
                this.c = Boolean.valueOf(z10);
                boolean z11 = AndroidUtilities.computePerceivedBrightness(wvVar.getThemedColor(i10)) > 0.721f;
                boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.s8), 855638016)) > 0.721f;
                if (!z10) {
                    z11 = z12;
                }
                AndroidUtilities.setLightStatusBar(wvVar, z11);
            }
            org.telegram.ui.ActionBar.j6.t0.setColor(wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
            org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (w7.q.a(lerp / AndroidUtilities.dp(f7), 0.0f, 1.0f) * org.telegram.ui.ActionBar.j6.t0.getAlpha()));
            int dp4 = AndroidUtilities.dp(36.0f);
            float dp5 = lerp + AndroidUtilities.dp(10.0f);
            rectF.set((getMeasuredWidth() - dp4) / 2, dp5, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + dp5);
            canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
            wvVar.r.setVisibility((zVar.canScrollVertically(1) || wvVar.w.getVisibility() == 0) ? 0 : 4);
            if (zVar != null) {
                canvas2.save();
                canvas2.translate(zVar.getLeft(), zVar.getY() + 0.0f);
                canvas2.clipRect(0, 0, zVar.getWidth(), zVar.getHeight());
                canvas2.saveLayerAlpha(0.0f, 0.0f, zVar.getWidth(), zVar.getHeight(), (int) (zVar.getAlpha() * 255.0f), 31);
                int i11 = 0;
                while (true) {
                    sparseArray = this.e;
                    int size = sparseArray.size();
                    arrayList = this.n;
                    if (i11 >= size) {
                        break;
                    }
                    ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
                    arrayList3.clear();
                    arrayList.add(arrayList3);
                    i11++;
                }
                sparseArray.clear();
                int i12 = 0;
                while (i12 < zVar.getChildCount()) {
                    View childAt = zVar.getChildAt(i12);
                    if (childAt instanceof nv) {
                        nv nvVar = (nv) childAt;
                        if (nvVar.isPressed()) {
                            float f13 = nvVar.e;
                            if (f13 != f12) {
                                nvVar.e = Utilities.clamp(f13 + 0.16f, f12, 0.0f);
                                nvVar.invalidate();
                            }
                        }
                        if (wvVar.b != null && (y5Var = nvVar.c) != null) {
                            p5 p5Var = (p5) wvVar.b.get(y5Var.getDocumentId());
                            if (p5Var != null) {
                                int themedColor2 = wvVar.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
                                if (themedColor2 != wvVar.U || wvVar.T == null) {
                                    wvVar.U = themedColor2;
                                    wvVar.T = new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.SRC_IN);
                                }
                                p5Var.setColorFilter(wvVar.T);
                                ArrayList arrayList4 = (ArrayList) sparseArray.get(childAt.getTop());
                                if (arrayList4 == null) {
                                    arrayList4 = !arrayList.isEmpty() ? (ArrayList) hc.b.z(1, arrayList) : new ArrayList();
                                    sparseArray.put(childAt.getTop(), arrayList4);
                                }
                                arrayList4.add(nvVar);
                            }
                        }
                    } else {
                        canvas2.save();
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        childAt.draw(canvas2);
                        canvas2.restore();
                    }
                    i12++;
                    f12 = 1.0f;
                }
                ArrayList arrayList5 = this.h;
                arrayList5.clear();
                ArrayList arrayList6 = this.f;
                arrayList5.addAll(arrayList6);
                arrayList6.clear();
                long currentTimeMillis = System.currentTimeMillis();
                int i13 = 0;
                while (true) {
                    int size2 = sparseArray.size();
                    arrayList2 = this.r;
                    if (i13 >= size2) {
                        break;
                    }
                    ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
                    View view = (View) arrayList7.get(0);
                    zVar.getClass();
                    int R = RecyclerView.R(view);
                    long j3 = currentTimeMillis;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList5.size()) {
                            lvVar = null;
                            break;
                        } else {
                            if (((lv) arrayList5.get(i14)).M == R) {
                                lvVar = (lv) arrayList5.get(i14);
                                arrayList5.remove(i14);
                                break;
                            }
                            i14++;
                        }
                    }
                    if (lvVar == null) {
                        if (arrayList2.isEmpty()) {
                            lvVar = new lv(this);
                            lvVar.l(7);
                        } else {
                            lvVar = (lv) hc.b.z(1, arrayList2);
                        }
                        lvVar.M = R;
                        lvVar.e();
                    }
                    arrayList6.add(lvVar);
                    lvVar.N = arrayList7;
                    canvas2.save();
                    canvas2.translate(0.0f, view.getY() + view.getPaddingTop());
                    Canvas canvas3 = canvas2;
                    lv lvVar2 = lvVar;
                    currentTimeMillis = j3;
                    lvVar2.a(canvas3, currentTimeMillis, getMeasuredWidth(), view.getMeasuredHeight() - view.getPaddingBottom(), 1.0f);
                    canvas2 = canvas3;
                    canvas2.restore();
                    i13++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    if (arrayList2.size() < 3) {
                        arrayList2.add((lv) arrayList5.get(i15));
                        ((lv) arrayList5.get(i15)).N = null;
                        ((lv) arrayList5.get(i15)).k();
                    } else {
                        ((lv) arrayList5.get(i15)).f();
                    }
                }
                arrayList5.clear();
                canvas2.restore();
                canvas2.restore();
                if (zVar.getAlpha() < 1.0f) {
                    int width = getWidth() / 2;
                    int height = (getHeight() + ((int) dp5)) / 2;
                    int dp6 = AndroidUtilities.dp(16.0f);
                    zpVar.setAlpha((int) ((1.0f - zVar.getAlpha()) * 255.0f));
                    zpVar.setBounds(width - dp6, height - dp6, width + dp6, height + dp6);
                    zpVar.draw(canvas2);
                    invalidate();
                }
            }
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            float y3 = motionEvent.getY();
            wv wvVar = this.y;
            if (y3 < wvVar.V() - AndroidUtilities.dp(6.0f)) {
                wvVar.dismiss();
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
        int i10 = 0;
        this.d = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((lv) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.r;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((lv) arrayList2.get(i10)).f();
            i10++;
        }
        arrayList.clear();
        y5.release(this, (LongSparseArray<p5>) this.y.b);
        ImageReceiver imageReceiver = this.v;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
    }
}
