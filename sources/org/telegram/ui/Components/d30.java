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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d30 extends View implements GestureDetector.OnGestureListener {
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
    public c30 W;
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

    public d30(ContextThemeWrapper contextThemeWrapper, int i10) {
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
        this.n = org.telegram.messenger.i0.L(42.0f);
        this.r = org.telegram.messenger.i0.L(56.0f);
        this.w = org.telegram.messenger.i0.L(1.0f);
        this.s = i10;
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
        imageReceiver.d = ((org.telegram.ui.dq0) this.W).a.T;
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.w * 2) + this.n) * this.f;
    }

    private int getMinScrollX() {
        return ((this.w * 2) + this.n) * (-((this.d.size() - this.f) - 1));
    }

    public final void a(int i10, boolean z10) {
        int i11;
        int i12;
        Object obj;
        Object obj2;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (!z10 && !arrayList2.isEmpty()) {
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
            int i13 = this.n;
            int i14 = measuredWidth2 - (i13 / 2);
            int i15 = this.w;
            if (z10) {
                int size = arrayList2.size();
                int i16 = 0;
                i11 = Integer.MIN_VALUE;
                i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (i16 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i16);
                    int i17 = imageReceiver.f;
                    int i18 = ((i13 + i15) * (i17 - this.f)) + i14 + i10;
                    if (i18 > measuredWidth || i18 + i13 < 0) {
                        arrayList.add(imageReceiver);
                        arrayList2.remove(i16);
                        size--;
                        i16--;
                    }
                    i12 = Math.min(i12, i17 - 1);
                    i11 = Math.max(i11, i17 + 1);
                    i16++;
                }
            } else {
                i11 = this.f;
                i12 = i11 - 1;
            }
            int i19 = this.r;
            int i20 = this.s;
            ArrayList arrayList4 = this.e;
            if (i11 != Integer.MIN_VALUE) {
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    int i21 = ((i13 + i15) * (i11 - this.f)) + i14 + i10;
                    if (i21 >= measuredWidth) {
                        break;
                    }
                    org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) arrayList3.get(i11);
                    ImageReceiver freeReceiver = getFreeReceiver();
                    int i22 = measuredWidth;
                    int i23 = i14;
                    freeReceiver.y0(i21, i20, i13, i19);
                    if (arrayList4.get(0) instanceof org.telegram.messenger.jj) {
                        obj2 = arrayList4.get(i11);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.bs0 bs0Var = ((org.telegram.ui.dq0) this.W).a.j7;
                        obj2 = bs0Var != null ? bs0Var.g() : null;
                    } else {
                        obj2 = "avatar_" + ((org.telegram.ui.dq0) this.W).a.z5;
                    }
                    freeReceiver.r0(null, null, icVar, "80_80", null, 0L, null, obj2, 1);
                    freeReceiver.f = i11;
                    i11++;
                    measuredWidth = i22;
                    i14 = i23;
                }
            }
            int i24 = i14;
            if (i12 != Integer.MAX_VALUE) {
                while (i12 >= 0) {
                    int i25 = ((i13 + i15) * (i12 - this.f)) + i24 + i10 + i13;
                    if (i25 <= 0) {
                        break;
                    }
                    org.telegram.messenger.ic icVar2 = (org.telegram.messenger.ic) arrayList3.get(i12);
                    ImageReceiver freeReceiver2 = getFreeReceiver();
                    freeReceiver2.y0(i25, i20, i13, i19);
                    if (arrayList4.get(0) instanceof org.telegram.messenger.jj) {
                        obj = arrayList4.get(i12);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.bs0 bs0Var2 = ((org.telegram.ui.dq0) this.W).a.j7;
                        obj = bs0Var2 != null ? bs0Var2.g() : null;
                    } else {
                        obj = "avatar_" + ((org.telegram.ui.dq0) this.W).a.z5;
                    }
                    freeReceiver2.r0(null, null, icVar2, "80_80", null, 0L, null, obj, 1);
                    freeReceiver2.f = i12;
                    i12--;
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
        int i10;
        long j10;
        Object obj;
        int i11;
        boolean z10;
        TL_iv.PageBlock pageBlock;
        int i12;
        int i13;
        org.telegram.ui.es0 es0Var;
        boolean z11;
        int i14;
        int i15 = 0;
        if (this.R) {
            this.R = false;
            return;
        }
        PhotoViewer photoViewer = ((org.telegram.ui.dq0) this.W).a;
        int i16 = photoViewer.P4;
        ArrayList arrayList = photoViewer.a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.bs0 bs0Var = photoViewer.j7;
        List all = bs0Var != null ? bs0Var.getAll() : null;
        int i17 = ((org.telegram.ui.dq0) this.W).a.w;
        this.U = false;
        long j11 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i16 >= arrayList.size()) {
                i16 = arrayList.size() - 1;
            }
            org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) arrayList.get(i16);
            int size = arrayList.size();
            this.U = true;
            i10 = 0;
            j10 = 0;
            i11 = size;
            z10 = false;
            obj = icVar;
        } else if (arrayList2 == null || arrayList2.isEmpty()) {
            i10 = 0;
            j10 = 0;
            if (all == null || all.isEmpty()) {
                obj = null;
                i11 = 0;
                z10 = false;
            } else {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) all.get(i16);
                long j12 = pageBlock2.groupId;
                if (j12 != this.h) {
                    this.h = j12;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.h != 0) {
                    this.U = true;
                    int size2 = all.size();
                    int i18 = i16;
                    i11 = 0;
                    TL_iv.PageBlock pageBlock3 = pageBlock2;
                    while (true) {
                        if (i18 >= size2) {
                            pageBlock = pageBlock3;
                            break;
                        }
                        pageBlock = pageBlock3;
                        if (((TL_iv.PageBlock) all.get(i18)).groupId != this.h) {
                            break;
                        }
                        i11++;
                        i18++;
                        pageBlock3 = pageBlock;
                    }
                    for (int i19 = i16 - 1; i19 >= 0 && ((TL_iv.PageBlock) all.get(i19)).groupId == this.h; i19--) {
                        i11++;
                    }
                    obj = pageBlock;
                } else {
                    i11 = 0;
                    obj = pageBlock2;
                }
            }
        } else {
            if (i16 >= arrayList2.size()) {
                i16 = arrayList2.size() - 1;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList2.get(i16);
            long e12 = jjVar.e1();
            if (e12 != this.h) {
                this.h = e12;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = arrayList2.size() > 1 && (es0Var = ((org.telegram.ui.dq0) this.W).a.d) != null && es0Var.L();
            if (this.h != 0 || z12) {
                this.U = true;
                int min = Math.min(i16 + 10, arrayList2.size());
                i12 = 0;
                int i20 = i16;
                while (true) {
                    if (i20 >= min) {
                        j10 = j11;
                        break;
                    }
                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList2.get(i20);
                    if (i17 == 0 && !z12) {
                        j10 = j11;
                        if (jjVar2.e1() != this.h) {
                            break;
                        }
                    } else {
                        j10 = j11;
                    }
                    i12++;
                    i20++;
                    j11 = j10;
                }
                int max = Math.max(i16 - 10, 0);
                int i21 = i16 - 1;
                while (true) {
                    if (i21 < max) {
                        i10 = i15;
                        i13 = i16;
                        break;
                    }
                    org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList2.get(i21);
                    if (i17 == 0 && !z12) {
                        i10 = i15;
                        i13 = i16;
                        if (jjVar3.e1() != this.h) {
                            break;
                        }
                    } else {
                        i10 = i15;
                        i13 = i16;
                    }
                    i12++;
                    i21--;
                    i15 = i10;
                    i16 = i13;
                }
            } else {
                i12 = 0;
                i10 = 0;
                i13 = i16;
                j10 = 0;
            }
            i11 = i12;
            i16 = i13;
            obj = jjVar;
        }
        if (obj == null) {
            return;
        }
        boolean z13 = this.S;
        ArrayList arrayList3 = this.d;
        if (z13) {
            if (this.U) {
                ValueAnimator valueAnimator = this.b0;
                if (valueAnimator != null) {
                    this.b0 = null;
                    valueAnimator.cancel();
                }
                float f7 = this.c0;
                if (f7 < 1.0f && this.a0 == null) {
                    final int i22 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 1.0f);
                    this.a0 = ofFloat;
                    ofFloat.setDuration((long) ((1.0f - this.c0) * 200.0f));
                    this.a0.addListener(new b30(this, i22));
                    this.a0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.a30
                        public final /* synthetic */ d30 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i22) {
                                case 0:
                                    d30 d30Var = this.b;
                                    d30Var.getClass();
                                    d30Var.c0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    d30Var.invalidate();
                                    break;
                                default:
                                    d30 d30Var2 = this.b;
                                    d30Var2.getClass();
                                    d30Var2.c0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    d30Var2.invalidate();
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
                        fArr[i10] = this.c0;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
                        this.b0 = ofFloat2;
                        ofFloat2.setDuration((long) (this.c0 * 200.0f));
                        final int i23 = i10;
                        this.b0.addListener(new b30(this, i23));
                        this.b0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.a30
                            public final /* synthetic */ d30 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (i23) {
                                    case 0:
                                        d30 d30Var = this.b;
                                        d30Var.getClass();
                                        d30Var.c0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        d30Var.invalidate();
                                        break;
                                    default:
                                        d30 d30Var2 = this.b;
                                        d30Var2.getClass();
                                        d30Var2.c0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        d30Var2.invalidate();
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
        if (!z10) {
            if (i11 == arrayList3.size() && arrayList4.contains(obj)) {
                int indexOf = arrayList4.indexOf(obj);
                int i24 = this.f;
                if (i24 != indexOf && indexOf != -1) {
                    boolean z14 = this.I;
                    if (!z14 && !this.H && (indexOf == i24 - 1 || indexOf == i24 + 1)) {
                        this.M = true;
                        z14 = true;
                    }
                    int i25 = this.w;
                    int i26 = this.n;
                    if (z14) {
                        this.L = indexOf;
                        this.F = indexOf;
                        this.J = (i26 + i25) * (i24 - indexOf);
                        this.H = true;
                        this.I = false;
                        this.G = System.currentTimeMillis();
                        invalidate();
                        z11 = false;
                    } else {
                        z11 = false;
                        a((i26 + i25) * (i24 - indexOf), true);
                        this.f = indexOf;
                        this.H = false;
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
            this.I = z11;
            arrayList3.clear();
            arrayList4.clear();
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList4.addAll(arrayList);
                arrayList3.addAll(arrayList);
                this.f = i16;
                this.L = -1;
                this.M = z11;
            } else if (arrayList2 == null || arrayList2.isEmpty()) {
                int i27 = i16;
                if (all != null && !all.isEmpty() && this.h != j10) {
                    int size4 = all.size();
                    for (int i28 = i27; i28 < size4; i28++) {
                        TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) all.get(i28);
                        if (pageBlock4.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(pageBlock4);
                        arrayList3.add(org.telegram.messenger.ic.f(pageBlock4.thumb, pageBlock4.thumbObject));
                    }
                    int i29 = 0;
                    this.f = 0;
                    this.L = -1;
                    this.M = false;
                    int i30 = i27 - 1;
                    while (i30 >= 0) {
                        TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) all.get(i30);
                        if (pageBlock5.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(i29, pageBlock5);
                        arrayList3.add(i29, org.telegram.messenger.ic.f(pageBlock5.thumb, pageBlock5.thumbObject));
                        this.f++;
                        i30--;
                        i29 = 0;
                    }
                }
            } else {
                org.telegram.ui.es0 es0Var2 = ((org.telegram.ui.dq0) this.W).a.d;
                boolean z15 = (es0Var2 != null && es0Var2.L()) && arrayList2.size() > 1;
                if (this.h != j10 || z15 || i17 != 0) {
                    int min2 = Math.min(i16 + 10, arrayList2.size());
                    int i31 = i16;
                    while (true) {
                        if (i31 >= min2) {
                            i14 = i16;
                            break;
                        }
                        org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) arrayList2.get(i31);
                        if (i17 == 0 && !z15) {
                            i14 = i16;
                            if (jjVar4.e1() != this.h) {
                                break;
                            }
                        } else {
                            i14 = i16;
                        }
                        arrayList4.add(jjVar4);
                        arrayList3.add(org.telegram.messenger.ic.f(org.telegram.messenger.b8.w(jjVar4.n0, 56, true, null, false), jjVar4.l0));
                        i31++;
                        i16 = i14;
                    }
                    this.f = 0;
                    this.L = -1;
                    this.M = false;
                    int max2 = Math.max(i14 - 10, 0);
                    for (int i32 = i14 - 1; i32 >= max2; i32--) {
                        org.telegram.messenger.jj jjVar5 = (org.telegram.messenger.jj) arrayList2.get(i32);
                        if (i17 == 0 && !z15 && jjVar5.e1() != this.h) {
                            break;
                        }
                        arrayList4.add(0, jjVar5);
                        arrayList3.add(0, org.telegram.messenger.ic.f(org.telegram.messenger.b8.w(jjVar5.n0, 56, true, null, false), jjVar5.l0));
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
        int i10 = this.T;
        if (i10 >= 0 && i10 < this.e.size()) {
            this.Q = true;
            this.M = false;
            int i11 = this.T;
            this.L = i11;
            this.F = i11;
            this.J = (this.n + this.w) * (this.f - i11);
            this.K = this.x;
            this.y = 1.0f;
            this.T = -1;
            c30 c30Var = this.W;
            if (c30Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.dq0) c30Var).a;
                if (PhotoViewer.U2(photoViewer.T4)) {
                    photoViewer.Y2 = true;
                    photoViewer.X1(true);
                    photoViewer.C0(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i10;
        int i11;
        int i12;
        int i13 = this.x;
        int abs = Math.abs(i13);
        int i14 = this.n;
        int i15 = this.w;
        int i16 = (i14 / 2) + i15;
        int i17 = -1;
        if (abs > i16) {
            if (i13 > 0) {
                i11 = i13 - i16;
                i12 = 1;
            } else {
                i11 = i13 + i16;
                i12 = -1;
            }
            i10 = (i11 / ((i15 * 2) + i14)) + i12;
        } else {
            i10 = 0;
        }
        this.T = this.f - i10;
        PhotoViewer photoViewer = ((org.telegram.ui.dq0) this.W).a;
        int i18 = photoViewer.P4;
        ArrayList arrayList = photoViewer.a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.bs0 bs0Var = photoViewer.j7;
        List all = bs0Var != null ? bs0Var.getAll() : null;
        int i19 = this.T;
        if (i18 != i19 && i19 >= 0 && i19 < this.d.size()) {
            Object obj = this.e.get(this.T);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i17 = arrayList2.indexOf((org.telegram.messenger.jj) obj);
            } else if (all != null && !all.isEmpty()) {
                i17 = all.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i17 = arrayList.indexOf((org.telegram.messenger.ic) obj);
            }
            if (i17 >= 0) {
                this.R = true;
                ((org.telegram.ui.dq0) this.W).a(i17);
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
        int i10;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z10 = this.U;
        ArrayList arrayList = this.c;
        if (z10 || !arrayList.isEmpty()) {
            float f7 = this.c0;
            if (!this.V) {
                f7 = this.U ? 1.0f : 0.0f;
            }
            Paint paint = this.a;
            paint.setAlpha((int) (f7 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i11 = this.x;
            int i12 = this.n;
            float f10 = i12;
            int i13 = (int) (f10 * 2.0f);
            int L = org.telegram.messenger.i0.L(8.0f);
            int i14 = this.f;
            ArrayList arrayList2 = this.d;
            org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) arrayList2.get(i14);
            int i15 = this.r;
            int min = Math.min(i13, (icVar == null || (photoSize2 = icVar.k) == null) ? i15 : Math.max(i12, (int) ((i15 / photoSize2.h) * photoSize2.w)));
            float f11 = L * 2;
            float f12 = this.D;
            int i16 = ((int) ((min - i12) * f12)) + i12 + ((int) (f11 * f12));
            int i17 = this.F;
            if (i17 < 0 || i17 >= arrayList2.size()) {
                i15 = i12;
            } else {
                org.telegram.messenger.ic icVar2 = (org.telegram.messenger.ic) arrayList2.get(this.F);
                if (icVar2 != null && (photoSize = icVar2.k) != null) {
                    i15 = Math.max(i12, (int) ((i15 / photoSize.h) * photoSize.w));
                }
            }
            int min2 = Math.min(i13, i15);
            float f13 = this.E;
            int i18 = (int) (((((min2 + r10) - i12) / 2) * f13 * (this.F > this.f ? -1 : 1)) + i11);
            int i19 = ((int) ((min2 - i12) * f13)) + i12 + ((int) (f11 * f13));
            int measuredWidth = (getMeasuredWidth() - i16) / 2;
            int i20 = 0;
            while (i20 < size) {
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i20);
                int i21 = imageReceiver.f;
                int i22 = this.f;
                if (i21 == i22) {
                    imageReceiver.K0 = (r15 / 2) + measuredWidth + i18;
                    imageReceiver.M0 = i16 - r15;
                    i10 = size;
                } else {
                    int i23 = this.F;
                    i10 = size;
                    int i24 = this.w;
                    if (i23 < i22) {
                        if (i21 >= i22) {
                            imageReceiver.K0 = ((i24 + i12) * ((i21 - i22) - 1)) + measuredWidth + i16 + i24 + i18;
                        } else if (i21 <= i23) {
                            imageReceiver.K0 = ((((i12 + i24) * ((i21 - i22) + 1)) + measuredWidth) - (i24 + i19)) + i18;
                        } else {
                            imageReceiver.K0 = ((i24 + i12) * (i21 - i22)) + measuredWidth + i18;
                        }
                    } else if (i21 < i22) {
                        imageReceiver.K0 = ((i24 + i12) * (i21 - i22)) + measuredWidth + i18;
                    } else if (i21 <= i23) {
                        imageReceiver.K0 = ((i24 + i12) * ((i21 - i22) - 1)) + measuredWidth + i16 + i24 + i18;
                    } else {
                        imageReceiver.K0 = i24 + i19 + ((i12 + i24) * ((i21 - i22) - 2)) + measuredWidth + i16 + i24 + i18;
                    }
                    if (i21 == i23) {
                        imageReceiver.M0 = i19 - r10;
                        imageReceiver.K0 = (int) (imageReceiver.K0 + (r10 / 2));
                    } else {
                        imageReceiver.M0 = f10;
                    }
                }
                imageReceiver.setAlpha(this.c0);
                imageReceiver.J0(org.telegram.messenger.i0.L(2.0f));
                imageReceiver.h(canvas, null);
                i20++;
                size = i10;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.G;
            if (j10 > 17) {
                j10 = 17;
            }
            this.G = currentTimeMillis;
            int i25 = this.L;
            if (i25 >= 0) {
                float f14 = this.y;
                if (f14 > 0.0f) {
                    float f15 = j10;
                    float f16 = f14 - (f15 / (this.M ? 100.0f : 200.0f));
                    this.y = f16;
                    if (i25 == this.f) {
                        float f17 = this.D;
                        if (f17 < 1.0f) {
                            float f18 = (f15 / 200.0f) + f17;
                            this.D = f18;
                            if (f18 > 1.0f) {
                                this.D = 1.0f;
                            }
                        }
                        this.x = this.K + ((int) Math.ceil(this.D * (this.J - r1)));
                    } else {
                        gr grVar = gr.g;
                        this.E = grVar.getInterpolation(1.0f - f16);
                        if (this.Q) {
                            float f19 = this.D;
                            if (f19 > 0.0f) {
                                float f20 = f19 - (f15 / 200.0f);
                                this.D = f20;
                                if (f20 < 0.0f) {
                                    this.D = 0.0f;
                                }
                            }
                            this.x = this.K + ((int) Math.ceil(r5 * (this.J - r1)));
                        } else {
                            this.D = grVar.getInterpolation(this.y);
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
                float f21 = this.D;
                if (f21 > 0.0f) {
                    float f22 = f21 - (j10 / 200.0f);
                    this.D = f22;
                    if (f22 < 0.0f) {
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        Scroller scroller = this.N;
        scroller.abortAnimation();
        if (this.d.size() < 10) {
            return false;
        }
        scroller.fling(this.x, 0, Math.round(f7), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(0, false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        this.x = (int) (this.x - f7);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i10 = this.x;
        if (i10 < minScrollX) {
            this.x = minScrollX;
        } else if (i10 > maxScrollX) {
            this.x = maxScrollX;
        }
        f();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PhotoViewer photoViewer = ((org.telegram.ui.dq0) this.W).a;
        int i10 = photoViewer.P4;
        ArrayList arrayList = photoViewer.a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.bs0 bs0Var = photoViewer.j7;
        List all = bs0Var != null ? bs0Var.getAll() : null;
        e();
        ArrayList arrayList3 = this.c;
        int size = arrayList3.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i11);
            if (imageReceiver.O(motionEvent.getX(), motionEvent.getY())) {
                int i12 = imageReceiver.f;
                if (i12 >= 0) {
                    ArrayList arrayList4 = this.e;
                    if (i12 < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((org.telegram.messenger.jj) arrayList4.get(i12));
                            if (i10 != indexOf) {
                                this.y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.dq0) this.W).a(indexOf);
                                return false;
                            }
                        } else if (all != null && !all.isEmpty()) {
                            int indexOf2 = all.indexOf((TL_iv.PageBlock) arrayList4.get(i12));
                            if (i10 != indexOf2) {
                                this.y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.dq0) this.W).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((org.telegram.messenger.ic) arrayList4.get(i12));
                            if (i10 != indexOf3) {
                                this.y = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.dq0) this.W).a(indexOf3);
                                return false;
                            }
                        }
                    }
                }
                return true;
            }
            i11++;
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

    public void setAnimateBackground(boolean z10) {
        this.V = z10;
    }

    public void setAnimationsEnabled(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            if (z10) {
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

    public void setDelegate(c30 c30Var) {
        this.W = c30Var;
    }

    public void setMoveProgress(float f7) {
        if (this.P || this.L >= 0) {
            return;
        }
        if (f7 > 0.0f) {
            this.F = this.f - 1;
        } else {
            this.F = this.f + 1;
        }
        int i10 = this.F;
        ArrayList arrayList = this.d;
        if (i10 < 0 || i10 >= arrayList.size()) {
            this.D = 1.0f;
        } else {
            this.D = 1.0f - Math.abs(f7);
        }
        this.E = 1.0f - this.D;
        this.H = f7 != 0.0f;
        invalidate();
        if (arrayList.isEmpty()) {
            return;
        }
        if (f7 >= 0.0f || this.f != arrayList.size() - 1) {
            if (f7 <= 0.0f || this.f != 0) {
                int i11 = (int) (f7 * (this.n + this.w));
                this.x = i11;
                a(i11, true);
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
