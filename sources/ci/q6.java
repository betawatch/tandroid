package ci;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q6 extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final o6 I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final wm a;
    public org.telegram.ui.Cells.z b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.u5 s;
    public final org.telegram.ui.Components.g6 w;
    public boolean x;
    public final e0 y;

    public q6(wm wmVar) {
        super(wmVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.u5(this, 0L, 420L, xq.h);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
        this.w = g6Var;
        new Matrix();
        this.K = new ArrayList();
        this.L = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = wmVar;
        g6Var.setCallback(this);
        g6Var.r(false, true);
        g6Var.w(org.telegram.messenger.g0.L(40.0f));
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        g6Var.M = org.telegram.messenger.g0.q.x;
        g6Var.u(-1);
        g6Var.b = 17;
        this.I = new o6(this, 0);
        this.y = new e0(12, this, wmVar);
    }

    private zi getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        }
        if (zVar instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) zVar).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            zi messageObject = getMessageObject();
            wm wmVar = this.a;
            e9 y9 = e9.y(wmVar.getCurrentAccount(), false);
            long E = y9.E(messageObject);
            if (!y9.e || y9.q(null, false, false).amount >= E) {
                return;
            }
            c9 c9Var = e9.y(wmVar.getCurrentAccount(), false).B;
            if (c9Var != null) {
                c9Var.a();
            }
            long a10 = wmVar.a();
            if (a10 >= 0) {
                str = l10.k(wmVar.getMessagesController().a2(Long.valueOf(a10)));
            } else {
                TLRPC.Chat M0 = wmVar.getMessagesController().M0(Long.valueOf(-a10));
                str = M0 == null ? "" : M0.title;
            }
            new mb(wmVar.getParentActivity(), wmVar.getResourceProvider(), E, 5, str, new l2(this, y9, messageObject, E, 3), 0L).show();
        }
    }

    public final void b(float f10, o6 o6Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new bh.f(this, 7));
        this.F.addListener(new p6(this, f10, o6Var, 0));
        this.F.setInterpolator(xq.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        org.telegram.messenger.g0.r(this.I);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new o6(this, 2));
    }

    public final void d(float f10, float f11, boolean z10) {
        ArrayList arrayList;
        if (this.b == null || this.J) {
            return;
        }
        zi messageObject = getMessageObject();
        dh.o0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        wm wmVar = this.a;
        e9 y9 = e9.y(wmVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.K;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((ch0) arrayList.remove(0)).C(true);
            }
        }
        f5.a aVar = Utilities.c;
        int[] iArr = this.L;
        ch0 ch0Var = new ch0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        ch0Var.R(this);
        ch0Var.J(true);
        ch0Var.K(0);
        ch0Var.start();
        arrayList.add(ch0Var);
        invalidate();
        dh.l0 l10 = reactionsLayoutInBubble.l("stars");
        if (l10 != null) {
            l10.p();
        }
        if (z10) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            e9.y(wmVar.getCurrentAccount(), false).b0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.g6 g6Var = this.w;
        g6Var.a();
        g6Var.t("+" + y9.E(messageObject), true, true);
        this.r = true;
        o6 o6Var = this.I;
        org.telegram.messenger.g0.r(o6Var);
        org.telegram.messenger.g0.i3(o6Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.G < 100) {
            this.H += 0.5f;
            return;
        }
        this.H = Utilities.i(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.H;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || wmVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            wmVar.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.b0(iArr2[0] + f10, iArr2[1] + f11, Utilities.i(this.H, 0.9f, 0.3f));
        this.H = 0.0f;
        this.G = currentTimeMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0331  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i3;
        boolean z10;
        Integer num;
        float f11;
        RectF rectF;
        float f12;
        float f13;
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            if (!((org.telegram.ui.Cells.q1) zVar).O0) {
                return;
            }
        } else if ((zVar instanceof org.telegram.ui.Cells.t0) && !((org.telegram.ui.Cells.t0) zVar).e2) {
            return;
        }
        zi messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.f1() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        dh.o0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(1.0f, 1.8f, this.E);
        wm wmVar = this.a;
        float y9 = wmVar.A0.getY() + (((wmVar.pa == null || (wmVar.la && !wmVar.ma)) && !wmVar.jb) ? (wmVar.M9 - wmVar.O9) - org.telegram.messenger.g0.L(4.0f) : 0.0f);
        float bottom = (wmVar.fragmentView.getBottom() - wmVar.A0.getBottom()) + (((wmVar.pa == null || (wmVar.la && !wmVar.ma)) && !wmVar.jb) ? wmVar.Va : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.E) * y9, getWidth(), a1.g.D(1.0f, this.E, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.z zVar2 = this.b;
        int[] iArr2 = this.d;
        zVar2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) wmVar.Ta);
        canvas.save();
        dh.l0 l10 = reactionsLayoutInBubble.l("stars");
        RectF rectF2 = this.f;
        if (l10 != null) {
            f10 = 4.0f;
            int i10 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.b + l10.w;
            int i11 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.c + l10.x;
            float f14 = i10;
            float f15 = i11;
            z10 = 1;
            rectF2.set(f14, f15, i10 + l10.z, i11 + l10.A);
            org.telegram.messenger.g0.j3(rectF2, T1, (l10.z * 0.1f) + f14, (l10.A / 2.0f) + f15);
            Paint paint = this.n;
            paint.setColor(0);
            i3 = 0;
            paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.r1(this.E, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(T1, T1, (l10.z * 0.1f) + f14, (l10.A / 2.0f) + f15);
            num = Integer.valueOf(l10.q.hashCode());
        } else {
            f10 = 4.0f;
            i3 = 0;
            z10 = 1;
            num = null;
        }
        canvas.translate(iArr2[i3] - iArr[i3], this.b.getPaddingTop() + (iArr2[z10] - iArr[z10]));
        org.telegram.ui.Cells.z zVar3 = this.b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) zVar3;
            q1Var.setScrimReaction(null);
            q1Var.o1(canvas, 1.0f, num);
            q1Var.p1(canvas);
            q1Var.setScrimReaction(num);
        } else if (zVar3 instanceof org.telegram.ui.Cells.t0) {
            org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) zVar3;
            t0Var.setScrimReaction(null);
            t0Var.J(canvas, z10, num);
            org.telegram.ui.Cells.s0 s0Var = t0Var.s2;
            dh.o0 o0Var = t0Var.F0;
            float alpha = t0Var.getAlpha();
            org.telegram.ui.ActionBar.e6 e6Var = t0Var.h1;
            if (e6Var != null) {
                f11 = 255.0f;
                e6Var.b(t0Var.v0, t0Var.u0 + org.telegram.messenger.g0.L(f10), t0Var.getMeasuredWidth(), t0Var.w0);
            } else {
                f11 = 255.0f;
                org.telegram.ui.ActionBar.k6.r(t0Var.v0, t0Var.u0 + org.telegram.messenger.g0.L(f10), t0Var.getMeasuredWidth(), t0Var.w0);
            }
            zi ziVar = t0Var.Q0;
            if (ziVar == null || !ziVar.P5()) {
                rectF = rectF2;
            } else {
                o0Var.getClass();
                o0Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, t0Var.getWidth(), t0Var.getHeight(), (int) (alpha * f11), 31);
                } else {
                    rectF = rectF2;
                }
                o0Var.e(canvas, s0Var.b ? s0Var.c : 1.0f);
                if (alpha < 1.0f) {
                    canvas.restore();
                }
            }
            t0Var.setScrimReaction(num);
            canvas.restore();
            canvas.restore();
            if (l10 != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-org.telegram.messenger.g0.L(42.0f), -org.telegram.messenger.g0.L(42.0f));
                int L = (int) (org.telegram.messenger.g0.L(90.0f) * T1);
                int i12 = i3;
                while (true) {
                    ArrayList arrayList = this.K;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    ch0 ch0Var = (ch0) arrayList.get(i12);
                    if (ch0Var.b0 >= ch0Var.e[i3]) {
                        arrayList.remove(i12);
                        i12--;
                    } else {
                        float f16 = L / 2.0f;
                        ch0Var.setBounds((int) (((org.telegram.messenger.g0.L(15.0f) * T1) + rectF.left) - f16), (int) (rectF.centerY() - f16), (int) t4.c.c(org.telegram.messenger.g0.L(15.0f), T1, rectF.left, f16), (int) (rectF.centerY() + f16));
                        ch0Var.setAlpha((int) (this.E * f11));
                        ch0Var.draw(canvas);
                    }
                    i12++;
                }
                float centerX = rectF.centerX();
                float L2 = rectF.top - org.telegram.messenger.g0.L(36.0f);
                canvas.save();
                float d = this.s.d(this.r);
                if (this.r) {
                    f13 = org.telegram.messenger.g0.L(60.0f);
                    f12 = 1.0f;
                } else {
                    f12 = 1.0f;
                    f13 = -org.telegram.messenger.g0.L(30.0f);
                }
                canvas.translate(0.0f, (f12 - d) * f13);
                float T12 = org.telegram.messenger.g0.T1(this.r ? 1.8f : 1.3f, f12, d);
                canvas.scale(T12, T12, centerX, L2);
                org.telegram.ui.Components.g6 g6Var = this.w;
                g6Var.B = (int) (d * f11);
                g6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), org.telegram.ui.ActionBar.k6.r1(d, -1442840576));
                g6Var.o(centerX - org.telegram.messenger.g0.L(100.0f), rectF.top - org.telegram.messenger.g0.L(48.0f), centerX + org.telegram.messenger.g0.L(100.0f), rectF.top - org.telegram.messenger.g0.L(24.0f));
                g6Var.draw(canvas);
                canvas.restore();
            }
            if (!this.r) {
                a();
            }
            invalidate();
        }
        rectF = rectF2;
        f11 = 255.0f;
        canvas.restore();
        canvas.restore();
        if (l10 != null) {
        }
        if (!this.r) {
        }
        invalidate();
    }

    public dh.o0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).O;
        }
        if (zVar instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) zVar).F0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dh.o0 reactionsLayoutInBubble;
        if (this.b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        e0 e0Var = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                dh.l0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.X.c(true);
                }
                org.telegram.messenger.g0.r(e0Var);
                org.telegram.messenger.g0.i3(e0Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            dh.l0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.X.c(false);
            }
            this.x = false;
            org.telegram.messenger.g0.r(e0Var);
        }
        return this.x;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        org.telegram.ui.Cells.z zVar2 = this.b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.q1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t0) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = zVar;
        this.c = getMessageObject() == null ? 0 : getMessageObject().f1();
        org.telegram.ui.Cells.z zVar3 = this.b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.q1) this.b).setInvalidateListener(new o6(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.t0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.t0) this.b).setInvalidateListener(new o6(this, 1));
        }
        invalidate();
    }
}
