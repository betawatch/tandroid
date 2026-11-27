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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dv extends FrameLayout implements jq3, zlb {
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
    public j47 S;
    public Drawable T;
    public boolean U;
    public final xi5 a;
    public final ex b;
    public cw c;
    public cw d;
    public final ImageReceiver e;
    public final RadialProgress2 f;
    public final fu h;
    public final byte n;
    public boolean r;
    public int s;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: Multi-variable type inference failed */
    public dv(Context context, xi5 xi5Var, ex exVar, int i) {
        super(context);
        this.a = xi5Var;
        this.b = exVar;
        setWillNotDraw(false);
        this.e = new ImageReceiver(this);
        fu fuVar = new fu(context, xi5Var, exVar, 1);
        this.h = fuVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.N = lq3.q(((o) xi5Var).Y).k();
        addView(fuVar, tre.c(-2.0f, -1));
        this.n = i;
    }

    private int getIconForCurrentState() {
        int i = this.G;
        if (i == 0) {
            return 2;
        }
        return i == 1 ? 3 : 4;
    }

    @Override // jq3
    public final void B(boolean z) {
        b(false);
    }

    @Override // jq3
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
            TLRPC.Photo d = dx.d(pageblockphoto2.photo_id, this.P);
            if (d != null) {
                this.I = xb4.w(d.sizes, hl.Y0(false), false, null, false);
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
        String r = xb4.r(null, this.I);
        xb4.G(i);
        File J = xb4.J(this.I, null, true, true);
        xb4.G(i);
        File J2 = xb4.J(this.I, null, false, true);
        boolean z2 = J.exists() || (J2 != null && J2.exists());
        boolean isEmpty = TextUtils.isEmpty(r);
        RadialProgress2 radialProgress2 = this.f;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z2) {
            lq3.q(i).v(this);
            this.G = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            lq3.q(i).a(r, null, this);
            float f = 0.0f;
            if (this.U || xb4.G(i).S(r)) {
                this.G = 1;
                Float s = in5.z().s(r);
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

    @Override // jq3
    public int getObserverTag() {
        return this.N;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        this.f.o(true, Math.min(1.0f, j / j2));
        if (this.G != 1) {
            b(true);
        }
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.I();
        b(false);
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.K();
        lq3.q(((o) this.a).Y).v(this);
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.f(this);
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
        if (!TextUtils.isEmpty(this.O.url) && !(this.M instanceof qxc)) {
            int measuredWidth = getMeasuredWidth() - hl.L(35.0f);
            int L = (int) (imageReceiver.M0 + hl.L(11.0f));
            this.T.setBounds(measuredWidth, L, hl.L(24.0f) + measuredWidth, hl.L(24.0f) + L);
            this.T.draw(canvas2);
        }
        cw cwVar = this.c;
        xi5 xi5Var = this.a;
        int i = 0;
        if (cwVar != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w);
            o.s(xi5Var, canvas2, this, 0);
            this.c.d(canvas2, this);
            canvas2.restore();
            i = 1;
        }
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(this.s, this.w + this.x);
            o.s(xi5Var, canvas2, this, i);
            this.d.d(canvas2, this);
            canvas2.restore();
        }
        o.r(canvas2, xi5Var, this.O, getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(ob6.M0(2131753941, null));
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
        ex exVar;
        boolean z;
        cw cwVar;
        cw cwVar2;
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
                    this.M = dx.d(pageblockphoto.photo_id, this.P);
                    int L2 = hl.L(48.0f);
                    if (b != 0 || (i13 = this.O.level) <= 0) {
                        this.s = hl.L(18.0f);
                        L = i3 - hl.L(36.0f);
                        i5 = 0;
                        i6 = i3;
                    } else {
                        i5 = hl.L(18.0f) + hl.L(i13 * 14);
                        this.s = i5;
                        i6 = ik8.B(18.0f, i5, i3);
                        L = i6;
                    }
                    TLRPC.Photo photo = this.M;
                    ex exVar2 = this.b;
                    if (photo == null || (this.I == null && !(photo instanceof qxc))) {
                        i7 = i4;
                    } else {
                        TLRPC.PhotoSize w = xb4.w(photo.sizes, 40, true, null, false);
                        this.K = w;
                        TLRPC.PhotoSize photoSize = this.I;
                        if (photoSize == w) {
                            this.K = null;
                        }
                        TLRPC.Photo photo2 = this.M;
                        if (photo2 instanceof qxc) {
                            qxc qxcVar = (qxc) photo2;
                            i8 = qxcVar.d;
                            i9 = qxcVar.e;
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
                                Point point = hl.q;
                                int max = (int) ((Math.max(point.x, point.y) - hl.L(56.0f)) * 0.9f);
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
                                    i6 -= hl.L(2.0f);
                                }
                                int L3 = (this.S.l & 8) == 0 ? i4 - hl.L(2.0f) : i4;
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
                                imageReceiver.i0(i11, (!this.r || b == 1 || b == 2 || this.O.level > 0) ? 0.0f : hl.L(8.0f), i12, i4);
                                if (b != 0) {
                                    this.J = null;
                                } else {
                                    Locale locale = Locale.US;
                                    this.J = qd4.m(i12, i4, "_");
                                }
                                this.L = "80_80_b";
                                o oVar = (o) this.a;
                                this.U = (lq3.q(oVar.Y).m() & 1) == 0;
                                if (!this.R) {
                                    TLRPC.Photo photo3 = this.M;
                                    if (photo3 instanceof qxc) {
                                        this.U = true;
                                        imageReceiver.O = null;
                                        rxc.g((qxc) photo3, imageReceiver, new c1(this, (byte) 23));
                                    } else {
                                        xb4.G(oVar.Y);
                                        File J = xb4.J(this.I, null, true, true);
                                        if (this.U || J.exists()) {
                                            imageReceiver.O = null;
                                            imageReceiver.Z(jn5.i(this.I, this.M), this.J, jn5.i(this.K, this.M), this.L, null, this.I.size, null, exVar2 != null ? exVar2.F : null, 1);
                                        } else {
                                            imageReceiver.O = jn5.i(this.I, this.M);
                                            imageReceiver.Z(null, this.J, jn5.i(this.K, this.M), this.L, null, this.I.size, null, exVar2 != null ? exVar2.F : null, 1);
                                        }
                                    }
                                }
                                float f4 = L2;
                                float f5 = f;
                                int z2 = (int) bp1.z(imageReceiver.N0, f4, f5, imageReceiver.L0);
                                this.y = z2;
                                int z3 = (int) bp1.z(imageReceiver.O0, f4, f5, imageReceiver.M0);
                                this.E = z3;
                                this.f.p(z2, z3, z2 + L2, L2 + z3);
                                i7 = i10;
                            }
                        }
                        i11 = i5;
                        i12 = i6;
                        i10 = i4;
                        imageReceiver.i0(i11, (!this.r || b == 1 || b == 2 || this.O.level > 0) ? 0.0f : hl.L(8.0f), i12, i4);
                        if (b != 0) {
                        }
                        this.L = "80_80_b";
                        o oVar2 = (o) this.a;
                        this.U = (lq3.q(oVar2.Y).m() & 1) == 0;
                        if (!this.R) {
                        }
                        float f42 = L2;
                        float f52 = f;
                        int z22 = (int) bp1.z(imageReceiver.N0, f42, f52, imageReceiver.L0);
                        this.y = z22;
                        int z32 = (int) bp1.z(imageReceiver.O0, f42, f52, imageReceiver.M0);
                        this.E = z32;
                        this.f.p(z22, z32, z22 + L2, L2 + z32);
                        i7 = i10;
                    }
                    int L4 = (int) (imageReceiver.M0 + imageReceiver.O0 + hl.L(8.0f));
                    this.w = L4;
                    if (b == 0) {
                        TL_iv.pageBlockPhoto pageblockphoto2 = this.O;
                        cw m = o.m(this.a, this, null, pageblockphoto2.caption.text, L, L4, pageblockphoto2, this.b);
                        this.c = m;
                        if (m != null) {
                            int height = this.c.d.getHeight() + hl.L(4.0f);
                            this.x = height;
                            i7 = uh9.w(4.0f, height, i7);
                        }
                        int i18 = i7;
                        TL_iv.pageBlockPhoto pageblockphoto3 = this.O;
                        exVar = exVar2;
                        cw n = o.n(this.a, this, null, pageblockphoto3.caption.credit, L, this.w + this.x, pageblockphoto3, (exVar2 == null || !exVar2.H) ? Layout.Alignment.ALIGN_NORMAL : o0b.a(), 0, this.b);
                        this.d = n;
                        i7 = n != null ? this.d.d.getHeight() + hl.L(4.0f) + i18 : i18;
                    } else {
                        exVar = exVar2;
                    }
                    if (!this.r && b == 0 && this.O.level <= 0) {
                        i7 += hl.L(8.0f);
                    }
                    if ((this.Q instanceof TL_iv.pageBlockCover) && exVar != null) {
                        ArrayList arrayList = exVar.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z = true;
                            i14 = (b != 2 || z) ? i7 : hl.L(8.0f) + i7;
                            cwVar = this.c;
                            if (cwVar != null) {
                                cwVar.s = this.s;
                                cwVar.w = this.w;
                            }
                            cwVar2 = this.d;
                            if (cwVar2 != null) {
                                cwVar2.s = this.s;
                                cwVar2.w = this.w + this.x;
                            }
                        }
                    }
                    z = false;
                    if (b != 2) {
                    }
                    cwVar = this.c;
                    if (cwVar != null) {
                    }
                    cwVar2 = this.d;
                    if (cwVar2 != null) {
                    }
                }
                fu fuVar = this.h;
                fuVar.measure(i, i2);
                fuVar.setTranslationY(imageReceiver.O0 - hl.L(39.0f));
                setMeasuredDimension(i3, i14);
            }
            float f6 = this.S.f;
            Point point2 = hl.q;
            i4 = (int) Math.ceil(f6 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i3 = size;
        pageblockphoto = this.O;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockphoto != null) {
        }
        fu fuVar2 = this.h;
        fuVar2.measure(i, i2);
        fuVar2.setTranslationY(imageReceiver2.O0 - hl.L(39.0f));
        setMeasuredDimension(i3, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r1 <= (hl.L(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        fu fuVar = this.h;
        int visibility = fuVar.getVisibility();
        ex exVar = this.b;
        if (visibility != 0 || y <= fuVar.getTranslationY() || y >= fuVar.getTranslationY() + hl.L(39.0f)) {
            int action = motionEvent.getAction();
            ImageReceiver imageReceiver = this.e;
            if (action == 0 && imageReceiver.H(x, y)) {
                if (this.G != -1) {
                    if (x >= this.y && x <= hl.L(48.0f) + r2) {
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
                    this.a.b(exVar, this.O);
                } else if (this.H) {
                    this.H = false;
                    playSoundEffect(0);
                    if (this.I != null) {
                        int i = this.G;
                        RadialProgress2 radialProgress2 = this.f;
                        if (i == 0) {
                            radialProgress2.o(true, 0.0f);
                            imageReceiver.Z(jn5.i(this.I, this.M), this.J, jn5.i(this.K, this.M), this.L, null, this.I.size, null, this.P, 1);
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
        } else if (exVar != null && exVar.G != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    public void setParentBlock(TL_iv.PageBlock pageBlock) {
        TL_iv.pageBlockChannel pageblockchannel;
        this.Q = pageBlock;
        ex exVar = this.b;
        if (exVar == null || (pageblockchannel = exVar.G) == null || !(pageBlock instanceof TL_iv.pageBlockCover)) {
            return;
        }
        fu fuVar = this.h;
        fuVar.setBlock(pageblockchannel);
        fuVar.setVisibility(0);
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }
}
