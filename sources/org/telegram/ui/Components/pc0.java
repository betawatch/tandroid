package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class pc0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final ArrayList a;
    public float b;
    public final org.telegram.ui.ActionBar.g6 c;
    public final Paint d;
    public int e;
    public int f;
    public Drawable h;
    public float n;
    public float r;
    public final RectF s;
    public Utilities.Callback v;

    public pc0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = new ArrayList();
        this.d = new Paint(1);
        this.n = AndroidUtilities.dp(14.0f);
        this.r = AndroidUtilities.dp(0.0f);
        this.s = new RectF();
        this.c = g6Var;
        b();
    }

    public final void a(int i10, String str) {
        this.a.add(new oc0(i10, str));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nd));
    }

    public final void b() {
        int[] iArr;
        boolean q6 = org.telegram.ui.ActionBar.k6.I.q();
        Paint paint = this.d;
        if (q6) {
            this.e = -1862270977;
            this.f = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.Nd;
        org.telegram.ui.ActionBar.g6 g6Var = this.c;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        if ((g6Var instanceof org.telegram.ui.qn) && (((org.telegram.ui.qn) g6Var).l() instanceof yc0) && (iArr = ((yc0) ((org.telegram.ui.qn) g6Var).l()).a) != null) {
            w02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
        }
        this.e = org.telegram.ui.ActionBar.k6.c(-1606201797, w02);
        this.f = org.telegram.ui.ActionBar.k6.c(-448573893, w02);
        paint.setColor(org.telegram.ui.ActionBar.k6.c(814980216, w02));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.a;
        if (arrayList.size() <= 1) {
            return;
        }
        float f7 = this.b;
        double d = f7;
        int floor = (int) Math.floor(d);
        boolean z10 = floor >= 0 && floor < arrayList.size();
        int ceil = (int) Math.ceil(d);
        boolean z11 = ceil >= 0 && ceil < arrayList.size();
        RectF rectF = this.s;
        if (z10 && z11) {
            AndroidUtilities.lerp(((oc0) arrayList.get(floor)).c, ((oc0) arrayList.get(ceil)).c, f7 - floor, rectF);
        } else if (z10) {
            rectF.set(((oc0) arrayList.get(floor)).c);
        } else if (z11) {
            rectF.set(((oc0) arrayList.get(ceil)).c);
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (z10 || z11) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.d);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            oc0 oc0Var = (oc0) arrayList.get(i10);
            oc0Var.b.c(oc0Var.c.left + this.n, getMeasuredHeight() / 2.0f, 1.0f, i0.a.f(1.0f - Math.abs(f7 - i10), this.e, this.f), canvas);
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.a;
        if (arrayList.size() > 1) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    i10 = -1;
                    break;
                }
                if (((oc0) arrayList.get(i11)).d.contains(x10, y3)) {
                    i10 = ((oc0) arrayList.get(i11)).a;
                    break;
                }
                i11++;
            }
            if (motionEvent.getAction() == 0) {
                if (i10 != -1) {
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.v) != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
        return false;
    }

    public int getColor() {
        return this.e;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        super.onMeasure(i10, i11);
        this.n = AndroidUtilities.dp(14.0f);
        float f7 = 0.0f;
        this.r = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f7 += this.r;
            }
            f7 += ((oc0) arrayList.get(i12)).b.l() + this.n + this.n;
            i12++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float dp = (measuredHeight - AndroidUtilities.dp(26.0f)) / 2.0f;
        float dp2 = (AndroidUtilities.dp(26.0f) + measuredHeight) / 2.0f;
        float f10 = measuredWidth;
        float f11 = (f10 - f7) / 2.0f;
        float f12 = f11;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            float l4 = ((oc0) arrayList.get(i13)).b.l() + this.n + this.n;
            ((oc0) arrayList.get(i13)).c.set(f12, dp, f12 + l4, dp2);
            ((oc0) arrayList.get(i13)).d.set(((oc0) arrayList.get(i13)).c);
            ((oc0) arrayList.get(i13)).d.inset((-this.r) / 2.0f, -dp);
            f12 += l4 + this.r;
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.h.setBounds((((int) f11) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f10 + f7) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.h = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.v = callback;
    }

    public void setSelectedTab(float f7) {
        this.b = f7;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            b();
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
