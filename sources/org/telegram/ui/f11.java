package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f11 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public c11 b;
    public c11 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public f11(ProfileActivity profileActivity, c11 c11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = c11Var;
    }

    public final boolean a() {
        c11 c11Var = this.b;
        if (!c11Var.b || this.h < 1.0f) {
            return false;
        }
        if (c11Var.c.getLottieAnimation() != null) {
            this.b.c.getLottieAnimation().L(0, false, false);
            this.b.c.getLottieAnimation().F(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(c11 c11Var) {
        if (this.b == c11Var || c11Var == null) {
            return;
        }
        ArrayList arrayList = c11Var.e;
        if (this.r) {
            this.c = c11Var;
            return;
        }
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((e11) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        c11 c11Var2 = this.b;
        ArrayList arrayList2 = c11Var2.j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && c11Var2.i) {
            c11Var2.b(true);
            c11Var2.i = false;
        }
        this.b = c11Var;
        if (this.f) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((e11) arrayList.get(i11)).setParentView(this);
        }
        this.f = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.j.add(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((e11) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        c11 c11Var = this.b;
        ArrayList arrayList = c11Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && c11Var.i) {
            c11Var.b(true);
            c11Var.i = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            if (!this.f) {
                for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                    ((e11) this.b.e.get(i10)).setParentView(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new sz0(this, 3));
                }
            }
            if (this.r) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.clamp(this.h + (Utilities.clamp(currentTimeMillis - this.n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.n = currentTimeMillis;
                ProfileActivity profileActivity = this.a;
                ty0 ty0Var = profileActivity.a;
                int i11 = profileActivity.R2;
                PointF pointF = this.d;
                float f10 = 2.0f;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= ty0Var.getChildCount()) {
                            break;
                        }
                        View childAt = ty0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.x8)) {
                            ih.s sVar = ((org.telegram.ui.Cells.x8) childAt).a;
                            pointF.set(sVar.getX() + childAt.getX() + ty0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + ty0Var.getY());
                            break;
                        }
                        i12++;
                    }
                }
                float f11 = dz.f();
                this.b.c.setImageCoords((getWidth() - AndroidUtilities.dp(f11)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f11) * 0.5f)), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.b.c.draw(canvas);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int dp = AndroidUtilities.dp(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    e11 e11Var = (e11) this.b.d.get(size);
                    float f12 = size;
                    float cascade = AndroidUtilities.cascade(this.h, f12, this.b.d.size(), 1.8f);
                    float f13 = dp;
                    float f14 = 0.88f * f13;
                    float d = e2.c.d(f14, this.b.d.size() - 1, getWidth(), f10);
                    float f15 = pointF.x;
                    float f16 = pointF.y;
                    float f17 = ((d - f15) * cascade) + (f14 * f12) + f15;
                    float pow = f16 - ((f16 + f13) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.mr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                    float f18 = (f13 / 2.0f) * interpolation;
                    float f19 = f13 * interpolation;
                    e11Var.setImageCoords(f17 - f18, pow - f18, f19, f19);
                    e11Var.draw(canvas);
                    size--;
                    f10 = 2.0f;
                }
                if (this.h < 1.0f) {
                    invalidate();
                    return;
                }
                this.r = false;
                b(this.c);
                this.c = null;
            }
        }
    }
}
