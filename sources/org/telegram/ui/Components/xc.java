package org.telegram.ui.Components;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xc {
    public static final int[] p = {R.attr.state_enabled, R.attr.state_pressed};
    public uq a;
    public final ArrayList b = new ArrayList();
    public int c;
    public boolean d;
    public final org.telegram.ui.Cells.z e;
    public final View f;
    public final Paint g;
    public Runnable h;
    public boolean i;
    public Runnable j;
    public final m2.b k;
    public boolean l;
    public final CornerPathEffect m;
    public boolean n;
    public final Paint o;

    public xc(View view) {
        Paint paint = new Paint(1);
        this.g = paint;
        this.k = new m2.b(this, 14);
        float dp = AndroidUtilities.dp(12.0f);
        this.f = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(dp);
        this.m = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.o = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        org.telegram.ui.Cells.z zVar = new org.telegram.ui.Cells.z(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.i6, false) & 436207615}), null, new ef.f(this, paint3));
        this.e = zVar;
        zVar.setCallback(view);
    }

    public final void a(RectF rectF) {
        int i10 = this.c + 1;
        this.c = i10;
        ArrayList arrayList = this.b;
        if (i10 > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.c - 1)).set(rectF);
    }

    public final boolean b(MotionEvent motionEvent) {
        Runnable runnable;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.f;
        m2.b bVar = this.k;
        org.telegram.ui.Cells.z zVar = this.e;
        if (action == 0) {
            for (int i10 = 0; i10 < this.c; i10++) {
                float f10 = x10;
                float f11 = y10;
                if (((RectF) this.b.get(i10)).contains(f10, f11)) {
                    this.d = true;
                    if (zVar != null) {
                        zVar.setHotspot(f10, f11);
                        zVar.setState(p);
                    }
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    if (this.l) {
                        AndroidUtilities.runOnUIThread(bVar, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.d) {
                if (motionEvent.getAction() == 1 && (runnable = this.h) != null) {
                    runnable.run();
                }
                view.playSoundEffect(0);
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
                this.d = false;
                view.invalidate();
            }
            AndroidUtilities.cancelRunOnUIThread(bVar);
        } else if (motionEvent.getAction() == 2 && this.d && zVar != null) {
            zVar.setHotspot(x10, y10);
        }
        return this.d;
    }

    public final void c(Canvas canvas, Paint paint) {
        int i10 = this.c;
        CornerPathEffect cornerPathEffect = this.m;
        org.telegram.ui.Cells.z zVar = this.e;
        int i11 = 0;
        ArrayList arrayList = this.b;
        if (i10 <= 1) {
            if (i10 == 1) {
                if (zVar != null) {
                    zVar.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
                }
                if (!this.n) {
                    paint.setPathEffect(cornerPathEffect);
                    canvas.drawRoundRect((RectF) arrayList.get(0), 0.0f, 0.0f, paint);
                    return;
                } else {
                    paint.setPathEffect(null);
                    float min = Math.min(((RectF) arrayList.get(0)).width(), ((RectF) arrayList.get(0)).height()) / 2.0f;
                    canvas.drawRoundRect((RectF) arrayList.get(0), min, min, paint);
                    return;
                }
            }
            return;
        }
        if (!this.i) {
            uq uqVar = this.a;
            if (uqVar == null) {
                this.a = new uq(0);
            } else {
                uqVar.rewind();
            }
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.c;
                if (i11 >= i16) {
                    break;
                }
                int i17 = i11 + 1;
                if (i17 < i16) {
                    float f10 = ((RectF) arrayList.get(i11)).right;
                    float f11 = ((RectF) arrayList.get(i17)).right;
                    if (Math.abs(f10 - f11) < AndroidUtilities.dp(4.0f)) {
                        RectF rectF = (RectF) arrayList.get(i17);
                        RectF rectF2 = (RectF) arrayList.get(i11);
                        float max = Math.max(f10, f11);
                        rectF2.right = max;
                        rectF.right = max;
                    }
                }
                if (i11 == 0 || ((RectF) arrayList.get(i11)).bottom > i12) {
                    i12 = (int) ((RectF) arrayList.get(i11)).bottom;
                }
                if (i11 == 0 || ((RectF) arrayList.get(i11)).right > i13) {
                    i13 = (int) ((RectF) arrayList.get(i11)).right;
                }
                if (i11 == 0 || ((RectF) arrayList.get(i11)).left < i14) {
                    i14 = (int) ((RectF) arrayList.get(i11)).left;
                }
                if (i11 == 0 || ((RectF) arrayList.get(i11)).top < i15) {
                    i15 = (int) ((RectF) arrayList.get(i11)).top;
                }
                this.a.addRect((RectF) arrayList.get(i11), Path.Direction.CCW);
                if (zVar != null) {
                    zVar.setBounds(i14, i15, i13, i12);
                }
                i11 = i17;
            }
            this.a.a();
            this.i = true;
        }
        paint.setPathEffect(cornerPathEffect);
        uq uqVar2 = this.a;
        if (uqVar2 != null) {
            canvas.drawPath(uqVar2, paint);
        }
    }

    public final void d(int i10) {
        this.g.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.e;
        if (zVar != null) {
            org.telegram.ui.ActionBar.k6.B1(zVar, i10, true);
        }
    }

    public final void e(org.telegram.ui.Cells.h2 h2Var) {
        this.h = h2Var;
    }
}
