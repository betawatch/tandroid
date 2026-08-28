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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f30 extends View implements GestureDetector.OnGestureListener {
    public float A;
    public int B;
    public long C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final Scroller J;
    public final GestureDetector K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public boolean R;
    public e30 S;
    public ValueAnimator T;
    public ValueAnimator U;
    public float V;
    public final Paint a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public int f;
    public long h;
    public final int n;
    public final int r;
    public final int s;
    public final int v;
    public int w;
    public float x;
    public float y;

    public f30(ContextThemeWrapper contextThemeWrapper, int i9) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.a = paint;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.y = 1.0f;
        this.A = 0.0f;
        this.H = -1;
        this.O = true;
        this.P = -1;
        this.R = true;
        this.K = new GestureDetector(contextThemeWrapper, this);
        this.J = new Scroller(contextThemeWrapper);
        this.n = AndroidUtilities.dp(42.0f);
        this.r = AndroidUtilities.dp(56.0f);
        this.v = AndroidUtilities.dp(1.0f);
        this.s = i9;
        paint.setColor(2130706432);
    }

    private ImageReceiver getFreeReceiver() {
        ImageReceiver imageReceiver;
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            imageReceiver = new ImageReceiver(this);
            imageReceiver.setAllowLoadingOnAttachedOnly(false);
        } else {
            ImageReceiver imageReceiver2 = (ImageReceiver) arrayList.get(0);
            arrayList.remove(0);
            imageReceiver = imageReceiver2;
        }
        this.c.add(imageReceiver);
        imageReceiver.setCurrentAccount(((org.telegram.ui.sr0) this.S).a.P);
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.v * 2) + this.n) * this.f;
    }

    private int getMinScrollX() {
        return ((this.v * 2) + this.n) * (-((this.d.size() - this.f) - 1));
    }

    public final void a(int i9, boolean z10) {
        int i10;
        int i11;
        String str;
        Object sb2;
        Object obj;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (!z10 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.D = false;
            this.x = 1.0f;
            this.y = 1.0f;
            this.A = 0.0f;
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
            int i14 = this.v;
            if (z10) {
                int size = arrayList2.size();
                int i15 = 0;
                i10 = TLObject.FLAG_31;
                i11 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (i15 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i15);
                    int param = imageReceiver.getParam();
                    int i16 = ((i12 + i14) * (param - this.f)) + i13 + i9;
                    if (i16 > measuredWidth || i16 + i12 < 0) {
                        arrayList.add(imageReceiver);
                        arrayList2.remove(i15);
                        size--;
                        i15--;
                    }
                    i11 = Math.min(i11, param - 1);
                    i10 = Math.max(i10, param + 1);
                    i15++;
                }
            } else {
                i10 = this.f;
                i11 = i10 - 1;
            }
            String str2 = "avatar_";
            int i17 = this.r;
            int i18 = this.s;
            ArrayList arrayList4 = this.e;
            if (i10 != Integer.MIN_VALUE) {
                int size2 = arrayList3.size();
                while (i10 < size2) {
                    int i19 = ((i12 + i14) * (i10 - this.f)) + i13 + i9;
                    if (i19 >= measuredWidth) {
                        break;
                    }
                    ImageLocation imageLocation = (ImageLocation) arrayList3.get(i10);
                    ImageReceiver freeReceiver = getFreeReceiver();
                    int i20 = measuredWidth;
                    int i21 = i13;
                    freeReceiver.setImageCoords(i19, i18, i12, i17);
                    if (arrayList4.get(0) instanceof MessageObject) {
                        obj = arrayList4.get(i10);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.vt0 vt0Var = ((org.telegram.ui.sr0) this.S).a.f7;
                        obj = vt0Var != null ? vt0Var.g() : null;
                    } else {
                        obj = "avatar_" + ((org.telegram.ui.sr0) this.S).a.v5;
                    }
                    freeReceiver.setImage(null, null, imageLocation, "80_80", 0L, null, obj, 1);
                    freeReceiver.setParam(i10);
                    i10++;
                    measuredWidth = i20;
                    i13 = i21;
                }
            }
            int i22 = i13;
            if (i11 != Integer.MAX_VALUE) {
                while (i11 >= 0) {
                    int i23 = ((i12 + i14) * (i11 - this.f)) + i22 + i9 + i12;
                    if (i23 <= 0) {
                        break;
                    }
                    ImageLocation imageLocation2 = (ImageLocation) arrayList3.get(i11);
                    ImageReceiver freeReceiver2 = getFreeReceiver();
                    freeReceiver2.setImageCoords(i23, i18, i12, i17);
                    if (arrayList4.get(0) instanceof MessageObject) {
                        sb2 = arrayList4.get(i11);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.vt0 vt0Var2 = ((org.telegram.ui.sr0) this.S).a.f7;
                        sb2 = vt0Var2 != null ? vt0Var2.g() : null;
                    } else {
                        StringBuilder sb3 = new StringBuilder(str2);
                        str = str2;
                        sb3.append(((org.telegram.ui.sr0) this.S).a.v5);
                        sb2 = sb3.toString();
                        freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb2, 1);
                        freeReceiver2.setParam(i11);
                        i11--;
                        str2 = str;
                    }
                    str = str2;
                    freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb2, 1);
                    freeReceiver2.setParam(i11);
                    i11--;
                    str2 = str;
                }
            }
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator == null || valueAnimator.isStarted()) {
                return;
            }
            this.T.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        long j10;
        char c10;
        Object obj;
        int i9;
        boolean z10;
        TL_iv.PageBlock pageBlock;
        int i10;
        int i11;
        org.telegram.ui.zt0 zt0Var;
        boolean z11;
        int i12;
        if (this.N) {
            this.N = false;
            return;
        }
        PhotoViewer photoViewer = ((org.telegram.ui.sr0) this.S).a;
        int i13 = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.vt0 vt0Var = photoViewer.f7;
        List all = vt0Var != null ? vt0Var.getAll() : null;
        int i14 = ((org.telegram.ui.sr0) this.S).a.v;
        this.Q = false;
        long j11 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i13 >= arrayList.size()) {
                i13 = arrayList.size() - 1;
            }
            ImageLocation imageLocation = (ImageLocation) arrayList.get(i13);
            int size = arrayList.size();
            this.Q = true;
            j10 = 0;
            i9 = size;
            z10 = false;
            c10 = 0;
            obj = imageLocation;
        } else if (arrayList2 == null || arrayList2.isEmpty()) {
            j10 = 0;
            c10 = 0;
            if (all == null || all.isEmpty()) {
                obj = null;
                i9 = 0;
                z10 = false;
            } else {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) all.get(i13);
                long j12 = pageBlock2.groupId;
                if (j12 != this.h) {
                    this.h = j12;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.h != 0) {
                    this.Q = true;
                    int size2 = all.size();
                    int i15 = i13;
                    i9 = 0;
                    TL_iv.PageBlock pageBlock3 = pageBlock2;
                    while (true) {
                        if (i15 >= size2) {
                            pageBlock = pageBlock3;
                            break;
                        }
                        pageBlock = pageBlock3;
                        if (((TL_iv.PageBlock) all.get(i15)).groupId != this.h) {
                            break;
                        }
                        i9++;
                        i15++;
                        pageBlock3 = pageBlock;
                    }
                    for (int i16 = i13 - 1; i16 >= 0 && ((TL_iv.PageBlock) all.get(i16)).groupId == this.h; i16--) {
                        i9++;
                    }
                    obj = pageBlock;
                } else {
                    i9 = 0;
                    obj = pageBlock2;
                }
            }
        } else {
            if (i13 >= arrayList2.size()) {
                i13 = arrayList2.size() - 1;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i13);
            long groupIdForUse = messageObject.getGroupIdForUse();
            if (groupIdForUse != this.h) {
                this.h = groupIdForUse;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = arrayList2.size() > 1 && (zt0Var = ((org.telegram.ui.sr0) this.S).a.d) != null && zt0Var.K();
            if (this.h != 0 || z12) {
                this.Q = true;
                int min = Math.min(i13 + 10, arrayList2.size());
                int i17 = i13;
                i10 = 0;
                while (true) {
                    if (i17 >= min) {
                        j10 = j11;
                        break;
                    }
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i17);
                    if (i14 == 0 && !z12) {
                        j10 = j11;
                        if (messageObject2.getGroupIdForUse() != this.h) {
                            break;
                        }
                    } else {
                        j10 = j11;
                    }
                    i10++;
                    i17++;
                    j11 = j10;
                }
                int max = Math.max(i13 - 10, 0);
                int i18 = i13 - 1;
                while (i18 >= max) {
                    MessageObject messageObject3 = (MessageObject) arrayList2.get(i18);
                    if (i14 == 0 && !z12) {
                        i11 = i13;
                        c10 = 0;
                        if (messageObject3.getGroupIdForUse() != this.h) {
                            break;
                        }
                    } else {
                        i11 = i13;
                    }
                    i10++;
                    i18--;
                    i13 = i11;
                }
                i11 = i13;
            } else {
                i11 = i13;
                j10 = 0;
                i10 = 0;
            }
            c10 = 0;
            i9 = i10;
            i13 = i11;
            obj = messageObject;
        }
        if (obj == null) {
            return;
        }
        boolean z13 = this.O;
        ArrayList arrayList3 = this.d;
        if (z13) {
            if (this.Q) {
                ValueAnimator valueAnimator = this.U;
                if (valueAnimator != null) {
                    this.U = null;
                    valueAnimator.cancel();
                }
                float f10 = this.V;
                if (f10 < 1.0f && this.T == null) {
                    final int i19 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 1.0f);
                    this.T = ofFloat;
                    ofFloat.setDuration((long) ((1.0f - this.V) * 200.0f));
                    this.T.addListener(new d30(this, i19));
                    this.T.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.c30
                        public final /* synthetic */ f30 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i19) {
                                case 0:
                                    f30 f30Var = this.b;
                                    f30Var.getClass();
                                    f30Var.V = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    f30Var.invalidate();
                                    break;
                                default:
                                    f30 f30Var2 = this.b;
                                    f30Var2.getClass();
                                    f30Var2.V = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    f30Var2.invalidate();
                                    break;
                            }
                        }
                    });
                }
            } else {
                ValueAnimator valueAnimator2 = this.T;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.T = null;
                }
                if (this.V > 0.0f && arrayList3.size() > 1) {
                    if (this.U == null) {
                        float[] fArr = new float[2];
                        fArr[c10] = this.V;
                        fArr[1] = 0.0f;
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
                        this.U = ofFloat2;
                        ofFloat2.setDuration((long) (this.V * 200.0f));
                        final int i20 = 0;
                        this.U.addListener(new d30(this, i20));
                        this.U.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.c30
                            public final /* synthetic */ f30 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (i20) {
                                    case 0:
                                        f30 f30Var = this.b;
                                        f30Var.getClass();
                                        f30Var.V = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        f30Var.invalidate();
                                        break;
                                    default:
                                        f30 f30Var2 = this.b;
                                        f30Var2.getClass();
                                        f30Var2.V = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        f30Var2.invalidate();
                                        break;
                                }
                            }
                        });
                        this.U.start();
                        return;
                    }
                    return;
                }
            }
        }
        ArrayList arrayList4 = this.e;
        if (!z10) {
            if (i9 == arrayList3.size() && arrayList4.contains(obj)) {
                int indexOf = arrayList4.indexOf(obj);
                int i21 = this.f;
                if (i21 != indexOf && indexOf != -1) {
                    boolean z14 = this.E;
                    if (!z14 && !this.D && (indexOf == i21 - 1 || indexOf == i21 + 1)) {
                        this.I = true;
                        z14 = true;
                    }
                    int i22 = this.v;
                    int i23 = this.n;
                    if (z14) {
                        this.H = indexOf;
                        this.B = indexOf;
                        this.F = (i23 + i22) * (i21 - indexOf);
                        this.D = true;
                        z11 = false;
                        this.E = false;
                        this.C = System.currentTimeMillis();
                        invalidate();
                    } else {
                        z11 = false;
                        a((i23 + i22) * (i21 - indexOf), true);
                        this.f = indexOf;
                        this.D = false;
                    }
                    this.w = z11 ? 1 : 0;
                }
            } else {
                z11 = false;
                z10 = true;
            }
            if (z10) {
                return;
            }
            int size3 = arrayList3.size();
            this.E = z11;
            arrayList3.clear();
            arrayList4.clear();
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList4.addAll(arrayList);
                arrayList3.addAll(arrayList);
                this.f = i13;
                this.H = -1;
                this.I = z11;
            } else if (arrayList2 == null || arrayList2.isEmpty()) {
                int i24 = i13;
                if (all != null && !all.isEmpty() && this.h != j10) {
                    int size4 = all.size();
                    for (int i25 = i24; i25 < size4; i25++) {
                        TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) all.get(i25);
                        if (pageBlock4.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(pageBlock4);
                        arrayList3.add(ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
                    }
                    int i26 = 0;
                    this.f = 0;
                    this.H = -1;
                    this.I = false;
                    int i27 = i24 - 1;
                    while (i27 >= 0) {
                        TL_iv.PageBlock pageBlock5 = (TL_iv.PageBlock) all.get(i27);
                        if (pageBlock5.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(i26, pageBlock5);
                        arrayList3.add(i26, ImageLocation.getForObject(pageBlock5.thumb, pageBlock5.thumbObject));
                        this.f++;
                        i27--;
                        i26 = 0;
                    }
                }
            } else {
                org.telegram.ui.zt0 zt0Var2 = ((org.telegram.ui.sr0) this.S).a.d;
                boolean z15 = (zt0Var2 != null && zt0Var2.K()) && arrayList2.size() > 1;
                if (this.h != j10 || z15 || i14 != 0) {
                    int min2 = Math.min(i13 + 10, arrayList2.size());
                    int i28 = i13;
                    while (true) {
                        if (i28 >= min2) {
                            i12 = i13;
                            break;
                        }
                        MessageObject messageObject4 = (MessageObject) arrayList2.get(i28);
                        if (i14 == 0 && !z15) {
                            i12 = i13;
                            if (messageObject4.getGroupIdForUse() != this.h) {
                                break;
                            }
                        } else {
                            i12 = i13;
                        }
                        arrayList4.add(messageObject4);
                        arrayList3.add(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject4.photoThumbs, 56, true), messageObject4.photoThumbsObject));
                        i28++;
                        i13 = i12;
                    }
                    this.f = 0;
                    this.H = -1;
                    this.I = false;
                    int max2 = Math.max(i12 - 10, 0);
                    for (int i29 = i12 - 1; i29 >= max2; i29--) {
                        MessageObject messageObject5 = (MessageObject) arrayList2.get(i29);
                        if (i14 == 0 && !z15 && messageObject5.getGroupIdForUse() != this.h) {
                            break;
                        }
                        arrayList4.add(0, messageObject5);
                        arrayList3.add(0, ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject5.photoThumbs, 56, true), messageObject5.photoThumbsObject));
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
        if (!this.Q || this.U != null) {
            return false;
        }
        if (this.V > 0.0f || !this.R) {
            return true;
        }
        ValueAnimator valueAnimator = this.T;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public final void d() {
        this.Q = false;
        if (this.O) {
            this.V = 0.0f;
        }
    }

    public final void e() {
        this.L = false;
        Scroller scroller = this.J;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        int i9 = this.P;
        if (i9 >= 0 && i9 < this.e.size()) {
            this.M = true;
            this.I = false;
            int i10 = this.P;
            this.H = i10;
            this.B = i10;
            this.F = (this.n + this.v) * (this.f - i10);
            this.G = this.w;
            this.x = 1.0f;
            this.P = -1;
            e30 e30Var = this.S;
            if (e30Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.sr0) e30Var).a;
                if (PhotoViewer.R2(photoViewer.P4)) {
                    photoViewer.U2 = true;
                    photoViewer.T1(true);
                    photoViewer.A0(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i9;
        int i10;
        int i11;
        int i12 = this.w;
        int abs = Math.abs(i12);
        int i13 = this.n;
        int i14 = this.v;
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
            i9 = (i10 / ((i14 * 2) + i13)) + i11;
        } else {
            i9 = 0;
        }
        this.P = this.f - i9;
        PhotoViewer photoViewer = ((org.telegram.ui.sr0) this.S).a;
        int i17 = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.vt0 vt0Var = photoViewer.f7;
        List all = vt0Var != null ? vt0Var.getAll() : null;
        int i18 = this.P;
        if (i17 != i18 && i18 >= 0 && i18 < this.d.size()) {
            Object obj = this.e.get(this.P);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i16 = arrayList2.indexOf((MessageObject) obj);
            } else if (all != null && !all.isEmpty()) {
                i16 = all.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i16 = arrayList.indexOf((ImageLocation) obj);
            }
            if (i16 >= 0) {
                this.N = true;
                ((org.telegram.ui.sr0) this.S).a(i16);
            }
        }
        if (!this.L) {
            this.L = true;
            this.M = false;
        }
        a(this.w, true);
    }

    public int getCount() {
        return this.d.size();
    }

    public int getIndex() {
        return this.f;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.J;
        if (!scroller.isFinished()) {
            scroller.abortAnimation();
        }
        this.H = -1;
        this.I = false;
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        TLRPC.PhotoSize photoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z10 = this.Q;
        ArrayList arrayList = this.c;
        if (z10 || !arrayList.isEmpty()) {
            float f10 = this.V;
            if (!this.R) {
                f10 = this.Q ? 1.0f : 0.0f;
            }
            Paint paint = this.a;
            paint.setAlpha((int) (f10 * 127.0f));
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (arrayList.isEmpty()) {
                return;
            }
            int i10 = this.w;
            int i11 = this.n;
            int i12 = (int) (i11 * 2.0f);
            int dp = AndroidUtilities.dp(8.0f);
            int i13 = this.f;
            ArrayList arrayList2 = this.d;
            ImageLocation imageLocation = (ImageLocation) arrayList2.get(i13);
            int i14 = this.r;
            int min = Math.min(i12, (imageLocation == null || (photoSize2 = imageLocation.photoSize) == null) ? i14 : Math.max(i11, (int) ((i14 / photoSize2.h) * photoSize2.w)));
            float f11 = dp * 2;
            float f12 = this.y;
            int i15 = (int) (f11 * f12);
            int i16 = ((int) ((min - i11) * f12)) + i11 + i15;
            int i17 = this.B;
            if (i17 < 0 || i17 >= arrayList2.size()) {
                i14 = i11;
            } else {
                ImageLocation imageLocation2 = (ImageLocation) arrayList2.get(this.B);
                if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                    i14 = Math.max(i11, (int) ((i14 / photoSize.h) * photoSize.w));
                }
            }
            int min2 = Math.min(i12, i14);
            float f13 = this.A;
            int i18 = (int) (f11 * f13);
            int i19 = (int) (((((min2 + i18) - i11) / 2) * f13 * (this.B > this.f ? -1 : 1)) + i10);
            int i20 = ((int) ((min2 - i11) * f13)) + i11 + i18;
            int measuredWidth = (getMeasuredWidth() - i16) / 2;
            int i21 = 0;
            for (int size = arrayList.size(); i21 < size; size = i9) {
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i21);
                int param = imageReceiver.getParam();
                int i22 = this.f;
                if (param == i22) {
                    imageReceiver.setImageX((i15 / 2) + measuredWidth + i19);
                    imageReceiver.setImageWidth(i16 - i15);
                    i9 = size;
                } else {
                    int i23 = this.B;
                    int i24 = this.v;
                    if (i23 >= i22) {
                        i9 = size;
                        if (param < i22) {
                            imageReceiver.setImageX(((i24 + i11) * (imageReceiver.getParam() - this.f)) + measuredWidth + i19);
                        } else if (param <= i23) {
                            imageReceiver.setImageX(((i24 + i11) * ((imageReceiver.getParam() - this.f) - 1)) + measuredWidth + i16 + i24 + i19);
                        } else {
                            imageReceiver.setImageX(i24 + i20 + ((i11 + i24) * ((imageReceiver.getParam() - this.f) - 2)) + measuredWidth + i16 + i24 + i19);
                        }
                    } else if (param < i22) {
                        if (param <= i23) {
                            imageReceiver.setImageX(((((i11 + i24) * ((imageReceiver.getParam() - this.f) + 1)) + measuredWidth) - (i24 + i20)) + i19);
                        } else {
                            imageReceiver.setImageX(((i24 + i11) * (imageReceiver.getParam() - this.f)) + measuredWidth + i19);
                        }
                        i9 = size;
                    } else {
                        i9 = size;
                        imageReceiver.setImageX(((i24 + i11) * ((imageReceiver.getParam() - this.f) - 1)) + measuredWidth + i16 + i24 + i19);
                    }
                    if (param == this.B) {
                        imageReceiver.setImageWidth(i20 - i18);
                        imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i18 / 2)));
                    } else {
                        imageReceiver.setImageWidth(i11);
                    }
                }
                imageReceiver.setAlpha(this.V);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                imageReceiver.draw(canvas);
                i21++;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.C;
            if (j10 > 17) {
                j10 = 17;
            }
            this.C = currentTimeMillis;
            int i25 = this.H;
            if (i25 >= 0) {
                float f14 = this.x;
                if (f14 > 0.0f) {
                    float f15 = j10;
                    float f16 = f14 - (f15 / (this.I ? 100.0f : 200.0f));
                    this.x = f16;
                    if (i25 == this.f) {
                        float f17 = this.y;
                        if (f17 < 1.0f) {
                            float f18 = (f15 / 200.0f) + f17;
                            this.y = f18;
                            if (f18 > 1.0f) {
                                this.y = 1.0f;
                            }
                        }
                        this.w = this.G + ((int) Math.ceil(this.y * (this.F - r1)));
                    } else {
                        gr grVar = gr.g;
                        this.A = grVar.getInterpolation(1.0f - f16);
                        if (this.M) {
                            float f19 = this.y;
                            if (f19 > 0.0f) {
                                float f20 = f19 - (f15 / 200.0f);
                                this.y = f20;
                                if (f20 < 0.0f) {
                                    this.y = 0.0f;
                                }
                            }
                            this.w = this.G + ((int) Math.ceil(r5 * (this.F - r1)));
                        } else {
                            this.y = grVar.getInterpolation(this.x);
                            this.w = (int) Math.ceil(this.A * this.F);
                        }
                    }
                    if (this.x <= 0.0f) {
                        this.f = this.H;
                        this.x = 1.0f;
                        this.y = 1.0f;
                        this.A = 0.0f;
                        this.D = false;
                        this.M = false;
                        this.w = 0;
                        this.H = -1;
                        this.I = false;
                    }
                }
                a(this.w, true);
                invalidate();
            }
            if (this.L) {
                float f21 = this.y;
                if (f21 > 0.0f) {
                    float f22 = f21 - (j10 / 200.0f);
                    this.y = f22;
                    if (f22 < 0.0f) {
                        this.y = 0.0f;
                    }
                    invalidate();
                }
            }
            Scroller scroller = this.J;
            if (scroller.isFinished()) {
                return;
            }
            if (scroller.computeScrollOffset()) {
                this.w = scroller.getCurrX();
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
        Scroller scroller = this.J;
        scroller.abortAnimation();
        if (this.d.size() < 10) {
            return false;
        }
        scroller.fling(this.w, 0, Math.round(f10), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a(0, false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.w = (int) (this.w - f10);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i9 = this.w;
        if (i9 < minScrollX) {
            this.w = minScrollX;
        } else if (i9 > maxScrollX) {
            this.w = maxScrollX;
        }
        f();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PhotoViewer photoViewer = ((org.telegram.ui.sr0) this.S).a;
        int i9 = photoViewer.L4;
        ArrayList arrayList = photoViewer.W6;
        ArrayList arrayList2 = photoViewer.U6;
        org.telegram.ui.vt0 vt0Var = photoViewer.f7;
        List all = vt0Var != null ? vt0Var.getAll() : null;
        e();
        ArrayList arrayList3 = this.c;
        int size = arrayList3.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i10);
            if (imageReceiver.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                int param = imageReceiver.getParam();
                if (param >= 0) {
                    ArrayList arrayList4 = this.e;
                    if (param < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((MessageObject) arrayList4.get(param));
                            if (i9 != indexOf) {
                                this.x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.sr0) this.S).a(indexOf);
                                return false;
                            }
                        } else if (all != null && !all.isEmpty()) {
                            int indexOf2 = all.indexOf((TL_iv.PageBlock) arrayList4.get(param));
                            if (i9 != indexOf2) {
                                this.x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.sr0) this.S).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((ImageLocation) arrayList4.get(param));
                            if (i9 != indexOf3) {
                                this.x = 1.0f;
                                this.E = true;
                                ((org.telegram.ui.sr0) this.S).a(indexOf3);
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
            r1 = this.K.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
            if (this.L && motionEvent.getAction() == 1 && this.J.isFinished()) {
                e();
            }
        }
        return r1;
    }

    public void setAnimateBackground(boolean z10) {
        this.R = z10;
    }

    public void setAnimationsEnabled(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            if (z10) {
                return;
            }
            ValueAnimator valueAnimator = this.T;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.T = null;
            }
            ValueAnimator valueAnimator2 = this.U;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.U = null;
            }
            this.V = 0.0f;
            invalidate();
        }
    }

    public void setDelegate(e30 e30Var) {
        this.S = e30Var;
    }

    public void setMoveProgress(float f10) {
        if (this.L || this.H >= 0) {
            return;
        }
        if (f10 > 0.0f) {
            this.B = this.f - 1;
        } else {
            this.B = this.f + 1;
        }
        int i9 = this.B;
        ArrayList arrayList = this.d;
        if (i9 < 0 || i9 >= arrayList.size()) {
            this.y = 1.0f;
        } else {
            this.y = 1.0f - Math.abs(f10);
        }
        this.A = 1.0f - this.y;
        this.D = f10 != 0.0f;
        invalidate();
        if (arrayList.isEmpty()) {
            return;
        }
        if (f10 >= 0.0f || this.f != arrayList.size() - 1) {
            if (f10 <= 0.0f || this.f != 0) {
                int i10 = (int) (f10 * (this.n + this.v));
                this.w = i10;
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
