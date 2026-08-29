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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pb0 extends View {
    public final ArrayList a;
    public float b;
    public final Paint c;
    public final int d;
    public final int e;
    public Drawable f;
    public float h;
    public float n;
    public final RectF r;
    public Utilities.Callback s;

    public pb0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int[] iArr;
        this.a = new ArrayList();
        Paint paint = new Paint(1);
        this.c = paint;
        this.h = AndroidUtilities.dp(14.0f);
        this.n = AndroidUtilities.dp(0.0f);
        this.r = new RectF();
        if (org.telegram.ui.ActionBar.g6.I.q()) {
            this.d = -1862270977;
            this.e = -1325400065;
            paint.setColor(285212671);
            return;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Nd, c6Var);
        if (c6Var instanceof org.telegram.ui.rn) {
            org.telegram.ui.rn rnVar = (org.telegram.ui.rn) c6Var;
            if ((rnVar.d() instanceof yb0) && (iArr = ((yb0) rnVar.d()).a) != null) {
                v02 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(iArr[0], iArr[1]), AndroidUtilities.getAverageColor(iArr[2], iArr[3]));
            }
        }
        this.d = org.telegram.ui.ActionBar.g6.c(-1606201797, v02);
        this.e = org.telegram.ui.ActionBar.g6.c(-448573893, v02);
        paint.setColor(org.telegram.ui.ActionBar.g6.c(814980216, v02));
    }

    public final void a(int i10, String str) {
        this.a.add(new ob0(i10, str));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.a;
        if (arrayList.size() <= 1) {
            return;
        }
        float f9 = this.b;
        double d = f9;
        int floor = (int) Math.floor(d);
        boolean z10 = floor >= 0 && floor < arrayList.size();
        int ceil = (int) Math.ceil(d);
        boolean z11 = ceil >= 0 && ceil < arrayList.size();
        RectF rectF = this.r;
        if (z10 && z11) {
            AndroidUtilities.lerp(((ob0) arrayList.get(floor)).c, ((ob0) arrayList.get(ceil)).c, f9 - floor, rectF);
        } else if (z10) {
            rectF.set(((ob0) arrayList.get(floor)).c);
        } else if (z11) {
            rectF.set(((ob0) arrayList.get(ceil)).c);
        }
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (z10 || z11) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.c);
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ob0 ob0Var = (ob0) arrayList.get(i10);
            ob0Var.b.c(ob0Var.c.left + this.h, getMeasuredHeight() / 2.0f, 1.0f, i0.a.d(1.0f - Math.abs(f9 - i10), this.d, this.e), canvas);
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        Utilities.Callback callback;
        ArrayList arrayList = this.a;
        if (arrayList.size() > 1) {
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    i10 = -1;
                    break;
                }
                if (((ob0) arrayList.get(i11)).d.contains(x4, y8)) {
                    i10 = ((ob0) arrayList.get(i11)).a;
                    break;
                }
                i11++;
            }
            if (motionEvent.getAction() == 0) {
                if (i10 != -1) {
                    return true;
                }
            } else if (motionEvent.getAction() == 1 && i10 != -1 && (callback = this.s) != null) {
                callback.run(Integer.valueOf(i10));
            }
        }
        return false;
    }

    public int getColor() {
        return this.d;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        super.onMeasure(i10, i11);
        this.h = AndroidUtilities.dp(14.0f);
        float f9 = 0.0f;
        this.n = AndroidUtilities.dp(0.0f);
        int i12 = 0;
        while (true) {
            arrayList = this.a;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (i12 > 0) {
                f9 += this.n;
            }
            f9 += ((ob0) arrayList.get(i12)).b.l() + this.h + this.h;
            i12++;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float dp = (measuredHeight - AndroidUtilities.dp(26.0f)) / 2.0f;
        float dp2 = (AndroidUtilities.dp(26.0f) + measuredHeight) / 2.0f;
        float f10 = measuredWidth;
        float f11 = (f10 - f9) / 2.0f;
        float f12 = f11;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            float l10 = ((ob0) arrayList.get(i13)).b.l() + this.h + this.h;
            ((ob0) arrayList.get(i13)).c.set(f12, dp, f12 + l10, dp2);
            ((ob0) arrayList.get(i13)).d.set(((ob0) arrayList.get(i13)).c);
            ((ob0) arrayList.get(i13)).d.inset((-this.n) / 2.0f, -dp);
            f12 += l10 + this.n;
        }
        Drawable drawable = this.f;
        if (drawable != null) {
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i14 = measuredHeight / 2;
            this.f.setBounds((((int) f11) - AndroidUtilities.dp(3.0f)) - rect.left, (i14 - AndroidUtilities.dp(16.0f)) - rect.top, AndroidUtilities.dp(3.0f) + ((int) ((f10 + f9) / 2.0f)) + rect.right, AndroidUtilities.dp(16.0f) + i14 + rect.bottom);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.f = drawable;
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.s = callback;
    }

    public void setSelectedTab(float f9) {
        this.b = f9;
        invalidate();
    }
}
