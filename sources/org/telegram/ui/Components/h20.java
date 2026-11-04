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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h20 extends View implements GestureDetector.OnGestureListener {
    public float E;
    public float F;
    public int G;
    public long H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Scroller O;
    public final GestureDetector P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public final Paint a;
    public g20 a0;
    public final ArrayList b;
    public ValueAnimator b0;
    public final ArrayList c;
    public ValueAnimator c0;
    public final ArrayList d;
    public float d0;
    public final ArrayList e;
    public int f;
    public long h;
    public final int n;
    public final int r;
    public final int s;
    public final int w;
    public int x;
    public float y;

    public h20(ContextThemeWrapper contextThemeWrapper, int i3) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.a = paint;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.E = 1.0f;
        this.F = 0.0f;
        this.M = -1;
        this.T = true;
        this.U = -1;
        this.W = true;
        this.P = new GestureDetector(contextThemeWrapper, this);
        this.O = new Scroller(contextThemeWrapper);
        this.n = org.telegram.messenger.g0.L(42.0f);
        this.r = org.telegram.messenger.g0.L(56.0f);
        this.w = org.telegram.messenger.g0.L(1.0f);
        this.s = i3;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.A1 = false;
        } else {
            ImageReceiver imageReceiver2 = (ImageReceiver) arrayList.get(0);
            arrayList.remove(0);
            imageReceiver = imageReceiver2;
        }
        this.c.add(imageReceiver);
        imageReceiver.d = ((org.telegram.ui.ko0) this.a0).a.U;
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.w * 2) + this.n) * this.f;
    }

    private int getMinScrollX() {
        return ((this.w * 2) + this.n) * (-((this.d.size() - this.f) - 1));
    }

    public final void a(int i3, boolean z10) {
        int i10;
        int i11;
        Object obj;
        Object obj2;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (!z10 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.I = false;
            this.y = 1.0f;
            this.E = 1.0f;
            this.F = 0.0f;
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
            if (z10) {
                int size = arrayList2.size();
                int i15 = 0;
                i10 = Integer.MIN_VALUE;
                i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (i15 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i15);
                    int i16 = imageReceiver.f;
                    int i17 = ((i12 + i14) * (i16 - this.f)) + i13 + i3;
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
                    int i20 = ((i12 + i14) * (i10 - this.f)) + i13 + i3;
                    if (i20 >= measuredWidth) {
                        break;
                    }
                    org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) arrayList3.get(i10);
                    ImageReceiver freeReceiver = getFreeReceiver();
                    int i21 = measuredWidth;
                    int i22 = i13;
                    freeReceiver.y0(i20, i19, i12, i18);
                    if (arrayList4.get(0) instanceof org.telegram.messenger.zi) {
                        obj2 = arrayList4.get(i10);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.hq0 hq0Var = ((org.telegram.ui.ko0) this.a0).a.k7;
                        obj2 = hq0Var != null ? hq0Var.g() : null;
                    } else {
                        obj2 = "avatar_" + ((org.telegram.ui.ko0) this.a0).a.A5;
                    }
                    freeReceiver.r0(null, null, acVar, "80_80", null, 0L, null, obj2, 1);
                    freeReceiver.f = i10;
                    i10++;
                    measuredWidth = i21;
                    i13 = i22;
                }
            }
            int i23 = i13;
            if (i11 != Integer.MAX_VALUE) {
                while (i11 >= 0) {
                    int i24 = ((i12 + i14) * (i11 - this.f)) + i23 + i3 + i12;
                    if (i24 <= 0) {
                        break;
                    }
                    org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) arrayList3.get(i11);
                    ImageReceiver freeReceiver2 = getFreeReceiver();
                    freeReceiver2.y0(i24, i19, i12, i18);
                    if (arrayList4.get(0) instanceof org.telegram.messenger.zi) {
                        obj = arrayList4.get(i11);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.hq0 hq0Var2 = ((org.telegram.ui.ko0) this.a0).a.k7;
                        obj = hq0Var2 != null ? hq0Var2.g() : null;
                    } else {
                        obj = "avatar_" + ((org.telegram.ui.ko0) this.a0).a.A5;
                    }
                    freeReceiver2.r0(null, null, acVar2, "80_80", null, 0L, null, obj, 1);
                    freeReceiver2.f = i11;
                    i11--;
                }
            }
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator == null || valueAnimator.isStarted()) {
                return;
            }
            this.b0.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i3;
        long j10;
        Object obj;
        int i10;
        boolean z10;
        TL_iv.PageBlock pageBlock;
        int i11;
        int i12;
        org.telegram.ui.kq0 kq0Var;
        boolean z11;
        int i13;
        int i14 = 0;
        if (this.S) {
            this.S = false;
            return;
        }
        PhotoViewer photoViewer = ((org.telegram.ui.ko0) this.a0).a;
        int i15 = photoViewer.Q4;
        ArrayList arrayList = photoViewer.b7;
        ArrayList arrayList2 = photoViewer.Z6;
        org.telegram.ui.hq0 hq0Var = photoViewer.k7;
        List all = hq0Var != null ? hq0Var.getAll() : null;
        int i16 = ((org.telegram.ui.ko0) this.a0).a.w;
        this.V = false;
        long j11 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i15 >= arrayList.size()) {
                i15 = arrayList.size() - 1;
            }
            org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) arrayList.get(i15);
            int size = arrayList.size();
            this.V = true;
            i3 = 0;
            j10 = 0;
            i10 = size;
            z10 = false;
            obj = acVar;
        } else if (arrayList2 == null || arrayList2.isEmpty()) {
            i3 = 0;
            j10 = 0;
            if (all == null || all.isEmpty()) {
                obj = null;
                i10 = 0;
                z10 = false;
            } else {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) all.get(i15);
                long j12 = pageBlock2.groupId;
                if (j12 != this.h) {
                    this.h = j12;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.h != 0) {
                    this.V = true;
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
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i15);
            long e12 = ziVar.e1();
            if (e12 != this.h) {
                this.h = e12;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = arrayList2.size() > 1 && (kq0Var = ((org.telegram.ui.ko0) this.a0).a.d) != null && kq0Var.L();
            if (this.h != 0 || z12) {
                this.V = true;
                int min = Math.min(i15 + 10, arrayList2.size());
                i11 = 0;
                int i19 = i15;
                while (true) {
                    if (i19 >= min) {
                        j10 = j11;
                        break;
                    }
                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i19);
                    if (i16 == 0 && !z12) {
                        j10 = j11;
                        if (ziVar2.e1() != this.h) {
                            break;
                        }
                    } else {
                        j10 = j11;
                    }
                    i11++;
                    i19++;
                    j11 = j10;
                }
                int max = Math.max(i15 - 10, 0);
                int i20 = i15 - 1;
                while (true) {
                    if (i20 < max) {
                        i3 = i14;
                        i12 = i15;
                        break;
                    }
                    org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList2.get(i20);
                    if (i16 == 0 && !z12) {
                        i3 = i14;
                        i12 = i15;
                        if (ziVar3.e1() != this.h) {
                            break;
                        }
                    } else {
                        i3 = i14;
                        i12 = i15;
                    }
                    i11++;
                    i20--;
                    i14 = i3;
                    i15 = i12;
                }
            } else {
                i11 = 0;
                i3 = 0;
                i12 = i15;
                j10 = 0;
            }
            i10 = i11;
            i15 = i12;
            obj = ziVar;
        }
        if (obj == null) {
            return;
        }
        boolean z13 = this.T;
        ArrayList arrayList3 = this.d;
        if (z13) {
            if (this.V) {
                ValueAnimator valueAnimator = this.c0;
                if (valueAnimator != null) {
                    this.c0 = null;
                    valueAnimator.cancel();
                }
                float f10 = this.d0;
                if (f10 < 1.0f && this.b0 == null) {
                    final int i21 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 1.0f);
                    this.b0 = ofFloat;
                    ofFloat.setDuration((long) ((1.0f - this.d0) * 200.0f));
                    this.b0.addListener(new f20(this, i21));
                    this.b0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.e20
                        public final /* synthetic */ h20 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i21) {
                                case 0:
                                    h20 h20Var = this.b;
                                    h20Var.getClass();
                                    h20Var.d0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    h20Var.invalidate();
                                    break;
                                default:
                                    h20 h20Var2 = this.b;
                                    h20Var2.getClass();
                                    h20Var2.d0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    h20Var2.invalidate();
                                    break;
                            }
                        }
                    });
                }
            } else {
                ValueAnimator valueAnimator2 = this.b0;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.b0 = null;
                }
                if (this.d0 > 0.0f && arrayList3.size() > 1) {
                    if (this.c0 == null) {
                        float[] fArr = new float[2];
                        fArr[i3] = this.d0;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
                        this.c0 = ofFloat2;
                        ofFloat2.setDuration((long) (this.d0 * 200.0f));
                        final int i22 = i3;
                        this.c0.addListener(new f20(this, i22));
                        this.c0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.e20
                            public final /* synthetic */ h20 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (i22) {
                                    case 0:
                                        h20 h20Var = this.b;
                                        h20Var.getClass();
                                        h20Var.d0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        h20Var.invalidate();
                                        break;
                                    default:
                                        h20 h20Var2 = this.b;
                                        h20Var2.getClass();
                                        h20Var2.d0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        h20Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        this.c0.start();
                        return;
                    }
                    return;
                }
            }
        }
        ArrayList arrayList4 = this.e;
        if (!z10) {
            if (i10 == arrayList3.size() && arrayList4.contains(obj)) {
                int indexOf = arrayList4.indexOf(obj);
                int i23 = this.f;
                if (i23 != indexOf && indexOf != -1) {
                    boolean z14 = this.J;
                    if (!z14 && !this.I && (indexOf == i23 - 1 || indexOf == i23 + 1)) {
                        this.N = true;
                        z14 = true;
                    }
                    int i24 = this.w;
                    int i25 = this.n;
                    if (z14) {
                        this.M = indexOf;
                        this.G = indexOf;
                        this.K = (i25 + i24) * (i23 - indexOf);
                        this.I = true;
                        this.J = false;
                        this.H = System.currentTimeMillis();
                        invalidate();
                        z11 = false;
                    } else {
                        z11 = false;
                        a((i25 + i24) * (i23 - indexOf), true);
                        this.f = indexOf;
                        this.I = false;
                    }
                    this.x = z11 ? 1 : 0;
                }
            } else {
                z11 = false;
                z10 = true;
            }
            if (z10) {
                return;
            }
            int size3 = arrayList3.size();
            this.J = z11;
            arrayList3.clear();
            arrayList4.clear();
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList4.addAll(arrayList);
                arrayList3.addAll(arrayList);
                this.f = i15;
                this.M = -1;
                this.N = z11;
            } else if (arrayList2 == null || arrayList2.isEmpty()) {
                int i26 = i15;
                if (all != null && !all.isEmpty() && this.h != j10) {
                    int size4 = all.size();
                    for (int i27 = i26; i27 < size4; i27++) {
                        TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) all.get(i27);
                        if (pageBlock4.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(pageBlock4);
                        arrayList3.add(org.telegram.messenger.ac.f(pageBlock4.thumb, pageBlock4.thumbObject));
                    }
                    int i28 = 0;
                    this.f = 0;
                    this.M = -1;
                    this.N = false;
                    int i29 = i26 - 1;
                    while (i29 >= 0) {
                        TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) all.get(i29);
                        if (pageBlock5.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(i28, pageBlock5);
                        arrayList3.add(i28, org.telegram.messenger.ac.f(pageBlock5.thumb, pageBlock5.thumbObject));
                        this.f++;
                        i29--;
                        i28 = 0;
                    }
                }
            } else {
                org.telegram.ui.kq0 kq0Var2 = ((org.telegram.ui.ko0) this.a0).a.d;
                boolean z15 = (kq0Var2 != null && kq0Var2.L()) && arrayList2.size() > 1;
                if (this.h != j10 || z15 || i16 != 0) {
                    int min2 = Math.min(i15 + 10, arrayList2.size());
                    int i30 = i15;
                    while (true) {
                        if (i30 >= min2) {
                            i13 = i15;
                            break;
                        }
                        org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) arrayList2.get(i30);
                        if (i16 == 0 && !z15) {
                            i13 = i15;
                            if (ziVar4.e1() != this.h) {
                                break;
                            }
                        } else {
                            i13 = i15;
                        }
                        arrayList4.add(ziVar4);
                        arrayList3.add(org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(ziVar4.n0, 56, true, null, false), ziVar4.l0));
                        i30++;
                        i15 = i13;
                    }
                    this.f = 0;
                    this.M = -1;
                    this.N = false;
                    int max2 = Math.max(i13 - 10, 0);
                    for (int i31 = i13 - 1; i31 >= max2; i31--) {
                        org.telegram.messenger.zi ziVar5 = (org.telegram.messenger.zi) arrayList2.get(i31);
                        if (i16 == 0 && !z15 && ziVar5.e1() != this.h) {
                            break;
                        }
                        arrayList4.add(0, ziVar5);
                        arrayList3.add(0, org.telegram.messenger.ac.f(org.telegram.messenger.w7.w(ziVar5.n0, 56, true, null, false), ziVar5.l0));
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
        z11 = false;
        if (z10) {
        }
    }

    public final boolean c() {
        if (!this.V || this.c0 != null) {
            return false;
        }
        if (this.d0 > 0.0f || !this.W) {
            return true;
        }
        ValueAnimator valueAnimator = this.b0;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public final void d() {
        this.V = false;
        if (this.T) {
            this.d0 = 0.0f;
        }
    }

    public final void e() {
        this.Q = false;
        Scroller scroller = this.O;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i3 = this.U;
        if (i3 >= 0 && i3 < this.e.size()) {
            this.R = true;
            this.N = false;
            int i10 = this.U;
            this.M = i10;
            this.G = i10;
            this.K = (this.n + this.w) * (this.f - i10);
            this.L = this.x;
            this.y = 1.0f;
            this.U = -1;
            g20 g20Var = this.a0;
            if (g20Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.ko0) g20Var).a;
                if (PhotoViewer.U2(photoViewer.U4)) {
                    photoViewer.Z2 = true;
                    photoViewer.X1(true);
                    photoViewer.C0(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i3;
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
            i3 = (i10 / ((i14 * 2) + i13)) + i11;
        } else {
            i3 = 0;
        }
        this.U = this.f - i3;
        PhotoViewer photoViewer = ((org.telegram.ui.ko0) this.a0).a;
        int i17 = photoViewer.Q4;
        ArrayList arrayList = photoViewer.b7;
        ArrayList arrayList2 = photoViewer.Z6;
        org.telegram.ui.hq0 hq0Var = photoViewer.k7;
        List all = hq0Var != null ? hq0Var.getAll() : null;
        int i18 = this.U;
        if (i17 != i18 && i18 >= 0 && i18 < this.d.size()) {
            Object obj = this.e.get(this.U);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i16 = arrayList2.indexOf((org.telegram.messenger.zi) obj);
            } else if (all != null && !all.isEmpty()) {
                i16 = all.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i16 = arrayList.indexOf((org.telegram.messenger.ac) obj);
            }
            if (i16 >= 0) {
                this.S = true;
                ((org.telegram.ui.ko0) this.a0).a(i16);
            }
        }
        if (!this.Q) {
            this.Q = true;
            this.R = false;
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
        Scroller scroller = this.O;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.M = -1;
        this.N = false;
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z10 = this.V;
        ArrayList arrayList = this.c;
        if (z10 || !arrayList.isEmpty()) {
            float f10 = this.d0;
            if (!this.W) {
                f10 = this.V ? 1.0f : 0.0f;
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
            org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) arrayList2.get(i13);
            int i14 = this.r;
            int min = Math.min(i12, (acVar == null || (photoSize2 = acVar.k) == null) ? i14 : Math.max(i11, (int) ((i14 / photoSize2.h) * photoSize2.w)));
            float f12 = L * 2;
            float f13 = this.E;
            int i15 = ((int) ((min - i11) * f13)) + i11 + ((int) (f12 * f13));
            int i16 = this.G;
            if (i16 < 0 || i16 >= arrayList2.size()) {
                i14 = i11;
            } else {
                org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) arrayList2.get(this.G);
                if (acVar2 != null && (photoSize = acVar2.k) != null) {
                    i14 = Math.max(i11, (int) ((i14 / photoSize.h) * photoSize.w));
                }
            }
            int min2 = Math.min(i12, i14);
            float f14 = this.F;
            int i17 = (int) (((((min2 + r10) - i11) / 2) * f14 * (this.G > this.f ? -1 : 1)) + i10);
            int i18 = ((int) ((min2 - i11) * f14)) + i11 + ((int) (f12 * f14));
            int measuredWidth = (getMeasuredWidth() - i15) / 2;
            int i19 = 0;
            while (i19 < size) {
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i19);
                int i20 = imageReceiver.f;
                int i21 = this.f;
                if (i20 == i21) {
                    imageReceiver.L0 = (r15 / 2) + measuredWidth + i17;
                    imageReceiver.N0 = i15 - r15;
                    i3 = size;
                } else {
                    int i22 = this.G;
                    i3 = size;
                    int i23 = this.w;
                    if (i22 < i21) {
                        if (i20 >= i21) {
                            imageReceiver.L0 = ((i23 + i11) * ((i20 - i21) - 1)) + measuredWidth + i15 + i23 + i17;
                        } else if (i20 <= i22) {
                            imageReceiver.L0 = ((((i11 + i23) * ((i20 - i21) + 1)) + measuredWidth) - (i23 + i18)) + i17;
                        } else {
                            imageReceiver.L0 = ((i23 + i11) * (i20 - i21)) + measuredWidth + i17;
                        }
                    } else if (i20 < i21) {
                        imageReceiver.L0 = ((i23 + i11) * (i20 - i21)) + measuredWidth + i17;
                    } else if (i20 <= i22) {
                        imageReceiver.L0 = ((i23 + i11) * ((i20 - i21) - 1)) + measuredWidth + i15 + i23 + i17;
                    } else {
                        imageReceiver.L0 = i23 + i18 + ((i11 + i23) * ((i20 - i21) - 2)) + measuredWidth + i15 + i23 + i17;
                    }
                    if (i20 == i22) {
                        imageReceiver.N0 = i18 - r10;
                        imageReceiver.L0 = (int) (imageReceiver.L0 + (r10 / 2));
                    } else {
                        imageReceiver.N0 = f11;
                    }
                }
                imageReceiver.setAlpha(this.d0);
                imageReceiver.J0(org.telegram.messenger.g0.L(2.0f));
                imageReceiver.h(canvas, null);
                i19++;
                size = i3;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.H;
            if (j10 > 17) {
                j10 = 17;
            }
            this.H = currentTimeMillis;
            int i24 = this.M;
            if (i24 >= 0) {
                float f15 = this.y;
                if (f15 > 0.0f) {
                    float f16 = j10;
                    float f17 = f15 - (f16 / (this.N ? 100.0f : 200.0f));
                    this.y = f17;
                    if (i24 == this.f) {
                        float f18 = this.E;
                        if (f18 < 1.0f) {
                            float f19 = (f16 / 200.0f) + f18;
                            this.E = f19;
                            if (f19 > 1.0f) {
                                this.E = 1.0f;
                            }
                        }
                        this.x = this.L + ((int) Math.ceil(this.E * (this.K - r1)));
                    } else {
                        xq xqVar = xq.g;
                        this.F = xqVar.getInterpolation(1.0f - f17);
                        if (this.R) {
                            float f20 = this.E;
                            if (f20 > 0.0f) {
                                float f21 = f20 - (f16 / 200.0f);
                                this.E = f21;
                                if (f21 < 0.0f) {
                                    this.E = 0.0f;
                                }
                            }
                            this.x = this.L + ((int) Math.ceil(r5 * (this.K - r1)));
                        } else {
                            this.E = xqVar.getInterpolation(this.y);
                            this.x = (int) Math.ceil(this.F * this.K);
                        }
                    }
                    if (this.y <= 0.0f) {
                        this.f = this.M;
                        this.y = 1.0f;
                        this.E = 1.0f;
                        this.F = 0.0f;
                        this.I = false;
                        this.R = false;
                        this.x = 0;
                        this.M = -1;
                        this.N = false;
                    }
                }
                a(this.x, true);
                invalidate();
            }
            if (this.Q) {
                float f22 = this.E;
                if (f22 > 0.0f) {
                    float f23 = f22 - (j10 / 200.0f);
                    this.E = f23;
                    if (f23 < 0.0f) {
                        this.E = 0.0f;
                    }
                    invalidate();
                }
            }
            Scroller scroller = this.O;
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
        Scroller scroller = this.O;
        scroller.abortAnimation();
        if (this.d.size() < 10) {
            return false;
        }
        scroller.fling(this.x, 0, Math.round(f10), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        a(0, false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.x = (int) (this.x - f10);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i3 = this.x;
        if (i3 < minScrollX) {
            this.x = minScrollX;
        } else if (i3 > maxScrollX) {
            this.x = maxScrollX;
        }
        f();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PhotoViewer photoViewer = ((org.telegram.ui.ko0) this.a0).a;
        int i3 = photoViewer.Q4;
        ArrayList arrayList = photoViewer.b7;
        ArrayList arrayList2 = photoViewer.Z6;
        org.telegram.ui.hq0 hq0Var = photoViewer.k7;
        List all = hq0Var != null ? hq0Var.getAll() : null;
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
                            int indexOf = arrayList2.indexOf((org.telegram.messenger.zi) arrayList4.get(i11));
                            if (i3 != indexOf) {
                                this.y = 1.0f;
                                this.J = true;
                                ((org.telegram.ui.ko0) this.a0).a(indexOf);
                                return false;
                            }
                        } else if (all != null && !all.isEmpty()) {
                            int indexOf2 = all.indexOf((TL_iv.PageBlock) arrayList4.get(i11));
                            if (i3 != indexOf2) {
                                this.y = 1.0f;
                                this.J = true;
                                ((org.telegram.ui.ko0) this.a0).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((org.telegram.messenger.ac) arrayList4.get(i11));
                            if (i3 != indexOf3) {
                                this.y = 1.0f;
                                this.J = true;
                                ((org.telegram.ui.ko0) this.a0).a(indexOf3);
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
            r1 = this.P.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
            if (this.Q && motionEvent.getAction() == 1 && this.O.isFinished()) {
                e();
            }
        }
        return r1;
    }

    public void setAnimateBackground(boolean z10) {
        this.W = z10;
    }

    public void setAnimationsEnabled(boolean z10) {
        if (this.T != z10) {
            this.T = z10;
            if (z10) {
                return;
            }
            ValueAnimator valueAnimator = this.b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.b0 = null;
            }
            ValueAnimator valueAnimator2 = this.c0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.c0 = null;
            }
            this.d0 = 0.0f;
            invalidate();
        }
    }

    public void setDelegate(g20 g20Var) {
        this.a0 = g20Var;
    }

    public void setMoveProgress(float f10) {
        if (this.Q || this.M >= 0) {
            return;
        }
        if (f10 > 0.0f) {
            this.G = this.f - 1;
        } else {
            this.G = this.f + 1;
        }
        int i3 = this.G;
        ArrayList arrayList = this.d;
        if (i3 < 0 || i3 >= arrayList.size()) {
            this.E = 1.0f;
        } else {
            this.E = 1.0f - Math.abs(f10);
        }
        this.F = 1.0f - this.E;
        this.I = f10 != 0.0f;
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
