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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m40 extends View implements GestureDetector.OnGestureListener {
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
    public l40 W;
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
    public final int v;
    public int w;
    public float x;
    public float y;

    public m40(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper);
        Paint paint = new Paint();
        this.a = paint;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.y = 1.0f;
        this.E = 0.0f;
        this.L = -1;
        this.S = true;
        this.T = -1;
        this.V = true;
        this.O = new GestureDetector(contextThemeWrapper, this);
        this.N = new Scroller(contextThemeWrapper);
        this.n = AndroidUtilities.dp(42.0f);
        this.r = AndroidUtilities.dp(56.0f);
        this.v = AndroidUtilities.dp(1.0f);
        this.s = i10;
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
        imageReceiver.setCurrentAccount(((org.telegram.ui.vs0) this.W).a.T);
        return imageReceiver;
    }

    private int getMaxScrollX() {
        return ((this.v * 2) + this.n) * this.f;
    }

    private int getMinScrollX() {
        return ((this.v * 2) + this.n) * (-((this.d.size() - this.f) - 1));
    }

    public final void a(int i10, boolean z10) {
        int i11;
        int i12;
        String str;
        Object sb2;
        Object obj;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (!z10 && !arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.H = false;
            this.x = 1.0f;
            this.y = 1.0f;
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
            int i15 = this.v;
            if (z10) {
                int size = arrayList2.size();
                int i16 = 0;
                i11 = Integer.MIN_VALUE;
                i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (i16 < size) {
                    ImageReceiver imageReceiver = (ImageReceiver) arrayList2.get(i16);
                    int param = imageReceiver.getParam();
                    int i17 = ((i13 + i15) * (param - this.f)) + i14 + i10;
                    if (i17 > measuredWidth || i17 + i13 < 0) {
                        arrayList.add(imageReceiver);
                        arrayList2.remove(i16);
                        size--;
                        i16--;
                    }
                    i12 = Math.min(i12, param - 1);
                    i11 = Math.max(i11, param + 1);
                    i16++;
                }
            } else {
                i11 = this.f;
                i12 = i11 - 1;
            }
            String str2 = "avatar_";
            int i18 = this.r;
            int i19 = this.s;
            ArrayList arrayList4 = this.e;
            if (i11 != Integer.MIN_VALUE) {
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    int i20 = ((i13 + i15) * (i11 - this.f)) + i14 + i10;
                    if (i20 >= measuredWidth) {
                        break;
                    }
                    ImageLocation imageLocation = (ImageLocation) arrayList3.get(i11);
                    ImageReceiver freeReceiver = getFreeReceiver();
                    int i21 = measuredWidth;
                    int i22 = i14;
                    freeReceiver.setImageCoords(i20, i19, i13, i18);
                    if (arrayList4.get(0) instanceof MessageObject) {
                        obj = arrayList4.get(i11);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.yu0 yu0Var = ((org.telegram.ui.vs0) this.W).a.j7;
                        obj = yu0Var != null ? yu0Var.g() : null;
                    } else {
                        obj = "avatar_" + ((org.telegram.ui.vs0) this.W).a.z5;
                    }
                    freeReceiver.setImage(null, null, imageLocation, "80_80", 0L, null, obj, 1);
                    freeReceiver.setParam(i11);
                    i11++;
                    measuredWidth = i21;
                    i14 = i22;
                }
            }
            int i23 = i14;
            if (i12 != Integer.MAX_VALUE) {
                while (i12 >= 0) {
                    int i24 = ((i13 + i15) * (i12 - this.f)) + i23 + i10 + i13;
                    if (i24 <= 0) {
                        break;
                    }
                    ImageLocation imageLocation2 = (ImageLocation) arrayList3.get(i12);
                    ImageReceiver freeReceiver2 = getFreeReceiver();
                    freeReceiver2.setImageCoords(i24, i19, i13, i18);
                    if (arrayList4.get(0) instanceof MessageObject) {
                        sb2 = arrayList4.get(i12);
                    } else if (arrayList4.get(0) instanceof TL_iv.PageBlock) {
                        org.telegram.ui.yu0 yu0Var2 = ((org.telegram.ui.vs0) this.W).a.j7;
                        sb2 = yu0Var2 != null ? yu0Var2.g() : null;
                    } else {
                        StringBuilder sb3 = new StringBuilder(str2);
                        str = str2;
                        sb3.append(((org.telegram.ui.vs0) this.W).a.z5);
                        sb2 = sb3.toString();
                        freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb2, 1);
                        freeReceiver2.setParam(i12);
                        i12--;
                        str2 = str;
                    }
                    str = str2;
                    freeReceiver2.setImage(null, null, imageLocation2, "80_80", 0L, null, sb2, 1);
                    freeReceiver2.setParam(i12);
                    i12--;
                    str2 = str;
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
    /* JADX WARN: Removed duplicated region for block: B:65:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i10;
        long j3;
        Object obj;
        int i11;
        boolean z10;
        TL_iv.PageBlock pageBlock;
        int i12;
        int i13;
        org.telegram.ui.cv0 cv0Var;
        boolean z11;
        int i14;
        int i15 = 0;
        if (this.R) {
            this.R = false;
            return;
        }
        PhotoViewer photoViewer = ((org.telegram.ui.vs0) this.W).a;
        int i16 = photoViewer.P4;
        ArrayList arrayList = photoViewer.a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.yu0 yu0Var = photoViewer.j7;
        List all = yu0Var != null ? yu0Var.getAll() : null;
        int i17 = ((org.telegram.ui.vs0) this.W).a.v;
        this.U = false;
        long j10 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (i16 >= arrayList.size()) {
                i16 = arrayList.size() - 1;
            }
            ImageLocation imageLocation = (ImageLocation) arrayList.get(i16);
            int size = arrayList.size();
            this.U = true;
            i10 = 0;
            j3 = 0;
            i11 = size;
            z10 = false;
            obj = imageLocation;
        } else if (arrayList2 == null || arrayList2.isEmpty()) {
            i10 = 0;
            j3 = 0;
            if (all == null || all.isEmpty()) {
                obj = null;
                i11 = 0;
                z10 = false;
            } else {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) all.get(i16);
                long j11 = pageBlock2.groupId;
                if (j11 != this.h) {
                    this.h = j11;
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
            MessageObject messageObject = (MessageObject) arrayList2.get(i16);
            long groupIdForUse = messageObject.getGroupIdForUse();
            if (groupIdForUse != this.h) {
                this.h = groupIdForUse;
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z12 = arrayList2.size() > 1 && (cv0Var = ((org.telegram.ui.vs0) this.W).a.d) != null && cv0Var.K();
            if (this.h != 0 || z12) {
                this.U = true;
                int min = Math.min(i16 + 10, arrayList2.size());
                i12 = 0;
                int i20 = i16;
                while (true) {
                    if (i20 >= min) {
                        j3 = j10;
                        break;
                    }
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i20);
                    if (i17 == 0 && !z12) {
                        j3 = j10;
                        if (messageObject2.getGroupIdForUse() != this.h) {
                            break;
                        }
                    } else {
                        j3 = j10;
                    }
                    i12++;
                    i20++;
                    j10 = j3;
                }
                int max = Math.max(i16 - 10, 0);
                int i21 = i16 - 1;
                while (true) {
                    if (i21 < max) {
                        i10 = i15;
                        i13 = i16;
                        break;
                    }
                    MessageObject messageObject3 = (MessageObject) arrayList2.get(i21);
                    if (i17 == 0 && !z12) {
                        i10 = i15;
                        i13 = i16;
                        if (messageObject3.getGroupIdForUse() != this.h) {
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
                j3 = 0;
            }
            i11 = i12;
            i16 = i13;
            obj = messageObject;
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
                    this.a0.addListener(new k40(this, i22));
                    this.a0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.j40
                        public final /* synthetic */ m40 b;

                        {
                            this.b = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            switch (i22) {
                                case 0:
                                    m40 m40Var = this.b;
                                    m40Var.getClass();
                                    m40Var.c0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    m40Var.invalidate();
                                    break;
                                default:
                                    m40 m40Var2 = this.b;
                                    m40Var2.getClass();
                                    m40Var2.c0 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                    m40Var2.invalidate();
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
                        this.b0.addListener(new k40(this, i23));
                        this.b0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.Components.j40
                            public final /* synthetic */ m40 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                                switch (i23) {
                                    case 0:
                                        m40 m40Var = this.b;
                                        m40Var.getClass();
                                        m40Var.c0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        m40Var.invalidate();
                                        break;
                                    default:
                                        m40 m40Var2 = this.b;
                                        m40Var2.getClass();
                                        m40Var2.c0 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                        m40Var2.invalidate();
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
                    int i25 = this.v;
                    int i26 = this.n;
                    if (z14) {
                        this.L = indexOf;
                        this.F = indexOf;
                        this.J = (i26 + i25) * (i24 - indexOf);
                        this.H = true;
                        z11 = false;
                        this.I = false;
                        this.G = System.currentTimeMillis();
                        invalidate();
                    } else {
                        z11 = false;
                        a((i26 + i25) * (i24 - indexOf), true);
                        this.f = indexOf;
                        this.H = false;
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
                if (all != null && !all.isEmpty() && this.h != j3) {
                    int size4 = all.size();
                    for (int i28 = i27; i28 < size4; i28++) {
                        TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) all.get(i28);
                        if (pageBlock4.groupId != this.h) {
                            break;
                        }
                        arrayList4.add(pageBlock4);
                        arrayList3.add(ImageLocation.getForObject(pageBlock4.thumb, pageBlock4.thumbObject));
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
                        arrayList3.add(i29, ImageLocation.getForObject(pageBlock5.thumb, pageBlock5.thumbObject));
                        this.f++;
                        i30--;
                        i29 = 0;
                    }
                }
            } else {
                org.telegram.ui.cv0 cv0Var2 = ((org.telegram.ui.vs0) this.W).a.d;
                boolean z15 = (cv0Var2 != null && cv0Var2.K()) && arrayList2.size() > 1;
                if (this.h != j3 || z15 || i17 != 0) {
                    int min2 = Math.min(i16 + 10, arrayList2.size());
                    int i31 = i16;
                    while (true) {
                        if (i31 >= min2) {
                            i14 = i16;
                            break;
                        }
                        MessageObject messageObject4 = (MessageObject) arrayList2.get(i31);
                        if (i17 == 0 && !z15) {
                            i14 = i16;
                            if (messageObject4.getGroupIdForUse() != this.h) {
                                break;
                            }
                        } else {
                            i14 = i16;
                        }
                        arrayList4.add(messageObject4);
                        arrayList3.add(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject4.photoThumbs, 56, true), messageObject4.photoThumbsObject));
                        i31++;
                        i16 = i14;
                    }
                    this.f = 0;
                    this.L = -1;
                    this.M = false;
                    int max2 = Math.max(i14 - 10, 0);
                    for (int i32 = i14 - 1; i32 >= max2; i32--) {
                        MessageObject messageObject5 = (MessageObject) arrayList2.get(i32);
                        if (i17 == 0 && !z15 && messageObject5.getGroupIdForUse() != this.h) {
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
            this.J = (this.n + this.v) * (this.f - i11);
            this.K = this.w;
            this.x = 1.0f;
            this.T = -1;
            l40 l40Var = this.W;
            if (l40Var != null) {
                PhotoViewer photoViewer = ((org.telegram.ui.vs0) l40Var).a;
                if (PhotoViewer.R2(photoViewer.T4)) {
                    photoViewer.Y2 = true;
                    photoViewer.U1(true);
                    photoViewer.B0(0, true);
                }
            }
        }
        invalidate();
    }

    public final void f() {
        int i10;
        int i11;
        int i12;
        int i13 = this.w;
        int abs = Math.abs(i13);
        int i14 = this.n;
        int i15 = this.v;
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
        PhotoViewer photoViewer = ((org.telegram.ui.vs0) this.W).a;
        int i18 = photoViewer.P4;
        ArrayList arrayList = photoViewer.a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.yu0 yu0Var = photoViewer.j7;
        List all = yu0Var != null ? yu0Var.getAll() : null;
        int i19 = this.T;
        if (i18 != i19 && i19 >= 0 && i19 < this.d.size()) {
            Object obj = this.e.get(this.T);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i17 = arrayList2.indexOf((MessageObject) obj);
            } else if (all != null && !all.isEmpty()) {
                i17 = all.indexOf((TL_iv.PageBlock) obj);
            } else if (arrayList != null && !arrayList.isEmpty()) {
                i17 = arrayList.indexOf((ImageLocation) obj);
            }
            if (i17 >= 0) {
                this.R = true;
                ((org.telegram.ui.vs0) this.W).a(i17);
            }
        }
        if (!this.P) {
            this.P = true;
            this.Q = false;
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
            int i11 = this.w;
            int i12 = this.n;
            int i13 = (int) (i12 * 2.0f);
            int dp = AndroidUtilities.dp(8.0f);
            int i14 = this.f;
            ArrayList arrayList2 = this.d;
            ImageLocation imageLocation = (ImageLocation) arrayList2.get(i14);
            int i15 = this.r;
            int min = Math.min(i13, (imageLocation == null || (photoSize2 = imageLocation.photoSize) == null) ? i15 : Math.max(i12, (int) ((i15 / photoSize2.h) * photoSize2.w)));
            float f10 = dp * 2;
            float f11 = this.y;
            int i16 = (int) (f10 * f11);
            int i17 = ((int) ((min - i12) * f11)) + i12 + i16;
            int i18 = this.F;
            if (i18 < 0 || i18 >= arrayList2.size()) {
                i15 = i12;
            } else {
                ImageLocation imageLocation2 = (ImageLocation) arrayList2.get(this.F);
                if (imageLocation2 != null && (photoSize = imageLocation2.photoSize) != null) {
                    i15 = Math.max(i12, (int) ((i15 / photoSize.h) * photoSize.w));
                }
            }
            int min2 = Math.min(i13, i15);
            float f12 = this.E;
            int i19 = (int) (f10 * f12);
            int i20 = (int) (((((min2 + i19) - i12) / 2) * f12 * (this.F > this.f ? -1 : 1)) + i11);
            int i21 = ((int) ((min2 - i12) * f12)) + i12 + i19;
            int measuredWidth = (getMeasuredWidth() - i17) / 2;
            int i22 = 0;
            for (int size = arrayList.size(); i22 < size; size = i10) {
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i22);
                int param = imageReceiver.getParam();
                int i23 = this.f;
                if (param == i23) {
                    imageReceiver.setImageX((i16 / 2) + measuredWidth + i20);
                    imageReceiver.setImageWidth(i17 - i16);
                    i10 = size;
                } else {
                    int i24 = this.F;
                    int i25 = this.v;
                    if (i24 >= i23) {
                        i10 = size;
                        if (param < i23) {
                            imageReceiver.setImageX(((i25 + i12) * (imageReceiver.getParam() - this.f)) + measuredWidth + i20);
                        } else if (param <= i24) {
                            imageReceiver.setImageX(((i25 + i12) * ((imageReceiver.getParam() - this.f) - 1)) + measuredWidth + i17 + i25 + i20);
                        } else {
                            imageReceiver.setImageX(i25 + i21 + ((i12 + i25) * ((imageReceiver.getParam() - this.f) - 2)) + measuredWidth + i17 + i25 + i20);
                        }
                    } else if (param < i23) {
                        if (param <= i24) {
                            imageReceiver.setImageX(((((i12 + i25) * ((imageReceiver.getParam() - this.f) + 1)) + measuredWidth) - (i25 + i21)) + i20);
                        } else {
                            imageReceiver.setImageX(((i25 + i12) * (imageReceiver.getParam() - this.f)) + measuredWidth + i20);
                        }
                        i10 = size;
                    } else {
                        i10 = size;
                        imageReceiver.setImageX(((i25 + i12) * ((imageReceiver.getParam() - this.f) - 1)) + measuredWidth + i17 + i25 + i20);
                    }
                    if (param == this.F) {
                        imageReceiver.setImageWidth(i21 - i19);
                        imageReceiver.setImageX((int) (imageReceiver.getImageX() + (i19 / 2)));
                    } else {
                        imageReceiver.setImageWidth(i12);
                    }
                }
                imageReceiver.setAlpha(this.c0);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(2.0f));
                imageReceiver.draw(canvas);
                i22++;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.G;
            if (j3 > 17) {
                j3 = 17;
            }
            this.G = currentTimeMillis;
            int i26 = this.L;
            if (i26 >= 0) {
                float f13 = this.x;
                if (f13 > 0.0f) {
                    float f14 = j3;
                    float f15 = f13 - (f14 / (this.M ? 100.0f : 200.0f));
                    this.x = f15;
                    if (i26 == this.f) {
                        float f16 = this.y;
                        if (f16 < 1.0f) {
                            float f17 = (f14 / 200.0f) + f16;
                            this.y = f17;
                            if (f17 > 1.0f) {
                                this.y = 1.0f;
                            }
                        }
                        this.w = this.K + ((int) Math.ceil(this.y * (this.J - r1)));
                    } else {
                        hs hsVar = hs.g;
                        this.E = hsVar.getInterpolation(1.0f - f15);
                        if (this.Q) {
                            float f18 = this.y;
                            if (f18 > 0.0f) {
                                float f19 = f18 - (f14 / 200.0f);
                                this.y = f19;
                                if (f19 < 0.0f) {
                                    this.y = 0.0f;
                                }
                            }
                            this.w = this.K + ((int) Math.ceil(r5 * (this.J - r1)));
                        } else {
                            this.y = hsVar.getInterpolation(this.x);
                            this.w = (int) Math.ceil(this.E * this.J);
                        }
                    }
                    if (this.x <= 0.0f) {
                        this.f = this.L;
                        this.x = 1.0f;
                        this.y = 1.0f;
                        this.E = 0.0f;
                        this.H = false;
                        this.Q = false;
                        this.w = 0;
                        this.L = -1;
                        this.M = false;
                    }
                }
                a(this.w, true);
                invalidate();
            }
            if (this.P) {
                float f20 = this.y;
                if (f20 > 0.0f) {
                    float f21 = f20 - (j3 / 200.0f);
                    this.y = f21;
                    if (f21 < 0.0f) {
                        this.y = 0.0f;
                    }
                    invalidate();
                }
            }
            Scroller scroller = this.N;
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
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        Scroller scroller = this.N;
        scroller.abortAnimation();
        if (this.d.size() < 10) {
            return false;
        }
        scroller.fling(this.w, 0, Math.round(f7), 0, getMinScrollX(), getMaxScrollX(), 0, 0);
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(0, false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        this.w = (int) (this.w - f7);
        int minScrollX = getMinScrollX();
        int maxScrollX = getMaxScrollX();
        int i10 = this.w;
        if (i10 < minScrollX) {
            this.w = minScrollX;
        } else if (i10 > maxScrollX) {
            this.w = maxScrollX;
        }
        f();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        PhotoViewer photoViewer = ((org.telegram.ui.vs0) this.W).a;
        int i10 = photoViewer.P4;
        ArrayList arrayList = photoViewer.a7;
        ArrayList arrayList2 = photoViewer.Y6;
        org.telegram.ui.yu0 yu0Var = photoViewer.j7;
        List all = yu0Var != null ? yu0Var.getAll() : null;
        e();
        ArrayList arrayList3 = this.c;
        int size = arrayList3.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            ImageReceiver imageReceiver = (ImageReceiver) arrayList3.get(i11);
            if (imageReceiver.isInsideImage(motionEvent.getX(), motionEvent.getY())) {
                int param = imageReceiver.getParam();
                if (param >= 0) {
                    ArrayList arrayList4 = this.e;
                    if (param < arrayList4.size()) {
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            int indexOf = arrayList2.indexOf((MessageObject) arrayList4.get(param));
                            if (i10 != indexOf) {
                                this.x = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.vs0) this.W).a(indexOf);
                                return false;
                            }
                        } else if (all != null && !all.isEmpty()) {
                            int indexOf2 = all.indexOf((TL_iv.PageBlock) arrayList4.get(param));
                            if (i10 != indexOf2) {
                                this.x = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.vs0) this.W).a(indexOf2);
                                return false;
                            }
                        } else if (arrayList != null && !arrayList.isEmpty()) {
                            int indexOf3 = arrayList.indexOf((ImageLocation) arrayList4.get(param));
                            if (i10 != indexOf3) {
                                this.x = 1.0f;
                                this.I = true;
                                ((org.telegram.ui.vs0) this.W).a(indexOf3);
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

    public void setDelegate(l40 l40Var) {
        this.W = l40Var;
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
            this.y = 1.0f;
        } else {
            this.y = 1.0f - Math.abs(f7);
        }
        this.E = 1.0f - this.y;
        this.H = f7 != 0.0f;
        invalidate();
        if (arrayList.isEmpty()) {
            return;
        }
        if (f7 >= 0.0f || this.f != arrayList.size() - 1) {
            if (f7 <= 0.0f || this.f != 0) {
                int i11 = (int) (f7 * (this.n + this.v));
                this.w = i11;
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
