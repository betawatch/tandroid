// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jq1 extends et1 {
    public final ti4 A3;
    public final yla B3;
    public boolean C3;
    public final Path D3;
    public boolean E3;
    public int F3;
    public final /* synthetic */ mu1 G3;
    public int g3;
    public final ArrayList h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public int m3;
    public int n3;
    public int o3;
    public long p3;
    public float q3;
    public float r3;
    public boolean s3;
    public final float t3;
    public final Paint u3;
    public final Paint v3;
    public final ti4 w3;
    public final yla x3;
    public final ti4 y3;
    public final yla z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq1(mu1 mu1Var, Context context, ku1 ku1Var) {
        super(mu1Var, context, ku1Var);
        this.G3 = mu1Var;
        this.h3 = new ArrayList();
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList(10);
        this.t3 = 2000.0f;
        final byte b = 1;
        Paint paint = new Paint(1);
        this.u3 = paint;
        Paint paint2 = new Paint(1);
        this.v3 = paint2;
        ti4 ti4Var = new ti4(0.0f);
        this.w3 = ti4Var;
        yla ylaVar = new yla(ti4Var);
        ylaVar.h = 0.0f;
        ylaVar.g = 2000.0f;
        ylaVar.m = oo1.j(0.0f, 1500.0f, 1.0f);
        final byte b2 = 0;
        ylaVar.b(new yr3(this) { // from class: iq1
            public final /* synthetic */ jq1 b;

            {
                this.b = this;
            }

            @Override // yr3
            public final void a(yla ylaVar2, float f, float f2) {
                byte b3 = b2;
                jq1 jq1Var = this.b;
                switch (b3) {
                    case 0:
                        jq1Var.invalidate();
                        break;
                    case 1:
                        jq1Var.invalidate();
                        break;
                    default:
                        jq1Var.invalidate();
                        break;
                }
            }
        });
        this.x3 = ylaVar;
        ti4 ti4Var2 = new ti4(0.0f);
        this.y3 = ti4Var2;
        yla ylaVar2 = new yla(ti4Var2);
        ylaVar2.h = 0.0f;
        ylaVar2.m = oo1.j(0.0f, 400.0f, 0.5f);
        ylaVar2.b(new yr3(this) { // from class: iq1
            public final /* synthetic */ jq1 b;

            {
                this.b = this;
            }

            @Override // yr3
            public final void a(yla ylaVar22, float f, float f2) {
                byte b3 = b;
                jq1 jq1Var = this.b;
                switch (b3) {
                    case 0:
                        jq1Var.invalidate();
                        break;
                    case 1:
                        jq1Var.invalidate();
                        break;
                    default:
                        jq1Var.invalidate();
                        break;
                }
            }
        });
        this.z3 = ylaVar2;
        ti4 ti4Var3 = new ti4(0.0f);
        this.A3 = ti4Var3;
        yla ylaVar3 = new yla(ti4Var3);
        ylaVar3.h = 0.0f;
        ylaVar3.m = oo1.j(0.0f, 200.0f, 1.0f);
        final byte b3 = 2;
        ylaVar3.b(new yr3(this) { // from class: iq1
            public final /* synthetic */ jq1 b;

            {
                this.b = this;
            }

            @Override // yr3
            public final void a(yla ylaVar22, float f, float f2) {
                byte b32 = b3;
                jq1 jq1Var = this.b;
                switch (b32) {
                    case 0:
                        jq1Var.invalidate();
                        break;
                    case 1:
                        jq1Var.invalidate();
                        break;
                    default:
                        jq1Var.invalidate();
                        break;
                }
            }
        });
        this.B3 = ylaVar3;
        this.D3 = new Path();
        this.F3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(gl.L(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(gl.L(2.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1(Canvas canvas, RectF rectF) {
        float f;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.h3;
        int size = arrayList3.size();
        mu1 mu1Var = this.G3;
        boolean z = 1;
        boolean z2 = false;
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                gb2 gb2Var = (gb2) arrayList3.get(i);
                if (!mu1Var.Na(gb2Var, rectF)) {
                    canvas.save();
                    canvas.translate(gb2Var.U1(false) + gb2Var.getLeft(), gb2Var.getY() + gb2Var.getPaddingTop());
                    gb2Var.A1(gb2Var.a() ? gb2Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.i3;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i2 = 0; i2 < size2; i2++) {
                gb2 gb2Var2 = (gb2) arrayList4.get(i2);
                if (!mu1Var.Na(gb2Var2, rectF)) {
                    float U1 = gb2Var2.U1(false) + gb2Var2.getLeft();
                    float y = gb2Var2.getY() + gb2Var2.getPaddingTop();
                    float alpha = gb2Var2.a() ? gb2Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(U1, y);
                    gb2Var2.setInvalidatesParent(true);
                    gb2Var2.h1(canvas, alpha);
                    gb2Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.j3;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            int i3 = 0;
            while (i3 < size3) {
                gb2 gb2Var3 = (gb2) arrayList5.get(i3);
                if (mu1Var.Na(gb2Var3, rectF)) {
                    arrayList2 = arrayList5;
                } else {
                    boolean z3 = (gb2Var3.getCurrentPosition() == null || (gb2Var3.getCurrentPosition().l & z) != 0) ? z2 : z;
                    float alpha2 = gb2Var3.a() ? gb2Var3.getAlpha() : 1.0f;
                    float U12 = gb2Var3.U1(z2) + gb2Var3.getLeft();
                    float y2 = gb2Var3.getY() + gb2Var3.getPaddingTop();
                    canvas.save();
                    f27 currentMessagesGroup = gb2Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup != null) {
                        e27 e27Var = currentMessagesGroup.m;
                        if (e27Var.j) {
                            float U13 = gb2Var3.U1(z);
                            float f2 = e27Var.a + U13 + e27Var.e;
                            arrayList2 = arrayList5;
                            float f3 = e27Var.b + e27Var.f;
                            float f4 = e27Var.c + U13 + e27Var.g;
                            float f5 = e27Var.d + e27Var.h;
                            if (!e27Var.j) {
                                f3 += gb2Var3.getTranslationY();
                                f5 += gb2Var3.getTranslationY();
                            }
                            canvas.clipRect(f2 + gl.L(8.0f), f3 + gl.L(8.0f), f4 - gl.L(8.0f), f5 - gl.L(8.0f));
                            if (gb2Var3.getTransitionParams().w0) {
                                canvas.translate(U12, y2);
                                gb2Var3.setInvalidatesParent(true);
                                gb2Var3.Q0(alpha2, canvas, z3);
                                gb2Var3.setInvalidatesParent(false);
                            }
                            canvas.restore();
                        }
                    }
                    arrayList2 = arrayList5;
                    if (gb2Var3.getTransitionParams().w0) {
                    }
                    canvas.restore();
                }
                i3++;
                arrayList5 = arrayList2;
                z = 1;
                z2 = false;
            }
            f = 8.0f;
            arrayList5.clear();
        } else {
            f = 8.0f;
        }
        ArrayList arrayList6 = this.k3;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            int i4 = 0;
            while (i4 < size4) {
                gb2 gb2Var4 = (gb2) arrayList6.get(i4);
                if (mu1Var.Na(gb2Var4, rectF)) {
                    arrayList = arrayList6;
                } else {
                    boolean z4 = gb2Var4.getCurrentPosition() != null && (gb2Var4.getCurrentPosition().l & 1) == 0;
                    float alpha3 = gb2Var4.a() ? gb2Var4.getAlpha() : 1.0f;
                    float U14 = gb2Var4.U1(false) + gb2Var4.getLeft();
                    float y3 = gb2Var4.getY() + gb2Var4.getPaddingTop();
                    canvas.save();
                    f27 currentMessagesGroup2 = gb2Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        e27 e27Var2 = currentMessagesGroup2.m;
                        if (e27Var2.j) {
                            float U15 = gb2Var4.U1(true);
                            float f6 = e27Var2.a + U15 + e27Var2.e;
                            float f7 = e27Var2.b + e27Var2.f;
                            float f8 = e27Var2.c + U15 + e27Var2.g;
                            arrayList = arrayList6;
                            float f9 = e27Var2.d + e27Var2.h;
                            if (!e27Var2.j) {
                                f7 += gb2Var4.getTranslationY();
                                f9 += gb2Var4.getTranslationY();
                            }
                            canvas.clipRect(f6 + gl.L(f), f7 + gl.L(f), f8 - gl.L(f), f9 - gl.L(f));
                            if (!z4 && gb2Var4.getTransitionParams().w0) {
                                canvas.translate(U14, y3);
                                gb2Var4.setInvalidatesParent(true);
                                gb2Var4.q1(canvas, alpha3, null);
                                gb2Var4.V0(canvas, alpha3);
                                gb2Var4.setInvalidatesParent(false);
                            }
                            canvas.restore();
                        }
                    }
                    arrayList = arrayList6;
                    if (!z4) {
                        canvas.translate(U14, y3);
                        gb2Var4.setInvalidatesParent(true);
                        gb2Var4.q1(canvas, alpha3, null);
                        gb2Var4.V0(canvas, alpha3);
                        gb2Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i4++;
                arrayList6 = arrayList;
            }
            arrayList6.clear();
        }
    }

    public final void B1(boolean z) {
        float f;
        VelocityTracker velocityTracker;
        mu1 mu1Var = this.G3;
        if (!z || (velocityTracker = mu1Var.B9) == null) {
            f = 0.0f;
        } else {
            velocityTracker.computeCurrentVelocity(1000);
            f = mu1Var.B9.getXVelocity();
        }
        VelocityTracker velocityTracker2 = mu1Var.B9;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            mu1Var.B9 = null;
        }
        mu1Var.y9 = false;
        mu1Var.C0.R = true;
        lwb lwbVar = mu1Var.n0;
        if (lwbVar != null) {
            lwbVar.settle(f);
        }
    }

    public final void C1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        f27 M6;
        k27 k27Var;
        boolean z;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        boolean z2;
        mu1 mu1Var = this.G3;
        if (motionEvent != null) {
            mu1Var.R4 = true;
        }
        if (mu1Var.b8() && mu1Var.v9 == null) {
            if (motionEvent == null) {
                if (mu1Var.y9) {
                    B1(false);
                }
                mu1Var.x9 = false;
            } else {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    z2 = ((d) mu1Var).inPreviewMode;
                    boolean z3 = (z2 || mu1Var.t7() || motionEvent.getX() < ((float) getMeasuredWidth()) * 0.55f) ? false : true;
                    mu1Var.x9 = z3;
                    if (z3) {
                        mu1Var.y9 = false;
                        mu1Var.z9 = motionEvent.getX();
                        mu1Var.A9 = motionEvent.getY();
                        VelocityTracker velocityTracker = mu1Var.B9;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        VelocityTracker obtain = VelocityTracker.obtain();
                        mu1Var.B9 = obtain;
                        obtain.addMovement(motionEvent);
                        return;
                    }
                    mu1Var.y9 = false;
                } else if (mu1Var.x9 || mu1Var.y9) {
                    if (actionMasked != 2) {
                        if (actionMasked == 1 || actionMasked == 3) {
                            if (mu1Var.y9) {
                                VelocityTracker velocityTracker2 = mu1Var.B9;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.addMovement(motionEvent);
                                }
                                B1(actionMasked == 1);
                            }
                            mu1Var.x9 = false;
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker3 = mu1Var.B9;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float x = motionEvent.getX() - mu1Var.z9;
                    float abs = Math.abs(motionEvent.getY() - mu1Var.A9);
                    if (!mu1Var.x9 || mu1Var.y9 || getScrollState() != 0 || x > (-gl.Z0(true, 0.4f)) || Math.abs(x) / 3.0f <= abs || mu1Var.v6() == null) {
                        if (mu1Var.y9) {
                            mu1Var.n0.setProgress((-(motionEvent.getX() - mu1Var.z9)) / mu1Var.n0.getContentWidth());
                            return;
                        }
                        return;
                    }
                    MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.onInterceptTouchEvent(obtain2);
                    obtain2.recycle();
                    mu1Var.C0.R = false;
                    mu1Var.x9 = false;
                    mu1Var.y9 = true;
                    mu1Var.z9 = motionEvent.getX();
                    lwb lwbVar = mu1Var.n0;
                    ValueAnimator valueAnimator = lwbVar.K;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        lwbVar.K = null;
                    }
                    gl.t1(mu1Var.m1);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return;
                    }
                    return;
                }
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !mu1Var.C9 && !mu1Var.w9 && mu1Var.v9 == null) {
            z = ((d) mu1Var).inPreviewMode;
            if (!z) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof gb2)) {
                    if (!(pressedChildView instanceof uk1)) {
                        return;
                    }
                    uk1 uk1Var = (uk1) pressedChildView;
                    float x2 = motionEvent.getX() - pressedChildView.getX();
                    float y = motionEvent.getY() - pressedChildView.getY();
                    if (!uk1Var.V()) {
                        return;
                    }
                    nkc nkcVar = uk1Var.J0;
                    float f = (x2 - uk1Var.L0) - (uk1Var.k0 / 2.0f);
                    float paddingTop = (y - uk1Var.M0) - uk1Var.getPaddingTop();
                    mkc mkcVar = nkcVar.m;
                    if (mkcVar != null && mkcVar.n && nkcVar.w.contains((int) f, (int) paddingTop)) {
                        return;
                    }
                }
                if (mu1Var.v9 != null) {
                    mu1Var.pc(0.0f);
                }
                mu1Var.v9 = pressedChildView;
                k27 i7 = mu1Var.i7();
                boolean J4 = mu1Var.J4(i7);
                int i = mu1Var.g4;
                if ((i != 0 && i != 5 && i != 8 && (i != 3 || mu1Var.s4 != mu1Var.getUserConfig().e())) || (((arrayList = mu1Var.p4) != null && arrayList.contains(i7)) || ((mu1Var.S6(i7) == 1 && (k27.B0(i7.k) == mu1Var.d7 || i7.l5())) || ((mu1Var.h == null && i7.e1() < 0) || (((chat2 = mu1Var.e) != null && hc2.c0(chat2) && !J4) || mu1Var.t7() || (k27.c3(i7.k) && i7.N3())))))) {
                    mu1Var.pc(0.0f);
                    mu1Var.v9 = null;
                    return;
                } else {
                    this.o3 = motionEvent.getPointerId(0);
                    mu1Var.w9 = true;
                    this.m3 = (int) motionEvent.getX();
                    this.n3 = (int) motionEvent.getY();
                    return;
                }
            }
        }
        if (mu1Var.v9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.o3) {
            int max = Math.max(gl.L(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.m3)));
            int abs2 = Math.abs(((int) motionEvent.getY()) - this.n3);
            if (getScrollState() == 0 && mu1Var.w9 && !mu1Var.C9 && max <= (-gl.Z0(true, 0.4f)) && Math.abs(max) / 3 > abs2) {
                MotionEvent obtain3 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                mu1Var.v9.onTouchEvent(obtain3);
                super.onInterceptTouchEvent(obtain3);
                obtain3.recycle();
                mu1Var.C0.R = false;
                mu1Var.w9 = false;
                mu1Var.C9 = true;
                this.m3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (mu1Var.C9) {
                if (Math.abs(max) < gl.L(50.0f)) {
                    this.s3 = false;
                } else if (!this.s3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.s3 = true;
                }
                float f2 = max;
                mu1Var.pc(f2);
                k27 i72 = mu1Var.i7();
                if (i72 != null && (i72.g4() || k27.K4(i72.k))) {
                    mu1Var.jd(false, false);
                }
                View view = mu1Var.v9;
                if (view instanceof gb2) {
                    D1((gb2) view, f2);
                }
                invalidate();
                return;
            }
            return;
        }
        if (mu1Var.v9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.o3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = mu1Var.v9;
                if (Math.abs(view2 instanceof gb2 ? ((gb2) view2).U1(false) : view2 instanceof uk1 ? ((uk1) view2).getWalletSlidingOffset() : 0.0f) >= gl.L(50.0f)) {
                    k27 i73 = mu1Var.i7();
                    boolean J42 = mu1Var.J4(i73);
                    er1 er1Var = mu1Var.d1;
                    if ((er1Var == null || er1Var.getVisibility() != 0 || ((mu1Var.X0 && J42) || i73.X1)) && ((chat = mu1Var.e) == null || ((!hc2.r0(chat) || mu1Var.a8()) && ((!hc2.T(mu1Var.e) || hc2.w(5, mu1Var.e) || mu1Var.e.megagroup) && hc2.n(mu1Var.e))))) {
                        mu1Var.Rb(mu1Var.i7());
                    } else {
                        if (i73.c1() != 0 && (M6 = mu1Var.M6(i73.c1())) != null && (k27Var = M6.h) != null) {
                            i73 = k27Var;
                        }
                        mu1Var.F5 = i73;
                        Bundle j = tb4.j(3, "onlySelect", "dialogsType", true);
                        j.putBoolean("quote", true);
                        j.putBoolean("reply_to", true);
                        mu1Var.Ma(j, i73);
                        j.putInt("messagesCount", 1);
                        j.putBoolean("canSelectTopics", true);
                        cj3 cj3Var = new cj3(j);
                        cj3Var.E2 = mu1Var;
                        mu1Var.presentFragment(cj3Var);
                    }
                }
            }
            View view3 = mu1Var.v9;
            float slidingOffsetX = view3 instanceof gb2 ? ((gb2) view3).getSlidingOffsetX() : view3 instanceof uk1 ? ((uk1) view3).getWalletSlidingOffset() : 0.0f;
            this.r3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                mu1Var.v9 = null;
            }
            this.p3 = System.currentTimeMillis();
            this.q3 = 0.0f;
            invalidate();
            mu1Var.w9 = false;
            mu1Var.C9 = false;
            mu1Var.C0.R = true;
        }
    }

    public final void D1(gb2 gb2Var, float f) {
        f27 currentMessagesGroup = gb2Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != gb2Var && (childAt instanceof gb2)) {
                gb2 gb2Var2 = (gb2) childAt;
                if (gb2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    gb2Var2.setSlidingOffset(f);
                    gb2Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override // o39
    public final boolean G0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.G3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // o39, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mu1 mu1Var = this.G3;
        mu1Var.K8 = null;
        canvas.save();
        this.F1.setEmpty();
        if (mu1Var.ka != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-mu1Var.ka) - (mu1Var.ra != 0.0f ? (mu1Var.A0.getMeasuredHeight() - mu1Var.ka) * mu1Var.ra : 0.0f);
            mu1Var.Wa = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            z1(canvas, null);
            super.dispatchDraw(canvas);
            A1(canvas, null);
        }
        canvas.restore();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.f7) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(android.graphics.Canvas r44) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jq1.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0289, code lost:
    
        if ((r4 & 1) != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x023b, code lost:
    
        if (r8.c != 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022e, code lost:
    
        if (r7.getTransitionParams().x0 != false) goto L134;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v45, types: [ni5] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v53, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v54, types: [ni5] */
    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        gb2 gb2Var;
        boolean z;
        gb2 gb2Var2;
        uk1 uk1Var;
        int i;
        f27 f27Var;
        int i2;
        boolean z2;
        float f;
        boolean z3;
        float f2;
        boolean z4;
        float f3;
        boolean z5;
        boolean z6;
        int paddingTop;
        gb2 gb2Var3;
        float f4;
        float checkBoxTranslation;
        int layoutHeight;
        float f5;
        int b;
        f27 f27Var2;
        int top;
        ?? r0;
        float checkBoxTranslation2;
        int b2;
        int i3;
        float x;
        float y;
        byte b3;
        k27 k27Var;
        mu1 mu1Var = this.G3;
        if (mu1Var.Y7()) {
            invalidate();
        }
        boolean z7 = view == mu1Var.Z8;
        boolean z8 = view instanceof gb2;
        if (z8) {
            gb2Var = (gb2) view;
            z = gb2Var.ub.x0;
        } else {
            gb2Var = null;
            z = false;
        }
        if ((!cja.l0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z7 = true;
        }
        if (z8) {
            gb2Var2 = (gb2) view;
            if (mu1Var.F6.contains(gb2Var2)) {
                z7 = true;
            }
            c27 currentPosition = gb2Var2.getCurrentPosition();
            f27Var = gb2Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i4 = currentPosition.e;
                int i5 = currentPosition.i;
                if (i4 != i5 && i5 == 1000 && currentPosition.m == null && f27Var.b) {
                    i = gb2Var2.getBackgroundDrawableLeft();
                    i2 = 0;
                    b3 = gb2Var2.M1;
                    if (b3 != 7) {
                    }
                    mu1Var.K8 = gb2Var2;
                    if (!z7) {
                    }
                    if (z7) {
                    }
                    uk1Var = null;
                } else if (currentPosition.m != null) {
                    i2 = view.getBottom() - gl.L((gb2Var2.K2() ? 1 : 0) + 1);
                    i = 0;
                    b3 = gb2Var2.M1;
                    if ((b3 != 7 || b3 == 4) && (k27Var = gb2Var2.Q5) != null && k27Var.D != 5 && MediaController.w().D(gb2Var2.Q5)) {
                        mu1Var.K8 = gb2Var2;
                    }
                    if (!z7) {
                        View view2 = mu1Var.Z8;
                        if (view2 instanceof gb2) {
                            gb2 gb2Var4 = (gb2) view2;
                            if (gb2Var4.getCurrentMessagesGroup() != null && gb2Var4.getCurrentMessagesGroup() == f27Var) {
                                z7 = true;
                            }
                        }
                    }
                    if (z7) {
                        gb2Var2.getPhotoImage().getClass();
                    }
                    uk1Var = null;
                }
            }
            i = 0;
            i2 = 0;
            b3 = gb2Var2.M1;
            if (b3 != 7) {
            }
            mu1Var.K8 = gb2Var2;
            if (!z7) {
            }
            if (z7) {
            }
            uk1Var = null;
        } else {
            if (view instanceof uk1) {
                uk1Var = (uk1) view;
                gb2Var2 = null;
            } else {
                gb2Var2 = null;
                uk1Var = null;
            }
            i = 0;
            f27Var = null;
            i2 = 0;
        }
        if (i != 0) {
            canvas.save();
        } else if (i2 != 0) {
            canvas.save();
        }
        if (z7) {
            z7 = false;
        }
        if (z7) {
            z2 = true;
            f = 0.0f;
            z3 = false;
        } else {
            boolean z9 = (gb2Var2 == null || gb2Var2.ub.w1 || f27Var == null || !f27Var.m.j) ? false : true;
            if (z9) {
                canvas.save();
                float U1 = gb2Var2.U1(true);
                e27 e27Var = f27Var.m;
                z2 = true;
                float f6 = e27Var.c + U1;
                f = 0.0f;
                canvas.clipRect(e27Var.a + U1 + e27Var.e + gl.L(4.0f), e27Var.b + e27Var.f + gl.L(4.0f), (f6 + e27Var.g) - gl.L(4.0f), (e27Var.d + e27Var.h) - gl.L(4.0f));
            } else {
                z2 = true;
                f = 0.0f;
            }
            if (gb2Var2 != null) {
                nb2 nb2Var = gb2Var2.ub;
                if (nb2Var.w1) {
                    canvas.save();
                    canvas.translate(gb2Var2.getX(), gb2Var2.getY());
                    gb2Var2.d1(canvas);
                    canvas.restore();
                    z3 = nb2Var.h;
                } else if (z9) {
                    z3 = super.drawChild(canvas, view, j);
                }
                if (z9) {
                    canvas.restore();
                }
                if (gb2Var2 == null && gb2Var2.l2()) {
                    canvas.save();
                    canvas.translate(gb2Var2.getX(), gb2Var2.getPaddingTopAnimated() + gb2Var2.getY());
                    gb2Var2.i1(canvas);
                    canvas.restore();
                } else if (uk1Var != null) {
                    canvas.save();
                    canvas.translate(uk1Var.getX(), uk1Var.getY());
                    uk1Var.L(canvas);
                    canvas.restore();
                }
            }
            z3 = super.drawChild(canvas, view, j);
            if (z9) {
            }
            if (gb2Var2 == null) {
            }
            if (uk1Var != null) {
            }
        }
        if (i != 0 || i2 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f) {
            canvas.save();
            f2 = f;
            canvas.translate(f2, view.getTranslationY());
        } else {
            f2 = f;
        }
        if (gb2Var2 != null) {
            gb2Var2.S0(canvas);
        }
        if (view.getTranslationY() != f2) {
            canvas.restore();
        }
        if (view.getTranslationY() != f2) {
            canvas.save();
            canvas.translate(f2, view.getTranslationY());
        }
        if (gb2Var2 != null) {
            k27 messageObject = gb2Var2.getMessageObject();
            c27 currentPosition2 = gb2Var2.getCurrentPosition();
            if (!z7) {
                if (currentPosition2 != null) {
                    if (!currentPosition2.h) {
                        if (currentPosition2.a == 0) {
                        }
                        if (currentPosition2 == null || gb2Var2.getTransitionParams().D0 || gb2Var2.getTransitionParams().x0) {
                            if (currentPosition2 != null || (currentPosition2.l & gb2Var2.H()) != 0) {
                                this.j3.add(gb2Var2);
                            }
                            if (currentPosition2 != null) {
                                int i6 = currentPosition2.l;
                                if ((i6 & 8) != 0) {
                                }
                            }
                            this.k3.add(gb2Var2);
                        }
                        if (mu1Var.J8 != null && ((messageObject.g4() || k27.K4(messageObject.k)) && !messageObject.S4() && MediaController.w().D(messageObject))) {
                            ImageReceiver photoImage = gb2Var2.getPhotoImage();
                            x = gb2Var2.getX() + photoImage.L0;
                            y = (mu1Var.A0.getY() + ((gb2Var2.getY() + gb2Var2.getPaddingTop()) + photoImage.M0)) - mu1Var.J8.getTop();
                            if (mu1Var.J8.getTranslationX() == x || mu1Var.J8.getTranslationY() != y) {
                                mu1Var.J8.setTranslationX(x);
                                mu1Var.J8.setTranslationY(y);
                                mu1Var.fragmentView.invalidate();
                                mu1Var.J8.invalidate();
                            }
                        }
                    }
                }
                if (currentPosition2 == null || currentPosition2.h) {
                    this.h3.add(gb2Var2);
                }
                if ((currentPosition2 == null || (currentPosition2.a == 0 && currentPosition2.c == 0)) && gb2Var2.k2()) {
                    this.i3.add(gb2Var2);
                }
                if (currentPosition2 == null) {
                }
                if (currentPosition2 != null) {
                }
                this.j3.add(gb2Var2);
                if (currentPosition2 != null) {
                }
                this.k3.add(gb2Var2);
                if (mu1Var.J8 != null) {
                    ImageReceiver photoImage2 = gb2Var2.getPhotoImage();
                    x = gb2Var2.getX() + photoImage2.L0;
                    y = (mu1Var.A0.getY() + ((gb2Var2.getY() + gb2Var2.getPaddingTop()) + photoImage2.M0)) - mu1Var.J8.getTop();
                    if (mu1Var.J8.getTranslationX() == x) {
                    }
                    mu1Var.J8.setTranslationX(x);
                    mu1Var.J8.setTranslationY(y);
                    mu1Var.fragmentView.invalidate();
                    mu1Var.J8.invalidate();
                }
            }
        }
        if (gb2Var != null) {
            k27 messageObject2 = gb2Var.getMessageObject();
            c27 currentPosition3 = gb2Var.getCurrentPosition();
            ImageReceiver avatarImage = gb2Var.getAvatarImage();
            if (avatarImage != null && mu1Var.f7() < 1.0f) {
                f27 n7 = mu1Var.n7(messageObject2);
                if (!gb2Var.getMessageObject().Z) {
                    mu1Var.A0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z5 = z2;
                        z6 = (!mu1Var.A0.W1 || (n7 != null && n7.m.j)) ? z2 : false;
                        paddingTop = view.getPaddingTop() + (!z6 ? view.getTop() : (int) view.getY());
                        if (gb2Var.n()) {
                            if (gb2Var.La) {
                                b2 = ((SparseArray) mu1Var.o9.s).indexOfValue(view);
                                if (b2 >= 0) {
                                    b2 = ((SparseArray) mu1Var.o9.s).keyAt(b2);
                                }
                            } else {
                                b2 = mu1Var.A0.T(view).b();
                            }
                            if (b2 >= 0) {
                                if (n7 != null) {
                                    ArrayList arrayList = n7.e;
                                    if (currentPosition3 != null) {
                                        int indexOf = arrayList.indexOf(currentPosition3);
                                        f4 = 1.0f;
                                        int size = arrayList.size();
                                        z4 = z3;
                                        if ((currentPosition3.l & 8) == 0) {
                                            i3 = b2 - 1;
                                            int i7 = indexOf + 1;
                                            while (i7 < size) {
                                                gb2Var3 = gb2Var2;
                                                if (((c27) arrayList.get(i7)).c > currentPosition3.d) {
                                                    break;
                                                }
                                                i3--;
                                                i7++;
                                                gb2Var2 = gb2Var3;
                                            }
                                        } else {
                                            i3 = (b2 - size) + indexOf;
                                        }
                                        gb2Var3 = gb2Var2;
                                        if (gb2Var.La) {
                                            if (mu1Var.A0.K(i3) != null) {
                                                if (view.getTranslationY() != 0.0f) {
                                                    canvas.restore();
                                                }
                                                avatarImage.v0(false, false);
                                                return z4;
                                            }
                                        } else if (((View) ((SparseArray) mu1Var.o9.s).get(i3)) != null) {
                                            if (view.getTranslationY() != 0.0f) {
                                                canvas.restore();
                                            }
                                            avatarImage.v0(false, false);
                                            return z4;
                                        }
                                        checkBoxTranslation = gb2Var.getCheckBoxTranslation() + gb2Var.getSlidingOffsetX();
                                        layoutHeight = (int) (gb2Var3.getLayoutHeight() + gb2Var3.getTransitionParams().j0 + ((int) (gb2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                                        int measuredHeight = mu1Var.A0.getMeasuredHeight() - mu1Var.A0.getPaddingBottom();
                                        boolean z10 = ((!gb2Var.n1 || gb2Var.o1) && checkBoxTranslation == 0.0f) ? z2 : false;
                                        if (!gb2Var.M2() || gb2Var.getTransitionParams().l2) {
                                            if (gb2Var.getTransitionParams().l2) {
                                                float f7 = gb2Var.getTransitionParams().L1;
                                                if (!gb2Var.M2()) {
                                                    f7 = f4 - f7;
                                                }
                                                layoutHeight = (int) tb4.A(f4, f7, Math.min(layoutHeight, measuredHeight), layoutHeight * f7);
                                            }
                                        } else if (layoutHeight > measuredHeight) {
                                            layoutHeight = measuredHeight;
                                        }
                                        if (!z6 && view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        if (gb2Var.j()) {
                                            if (gb2Var.La) {
                                                b = ((SparseArray) mu1Var.o9.s).indexOfValue(view);
                                                if (b >= 0) {
                                                    b = ((SparseArray) mu1Var.o9.s).keyAt(b);
                                                }
                                            } else {
                                                b = mu1Var.A0.T(view).b();
                                            }
                                            if (b >= 0) {
                                                int i8 = paddingTop;
                                                int i9 = b;
                                                gb2 gb2Var5 = gb2Var;
                                                float f8 = checkBoxTranslation;
                                                int i10 = 0;
                                                while (i10 < 20) {
                                                    i10++;
                                                    if (n7 != null) {
                                                        ArrayList arrayList2 = n7.e;
                                                        if (currentPosition3 != null) {
                                                            int indexOf2 = arrayList2.indexOf(currentPosition3);
                                                            if (indexOf2 < 0) {
                                                                break;
                                                            }
                                                            arrayList2.size();
                                                            f27Var2 = n7;
                                                            if ((currentPosition3.l & 4) == 0) {
                                                                i9++;
                                                                int i11 = indexOf2 - 1;
                                                                while (i11 >= 0) {
                                                                    int i12 = i11;
                                                                    if (((c27) arrayList2.get(i11)).d < currentPosition3.c) {
                                                                        break;
                                                                    }
                                                                    i9++;
                                                                    i11 = i12 - 1;
                                                                }
                                                            } else {
                                                                i9 = i9 + indexOf2 + 1;
                                                            }
                                                            if (!gb2Var5.m()) {
                                                                ?? r02 = (View) ((SparseArray) mu1Var.o9.s).get(i9);
                                                                if (r02 == 0) {
                                                                    break;
                                                                }
                                                                top = r02.getTop() + r02.getPaddingTop();
                                                                if (!(r02 instanceof ni5)) {
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = f8;
                                                                    gb2Var = gb2Var5;
                                                                    break;
                                                                }
                                                                r0 = (ni5) r02;
                                                                checkBoxTranslation2 = r0.getCheckBoxTranslation() + r0.getSlidingOffsetX();
                                                                if (!z10 || checkBoxTranslation2 <= 0.0f) {
                                                                    checkBoxTranslation2 = f8;
                                                                }
                                                                if (!r0.j()) {
                                                                    gb2Var = r0;
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = checkBoxTranslation2;
                                                                    break;
                                                                }
                                                                gb2Var5 = r0;
                                                                f8 = checkBoxTranslation2;
                                                                i8 = top;
                                                                n7 = f27Var2;
                                                            } else {
                                                                s49 K = mu1Var.A0.K(i9);
                                                                if (K == null) {
                                                                    break;
                                                                }
                                                                ?? r03 = K.a;
                                                                top = r03.getTop() + r03.getPaddingTop();
                                                                if (!(r03 instanceof gb2)) {
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = f8;
                                                                    gb2Var = gb2Var5;
                                                                    break;
                                                                }
                                                                r0 = (ni5) r03;
                                                                checkBoxTranslation2 = r0.getCheckBoxTranslation() + r0.getSlidingOffsetX();
                                                                if (!z10 || checkBoxTranslation2 <= 0.0f) {
                                                                    checkBoxTranslation2 = f8;
                                                                }
                                                                if (!r0.j()) {
                                                                    gb2Var = r0;
                                                                    paddingTop = top;
                                                                    checkBoxTranslation = checkBoxTranslation2;
                                                                    break;
                                                                }
                                                                gb2Var5 = r0;
                                                                f8 = checkBoxTranslation2;
                                                                i8 = top;
                                                                n7 = f27Var2;
                                                            }
                                                        }
                                                    }
                                                    f27Var2 = n7;
                                                    i9++;
                                                    if (!gb2Var5.m()) {
                                                    }
                                                }
                                                checkBoxTranslation = f8;
                                                gb2Var = gb2Var5;
                                                paddingTop = i8;
                                            }
                                        }
                                        if (layoutHeight - gl.L(48.0f) < paddingTop) {
                                            layoutHeight = gl.L(48.0f) + paddingTop;
                                        }
                                        if (!gb2Var.n()) {
                                            int bottom = z6 ? view.getBottom() : (int) (gb2Var.getDeltaBottom() + gb2Var.getY() + gb2Var.getMeasuredHeight());
                                            if (layoutHeight > bottom) {
                                                layoutHeight = bottom;
                                            }
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                            canvas.translate(checkBoxTranslation, 0.0f);
                                        }
                                        if (gb2Var instanceof gb2) {
                                            gb2 gb2Var6 = gb2Var;
                                            if (gb2Var6.getCurrentMessagesGroup() != null && gb2Var6.getCurrentMessagesGroup().m.j) {
                                                layoutHeight = (int) (layoutHeight - gb2Var6.getTranslationY());
                                            }
                                        }
                                        if (z5) {
                                            avatarImage.M0 = layoutHeight - gl.L(44.0f);
                                        }
                                        if (gb2Var.a()) {
                                            f5 = 1.0f;
                                            avatarImage.setAlpha(1.0f - mu1Var.f7());
                                        } else {
                                            avatarImage.setAlpha(gb2Var.getAlpha() * (1.0f - mu1Var.f7()));
                                            canvas.scale(gb2Var.getScaleX(), gb2Var.getScaleY(), gb2Var.getPivotX() + gb2Var.getX(), gb2Var.getY() + (gb2Var.getHeight() >> 1));
                                            f5 = 1.0f;
                                        }
                                        if (z5) {
                                            avatarImage.v0(z2, false);
                                        }
                                        if (mu1Var.f7() <= 0.0f) {
                                            canvas.scale(f5 - mu1Var.f7(), f5 - mu1Var.f7(), avatarImage.w(), avatarImage.x());
                                            f3 = 0.0f;
                                            canvas.translate(mu1Var.f7() * gl.L(24.0f), 0.0f);
                                        } else {
                                            f3 = 0.0f;
                                        }
                                        avatarImage.h(canvas, null);
                                        canvas.restore();
                                        if (!z6 && view.getTranslationY() != f3) {
                                            canvas.save();
                                        }
                                        if (view.getTranslationY() != f3) {
                                            canvas.restore();
                                        }
                                        return z4;
                                    }
                                }
                                z4 = z3;
                                gb2Var3 = gb2Var2;
                                f4 = 1.0f;
                                i3 = b2 - 1;
                                if (gb2Var.La) {
                                }
                                checkBoxTranslation = gb2Var.getCheckBoxTranslation() + gb2Var.getSlidingOffsetX();
                                layoutHeight = (int) (gb2Var3.getLayoutHeight() + gb2Var3.getTransitionParams().j0 + ((int) (gb2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                                int measuredHeight2 = mu1Var.A0.getMeasuredHeight() - mu1Var.A0.getPaddingBottom();
                                if (gb2Var.n1) {
                                }
                                if (gb2Var.M2()) {
                                }
                                if (gb2Var.getTransitionParams().l2) {
                                }
                                if (!z6) {
                                    canvas.restore();
                                }
                                if (gb2Var.j()) {
                                }
                                if (layoutHeight - gl.L(48.0f) < paddingTop) {
                                }
                                if (!gb2Var.n()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (gb2Var instanceof gb2) {
                                }
                                if (z5) {
                                }
                                if (gb2Var.a()) {
                                }
                                if (z5) {
                                }
                                if (mu1Var.f7() <= 0.0f) {
                                }
                                avatarImage.h(canvas, null);
                                canvas.restore();
                                if (!z6) {
                                    canvas.save();
                                }
                                if (view.getTranslationY() != f3) {
                                }
                                return z4;
                            }
                        }
                        z4 = z3;
                        gb2Var3 = gb2Var2;
                        f4 = 1.0f;
                        checkBoxTranslation = gb2Var.getCheckBoxTranslation() + gb2Var.getSlidingOffsetX();
                        layoutHeight = (int) (gb2Var3.getLayoutHeight() + gb2Var3.getTransitionParams().j0 + ((int) (gb2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                        int measuredHeight22 = mu1Var.A0.getMeasuredHeight() - mu1Var.A0.getPaddingBottom();
                        if (gb2Var.n1) {
                        }
                        if (gb2Var.M2()) {
                        }
                        if (gb2Var.getTransitionParams().l2) {
                        }
                        if (!z6) {
                        }
                        if (gb2Var.j()) {
                        }
                        if (layoutHeight - gl.L(48.0f) < paddingTop) {
                        }
                        if (!gb2Var.n()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (gb2Var instanceof gb2) {
                        }
                        if (z5) {
                        }
                        if (gb2Var.a()) {
                        }
                        if (z5) {
                        }
                        if (mu1Var.f7() <= 0.0f) {
                        }
                        avatarImage.h(canvas, null);
                        canvas.restore();
                        if (!z6) {
                        }
                        if (view.getTranslationY() != f3) {
                        }
                        return z4;
                    }
                }
                z5 = false;
                if (mu1Var.A0.W1) {
                }
                paddingTop = view.getPaddingTop() + (!z6 ? view.getTop() : (int) view.getY());
                if (gb2Var.n()) {
                }
                z4 = z3;
                gb2Var3 = gb2Var2;
                f4 = 1.0f;
                checkBoxTranslation = gb2Var.getCheckBoxTranslation() + gb2Var.getSlidingOffsetX();
                layoutHeight = (int) (gb2Var3.getLayoutHeight() + gb2Var3.getTransitionParams().j0 + ((int) (gb2Var.getPaddingTopAnimated() + ((int) (0.0f + (!z6 ? view.getTop() : view.getY()))))));
                int measuredHeight222 = mu1Var.A0.getMeasuredHeight() - mu1Var.A0.getPaddingBottom();
                if (gb2Var.n1) {
                }
                if (gb2Var.M2()) {
                }
                if (gb2Var.getTransitionParams().l2) {
                }
                if (!z6) {
                }
                if (gb2Var.j()) {
                }
                if (layoutHeight - gl.L(48.0f) < paddingTop) {
                }
                if (!gb2Var.n()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (gb2Var instanceof gb2) {
                }
                if (z5) {
                }
                if (gb2Var.a()) {
                }
                if (z5) {
                }
                if (mu1Var.f7() <= 0.0f) {
                }
                avatarImage.h(canvas, null);
                canvas.restore();
                if (!z6) {
                }
                if (view.getTranslationY() != f3) {
                }
                return z4;
            }
        }
        z4 = z3;
        f3 = 0.0f;
        if (view.getTranslationY() != f3) {
        }
        return z4;
    }

    @Override // o39
    public final void k1(View view, float f, float f2, boolean z) {
        f27 currentMessagesGroup;
        super.k1(view, f, f2, z);
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            k27 messageObject = gb2Var.getMessageObject();
            if (messageObject.I3() || messageObject.U2() || (currentMessagesGroup = gb2Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != view && (childAt instanceof gb2)) {
                    gb2 gb2Var2 = (gb2) childAt;
                    if (gb2Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        gb2Var2.setPressed(z);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        int i;
        kc2 kc2Var;
        int i2;
        float f3;
        int i3;
        String M0;
        String M02;
        String M03;
        int i4;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i5;
        jq1 jq1Var;
        Paint paint;
        Paint paint2;
        float f4;
        float f5;
        float f6;
        ti4 ti4Var;
        float f7;
        float f8;
        Paint paint3;
        float f9;
        Paint paint4;
        Paint paint5;
        float f10;
        float f11;
        Paint paint6;
        wjb wjbVar;
        float f12;
        ti4 ti4Var2;
        float f13;
        int i6;
        Paint paint7;
        super.onDraw(canvas);
        mu1 mu1Var = this.G3;
        View view = mu1Var.v9;
        if (view != null) {
            float slidingOffsetX = view instanceof gb2 ? ((gb2) view).getSlidingOffsetX() : view instanceof uk1 ? ((uk1) view).getWalletSlidingOffset() : 0.0f;
            if (!mu1Var.w9 && !mu1Var.C9 && this.r3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f14 = ((currentTimeMillis - this.p3) / 180.0f) + this.q3;
                this.q3 = f14;
                if (f14 > 1.0f) {
                    this.q3 = 1.0f;
                    f14 = 1.0f;
                }
                this.p3 = currentTimeMillis;
                float interpolation = (1.0f - gl.F.getInterpolation(f14)) * this.r3;
                if (interpolation == 0.0f) {
                    this.r3 = 0.0f;
                }
                View view2 = mu1Var.v9;
                if (view2 instanceof gb2) {
                    D1((gb2) view2, interpolation);
                }
                mu1Var.pc(interpolation);
                k27 i7 = mu1Var.i7();
                if (i7 != null && (i7.g4() || k27.K4(i7.k))) {
                    mu1Var.jd(false, false);
                }
                float f15 = this.q3;
                if (f15 == 1.0f || f15 == 0.0f) {
                    mu1Var.pc(0.0f);
                    mu1Var.v9 = null;
                }
                invalidate();
            }
            if (mu1Var.v9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint X0 = X0("paintChatActionBackground");
                Paint paint8 = bkb.g2;
                Paint paint9 = this.u3;
                if (paint9.getColor() != X0.getColor()) {
                    paint9.setColor(X0.getColor());
                }
                Paint paint10 = this.v3;
                if (paint10.getColor() != paint8.getColor()) {
                    paint10.setColor(paint8.getColor());
                }
                if (paint9.getShader() != X0.getShader()) {
                    paint9.setShader(X0.getShader());
                }
                if (paint10.getShader() != paint8.getShader()) {
                    paint10.setShader(paint8.getShader());
                }
                ti4 ti4Var3 = this.y3;
                float f16 = ti4Var3.a;
                f = 255.0f;
                float f17 = this.t3;
                float f18 = f16 / f17;
                f2 = 2.0f;
                int color = paint10.getColor();
                if (f18 > 1.0f) {
                    this.C3 = true;
                }
                View view3 = mu1Var.v9;
                i = 2;
                float U1 = view3 instanceof gb2 ? ((gb2) view3).U1(false) : view3 instanceof uk1 ? ((uk1) view3).getWalletSlidingOffset() : 0.0f;
                ti4 ti4Var4 = this.w3;
                float f19 = ti4Var4.a;
                ti4 ti4Var5 = this.A3;
                yla ylaVar = this.B3;
                yla ylaVar2 = this.z3;
                if (f19 == 0.0f) {
                    ylaVar2.d();
                    paint = X0;
                    paint2 = paint8;
                    ylaVar2.m.i = 0.0d;
                    ti4Var3.a = 0.0f;
                    ylaVar.d();
                    ylaVar.m.i = 0.0d;
                    ti4Var5.a = 0.0f;
                    this.C3 = false;
                } else {
                    paint = X0;
                    paint2 = paint8;
                }
                if (((float) ylaVar2.m.i) != f17) {
                    f4 = 1.0f;
                    f5 = moe.a(((-U1) - gl.L(20.0f)) / gl.L(30.0f), 0.0f, 1.0f);
                } else {
                    f4 = 1.0f;
                    f5 = 1.0f;
                }
                if (f5 == f4) {
                    zla zlaVar = ylaVar2.m;
                    f6 = 20.0f;
                    ti4Var = ti4Var5;
                    if (((float) zlaVar.i) != f17) {
                        double d = f17;
                        zlaVar.i = d;
                        ylaVar2.h();
                        ylaVar.m.i = d;
                        ylaVar.h();
                    }
                } else {
                    f6 = 20.0f;
                    ti4Var = ti4Var5;
                }
                float f20 = U1 <= ((float) (-gl.L(f6))) ? f17 : 0.0f;
                yla ylaVar3 = this.x3;
                zla zlaVar2 = ylaVar3.m;
                if (f20 != ((float) zlaVar2.i)) {
                    zlaVar2.i = f20;
                    if (!ylaVar3.f) {
                        ylaVar3.h();
                    }
                }
                float f21 = ti4Var4.a / f17;
                k27 i72 = mu1Var.i7();
                float measuredWidth = (U1 * ((i72 == null || !i72.N3()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (mu1Var.v9.getMeasuredHeight() / 2.0f) + mu1Var.v9.getTop();
                if (this.C3) {
                    f8 = f18;
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f - f18;
                    f8 = f21;
                }
                int i8 = bkb.c6;
                wjb wjbVar2 = this.o2;
                boolean z = bm2.h(bkb.v0(i8, wjbVar2)) <= 0.5d;
                if (f21 != 0.0f) {
                    RectF rectF = gl.P;
                    ti4 ti4Var6 = ti4Var;
                    rectF.set((int) ((paint9.getStrokeWidth() / 2.0f) + (measuredWidth - (gl.L(16.0f) * f8))), (int) ((paint9.getStrokeWidth() / 2.0f) + (measuredHeight - (gl.L(16.0f) * f8))), (int) (((gl.L(16.0f) * f8) + measuredWidth) - (paint9.getStrokeWidth() / 2.0f)), (int) (((gl.L(16.0f) * f8) + measuredHeight) - (paint9.getStrokeWidth() / 2.0f)));
                    bkb.q(0.0f, getY() + rectF.top, getMeasuredWidth(), gl.q.y);
                    if (f18 == 0.0f) {
                        int alpha = paint9.getAlpha();
                        paint9.setAlpha((int) (alpha * f21));
                        float f22 = f5 * 360.0f;
                        f9 = f21;
                        paint5 = paint;
                        f11 = f17;
                        wjbVar = wjbVar2;
                        f10 = measuredWidth;
                        paint6 = paint2;
                        f12 = f5;
                        ti4Var2 = ti4Var6;
                        canvas.drawArc(rectF, -90.0f, f22, false, paint9);
                        paint9.setAlpha(alpha);
                        if (mu1Var.Ba.g()) {
                            int alpha2 = paint10.getAlpha();
                            paint4 = paint10;
                            if (z) {
                                paint4.setColor(-1);
                            }
                            paint4.setAlpha((int) (alpha2 * f9));
                            paint3 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f22, false, paint4);
                        } else {
                            paint3 = paint9;
                            paint4 = paint10;
                            canvas2 = canvas;
                        }
                    } else {
                        canvas2 = canvas;
                        paint3 = paint9;
                        f9 = f21;
                        paint4 = paint10;
                        paint5 = paint;
                        f10 = measuredWidth;
                        f11 = f17;
                        paint6 = paint2;
                        wjbVar = wjbVar2;
                        f12 = f5;
                        ti4Var2 = ti4Var6;
                    }
                } else {
                    canvas2 = canvas;
                    paint3 = paint9;
                    f9 = f21;
                    paint4 = paint10;
                    paint5 = paint;
                    f10 = measuredWidth;
                    f11 = f17;
                    paint6 = paint2;
                    wjbVar = wjbVar2;
                    f12 = f5;
                    ti4Var2 = ti4Var;
                }
                RectF rectF2 = gl.P;
                rectF2.set((int) (f10 - (gl.L(16.0f) * f8)), (int) (measuredHeight - (gl.L(16.0f) * f8)), (int) ((gl.L(16.0f) * f8) + f10), (int) ((gl.L(16.0f) * f8) + measuredHeight));
                int measuredWidth2 = getMeasuredWidth();
                Point point = gl.q;
                bkb.q(0.0f, getY() + rectF2.top, measuredWidth2, point.y);
                Path path = this.D3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, gl.L(16.0f) * f8, gl.L(16.0f) * f8, direction);
                int alpha3 = paint5.getAlpha();
                float f23 = 0.6f * f9 * f12;
                int i9 = (int) (alpha3 * f23);
                Paint paint11 = paint5;
                paint11.setAlpha(i9);
                canvas2.drawPath(path, paint11);
                paint11.setAlpha(alpha3);
                if (mu1Var.Ba.g()) {
                    int alpha4 = bkb.g2.getAlpha();
                    if (z) {
                        f13 = f7;
                        bkb.g2.setColor(-1);
                    } else {
                        f13 = f7;
                    }
                    bkb.g2.setAlpha((int) (alpha4 * f23));
                    canvas2.drawPath(path, bkb.g2);
                    bkb.g2.setAlpha(alpha4);
                } else {
                    f13 = f7;
                }
                int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                if (i10 != 0) {
                    i6 = i10;
                    paint7 = paint6;
                    rectF2.set((int) (f10 - (gl.L(16.0f) * f13)), (int) (measuredHeight - (gl.L(16.0f) * f13)), (int) ((gl.L(16.0f) * f13) + f10), (int) ((gl.L(16.0f) * f13) + measuredHeight));
                    path.rewind();
                    path.addRoundRect(rectF2, gl.L(16.0f), gl.L(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i6 = i10;
                    paint7 = paint6;
                }
                rectF2.set((int) (f10 - (gl.L(16.0f) * f8)), (int) (measuredHeight - (gl.L(16.0f) * f8)), (int) ((gl.L(16.0f) * f8) + f10), (int) ((gl.L(16.0f) * f8) + measuredHeight));
                bkb.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                path.rewind();
                path.addRoundRect(rectF2, gl.L(16.0f) * f8, gl.L(16.0f) * f8, direction);
                int alpha5 = paint11.getAlpha();
                float f24 = 0.4f * f9;
                paint11.setAlpha((int) (alpha5 * f24));
                canvas2.drawPath(path, paint11);
                paint11.setAlpha(alpha5);
                if (mu1Var.Ba.g()) {
                    int alpha6 = bkb.g2.getAlpha();
                    if (z) {
                        bkb.g2.setColor(-1);
                    }
                    bkb.g2.setAlpha((int) (f24 * alpha6));
                    canvas2.drawPath(path, bkb.g2);
                    bkb.g2.setAlpha(alpha6);
                }
                if (i6 != 0) {
                    canvas2.restore();
                }
                float f25 = ti4Var2.a / f11;
                if (f25 != 0.0f && f25 != 1.0f) {
                    float f26 = f25 + 1.0f;
                    float strokeWidth = paint3.getStrokeWidth();
                    float f27 = (1.0f - f25) * strokeWidth;
                    if (f27 != 0.0f) {
                        rectF2.set((int) ((f10 - (gl.L(16.0f) * f26)) + f27), (int) ((measuredHeight - (gl.L(16.0f) * f26)) + f27), (int) (((gl.L(16.0f) * f26) + f10) - f27), (int) (((gl.L(16.0f) * f26) + measuredHeight) - f27));
                        bkb.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), point.y);
                        int alpha7 = paint3.getAlpha();
                        paint3.setAlpha((int) (alpha7 * f9));
                        paint3.setStrokeWidth(f27);
                        canvas2.drawRoundRect(rectF2, gl.L(16.0f) * f26, gl.L(16.0f) * f26, paint3);
                        paint3.setStrokeWidth(strokeWidth);
                        paint3.setAlpha(alpha7);
                        if (mu1Var.Ba.g()) {
                            int alpha8 = paint4.getAlpha();
                            if (z) {
                                paint4.setColor(-1);
                            }
                            paint4.setAlpha((int) (alpha8 * f9));
                            paint4.setStrokeWidth(f27);
                            canvas2.drawRoundRect(rectF2, gl.L(16.0f) * f26, gl.L(16.0f) * f26, paint4);
                            paint4.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i11 = (int) (f9 * 255.0f);
                Drawable drawable = wjbVar != null ? wjbVar.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = bkb.P0("drawableReplyIcon");
                }
                drawable.setAlpha(i11);
                drawable.setBounds((int) (f10 - ((drawable.getIntrinsicWidth() / 2) * f8)), (int) (measuredHeight - ((drawable.getIntrinsicHeight() / 2) * f8)), (int) (((drawable.getIntrinsicWidth() / 2) * f8) + f10), (int) (((drawable.getIntrinsicHeight() / 2) * f8) + measuredHeight));
                drawable.draw(canvas2);
                drawable.setAlpha(kk7.d4);
                paint4.setColor(color);
                paint7.setColor(color);
                if (mu1Var.ka != 0.0f || mu1Var.isInPreviewMode() || mu1Var.mb || (i2 = mu1Var.g4) == 3 || i2 == 1) {
                    kc2Var = mu1Var.ma;
                    if (kc2Var == null) {
                        kc2Var.P = 0.0f;
                        kc2Var.O = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (mu1Var.ra != 0.0f) {
                    float measuredHeight2 = mu1Var.A0.getMeasuredHeight() - mu1Var.ka;
                    mu1 mu1Var2 = mu1Var.qa;
                    f3 = (measuredHeight2 + (mu1Var2 == null ? 0.0f : mu1Var2.la)) * mu1Var.ra;
                } else {
                    f3 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - mu1Var.Ya) - f3);
                if (mu1Var.ma == null) {
                    i5 = ((d) mu1Var).currentAccount;
                    kc2 kc2Var2 = new kc2(i5, mu1Var.fragmentView, mu1Var.l6, mu1Var.Ra, mu1Var.Sa, mu1Var.d(), mu1Var.Ba);
                    mu1Var.ma = kc2Var2;
                    kc2Var2.T = mu1Var.dd.e;
                    ArrayList arrayList = mu1Var.Fb;
                    if (arrayList == null || arrayList.isEmpty()) {
                        boolean z2 = mu1Var.x4;
                        kc2 kc2Var3 = mu1Var.ma;
                        if (z2) {
                            kc2Var3.h();
                        } else {
                            kc2Var3.f();
                        }
                    } else {
                        mu1Var.ma.g((TLRPC.Chat) mu1Var.Fb.get(0));
                    }
                    kc2 kc2Var4 = mu1Var.ma;
                    kc2Var4.G.I();
                    vl vlVar = kc2Var4.l0;
                    if (vlVar != null && (jq1Var = kc2Var4.b0) != null) {
                        vlVar.b(jq1Var);
                    }
                    kk7.f(kc2Var4.f0).b(kc2Var4, i);
                }
                kc2 kc2Var5 = mu1Var.ma;
                int measuredWidth3 = getMeasuredWidth() - (mu1Var.W7() ? gl.L(71.0f) : 0);
                ImageReceiver imageReceiver = kc2Var5.G;
                TextPaint textPaint = kc2Var5.f;
                TextPaint textPaint2 = kc2Var5.h;
                boolean z3 = kc2Var5.Y;
                if (measuredWidth3 != kc2Var5.c || (z3 && (tL_forumTopic = kc2Var5.I) != null && kc2Var5.J != tL_forumTopic.id)) {
                    kc2Var5.d = gl.L(56.0f) / f2;
                    kc2Var5.c = measuredWidth3;
                    TLRPC.Chat chat = kc2Var5.H;
                    if (chat != null) {
                        M0 = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = kc2Var5.I;
                        if (tL_forumTopic2 != null) {
                            M0 = tL_forumTopic2.title;
                        } else {
                            if (z3) {
                                i3 = 0;
                                M0 = k96.a0(null, null, 2131744067, na7.q1(kc2Var5.f0).K0(Long.valueOf(-kc2Var5.j0)).title);
                            } else {
                                i3 = 0;
                                M0 = k96.M0(2131744070, null);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) M0, i3, M0.length());
                            kc2Var5.y = measureText;
                            int x = b00.x(60.0f, kc2Var5.c, measureText);
                            kc2Var5.y = x;
                            kc2Var5.s = lwa.c(M0, textPaint, x, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, x, 1, true);
                            if (!kc2Var5.W) {
                                M02 = k96.M0(2131744068, null);
                                M03 = k96.M0(2131746134, null);
                            } else if (z3) {
                                M02 = k96.M0(2131744066, null);
                                M03 = k96.M0(2131746133, null);
                            } else {
                                boolean z4 = kc2Var5.X;
                                if (z4 && (i4 = kc2Var5.a) != kc2Var5.g0 && i4 != 0) {
                                    M02 = k96.M0(2131744072, null);
                                    M03 = k96.M0(2131746137, null);
                                } else if (z4) {
                                    M02 = k96.M0(2131744069, null);
                                    M03 = k96.M0(2131746135, null);
                                } else {
                                    M02 = k96.M0(2131744071, null);
                                    M03 = k96.M0(2131746136, null);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(M02);
                            kc2Var5.E = measureText2;
                            kc2Var5.E = b00.x(60.0f, kc2Var5.c, measureText2);
                            int i12 = kc2Var5.E;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            kc2Var5.w = new StaticLayout(M02, textPaint2, i12, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(M03);
                            kc2Var5.F = measureText3;
                            kc2Var5.F = b00.x(60.0f, kc2Var5.c, measureText3);
                            kc2Var5.x = new StaticLayout(M03, textPaint2, kc2Var5.F, alignment, 1.0f, 0.0f, false);
                            imageReceiver.i0((kc2Var5.c / f2) - (gl.L(40.0f) / f2), (gl.L(12.0f) + kc2Var5.d) - (gl.L(40.0f) / f2), gl.L(40.0f), gl.L(40.0f));
                            imageReceiver.q0((int) (gl.L(40.0f) / f2));
                            kc2Var5.d0.d(gl.L(28.0f), gl.L(100.0f));
                            if (z3) {
                                kc2Var5.J = kc2Var5.I == null ? 0L : r3.id;
                            }
                        }
                    }
                    i3 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) M0, i3, M0.length());
                    kc2Var5.y = measureText4;
                    int x2 = b00.x(60.0f, kc2Var5.c, measureText4);
                    kc2Var5.y = x2;
                    kc2Var5.s = lwa.c(M0, textPaint, x2, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, x2, 1, true);
                    if (!kc2Var5.W) {
                    }
                    int measureText22 = (int) textPaint2.measureText(M02);
                    kc2Var5.E = measureText22;
                    kc2Var5.E = b00.x(60.0f, kc2Var5.c, measureText22);
                    int i122 = kc2Var5.E;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    kc2Var5.w = new StaticLayout(M02, textPaint2, i122, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(M03);
                    kc2Var5.F = measureText32;
                    kc2Var5.F = b00.x(60.0f, kc2Var5.c, measureText32);
                    kc2Var5.x = new StaticLayout(M03, textPaint2, kc2Var5.F, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.i0((kc2Var5.c / f2) - (gl.L(40.0f) / f2), (gl.L(12.0f) + kc2Var5.d) - (gl.L(40.0f) / f2), gl.L(40.0f), gl.L(40.0f));
                    imageReceiver.q0((int) (gl.L(40.0f) / f2));
                    kc2Var5.d0.d(gl.L(28.0f), gl.L(100.0f));
                    if (z3) {
                    }
                }
                float min = Math.min(1.0f, mu1Var.ka / gl.L(110.0f));
                canvas2.translate(mu1Var.W7() ? gl.U1(mu1Var.f7(), gl.L(32.0f), gl.L(71.0f)) : 0.0f, -(mu1Var.m7(gxb.c) + mu1Var.U.getInputBubbleHeight() + mu1Var.w.d() + gl.L(10.0f)));
                mu1Var.ma.a(canvas2, mu1Var.A0, min, 1.0f - mu1Var.ra);
                canvas2.restore();
                if (mu1Var.qa != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.A0.getMeasuredWidth(), mu1Var.qa.A0.getMeasuredHeight(), (int) (mu1Var.ra * f), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - mu1Var.ka) - f3);
                    mu1Var.qa.A0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f = 255.0f;
        f2 = 2.0f;
        i = 2;
        if (mu1Var.ka != 0.0f) {
        }
        kc2Var = mu1Var.ma;
        if (kc2Var == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.G3.h == null) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if (collectionInfo != null) {
                accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
            }
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wx8 wx8Var;
        a aVar;
        mu1 mu1Var = this.G3;
        bt1 bt1Var = mu1Var.u9;
        bt1Var.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gl.r(bt1Var.f0);
            bt1Var.z = false;
        }
        if (!this.W1 && ((wx8Var = mu1Var.ua) == null || !wx8Var.a())) {
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            aVar = ((d) mu1Var).actionBar;
            if (aVar.y() || mu1Var.T7()) {
                return onInterceptTouchEvent;
            }
            C1(motionEvent);
            if (onInterceptTouchEvent || mu1Var.y9) {
                return true;
            }
        }
        return false;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.g3;
        int i6 = i3 - i;
        mu1 mu1Var = this.G3;
        if (i5 != i6) {
            if (i5 != 0) {
                mu1Var.z7(false);
            }
            this.g3 = i6;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.F3 != measuredHeight) {
            this.E3 = true;
            lq1 lq1Var = mu1Var.B0;
            if (lq1Var != null) {
                lq1Var.g();
            }
            mu1Var.o9.d();
            this.E3 = false;
            this.F3 = measuredHeight;
        }
        mu1Var.j6 = false;
        bt1 bt1Var = mu1Var.u9;
        if (bt1Var != null && bt1Var.w()) {
            mu1Var.u9.v();
        }
        mu1Var.H7();
        mu1Var.Y7();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        kc2 kc2Var;
        mu1 mu1Var = this.G3;
        fm0 fm0Var = mu1Var.dd;
        bt1 bt1Var = mu1Var.u9;
        bt1Var.getClass();
        final byte b = 3;
        final byte b2 = 0;
        final byte b3 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            gl.r(bt1Var.f0);
            bt1Var.z = false;
        }
        if (motionEvent.getAction() == 0) {
            mu1Var.Pa = true;
        }
        if (mu1Var.ka != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, mu1Var.ka / gl.L(110.0f));
            final byte b4 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (kc2Var = mu1Var.ma) == null || kc2Var.S) {
                kc2 kc2Var2 = mu1Var.ma;
                if (kc2Var2 != null && kc2Var2.S) {
                    long currentTimeMillis = System.currentTimeMillis();
                    kc2 kc2Var3 = mu1Var.ma;
                    if (currentTimeMillis - kc2Var3.V < 500 && kc2Var3.N) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        mu1Var.na = animatorSet;
                        if (mu1Var.ma != null) {
                            fm0Var.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(mu1Var.ka, gl.L(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gq1
                            public final /* synthetic */ jq1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b5 = b3;
                                jq1 jq1Var = this.b;
                                switch (b5) {
                                    case 0:
                                        mu1 mu1Var2 = jq1Var.G3;
                                        mu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var2.A0.invalidate();
                                        break;
                                    case 1:
                                        mu1 mu1Var3 = jq1Var.G3;
                                        mu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var3.A0.invalidate();
                                        break;
                                    case 2:
                                        mu1 mu1Var4 = jq1Var.G3;
                                        mu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var4.A0.invalidate();
                                        break;
                                    default:
                                        mu1 mu1Var5 = jq1Var.G3;
                                        mu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(s33.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(gl.L(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gq1
                            public final /* synthetic */ jq1 b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                byte b5 = b4;
                                jq1 jq1Var = this.b;
                                switch (b5) {
                                    case 0:
                                        mu1 mu1Var2 = jq1Var.G3;
                                        mu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var2.A0.invalidate();
                                        break;
                                    case 1:
                                        mu1 mu1Var3 = jq1Var.G3;
                                        mu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var3.A0.invalidate();
                                        break;
                                    case 2:
                                        mu1 mu1Var4 = jq1Var.G3;
                                        mu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var4.A0.invalidate();
                                        break;
                                    default:
                                        mu1 mu1Var5 = jq1Var.G3;
                                        mu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        mu1Var5.A0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(la2.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(mu1Var.ka, 0.0f);
                mu1Var.na = ofFloat3;
                if (mu1Var.ma != null) {
                    fm0Var.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gq1
                    public final /* synthetic */ jq1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b;
                        jq1 jq1Var = this.b;
                        switch (b5) {
                            case 0:
                                mu1 mu1Var2 = jq1Var.G3;
                                mu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var2.A0.invalidate();
                                break;
                            case 1:
                                mu1 mu1Var3 = jq1Var.G3;
                                mu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var3.A0.invalidate();
                                break;
                            case 2:
                                mu1 mu1Var4 = jq1Var.G3;
                                mu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var4.A0.invalidate();
                                break;
                            default:
                                mu1 mu1Var5 = jq1Var.G3;
                                mu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(la2.V);
                ofFloat3.start();
            } else if (kc2Var.L != 1.0f) {
                float f = mu1Var.ka;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f, gl.L(8.0f) + f);
                mu1Var.na = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: gq1
                    public final /* synthetic */ jq1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b2;
                        jq1 jq1Var = this.b;
                        switch (b5) {
                            case 0:
                                mu1 mu1Var2 = jq1Var.G3;
                                mu1Var2.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var2.A0.invalidate();
                                break;
                            case 1:
                                mu1 mu1Var3 = jq1Var.G3;
                                mu1Var3.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var3.A0.invalidate();
                                break;
                            case 2:
                                mu1 mu1Var4 = jq1Var.G3;
                                mu1Var4.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var4.A0.invalidate();
                                break;
                            default:
                                mu1 mu1Var5 = jq1Var.G3;
                                mu1Var5.ka = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                mu1Var5.A0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                s33 s33Var = s33.f;
                ofFloat4.setInterpolator(s33Var);
                ofFloat4.start();
                final kc2 kc2Var4 = mu1Var.ma;
                hq1 hq1Var = new hq1(this, b2);
                AnimatorSet animatorSet2 = kc2Var4.K;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    kc2Var4.K.cancel();
                }
                kc2Var4.Z = hq1Var;
                kc2Var4.K = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(kc2Var4.L, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jc2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b2;
                        kc2 kc2Var5 = kc2Var4;
                        kc2Var5.getClass();
                        switch (b5) {
                            case 0:
                                kc2Var5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                kc2Var5.U.invalidate();
                                jq1 jq1Var = kc2Var5.b0;
                                if (jq1Var != null) {
                                    jq1Var.invalidate();
                                    break;
                                }
                                break;
                            default:
                                kc2Var5.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                jq1 jq1Var2 = kc2Var5.b0;
                                if (jq1Var2 != null) {
                                    jq1Var2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(kc2Var4.M, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jc2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        byte b5 = b3;
                        kc2 kc2Var5 = kc2Var4;
                        kc2Var5.getClass();
                        switch (b5) {
                            case 0:
                                kc2Var5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                kc2Var5.U.invalidate();
                                jq1 jq1Var = kc2Var5.b0;
                                if (jq1Var != null) {
                                    jq1Var.invalidate();
                                    break;
                                }
                                break;
                            default:
                                kc2Var5.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                jq1 jq1Var2 = kc2Var5.b0;
                                if (jq1Var2 != null) {
                                    jq1Var2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                kc2Var4.K.addListener(new bb1((Object) kc2Var4, (byte) 22));
                kc2Var4.K.playTogether(ofFloat5, ofFloat6);
                kc2Var4.K.setDuration(120L);
                kc2Var4.K.setInterpolator(s33Var);
                kc2Var4.K.start();
            } else {
                mu1Var.B4();
            }
        }
        if (!this.W1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            aVar = ((d) mu1Var).actionBar;
            if (aVar.y() || mu1Var.T7()) {
                return onTouchEvent;
            }
            C1(motionEvent);
            if (mu1Var.C9 || mu1Var.y9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        if (this.G3.g9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        zi9 f4;
        gwc gwcVar;
        super.requestDisallowInterceptTouchEvent(z);
        View view = this.G3.v9;
        if (view != null) {
            if ((view instanceof gb2) && (f4 = ((gb2) view).f4()) != null && (gwcVar = f4.e0) != null && f4.f0 && gwcVar.w && !gwcVar.E) {
                if (!gwcVar.x) {
                    return;
                }
                if (!gwcVar.y && (gwcVar.L & 3) != 1) {
                    return;
                }
            }
            C1(null);
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.E3) {
            return;
        }
        vu1 vu1Var = this.G3.uc;
        if (vu1Var.b != 0) {
            int childCount = vu1Var.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                vu1Var.a.getChildAt(i).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(b49 b49Var) {
        if (this.W1) {
            return;
        }
        super.setItemAnimator(b49Var);
    }

    @Override // o39, android.view.View
    public final void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            mu1 mu1Var = this.G3;
            mu1Var.G7();
            mu1Var.I7();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0459  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z1(Canvas canvas, RectF rectF) {
        int i;
        int i2;
        float f;
        mu1 mu1Var;
        float f2;
        int i3;
        float f3;
        int i4;
        f27 f27Var;
        int i5;
        ArrayList arrayList;
        e27 e27Var;
        boolean z;
        int i6;
        f27 currentMessagesGroup;
        int i7;
        int backgroundDrawableLeft;
        int backgroundDrawableRight;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        a aVar;
        int measuredHeight;
        int i15;
        int i16;
        a aVar2;
        int measuredHeight2;
        jq1 jq1Var = this;
        Canvas canvas2 = canvas;
        int childCount = jq1Var.getChildCount();
        f27 f27Var2 = null;
        int i17 = 0;
        while (true) {
            i = 8;
            i2 = 2;
            f = 0.0f;
            mu1Var = jq1Var.G3;
            if (i17 >= childCount) {
                f2 = 1.0f;
                break;
            }
            View childAt = jq1Var.getChildAt(i17);
            f2 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8 && !mu1Var.Na(childAt, rectF)) {
                if (childAt instanceof ob2) {
                    canvas2.save();
                    canvas2.translate(childAt.getX(), childAt.getY());
                    ((ob2) childAt).a(canvas2);
                    canvas2.restore();
                } else if (mu1Var.D0.n && (childAt instanceof eq0)) {
                    float measuredHeight3 = ((((jq1Var.getMeasuredHeight() - mu1Var.P9) - mu1Var.Ya) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + mu1Var.P9;
                    if (!((eq0) childAt).J && !mu1Var.A0.W1) {
                        if (childAt.getTop() > measuredHeight3) {
                            childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                        } else {
                            childAt.setTranslationY(0.0f);
                        }
                    }
                } else if (childAt instanceof g7c) {
                    float measuredHeight4 = ((((jq1Var.getMeasuredHeight() - mu1Var.P9) - mu1Var.Ya) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + mu1Var.P9;
                    if (!((g7c) childAt).P && !mu1Var.A0.W1) {
                        if (childAt.getTop() > measuredHeight4) {
                            childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                        } else {
                            childAt.setTranslationY(0.0f);
                        }
                    }
                } else {
                    if (childAt instanceof gb2) {
                        gb2 gb2Var = (gb2) childAt;
                        f27 currentMessagesGroup2 = gb2Var.getCurrentMessagesGroup();
                        if (currentMessagesGroup2 == null || currentMessagesGroup2 != f27Var2) {
                            c27 currentPosition = gb2Var.getCurrentPosition();
                            f17 backgroundDrawable = gb2Var.getBackgroundDrawable();
                            if ((backgroundDrawable.f || gb2Var.B2()) && (currentPosition == null || (currentPosition.l & 2) != 0)) {
                                boolean z3 = gb2Var.x6;
                                wjb wjbVar = jq1Var.o2;
                                z2 = true;
                                if (z3 || gb2Var.y6) {
                                    i14 = i17;
                                    if (currentPosition == null) {
                                        Paint X0 = jq1Var.X0("paintChatMessageBackgroundSelected");
                                        ku1 ku1Var = mu1Var.Ba;
                                        if ((ku1Var == null || !ku1Var.q) && X0 != null) {
                                            if (mu1Var.Q7()) {
                                                measuredHeight = mu1Var.A0.getTop();
                                            } else {
                                                aVar = ((d) mu1Var).actionBar;
                                                measuredHeight = aVar.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY = measuredHeight - mu1Var.m1.getBackgroundTranslationY();
                                            int backgroundSizeY = mu1Var.m1.getBackgroundSizeY();
                                            ku1 ku1Var2 = mu1Var.Ba;
                                            if (ku1Var2 != null) {
                                                ku1Var2.b(gb2Var.getX(), backgroundTranslationY, jq1Var.getMeasuredWidth(), backgroundSizeY);
                                            } else {
                                                bkb.q(gb2Var.getX(), backgroundTranslationY, jq1Var.getMeasuredWidth(), backgroundSizeY);
                                            }
                                        } else {
                                            X0 = bkb.Z1;
                                            X0.setColor(bkb.v0(bkb.xd, wjbVar));
                                        }
                                        Paint paint = X0;
                                        canvas2.save();
                                        canvas2.translate(0.0f, gb2Var.getTranslationY());
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (gb2Var.getAlpha() * gb2Var.getHighlightAlpha() * alpha));
                                        canvas2.drawRect(0.0f, gb2Var.getTop(), jq1Var.getMeasuredWidth(), gb2Var.getBottom(), paint);
                                        paint.setAlpha(alpha);
                                        canvas2.restore();
                                    }
                                } else {
                                    int y = (int) gb2Var.getY();
                                    canvas2.save();
                                    if (currentPosition == null) {
                                        i15 = gb2Var.getMeasuredHeight();
                                        i14 = i17;
                                    } else {
                                        int measuredHeight5 = gb2Var.getMeasuredHeight() + y;
                                        long j = 0;
                                        float f4 = 0.0f;
                                        int i18 = 0;
                                        while (i18 < childCount) {
                                            View childAt2 = jq1Var.getChildAt(i18);
                                            int i19 = i17;
                                            if (childAt2 instanceof gb2) {
                                                gb2 gb2Var2 = (gb2) childAt2;
                                                if (gb2Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                    f17 backgroundDrawable2 = gb2Var2.getBackgroundDrawable();
                                                    i16 = i18;
                                                    y = Math.min(y, (int) gb2Var2.getY());
                                                    measuredHeight5 = Math.max(measuredHeight5, gb2Var2.getMeasuredHeight() + ((int) gb2Var2.getY()));
                                                    long j2 = backgroundDrawable2.l;
                                                    if (j2 > j) {
                                                        j = j2;
                                                        f = gb2Var2.getX() + backgroundDrawable2.h;
                                                        f4 = gb2Var2.getY() + backgroundDrawable2.i;
                                                    }
                                                    i18 = i16 + 1;
                                                    i17 = i19;
                                                }
                                            }
                                            i16 = i18;
                                            i18 = i16 + 1;
                                            i17 = i19;
                                        }
                                        i14 = i17;
                                        backgroundDrawable.j = f;
                                        backgroundDrawable.k = f4 - y;
                                        i15 = measuredHeight5 - y;
                                    }
                                    int i20 = i15 + y;
                                    canvas2.clipRect(0, y, jq1Var.getMeasuredWidth(), i20);
                                    Paint X02 = jq1Var.X0("paintChatMessageBackgroundSelected");
                                    ku1 ku1Var3 = mu1Var.Ba;
                                    if (ku1Var3 == null || ku1Var3.q || X02 == null) {
                                        backgroundDrawable.b = null;
                                        backgroundDrawable.a.setColor(bkb.v0(bkb.xd, wjbVar));
                                    } else {
                                        backgroundDrawable.b = X02;
                                        if (mu1Var.Q7()) {
                                            measuredHeight2 = mu1Var.A0.getTop();
                                        } else {
                                            aVar2 = ((d) mu1Var).actionBar;
                                            measuredHeight2 = aVar2.getMeasuredHeight();
                                        }
                                        float backgroundTranslationY2 = measuredHeight2 - mu1Var.m1.getBackgroundTranslationY();
                                        int backgroundSizeY2 = mu1Var.m1.getBackgroundSizeY();
                                        ku1 ku1Var4 = mu1Var.Ba;
                                        if (ku1Var4 != null) {
                                            ku1Var4.b(gb2Var.getX(), backgroundTranslationY2, jq1Var.getMeasuredWidth(), backgroundSizeY2);
                                        } else {
                                            bkb.q(gb2Var.getX(), backgroundTranslationY2, jq1Var.getMeasuredWidth(), backgroundSizeY2);
                                        }
                                    }
                                    backgroundDrawable.setBounds(0, y, jq1Var.getMeasuredWidth(), i20);
                                    backgroundDrawable.draw(canvas2);
                                    canvas2.restore();
                                }
                            } else {
                                i14 = i17;
                                z2 = true;
                            }
                            f27Var2 = currentMessagesGroup2;
                        } else {
                            i14 = i17;
                            z2 = true;
                        }
                        if (mu1Var.Z8 != gb2Var && currentMessagesGroup2 == null && gb2Var.L0()) {
                            canvas2.save();
                            canvas2.translate(gb2Var.getX(), gb2Var.getY() + gb2Var.getPaddingTop());
                            if (gb2Var.getScaleX() != 1.0f) {
                                canvas2.scale(gb2Var.getScaleX(), gb2Var.getScaleY(), gb2Var.getPivotX(), gb2Var.getHeight() >> 1);
                            }
                            gb2Var.M0(canvas2, z2, false);
                            canvas2.restore();
                        }
                    } else {
                        i14 = i17;
                        if (childAt instanceof uk1) {
                            uk1 uk1Var = (uk1) childAt;
                            if (uk1Var.T()) {
                                canvas2.save();
                                canvas2.translate(uk1Var.getX(), uk1Var.getY() + uk1Var.getPaddingTop());
                                canvas2.scale(uk1Var.getScaleX(), uk1Var.getScaleY(), uk1Var.getMeasuredWidth() / 2.0f, uk1Var.getMeasuredHeight() / 2.0f);
                                canvas2.translate(mu1Var.g7() / 2.0f, 0.0f);
                                uk1Var.J(canvas2, true);
                                uk1Var.M(canvas2, true);
                                canvas2.restore();
                            }
                        }
                    }
                    i17 = i14 + 1;
                }
            }
            i14 = i17;
            i17 = i14 + 1;
        }
        View view = mu1Var.Z8;
        f27 currentMessagesGroup3 = view instanceof gb2 ? ((gb2) view).getCurrentMessagesGroup() : null;
        int i21 = 0;
        while (i21 < 3) {
            ArrayList arrayList2 = jq1Var.l3;
            arrayList2.clear();
            if (i21 != i2 || mu1Var.A0.W1) {
                int i22 = 0;
                while (i22 < childCount) {
                    View childAt3 = mu1Var.A0.getChildAt(i22);
                    if (childAt3 instanceof gb2) {
                        gb2 gb2Var3 = (gb2) childAt3;
                        if (childAt3.getY() <= mu1Var.A0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f && gb2Var3.getVisibility() != i && (currentMessagesGroup = gb2Var3.getCurrentMessagesGroup()) != null) {
                            e27 e27Var2 = currentMessagesGroup.m;
                            if (i21 == 0) {
                                i6 = i;
                                i7 = 1;
                                if (currentMessagesGroup.d.size() == 1) {
                                    i22++;
                                    i = i6;
                                    i2 = 2;
                                    f = 0.0f;
                                }
                            } else {
                                i6 = i;
                                i7 = 1;
                            }
                            if ((i21 != i7 || e27Var2.i) && ((i21 != 0 || !gb2Var3.getMessageObject().Z) && (i21 != 1 || gb2Var3.getMessageObject().Z))) {
                                boolean z4 = gb2Var3.La;
                                if (i21 == i2) {
                                    if (!z4) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                        e27Var2.a = 0;
                                        e27Var2.b = 0;
                                        e27Var2.c = 0;
                                        e27Var2.d = 0;
                                        e27Var2.l = false;
                                        e27Var2.k = false;
                                        e27Var2.m = gb2Var3;
                                        arrayList2.add(currentMessagesGroup);
                                    }
                                    e27Var2.k = gb2Var3.L2();
                                    e27Var2.l = gb2Var3.K2();
                                    backgroundDrawableLeft = gb2Var3.getBackgroundDrawableLeft() + gb2Var3.getLeft();
                                    backgroundDrawableRight = gb2Var3.getBackgroundDrawableRight() + gb2Var3.getLeft();
                                    int backgroundDrawableTop = gb2Var3.getBackgroundDrawableTop() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                    int backgroundDrawableBottom = gb2Var3.getBackgroundDrawableBottom() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                    if ((gb2Var3.getCurrentPosition().l & 4) == 0) {
                                        backgroundDrawableTop -= gl.L(10.0f);
                                    }
                                    i8 = backgroundDrawableTop;
                                    if ((gb2Var3.getCurrentPosition().l & 8) == 0) {
                                        backgroundDrawableBottom = gl.L(10.0f) + backgroundDrawableBottom;
                                    }
                                    i9 = backgroundDrawableBottom;
                                    if (gb2Var3.La) {
                                        e27Var2.m = gb2Var3;
                                    }
                                    i10 = e27Var2.b;
                                    if (i10 != 0 || i8 < i10) {
                                        e27Var2.b = i8;
                                    }
                                    i11 = e27Var2.d;
                                    if (i11 != 0 || i9 > i11) {
                                        e27Var2.d = i9;
                                    }
                                    i12 = e27Var2.a;
                                    if (i12 != 0 || backgroundDrawableLeft < i12) {
                                        e27Var2.a = backgroundDrawableLeft;
                                    }
                                    i13 = e27Var2.c;
                                    if (i13 != 0 || backgroundDrawableRight > i13) {
                                        e27Var2.c = backgroundDrawableRight;
                                    }
                                } else {
                                    if (z4) {
                                    }
                                    if (!arrayList2.contains(currentMessagesGroup)) {
                                    }
                                    e27Var2.k = gb2Var3.L2();
                                    e27Var2.l = gb2Var3.K2();
                                    backgroundDrawableLeft = gb2Var3.getBackgroundDrawableLeft() + gb2Var3.getLeft();
                                    backgroundDrawableRight = gb2Var3.getBackgroundDrawableRight() + gb2Var3.getLeft();
                                    int backgroundDrawableTop2 = gb2Var3.getBackgroundDrawableTop() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                    int backgroundDrawableBottom2 = gb2Var3.getBackgroundDrawableBottom() + gb2Var3.getPaddingTop() + gb2Var3.getTop();
                                    if ((gb2Var3.getCurrentPosition().l & 4) == 0) {
                                    }
                                    i8 = backgroundDrawableTop2;
                                    if ((gb2Var3.getCurrentPosition().l & 8) == 0) {
                                    }
                                    i9 = backgroundDrawableBottom2;
                                    if (gb2Var3.La) {
                                    }
                                    i10 = e27Var2.b;
                                    if (i10 != 0) {
                                    }
                                    e27Var2.b = i8;
                                    i11 = e27Var2.d;
                                    if (i11 != 0) {
                                    }
                                    e27Var2.d = i9;
                                    i12 = e27Var2.a;
                                    if (i12 != 0) {
                                    }
                                    e27Var2.a = backgroundDrawableLeft;
                                    i13 = e27Var2.c;
                                    if (i13 != 0) {
                                    }
                                    e27Var2.c = backgroundDrawableRight;
                                }
                            }
                            i22++;
                            i = i6;
                            i2 = 2;
                            f = 0.0f;
                        }
                    }
                    i6 = i;
                    i22++;
                    i = i6;
                    i2 = 2;
                    f = 0.0f;
                }
                i3 = i;
                int i23 = 0;
                while (i23 < arrayList2.size()) {
                    f27 f27Var3 = (f27) arrayList2.get(i23);
                    e27 e27Var3 = f27Var3.m;
                    ArrayList arrayList3 = f27Var3.d;
                    float U1 = e27Var3.m.U1(true);
                    float f5 = e27Var3.a + U1 + e27Var3.e;
                    float f6 = e27Var3.b + e27Var3.f;
                    float f7 = e27Var3.g + e27Var3.c + U1;
                    float f8 = e27Var3.d + e27Var3.h;
                    if (!e27Var3.j) {
                        f6 += e27Var3.m.getTranslationY();
                        f8 += e27Var3.m.getTranslationY();
                    }
                    float f9 = f6;
                    if (f8 > gl.L(20.0f) + mu1Var.A0.getMeasuredHeight()) {
                        f8 = gl.L(20.0f) + mu1Var.A0.getMeasuredHeight();
                    }
                    boolean z5 = (e27Var3.m.getScaleX() == f2 && e27Var3.m.getScaleY() == f2) ? false : true;
                    if (z5) {
                        canvas2.save();
                        f27Var = f27Var3;
                        i5 = i21;
                        arrayList = arrayList2;
                        canvas2.scale(e27Var3.m.getScaleX(), e27Var3.m.getScaleY(), oo1.z(f7, f5, 2.0f, f5), oo1.z(f8, f9, 2.0f, f9));
                    } else {
                        f27Var = f27Var3;
                        i5 = i21;
                        arrayList = arrayList2;
                    }
                    int size = arrayList3.size();
                    int i24 = 0;
                    while (true) {
                        if (i24 >= size) {
                            e27Var = e27Var3;
                            z = true;
                            break;
                        }
                        k27 k27Var = (k27) arrayList3.get(i24);
                        e27Var = e27Var3;
                        if (mu1Var.o6[k27.B0(k27Var.k) == mu1Var.l6 ? (char) 0 : (char) 1].indexOfKey(k27Var.e1()) < 0) {
                            z = false;
                            break;
                        } else {
                            i24++;
                            e27Var3 = e27Var;
                        }
                    }
                    float f10 = f8;
                    mu1 mu1Var2 = mu1Var;
                    boolean z6 = z;
                    f27 f27Var4 = f27Var;
                    e27Var.m.K0(canvas, (int) f5, (int) f9, (int) f7, (int) f8, e27Var.k, e27Var.l, z6, 0);
                    if (f27Var4 != currentMessagesGroup3) {
                        e27Var.m = null;
                    }
                    e27Var.o = f27Var4.c;
                    if (z5) {
                        canvas.restore();
                        for (int i25 = 0; i25 < childCount; i25++) {
                            View childAt4 = mu1Var2.A0.getChildAt(i25);
                            if (childAt4 instanceof gb2) {
                                gb2 gb2Var4 = (gb2) childAt4;
                                if (gb2Var4.getCurrentMessagesGroup() == f27Var4) {
                                    int left = gb2Var4.getLeft();
                                    int top = gb2Var4.getTop();
                                    childAt4.setPivotX(((f7 - f5) / 2.0f) + (f5 - left));
                                    childAt4.setPivotY(((f10 - f9) / 2.0f) + (f9 - top));
                                }
                            }
                        }
                    }
                    i23++;
                    canvas2 = canvas;
                    mu1Var = mu1Var2;
                    i21 = i5;
                    arrayList2 = arrayList;
                }
                f3 = 0.0f;
                i4 = 2;
            } else {
                i3 = i;
                i4 = i2;
                f3 = f;
            }
            canvas2 = canvas;
            mu1Var = mu1Var;
            i = i3;
            f = f3;
            i2 = i4;
            i21++;
            jq1Var = this;
        }
    }
}
