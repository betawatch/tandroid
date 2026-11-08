package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class l20 extends View implements GestureDetector.OnGestureListener {
    public float D;
    public float E;
    public int F;
    public long G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final Scroller N;
    public final GestureDetector O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public k20 W;
    public final Paint a;
    public ValueAnimator a0;
    public final ArrayList b;
    public ValueAnimator b0;
    public final ArrayList c;
    public float c0;
    public final ArrayList d;
    public final ArrayList e;
    public int f;
    public long h;
    public final int n;
    public final int r;
    public final int s;
    public final int w;
    public int x;
    public float y;

    public l20(ContextThemeWrapper contextThemeWrapper, int i7) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.a = paint;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.D = 1.0f;
        this.E = 0.0f;
        this.L = -1;
        this.S = true;
        this.T = -1;
        this.V = true;
        this.O = new GestureDetector(contextThemeWrapper, this);
        this.N = new Scroller(contextThemeWrapper);
        this.n = org.telegram.messenger.g0.L(42.0f);
        this.r = org.telegram.messenger.g0.L(56.0f);
        this.w = org.telegram.messenger.g0.L(1.0f);
        this.s = i7;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.z1 = false;
        } else {
            ImageReceiver imageReceiver2 = (ImageReceiver) arrayList.get(0);
            arrayList.remove(0);
            imageReceiver = imageReceiver2;
        }
        this.c.add(imageReceiver);
        imageReceiver.d = ((org.telegram.ui.to0) this.W).a.T;
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.w * 2) + this.n) * this.f;
    }

    private int getMinScrollX() {
        return ((this.w * 2) + this.n) * (-((this.d.size() - this.f) - 1));
    }

    public final void a(int i7, boolean z9) {
        int i10;
        int i11;
        Object obj;
        Object obj2;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (!z9 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = false;
            this.y = 1.0f;
            this.D = 1.0f;
            this.E = 0.0f;
        }
        invalidate();
        if (getMeasuredWidth() != 0) {
            ArrayList arrayList3 = this.d;
            if (arrayList3.isEmpty()) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = getMeasuredWidth() / 2;
            int i12 = this.n;
            int i13 = measuredWidth2 - (i12 / 2);
            int i14 = this.w;
            if (z9) {
                int size = arrayList2.size();
                int i15 = 0;
                i10 = Integer.MIN_VALUE;
                i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (i15 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i15);
                    int i16 = imageReceiver.f;
                    int i17 = ((i12 + i14) * (i16 - this.f)) + i13 + i7;
                    if (i17 > measuredWidth || i17 + i12 < 0) {
                        arrayList.add(imageReceiver);
                        arrayList2.remove(i15);
                        size--;
                        i15--;
                    }
                    i11 = Math.min(i11, i16 - 1);
                    i10 = Math.max(i10, i16 + 1);
                    i15++;
                }
            } else {
                i10 = this.f;
                i11 = i10 - 1;
            }
            int i18 = this.r;
            int i19 = this.s;
            ArrayList arrayList4 = this.e;
            if (i10 != Integer.MIN_VALUE) {
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    int i20 = ((i12 + i14) * (i10 - this.f)) + i13 + i7;
                    if (i20 >= measuredWidth) {
                        break;
                    }
                    org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) arrayList3.get(i10);
                    ImageReceiver freeReceiver = getFreeReceiver();
                    int i21 = measuredWidth;
                    int i22 = i13;
                    freeReceiver.y0(i20, i19, i12, i18);
                    if (arrayList4.get(0) instanceof org.telegram.messenger.ij) {
                        obj2 = arrayList4.get(i10);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.qq0 qq0Var = ((org.telegram.ui.to0) this.W).a.i7;
                        obj2 = qq0Var != null ? qq0Var.g() : null;
                    } else {
                        obj2 = "avatar_" + ((org.telegram.ui.to0) this.W).a.y5;
                    }
                    freeReceiver.r0(null, null, hcVar, "80_80", null, 0L, null, obj2, 1);
                    freeReceiver.f = i10;
                    i10++;
                    measuredWidth = i21;
                    i13 = i22;
                }
            }
            int i23 = i13;
            if (i11 != Integer.MAX_VALUE) {
                while (i11 >= 0) {
                    int i24 = ((i12 + i14) * (i11 - this.f)) + i23 + i7 + i12;
                    if (i24 <= 0) {
                        break;
                    }
                    org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) arrayList3.get(i11);
                    ImageReceiver freeReceiver2 = getFreeReceiver();
                    freeReceiver2.y0(i24, i19, i12, i18);
                    if (arrayList4.get(0) instanceof org.telegram.messenger.ij) {
                        obj = arrayList4.get(i11);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.qq0 qq0Var2 = ((org.telegram.ui.to0) this.W).a.i7;
                        obj = qq0Var2 != null ? qq0Var2.g() : null;
                    } else {
                        obj = "avatar_" + ((org.telegram.ui.to0) this.W).a.y5;
                    }
                    freeReceiver2.r0(null, null, hcVar2, "80_80", null, 0L, null, obj, 1);
                    freeReceiver2.f = i11;
                    i11--;
                }
            }
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator == null || valueAnimator.isStarted()) {
                return;
            }
            this.a0.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i7;
        long j3;
        Object obj;
        int i10;
        boolean z9;
        TL_iv.PageBlock pageBlock;
        int i11;
        int i12;
        org.telegram.ui.uq0 uq0Var;
        boolean z10;
        int i13;
        int i14 = 0;
        if (this.R) {
            this.R = false;
            return;
        }
        PhotoViewer photoViewer = ((org.telegram.ui.to0) this.W).a;
        int i15 = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        org.telegram.ui.qq0 qq0Var = photoViewer.i7;
        List all = qq0Var != null ? qq0Var.getAll() : null;
        int i16 = ((org.telegram.ui.to0) this.W).a.w;
        this.U = false;
        long j10 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i15 >= arrayList.size()) {
                i15 = arrayList.size() - 1;
            }
            org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) arrayList.get(i15);
            int size = arrayList.size();
            this.U = true;
            i7 = 0;
            j3 = 0;
            i10 = size;
            z9 = false;
            obj = hcVar;
        } else if (arrayList2 == null || arrayList2.isEmpty()) {
            i7 = 0;
            j3 = 0;
            if (all == null || all.isEmpty()) {
                obj = null;
                i10 = 0;
                z9 = false;
            } else {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) all.get(i15);
                long j11 = pageBlock2.groupId;
                if (j11 != this.h) {
                    this.h = j11;
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (this.h != 0) {
                    this.U = true;
                    int size2 = all.size();
                    int i17 = i15;
                    i10 = 0;
                    TL_iv.PageBlock pageBlock3 = pageBlock2;
                    while (true) {
                        if (i17 >= size2) {
                            pageBlock = pageBlock3;
                            break;
                        }
                        pageBlock = pageBlock3;
                        if (((TL_iv.PageBlock) all.get(i17)).groupId != this.h) {
                            break;
                        }
                        i10++;
                        i17++;
                        pageBlock3 = pageBlock;
                    }
                    for (int i18 = i15 - 1; i18 >= 0 && ((TL_iv.PageBlock) all.get(i18)).groupId == this.h; i18--) {
                        i10++;
                    }
                    obj = pageBlock;
                } else {
                    i10 = 0;
                    obj = pageBlock2;
                }
            }
        } else {
            if (i15 >= arrayList2.size()) {
                i15 = arrayList2.size() - 1;
            }
            org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i15);
            long e12 = ijVar.e1();
            if (e12 != this.h) {
                this.h = e12;
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z11 = arrayList2.size() > 1 && (uq0Var = ((org.telegram.ui.to0) this.W).a.d) != null && uq0Var.L();
            if (this.h != 0 || z11) {
                this.U = true;
                int min = Math.min(i15 + 10, arrayList2.size());
                i11 = 0;
                int i19 = i15;
                while (true) {
                    if (i19 >= min) {
                        j3 = j10;
                        break;
                    }
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList2.get(i19);
                    if (i16 == 0 && !z11) {
                        j3 = j10;
                        if (ijVar2.e1() != this.h) {
                            break;
                        }
                    } else {
                        j3 = j10;
                    }
                    i11++;
                    i19++;
                    j10 = j3;
                }
                int max = Math.max(i15 - 10, 0);
                int i20 = i15 - 1;
                while (true) {
                    if (i20 < max) {
                        i7 = i14;
                        i12 = i15;
                        break;
                    }
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList2.get(i20);
                    if (i16 == 0 && !z11) {
                        i7 = i14;
                        i12 = i15;
                        if (ijVar3.e1() != this.h) {
                            break;
                        }
                    } else {
                        i7 = i14;
                        i12 = i15;
                    }
                    i11++;
                    i20--;
                    i14 = i7;
                    i15 = i12;
                }
            } else {
                i11 = 0;
                i7 = 0;
                i12 = i15;
                j3 = 0;
            }
            i10 = i11;
            i15 = i12;
            obj = ijVar;
        }
        if (obj == null) {
            return;
        }
        boolean z12 = this.S;
        ArrayList arrayList3 = this.d;
        if (z12) {
            if (this.U) {
                ValueAnimator valueAnimator = this.b0;
                if (valueAnimator != null) {
                    this.b0 = null;
                    valueAnimator.cancel();
                }
                float f10 = this.c0;
                if (f10 < 1.0f && this.a0 == null) {
                    final int i21 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 1.0f);
                    this.a0 = ofFloat;
                    ofFloat.setDuration((long) ((1.0f - this.c0) * 200.0f));
                    this.a0.addListener(new j20(this, i21));
                    this.a0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.i20
                        public final /* synthetic */ l20 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i21) {
                                case 0:
                                    l20 l20Var = this.b;
                                    l20Var.getClass();
                                    l20Var.c0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    l20Var.invalidate();
                                    break;
                                default:
                                    l20 l20Var2 = this.b;
                                    l20Var2.getClass();
                                    l20Var2.c0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    l20Var2.invalidate();
                                    break;
                            }
                        }
                    });
                }
            } else {
                ValueAnimator valueAnimator2 = this.a0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.a0 = null;
                }
                if (this.c0 > 0.0f && arrayList3.size() > 1) {
                    if (this.b0 == null) {
                        float[] fArr = new float[2];
                        fArr[i7] = this.c0;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
                        this.b0 = ofFloat2;
                        ofFloat2.setDuration((long) (this.c0 * 200.0f));
                        final int i22 = i7;
                        this.b0.addListener(new j20(this, i22));
                        this.b0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.i20
                            public final /* synthetic */ l20 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (i22) {
                                    case 0:
                                        l20 l20Var = this.b;
                                        l20Var.getClass();
                                        l20Var.c0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        l20Var.invalidate();
                                        break;
                                    default:
                                        l20 l20Var2 = this.b;
                                        l20Var2.getClass();
                                        l20Var2.c0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        l20Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        this.b0.start();
                        return;
                    }
                    return;
                }
            }
        }
        ArrayList arrayList4 = this.e;
        if (!z9) {
            if (i10 == arrayList3.size() && arrayList4.contains(obj)) {
                int indexOf = arrayList4.indexOf(obj);
                int i23 = this.f;
                if (i23 != indexOf && indexOf != -1) {
                    boolean z13 = this.I;
                    if (!z13 && !this.H && (indexOf == i23 - 1 || indexOf == i23 + 1)) {
                        this.M = true;
                        z13 = true;
                    }
                    int i24 = this.w;
                    int i25 = this.n;
                    if (z13) {
                        this.L = indexOf;
                        this.F = indexOf;
                        this.J = (i25 + i24) * (i23 - indexOf);
                        this.H = true;
                        this.I = false;
                        this.G = System.currentTimeMillis();
                        invalidate();
                        z10 = false;
                    } else {
                        z10 = false;
                        a((i25 + i24) * (i23 - indexOf), true);
                        this.f = indexOf;
                        this.H = false;
                    }
                    this.x = z10 ? 1 : 0;
                }
            } else {
                z10 = false;
                z9 = true;
            }
            if (z9) {
                return;
            }
            int size3 = arrayList3.size();
            this.I = z10;
            arrayList3.clear();
            arrayList4.clear();
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList4.addAll(arrayList);
                arrayList3.addAll(arrayList);
                this.f = i15;
                this.L = -1;
                this.M = z10;
            } else if (arrayList2 == null || arrayList2.isEmpty()) {
                int i26 = i15;
                if (all != null && !all.isEmpty() && this.h != j3) {
                    int size4 = all.size();
                    for (int i27 = i26; i27 < size4; i27++) {
                        TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) all.get(i27);
                        if (pageBlock4.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(pageBlock4);
                        arrayList3.add(org.telegram.messenger.hc.f(pageBlock4.thumb, pageBlock4.thumbObject));
                    }
                    int i28 = 0;
                    this.f = 0;
                    this.L = -1;
                    this.M = false;
                    int i29 = i26 - 1;
                    while (i29 >= 0) {
                        TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) all.get(i29);
                        if (pageBlock5.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(i28, pageBlock5);
                        arrayList3.add(i28, org.telegram.messenger.hc.f(pageBlock5.thumb, pageBlock5.thumbObject));
                        this.f++;
                        i29--;
                        i28 = 0;
                    }
                }
            } else {
                org.telegram.ui.uq0 uq0Var2 = ((org.telegram.ui.to0) this.W).a.d;
                boolean z14 = (uq0Var2 != null && uq0Var2.L()) && arrayList2.size() > 1;
                if (this.h != j3 || z14 || i16 != 0) {
                    int min2 = Math.min(i15 + 10, arrayList2.size());
                    int i30 = i15;
                    while (true) {
                        if (i30 >= min2) {
                            i13 = i15;
                            break;
                        }
                        org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) arrayList2.get(i30);
                        if (i16 == 0 && !z14) {
                            i13 = i15;
                            if (ijVar4.e1() != this.h) {
                                break;
                            }
                        } else {
                            i13 = i15;
                        }
                        arrayList4.add(ijVar4);
                        arrayList3.add(org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(ijVar4.n0, 56, true, null, false), ijVar4.l0));
                        i30++;
                        i15 = i13;
                    }
                    this.f = 0;
                    this.L = -1;
                    this.M = false;
                    int max2 = Math.max(i13 - 10, 0);
                    for (int i31 = i13 - 1; i31 >= max2; i31--) {
                        org.telegram.messenger.ij ijVar5 = (org.telegram.messenger.ij) arrayList2.get(i31);
                        if (i16 == 0 && !z14 && ijVar5.e1() != this.h) {
                            break;
                        }
                        arrayList4.add(0, ijVar5);
                        arrayList3.add(0, org.telegram.messenger.hc.f(org.telegram.messenger.w7.w(ijVar5.n0, 56, true, null, false), ijVar5.l0));
                        this.f++;
                    }
                }
            }
            if (arrayList3.size() == 1) {
                arrayList3.clear();
                arrayList4.clear();
            }
            if (arrayList3.size() != size3) {
                requestLayout();
            }
            a(0, false);
            return;
        }
        z10 = false;
        if (z9) {
        }
    }

    public final boolean c() {
        if (!this.U || this.b0 != null) {
            return false;
        }
        if (this.c0 > 0.0f || !this.V) {
            return true;
        }
        ValueAnimator valueAnimator = this.a0;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public final void d() {
        this.U = false;
        if (this.S) {
            this.c0 = 0.0f;
        }
    }

    public final void e() {
        this.P = false;
        Scroller scroller = this.N;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i7 = this.T;
        if (i7 >= 0 && i7 < this.e.size()) {
            this.Q = true;
            this.M = false;
            int i10 = this.T;
            this.L = i10;
            this.F = i10;
            this.J = (this.n + this.w) * (this.f - i10);
            this.K = this.x;
            this.y = 1.0f;
            this.T = -1;
            k20 k20Var = this.W;
            if (k20Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.to0) k20Var).a;
                if (PhotoViewer.O2(photoViewer.S4)) {
                    photoViewer.X2 = true;
                    photoViewer.S1(true);
                    photoViewer.u0(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i7;
        int i10;
        int i11;
        int i12 = this.x;
        int abs = Math.abs(i12);
        int i13 = this.n;
        int i14 = this.w;
        int i15 = (i13 / 2) + i14;
        int i16 = -1;
        if (abs > i15) {
            if (i12 > 0) {
                i10 = i12 - i15;
                i11 = 1;
            } else {
                i10 = i12 + i15;
                i11 = -1;
            }
            i7 = (i10 / ((i14 * 2) + i13)) + i11;
        } else {
            i7 = 0;
        }
        this.T = this.f - i7;
        PhotoViewer photoViewer = ((org.telegram.ui.to0) this.W).a;
        int i17 = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        org.telegram.ui.qq0 qq0Var = photoViewer.i7;
        List all = qq0Var != null ? qq0Var.getAll() : null;
        int i18 = this.T;
        if (i17 != i18 && i18 >= 0 && i18 < this.d.size()) {
            Object obj = this.e.get(this.T);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i16 = arrayList2.indexOf((org.telegram.messenger.ij) obj);
            } else if (all != null && !all.isEmpty()) {
                i16 = all.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i16 = arrayList.indexOf((org.telegram.messenger.hc) obj);
            }
            if (i16 >= 0) {
                this.R = true;
                ((org.telegram.ui.to0) this.W).a(i16);
            }
        }
        if (!this.P) {
            this.P = true;
            this.Q = false;
        }
        a(this.x, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.N;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.L = -1;
        this.M = false;
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z9 = this.U;
        ArrayList arrayList = this.c;
        if (z9 || !arrayList.isEmpty()) {
            float f10 = this.c0;
            if (!this.V) {
                f10 = this.U ? 1.0f : 0.0f;
            }
            Paint paint = this.a;
            paint.setAlpha((int) (f10 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i10 = this.x;
            int i11 = this.n;
            float f11 = i11;
            int i12 = (int) (f11 * 2.0f);
            int L = org.telegram.messenger.g0.L(8.0f);
            int i13 = this.f;
            ArrayList arrayList2 = this.d;
            org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) arrayList2.get(i13);
            int i14 = this.r;
            int min = Math.min(i12, (hcVar == null || (photoSize2 = hcVar.k) == null) ? i14 : Math.max(i11, (int) ((i14 / photoSize2.h) * photoSize2.w)));
            float f12 = L * 2;
            float f13 = this.D;
            int i15 = ((int) ((min - i11) * f13)) + i11 + ((int) (f12 * f13));
            int i16 = this.F;
            if (i16 < 0 || i16 >= arrayList2.size()) {
                i14 = i11;
            } else {
                org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) arrayList2.get(this.F);
                if (hcVar2 != null && (photoSize = hcVar2.k) != null) {
                    i14 = Math.max(i11, (int) ((i14 / photoSize.h) * photoSize.w));
                }
            }
            int min2 = Math.min(i12, i14);
            float f14 = this.E;
            int i17 = (int) (((((min2 + r10) - i11) / 2) * f14 * (this.F > this.f ? -1 : 1)) + i10);
            int i18 = ((int) ((min2 - i11) * f14)) + i11 + ((int) (f12 * f14));
            int measuredWidth = (getMeasuredWidth() - i15) / 2;
            int i19 = 0;
            while (i19 < size) {
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i19);
                int i20 = imageReceiver.f;
                int i21 = this.f;
                if (i20 == i21) {
                    imageReceiver.K0 = (r15 / 2) + measuredWidth + i17;
                    imageReceiver.M0 = i15 - r15;
                    i7 = size;
                } else {
                    int i22 = this.F;
                    i7 = size;
                    int i23 = this.w;
                    if (i22 < i21) {
                        if (i20 >= i21) {
                            imageReceiver.K0 = ((i23 + i11) * ((i20 - i21) - 1)) + measuredWidth + i15 + i23 + i17;
                        } else if (i20 <= i22) {
                            imageReceiver.K0 = ((((i11 + i23) * ((i20 - i21) + 1)) + measuredWidth) - (i23 + i18)) + i17;
                        } else {
                            imageReceiver.K0 = ((i23 + i11) * (i20 - i21)) + measuredWidth + i17;
                        }
                    } else if (i20 < i21) {
                        imageReceiver.K0 = ((i23 + i11) * (i20 - i21)) + measuredWidth + i17;
                    } else if (i20 <= i22) {
                        imageReceiver.K0 = ((i23 + i11) * ((i20 - i21) - 1)) + measuredWidth + i15 + i23 + i17;
                    } else {
                        imageReceiver.K0 = i23 + i18 + ((i11 + i23) * ((i20 - i21) - 2)) + measuredWidth + i15 + i23 + i17;
                    }
                    if (i20 == i22) {
                        imageReceiver.M0 = i18 - r10;
                        imageReceiver.K0 = (int) (imageReceiver.K0 + (r10 / 2));
                    } else {
                        imageReceiver.M0 = f11;
                    }
                }
                imageReceiver.setAlpha(this.c0);
                imageReceiver.J0(org.telegram.messenger.g0.L(2.0f));
                imageReceiver.h(canvas, null);
                i19++;
                size = i7;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.G;
            if (j3 > 17) {
                j3 = 17;
            }
            this.G = currentTimeMillis;
            int i24 = this.L;
            if (i24 >= 0) {
                float f15 = this.y;
                if (f15 > 0.0f) {
                    float f16 = j3;
                    float f17 = f15 - (f16 / (this.M ? 100.0f : 200.0f));
                    this.y = f17;
                    if (i24 == this.f) {
                        float f18 = this.D;
                        if (f18 < 1.0f) {
                            float f19 = (f16 / 200.0f) + f18;
                            this.D = f19;
                            if (f19 > 1.0f) {
                                this.D = 1.0f;
                            }
                        }
                        this.x = this.K + ((int) Math.ceil(this.D * (this.J - r1)));
                    } else {
                        xq xqVar = xq.g;
                        this.E = xqVar.getInterpolation(1.0f - f17);
                        if (this.Q) {
                            float f20 = this.D;
                            if (f20 > 0.0f) {
                                float f21 = f20 - (f16 / 200.0f);
                                this.D = f21;
                                if (f21 < 0.0f) {
                                    this.D = 0.0f;
                                }
                            }
                            this.x = this.K + ((int) Math.ceil(r5 * (this.J - r1)));
                        } else {
                            this.D = xqVar.getInterpolation(this.y);
                            this.x = (int) Math.ceil(this.E * this.J);
                        }
                    }
                    if (this.y <= 0.0f) {
                        this.f = this.L;
                        this.y = 1.0f;
                        this.D = 1.0f;
                        this.E = 0.0f;
                        this.H = false;
                        this.Q = false;
                        this.x = 0;
                        this.L = -1;
                        this.M = false;
                    }
                }
                a(this.x, true);
                invalidate();
            }
            if (this.P) {
                float f22 = this.D;
                if (f22 > 0.0f) {
                    float f23 = f22 - (j3 / 200.0f);
                    this.D = f23;
                    if (f23 < 0.0f) {
                        this.D = 0.0f;
                    }
                    invalidate();
                }
            }
            Scroller scroller = this.N;
            if (scroller.isFinished()) {
                return;
            }
            if (scroller.computeScrollOffset()) {
                this.x = scroller.getCurrX();
                f();
                invalidate();
            }
            if (scroller.isFinished()) {
                e();
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        Scroller scroller = this.N;
        scroller.abortAnimation();
        if (this.d.size() < 10) {
            return false;
        }
        scroller.fling(this.x, 0, Math.round(f10), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a(0, false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.x = (int) (this.x - f10);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i7 = this.x;
        if (i7 < minScrollX) {
            this.x = minScrollX;
        } else if (i7 > maxScrollX) {
            this.x = maxScrollX;
        }
        f();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PhotoViewer photoViewer = ((org.telegram.ui.to0) this.W).a;
        int i7 = photoViewer.O4;
        ArrayList arrayList = photoViewer.Z6;
        ArrayList arrayList2 = photoViewer.X6;
        org.telegram.ui.qq0 qq0Var = photoViewer.i7;
        List all = qq0Var != null ? qq0Var.getAll() : null;
        e();
        ArrayList arrayList3 = this.c;
        int size = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i10);
            if (imageReceiver.O(motionEvent.getX(), motionEvent.getY())) {
                int i11 = imageReceiver.f;
                if (i11 >= 0) {
                    ArrayList arrayList4 = this.e;
                    if (i11 < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((org.telegram.messenger.ij) arrayList4.get(i11));
                            if (i7 != indexOf) {
                                this.y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.to0) this.W).a(indexOf);
                                return false;
                            }
                        } else if (all != null && !all.isEmpty()) {
                            int indexOf2 = all.indexOf((TL_iv.PageBlock) arrayList4.get(i11));
                            if (i7 != indexOf2) {
                                this.y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.to0) this.W).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((org.telegram.messenger.hc) arrayList4.get(i11));
                            if (i7 != indexOf3) {
                                this.y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.to0) this.W).a(indexOf3);
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
            i10++;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.d.isEmpty() && getAlpha() == 1.0f) {
            r1 = this.O.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
            if (this.P && motionEvent.getAction() == 1 && this.N.isFinished()) {
                e();
            }
        }
        return r1;
    }

    public void setAnimateBackground(boolean z9) {
        this.V = z9;
    }

    public void setAnimationsEnabled(boolean z9) {
        if (this.S != z9) {
            this.S = z9;
            if (z9) {
                return;
            }
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.a0 = null;
            }
            ValueAnimator valueAnimator2 = this.b0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.b0 = null;
            }
            this.c0 = 0.0f;
            invalidate();
        }
    }

    public void setDelegate(k20 k20Var) {
        this.W = k20Var;
    }

    public void setMoveProgress(float f10) {
        if (this.P || this.L >= 0) {
            return;
        }
        if (f10 > 0.0f) {
            this.F = this.f - 1;
        } else {
            this.F = this.f + 1;
        }
        int i7 = this.F;
        ArrayList arrayList = this.d;
        if (i7 < 0 || i7 >= arrayList.size()) {
            this.D = 1.0f;
        } else {
            this.D = 1.0f - Math.abs(f10);
        }
        this.E = 1.0f - this.D;
        this.H = f10 != 0.0f;
        invalidate();
        if (arrayList.isEmpty()) {
            return;
        }
        if (f10 >= 0.0f || this.f != arrayList.size() - 1) {
            if (f10 <= 0.0f || this.f != 0) {
                int i10 = (int) (f10 * (this.n + this.w));
                this.x = i10;
                a(i10, true);
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
