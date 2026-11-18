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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ex extends View implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public int F;
    public final Paint a;
    public final Paint b;
    public final int c;
    public final ArrayList d;
    public float e;
    public float f;
    public float h;
    public final ImageReceiver n;
    public final ImageReceiver r;
    public final org.telegram.ui.Components.mh0 s;
    public final org.telegram.ui.Components.mh0 w;
    public boolean x;
    public int y;

    public ex(Context context, int i7) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.r = imageReceiver2;
        this.c = i7;
        imageReceiver.y = true;
        imageReceiver2.y = true;
        org.telegram.ui.Components.mh0 mh0Var = new org.telegram.ui.Components.mh0(R.raw.download_progress, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.s = mh0Var;
        org.telegram.ui.Components.mh0 mh0Var2 = new org.telegram.ui.Components.mh0(R.raw.download_finish, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.w = mh0Var2;
        imageReceiver.w0(mh0Var);
        imageReceiver2.w0(mh0Var2);
        imageReceiver.W(1);
        mh0Var.K(1);
        mh0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i7 = this.c;
        ArrayList arrayList2 = org.telegram.messenger.a6.q(i7).H;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            hashMap.put(((dx) arrayList.get(i10)).c, (dx) arrayList.get(i10));
            org.telegram.messenger.a6.q(i7).v((org.telegram.messenger.y5) arrayList.get(i10));
            i10++;
        }
        arrayList.clear();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            String S0 = ((org.telegram.messenger.fj) arrayList2.get(i11)).S0();
            if (org.telegram.messenger.w7.G(i7).S(S0)) {
                dx dxVar = (dx) hashMap.get(S0);
                if (dxVar == null) {
                    dxVar = new dx(this, S0);
                }
                org.telegram.messenger.a6.q(i7).a(S0, null, dxVar);
                arrayList.add(dxVar);
            }
        }
        if (arrayList.size() != 0 || this.E) {
            return;
        }
        if (org.telegram.messenger.a6.q(i7).J.size() > 0) {
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
        org.telegram.messenger.tr.a0(this.c);
        int i7 = 0;
        long j3 = 0;
        long j10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 >= arrayList.size()) {
                break;
            }
            j3 += ((dx) arrayList.get(i7)).a;
            j10 += ((dx) arrayList.get(i7)).b;
            i7++;
        }
        if (j3 == 0) {
            this.e = 1.0f;
        } else {
            this.e = j10 / j3;
        }
        float f10 = this.e;
        if (f10 > 1.0f) {
            this.e = 1.0f;
        } else if (f10 < 0.0f) {
            this.e = 0.0f;
        }
        this.h = ((this.e - this.f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.d5) {
            a();
            b();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        org.telegram.messenger.ks.f(this.c).c(this, org.telegram.messenger.ks.d5);
        this.n.P();
        this.r.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = this.c;
            if (i7 >= size) {
                arrayList.clear();
                org.telegram.messenger.ks.f(i10).n(this, org.telegram.messenger.ks.d5);
                this.n.R();
                this.r.R();
                return;
            }
            org.telegram.messenger.a6.q(i10).v((org.telegram.messenger.y5) arrayList.get(i7));
            i7++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i7 = this.y;
        int i10 = org.telegram.ui.ActionBar.n6.v8;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        ImageReceiver imageReceiver = this.r;
        ImageReceiver imageReceiver2 = this.n;
        Paint paint = this.a;
        Paint paint2 = this.b;
        if (i7 != x02) {
            this.y = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageReceiver2.p1 = new PorterDuffColorFilter(x03, mode);
            imageReceiver.p1 = new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, i10, false), mode);
            paint2.setAlpha(100);
        }
        float f10 = this.f;
        float f11 = this.e;
        if (f10 != f11) {
            float f12 = this.h;
            float f13 = f10 + f12;
            this.f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f = f11;
            } else if (f12 >= 0.0f || f13 >= f11) {
                invalidate();
            } else {
                this.f = f11;
            }
        }
        int L = org.telegram.messenger.g0.L(8.0f) + (getMeasuredHeight() / 2);
        float L2 = org.telegram.messenger.g0.L(1.0f);
        float L3 = org.telegram.messenger.g0.L(16.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        float f14 = L;
        float f15 = f14 - L2;
        float f16 = f14 + L2;
        rectF.set(L3, f15, getMeasuredWidth() - L3, f16);
        canvas.drawRoundRect(rectF, L2, L2, paint2);
        rectF.set(L3, f15, ((getMeasuredWidth() - (2.0f * L3)) * this.f) + L3, f16);
        canvas.drawRoundRect(rectF, L2, L2, paint);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f15);
        if (this.e != 1.0f) {
            this.x = false;
        }
        if (this.x) {
            imageReceiver.h(canvas, null);
        } else {
            imageReceiver2.h(canvas, null);
        }
        if (this.e == 1.0f && !this.x && this.s.b0 == 0) {
            org.telegram.ui.Components.mh0 mh0Var = this.w;
            mh0Var.N(0, false, false);
            mh0Var.start();
            this.x = true;
        }
        canvas.restore();
        if (getAlpha() != 0.0f) {
            this.E = true;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
        int L = org.telegram.messenger.g0.L(15.0f);
        float f10 = L;
        int i11 = L * 2;
        this.n.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - i11);
        this.r.y0(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - i11);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        if (f10 == 0.0f) {
            this.E = false;
        }
        super.setAlpha(f10);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (i7 != 0) {
            this.E = false;
        }
        super.setVisibility(i7);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Components.mh0 mh0Var;
        org.telegram.ui.Components.mh0 mh0Var2 = this.s;
        if (mh0Var2 == null || (mh0Var = this.w) == null) {
            return;
        }
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.v8, false);
        if (x02 != this.F || mh0Var2.getColorFilter() == null) {
            this.F = x02;
            mh0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            mh0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
