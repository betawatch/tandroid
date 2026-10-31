package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dy extends View implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public int E;
    public final Paint a;
    public final Paint b;
    public final int c;
    public final ArrayList d;
    public float e;
    public float f;
    public float h;
    public final ImageReceiver n;
    public final ImageReceiver r;
    public final org.telegram.ui.Components.bi0 s;
    public final org.telegram.ui.Components.bi0 w;
    public boolean x;
    public int y;

    public dy(Context context, int i10) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.r = imageReceiver2;
        this.c = i10;
        imageReceiver.y = true;
        imageReceiver2.y = true;
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.download_progress, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.s = bi0Var;
        org.telegram.ui.Components.bi0 bi0Var2 = new org.telegram.ui.Components.bi0(R.raw.download_finish, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.w = bi0Var2;
        imageReceiver.w0(bi0Var);
        imageReceiver2.w0(bi0Var2);
        imageReceiver.W(1);
        bi0Var.K(1);
        bi0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i10 = this.c;
        ArrayList arrayList2 = org.telegram.messenger.b6.q(i10).G;
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((cy) arrayList.get(i11)).c, (cy) arrayList.get(i11));
            org.telegram.messenger.b6.q(i10).v((org.telegram.messenger.z5) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            String S0 = ((org.telegram.messenger.jj) arrayList2.get(i12)).S0();
            if (org.telegram.messenger.b8.G(i10).T(S0)) {
                cy cyVar = (cy) hashMap.get(S0);
                if (cyVar == null) {
                    cyVar = new cy(this, S0);
                }
                org.telegram.messenger.b6.q(i10).a(S0, null, cyVar);
                arrayList.add(cyVar);
            }
        }
        if (arrayList.size() != 0 || this.D) {
            return;
        }
        if (org.telegram.messenger.b6.q(i10).I.size() > 0) {
            this.e = 1.0f;
            this.f = 1.0f;
            this.x = true;
        } else {
            this.e = 0.0f;
            this.f = 0.0f;
            this.x = false;
        }
    }

    public final void b() {
        org.telegram.messenger.hs.a0(this.c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((cy) arrayList.get(i10)).a;
            j11 += ((cy) arrayList.get(i10)).b;
            i10++;
        }
        if (j10 == 0) {
            this.e = 1.0f;
        } else {
            this.e = j11 / j10;
        }
        float f7 = this.e;
        if (f7 > 1.0f) {
            this.e = 1.0f;
        } else if (f7 < 0.0f) {
            this.e = 0.0f;
        }
        this.h = ((this.e - this.f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.b5) {
            a();
            b();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.zs.f(this.c).c(this, org.telegram.messenger.zs.b5);
        this.n.P();
        this.r.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.c;
            if (i10 >= size) {
                arrayList.clear();
                org.telegram.messenger.zs.f(i11).n(this, org.telegram.messenger.zs.b5);
                this.n.R();
                this.r.R();
                return;
            }
            org.telegram.messenger.b6.q(i11).v((org.telegram.messenger.z5) arrayList.get(i10));
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i10 = this.y;
        int i11 = org.telegram.ui.ActionBar.t6.v8;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        ImageReceiver imageReceiver = this.r;
        ImageReceiver imageReceiver2 = this.n;
        Paint paint = this.a;
        Paint paint2 = this.b;
        if (i10 != x02) {
            this.y = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageReceiver2.o1 = new PorterDuffColorFilter(x03, mode);
            imageReceiver.o1 = new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, i11, false), mode);
            paint2.setAlpha(100);
        }
        float f7 = this.f;
        float f10 = this.e;
        if (f7 != f10) {
            float f11 = this.h;
            float f12 = f7 + f11;
            this.f = f12;
            if (f11 > 0.0f && f12 > f10) {
                this.f = f10;
            } else if (f11 >= 0.0f || f12 >= f10) {
                invalidate();
            } else {
                this.f = f10;
            }
        }
        int L = org.telegram.messenger.i0.L(8.0f) + (getMeasuredHeight() / 2);
        float L2 = org.telegram.messenger.i0.L(1.0f);
        float L3 = org.telegram.messenger.i0.L(16.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        float f13 = L;
        float f14 = f13 - L2;
        float f15 = f13 + L2;
        rectF.set(L3, f14, getMeasuredWidth() - L3, f15);
        canvas.drawRoundRect(rectF, L2, L2, paint2);
        rectF.set(L3, f14, ((getMeasuredWidth() - (2.0f * L3)) * this.f) + L3, f15);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f14);
        if (this.e != 1.0f) {
            this.x = false;
        }
        if (this.x) {
            imageReceiver.h(canvas, null);
        } else {
            imageReceiver2.h(canvas, null);
        }
        if (this.e == 1.0f && !this.x && this.s.a0 == 0) {
            org.telegram.ui.Components.bi0 bi0Var = this.w;
            bi0Var.N(0, false, false);
            bi0Var.start();
            this.x = true;
        }
        canvas.restore();
        if (getAlpha() != 0.0f) {
            this.D = true;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
        int L = org.telegram.messenger.i0.L(15.0f);
        float f7 = L;
        int i12 = L * 2;
        this.n.y0(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.r.y0(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.D = false;
        }
        super.setAlpha(f7);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.D = false;
        }
        super.setVisibility(i10);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Components.bi0 bi0Var;
        org.telegram.ui.Components.bi0 bi0Var2 = this.s;
        if (bi0Var2 == null || (bi0Var = this.w) == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.v8, false);
        if (x02 != this.E || bi0Var2.getColorFilter() == null) {
            this.E = x02;
            bi0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            bi0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
