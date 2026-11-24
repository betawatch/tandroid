// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cv extends FrameLayout implements sp3, eib {
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public TLRPC.PhotoSize I;
    public String J;
    public TLRPC.PhotoSize K;
    public String L;
    public TLRPC.Photo M;
    public final int N;
    public TL_iv.pageBlockPhoto O;
    public TLObject P;
    public TL_iv.PageBlock Q;
    public boolean R;
    public c27 S;
    public Drawable T;
    public boolean U;
    public final vg5 a;
    public final dx b;
    public bw c;
    public bw d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final eu h;
    public final byte n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public cv(Context context, vg5 vg5Var, dx dxVar, int i) {
        super(context);
        this.a = vg5Var;
        this.b = dxVar;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        eu euVar = new eu(context, vg5Var, dxVar, 1);
        this.h = euVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.N = up3.q(((o) vg5Var).Y).k();
        addView(euVar, nme.c(-2.0f, -1));
        this.n = i;
    }

    private int getIconForCurrentState() {
        int i = this.G;
        if (i == 0) {
            return 2;
        }
        return i == 1 ? 3 : 4;
    }

    @Override // sp3
    public final void B(boolean z) {
        b(false);
    }

    @Override // sp3
    public final void N(String str) {
        this.f.o(true, 1.0f);
        b(true);
    }

    public final void a(TL_iv.pageBlockPhoto pageblockphoto, TLObject tLObject, boolean z, boolean z2) {
        this.Q = null;
        this.O = pageblockphoto;
        this.P = tLObject;
        this.R = z;
        this.r = z2;
        this.h.setVisibility(4);
        if (!TextUtils.isEmpty(this.O.url)) {
            this.T = getResources().getDrawable(R.drawable.msg_instant_link);
        }
        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
        if (pageblockphoto2 != null) {
            TLRPC.Photo d = cx.d(pageblockphoto2.photo_id, this.P);
            if (d != null) {
                this.I = ba4.w(d.sizes, gl.Y0(false), false, null, false);
            } else {
                this.I = null;
            }
        } else {
            this.I = null;
        }
        b(false);
        requestLayout();
    }

    public final void b(boolean z) {
        int i = ((o) this.a).Y;
        String r = ba4.r(null, this.I);
        ba4.G(i);
        File J = ba4.J(this.I, null, true, true);
        ba4.G(i);
        File J2 = ba4.J(this.I, null, false, true);
        boolean z2 = J.exists() || (J2 != null && J2.exists());
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z2) {
            up3.q(i).v(this);
            this.G = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            up3.q(i).a(r, null, this);
            float f = 0.0f;
            if (this.U || ba4.G(i).S(r)) {
                this.G = 1;
                Float s = fl5.z().s(r);
                if (s != null) {
                    f = s.floatValue();
                }
            } else {
                this.G = 0;
            }
            radialProgress2.setIcon(getIconForCurrentState(), true, z);
            radialProgress2.o(false, f);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.h;
    }

    public TL_iv.pageBlockPhoto getCurrentBlock() {
        return this.O;
    }

    public TLObject getCurrentPage() {
        return this.P;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // sp3
    public int getObserverTag() {
        return this.N;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        this.f.o(true, Math.min(1.0f, j / j2));
        if (this.G != 1) {
            b(true);
        }
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.I();
        b(false);
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.K();
        up3.q(((o) this.a).Y).v(this);
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.O == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (imageReceiver.B() && imageReceiver.i1 == 1.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x(), o.q1);
        }
        imageReceiver.h(canvas2, null);
        if (imageReceiver.R0) {
            this.f.draw(canvas2);
        }
        if (!TextUtils.isEmpty(this.O.url) && !(this.M instanceof btc)) {
            int measuredWidth = getMeasuredWidth() - gl.L(35.0f);
            int L = (int) (imageReceiver.M0 + gl.L(11.0f));
            this.T.setBounds(measuredWidth, L, gl.L(24.0f) + measuredWidth, gl.L(24.0f) + L);
            this.T.draw(canvas2);
        }
        bw bwVar = this.c;
        vg5 vg5Var = this.a;
        int i = 0;
        if (bwVar != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            o.s(vg5Var, canvas2, this, 0);
            this.c.d(canvas2, this);
            canvas2.restore();
            i = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            o.s(vg5Var, canvas2, this, i);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        o.r(canvas2, vg5Var, this.O, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(k96.M0(2131753945, null));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ff  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        TL_iv.pageBlockPhoto pageblockphoto;
        int L;
        int i5;
        int i6;
        int i7;
        dx dxVar;
        boolean z;
        bw bwVar;
        bw bwVar2;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i);
        byte b = this.n;
        int i14 = 1;
        if (b == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i4 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (b != 2) {
                i3 = size;
                i4 = 0;
                pageblockphoto = this.O;
                ImageReceiver imageReceiver = this.e;
                if (pageblockphoto != null) {
                    this.M = cx.d(pageblockphoto.photo_id, this.P);
                    int L2 = gl.L(48.0f);
                    if (b != 0 || (i13 = this.O.level) <= 0) {
                        this.s = gl.L(18.0f);
                        L = i3 - gl.L(36.0f);
                        i5 = 0;
                        i6 = i3;
                    } else {
                        i5 = gl.L(18.0f) + gl.L(i13 * 14);
                        this.s = i5;
                        i6 = ug8.B(18.0f, i5, i3);
                        L = i6;
                    }
                    TLRPC.Photo photo = this.M;
                    dx dxVar2 = this.b;
                    if (photo == null || (this.I == null && !(photo instanceof btc))) {
                        i7 = i4;
                    } else {
                        TLRPC.PhotoSize w = ba4.w(photo.sizes, 40, true, null, false);
                        this.K = w;
                        TLRPC.PhotoSize photoSize = this.I;
                        if (photoSize == w) {
                            this.K = null;
                        }
                        TLRPC.Photo photo2 = this.M;
                        if (photo2 instanceof btc) {
                            btc btcVar = (btc) photo2;
                            i8 = btcVar.d;
                            i9 = btcVar.e;
                        } else {
                            int i15 = photoSize.w;
                            int i16 = photoSize.h;
                            i8 = i15;
                            i9 = i16;
                        }
                        if (b == 0) {
                            float f2 = i8;
                            float f3 = i9;
                            i4 = (int) ((i6 / f2) * f3);
                            f = 2.0f;
                            if (this.Q instanceof TL_iv.pageBlockCover) {
                                i4 = Math.min(i4, i6);
                            } else {
                                Point point = gl.q;
                                int max = (int) ((Math.max(point.x, point.y) - gl.L(56.0f)) * 0.9f);
                                if (i4 > max) {
                                    i6 = (int) ((max / f3) * f2);
                                    i5 += ((i3 - i5) - i6) / 2;
                                    i4 = max;
                                }
                            }
                        } else {
                            f = 2.0f;
                            if (b == 2) {
                                if ((this.S.l & 2) == 0) {
                                    i6 -= gl.L(2.0f);
                                }
                                int L3 = (this.S.l & 8) == 0 ? i4 - gl.L(2.0f) : i4;
                                if (this.S.j != 0) {
                                    int ceil = (int) Math.ceil((r7 * i3) / 1000.0f);
                                    i6 -= ceil;
                                    i5 += ceil;
                                }
                                int i17 = i6;
                                i10 = i4;
                                i4 = L3;
                                i11 = i5;
                                i12 = i17;
                                imageReceiver.i0(i11, (!this.r || b == 1 || b == 2 || this.O.level > 0) ? 0.0f : gl.L(8.0f), i12, i4);
                                if (b != 0) {
                                    this.J = null;
                                } else {
                                    Locale locale = Locale.US;
                                    this.J = tb4.m(i12, i4, "_");
                                }
                                this.L = "80_80_b";
                                o oVar = (o) this.a;
                                this.U = (up3.q(oVar.Y).m() & 1) == 0;
                                if (!this.R) {
                                    TLRPC.Photo photo3 = this.M;
                                    if (photo3 instanceof btc) {
                                        this.U = true;
                                        imageReceiver.O = null;
                                        ctc.g((btc) photo3, imageReceiver, new b1(this, (byte) 23));
                                    } else {
                                        ba4.G(oVar.Y);
                                        File J = ba4.J(this.I, null, true, true);
                                        if (this.U || J.exists()) {
                                            imageReceiver.O = null;
                                            imageReceiver.Z(gl5.i(this.I, this.M), this.J, gl5.i(this.K, this.M), this.L, null, this.I.size, null, dxVar2 != null ? dxVar2.F : null, 1);
                                        } else {
                                            imageReceiver.O = gl5.i(this.I, this.M);
                                            imageReceiver.Z(null, this.J, gl5.i(this.K, this.M), this.L, null, this.I.size, null, dxVar2 != null ? dxVar2.F : null, 1);
                                        }
                                    }
                                }
                                float f4 = L2;
                                float f5 = f;
                                int z2 = (int) oo1.z(imageReceiver.N0, f4, f5, imageReceiver.L0);
                                this.y = z2;
                                int z3 = (int) oo1.z(imageReceiver.O0, f4, f5, imageReceiver.M0);
                                this.E = z3;
                                this.f.p(z2, z3, z2 + L2, L2 + z3);
                                i7 = i10;
                            }
                        }
                        i11 = i5;
                        i12 = i6;
                        i10 = i4;
                        imageReceiver.i0(i11, (!this.r || b == 1 || b == 2 || this.O.level > 0) ? 0.0f : gl.L(8.0f), i12, i4);
                        if (b != 0) {
                        }
                        this.L = "80_80_b";
                        o oVar2 = (o) this.a;
                        this.U = (up3.q(oVar2.Y).m() & 1) == 0;
                        if (!this.R) {
                        }
                        float f42 = L2;
                        float f52 = f;
                        int z22 = (int) oo1.z(imageReceiver.N0, f42, f52, imageReceiver.L0);
                        this.y = z22;
                        int z32 = (int) oo1.z(imageReceiver.O0, f42, f52, imageReceiver.M0);
                        this.E = z32;
                        this.f.p(z22, z32, z22 + L2, L2 + z32);
                        i7 = i10;
                    }
                    int L4 = (int) (imageReceiver.M0 + imageReceiver.O0 + gl.L(8.0f));
                    this.w = L4;
                    if (b == 0) {
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
                        bw m = o.m(this.a, this, null, pageblockphoto2.caption.text, L, L4, pageblockphoto2, this.b);
                        this.c = m;
                        if (m != null) {
                            int height = this.c.d.getHeight() + gl.L(4.0f);
                            this.x = height;
                            i7 = de9.w(4.0f, height, i7);
                        }
                        int i18 = i7;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.O;
                        dxVar = dxVar2;
                        bw n = o.n(this.a, this, null, pageblockphoto3.caption.credit, L, this.w + this.x, pageblockphoto3, (dxVar2 == null || !dxVar2.H) ? Layout.Alignment.ALIGN_NORMAL : lwa.a(), 0, this.b);
                        this.d = n;
                        i7 = n != null ? this.d.d.getHeight() + gl.L(4.0f) + i18 : i18;
                    } else {
                        dxVar = dxVar2;
                    }
                    if (!this.r && b == 0 && this.O.level <= 0) {
                        i7 += gl.L(8.0f);
                    }
                    if ((this.Q instanceof TL_iv.pageBlockCover) && dxVar != null) {
                        ArrayList arrayList = dxVar.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z = true;
                            i14 = (b != 2 || z) ? i7 : gl.L(8.0f) + i7;
                            bwVar = this.c;
                            if (bwVar != null) {
                                bwVar.s = this.s;
                                bwVar.w = this.w;
                            }
                            bwVar2 = this.d;
                            if (bwVar2 != null) {
                                bwVar2.s = this.s;
                                bwVar2.w = this.w + this.x;
                            }
                        }
                    }
                    z = false;
                    if (b != 2) {
                    }
                    bwVar = this.c;
                    if (bwVar != null) {
                    }
                    bwVar2 = this.d;
                    if (bwVar2 != null) {
                    }
                }
                eu euVar = this.h;
                euVar.measure(i, i2);
                euVar.setTranslationY(imageReceiver.O0 - gl.L(39.0f));
                setMeasuredDimension(i3, i14);
            }
            float f6 = this.S.f;
            Point point2 = gl.q;
            i4 = (int) Math.ceil(f6 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i3 = size;
        pageblockphoto = this.O;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockphoto != null) {
        }
        eu euVar2 = this.h;
        euVar2.measure(i, i2);
        euVar2.setTranslationY(imageReceiver2.O0 - gl.L(39.0f));
        setMeasuredDimension(i3, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r1 <= (gl.L(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        eu euVar = this.h;
        int visibility = euVar.getVisibility();
        dx dxVar = this.b;
        if (visibility != 0 || y <= euVar.getTranslationY() || y >= euVar.getTranslationY() + gl.L(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.e;
            if (action == 0 && imageReceiver.H(x, y)) {
                if (this.G != -1) {
                    if (x >= this.y && x <= gl.L(48.0f) + r2) {
                        if (y >= this.E) {
                        }
                    }
                }
                if (this.G != 0) {
                    this.F = true;
                }
                this.H = true;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.F) {
                    this.F = false;
                    this.a.b(dxVar, this.O);
                } else if (this.H) {
                    this.H = false;
                    playSoundEffect(0);
                    if (this.I != null) {
                        int i = this.G;
                        RadialProgress2 radialProgress2 = this.f;
                        if (i == 0) {
                            radialProgress2.o(true, 0.0f);
                            imageReceiver.Z(gl5.i(this.I, this.M), this.J, gl5.i(this.K, this.M), this.L, null, this.I.size, null, this.P, 1);
                            this.G = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i == 1) {
                            imageReceiver.c();
                            this.G = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.F = false;
                this.H = false;
            }
            if (!this.F && !this.H) {
                if (!o.i(this.a, this.b, motionEvent, this, this.c, this.s, this.w)) {
                    if (!o.i(this.a, this.b, motionEvent, this, this.d, this.s, this.w + this.x) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (dxVar != null && dxVar.G != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.Q = pageBlock;
        dx dxVar = this.b;
        if (dxVar == null || (pageblockchannel = dxVar.G) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        eu euVar = this.h;
        euVar.setBlock(pageblockchannel);
        euVar.setVisibility(0);
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }
}
