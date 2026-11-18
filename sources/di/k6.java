package di;

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
import org.telegram.messenger.fj;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k6 extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final i6 I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final bn a;
    public org.telegram.ui.Cells.z b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.c6 s;
    public final org.telegram.ui.Components.m6 w;
    public boolean x;
    public final w2 y;

    public k6(bn bnVar) {
        super(bnVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.c6(this, 0L, 420L, lr.h);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false);
        this.w = m6Var;
        new Matrix();
        this.K = new ArrayList();
        this.L = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = bnVar;
        m6Var.setCallback(this);
        m6Var.r(false, true);
        m6Var.w(org.telegram.messenger.g0.L(40.0f));
        m6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        m6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        m6Var.N = org.telegram.messenger.g0.q.x;
        m6Var.u(-1);
        m6Var.b = 17;
        this.I = new i6(this, 0);
        this.y = new w2(9, this, bnVar);
    }

    private fj getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        }
        if (zVar instanceof org.telegram.ui.Cells.u0) {
            return ((org.telegram.ui.Cells.u0) zVar).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            fj messageObject = getMessageObject();
            bn bnVar = this.a;
            x8 y10 = x8.y(bnVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (!y10.e || y10.q(null, false, false).amount >= E) {
                return;
            }
            v8 v8Var = x8.y(bnVar.getCurrentAccount(), false).B;
            if (v8Var != null) {
                v8Var.a();
            }
            long a10 = bnVar.a();
            if (a10 >= 0) {
                str = o10.l(bnVar.getMessagesController().c2(Long.valueOf(a10)));
            } else {
                TLRPC.Chat O0 = bnVar.getMessagesController().O0(Long.valueOf(-a10));
                str = O0 == null ? "" : O0.title;
            }
            new fb(bnVar.getParentActivity(), bnVar.getResourceProvider(), E, 5, str, new i2(this, y10, messageObject, E, 3), 0L).show();
        }
    }

    public final void b(float f10, i6 i6Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f10);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ah.g(this, 9));
        this.F.addListener(new j6(this, f10, i6Var, 0));
        this.F.setInterpolator(lr.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        org.telegram.messenger.g0.r(this.I);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new i6(this, 2));
    }

    public final void d(float f10, float f11, boolean z10) {
        ArrayList arrayList;
        if (this.b == null || this.J) {
            return;
        }
        fj messageObject = getMessageObject();
        ch.q0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        bn bnVar = this.a;
        x8 y10 = x8.y(bnVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.K;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((mh0) arrayList.remove(0)).C(true);
            }
        }
        g5.a aVar = Utilities.c;
        int[] iArr = this.L;
        mh0 mh0Var = new mh0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        mh0Var.R(this);
        mh0Var.J(true);
        mh0Var.K(0);
        mh0Var.start();
        arrayList.add(mh0Var);
        invalidate();
        ch.n0 l10 = reactionsLayoutInBubble.l("stars");
        if (l10 != null) {
            l10.p();
        }
        if (z10) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            x8.y(bnVar.getCurrentAccount(), false).b0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.m6 m6Var = this.w;
        m6Var.a();
        m6Var.t("+" + y10.E(messageObject), true, true);
        this.r = true;
        i6 i6Var = this.I;
        org.telegram.messenger.g0.r(i6Var);
        org.telegram.messenger.g0.h3(i6Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.G < 100) {
            this.H += 0.5f;
            return;
        }
        this.H = Utilities.i(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.H;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || bnVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            bnVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        int i7;
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
        } else if ((zVar instanceof org.telegram.ui.Cells.u0) && !((org.telegram.ui.Cells.u0) zVar).m2) {
            return;
        }
        fj messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.e1() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        ch.q0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(1.0f, 1.8f, this.E);
        bn bnVar = this.a;
        float y10 = bnVar.A0.getY() + (((bnVar.sa == null || (bnVar.oa && !bnVar.pa)) && !bnVar.mb) ? (bnVar.P9 - bnVar.R9) - org.telegram.messenger.g0.L(4.0f) : 0.0f);
        float bottom = (bnVar.fragmentView.getBottom() - bnVar.A0.getBottom()) + (((bnVar.sa == null || (bnVar.oa && !bnVar.pa)) && !bnVar.mb) ? bnVar.Ya : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.E) * y10, getWidth(), com.google.android.gms.internal.vision.e2.t(1.0f, this.E, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.z zVar2 = this.b;
        int[] iArr2 = this.d;
        zVar2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) bnVar.Wa);
        canvas.save();
        ch.n0 l10 = reactionsLayoutInBubble.l("stars");
        RectF rectF2 = this.f;
        if (l10 != null) {
            f10 = 4.0f;
            int i10 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.b + l10.w;
            int i11 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.c + l10.x;
            float f14 = i10;
            float f15 = i11;
            z10 = 1;
            rectF2.set(f14, f15, i10 + l10.z, i11 + l10.A);
            org.telegram.messenger.g0.i3(rectF2, T1, (l10.z * 0.1f) + f14, (l10.A / 2.0f) + f15);
            Paint paint = this.n;
            paint.setColor(0);
            i7 = 0;
            paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.r1(this.E, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(T1, T1, (l10.z * 0.1f) + f14, (l10.A / 2.0f) + f15);
            num = Integer.valueOf(l10.q.hashCode());
        } else {
            f10 = 4.0f;
            i7 = 0;
            z10 = 1;
            num = null;
        }
        canvas.translate(iArr2[i7] - iArr[i7], this.b.getPaddingTop() + (iArr2[z10] - iArr[z10]));
        org.telegram.ui.Cells.z zVar3 = this.b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) zVar3;
            q1Var.setScrimReaction(null);
            q1Var.o1(canvas, 1.0f, num);
            q1Var.p1(canvas);
            q1Var.setScrimReaction(num);
        } else if (zVar3 instanceof org.telegram.ui.Cells.u0) {
            org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) zVar3;
            u0Var.setScrimReaction(null);
            u0Var.M(canvas, z10, num);
            org.telegram.ui.Cells.t0 t0Var = u0Var.A2;
            ch.q0 q0Var = u0Var.F0;
            float alpha = u0Var.getAlpha();
            org.telegram.ui.ActionBar.i6 i6Var = u0Var.h1;
            if (i6Var != null) {
                f11 = 255.0f;
                i6Var.e(u0Var.v0, u0Var.u0 + org.telegram.messenger.g0.L(f10), u0Var.getMeasuredWidth(), u0Var.w0);
            } else {
                f11 = 255.0f;
                org.telegram.ui.ActionBar.n6.r(u0Var.v0, u0Var.u0 + org.telegram.messenger.g0.L(f10), u0Var.getMeasuredWidth(), u0Var.w0);
            }
            fj fjVar = u0Var.Q0;
            if (fjVar == null || !fjVar.O5()) {
                rectF = rectF2;
            } else {
                q0Var.getClass();
                q0Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, u0Var.getWidth(), u0Var.getHeight(), (int) (alpha * f11), 31);
                } else {
                    rectF = rectF2;
                }
                q0Var.e(canvas, t0Var.b ? t0Var.c : 1.0f);
                if (alpha < 1.0f) {
                    canvas.restore();
                }
            }
            u0Var.setScrimReaction(num);
            canvas.restore();
            canvas.restore();
            if (l10 != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-org.telegram.messenger.g0.L(42.0f), -org.telegram.messenger.g0.L(42.0f));
                int L = (int) (org.telegram.messenger.g0.L(90.0f) * T1);
                int i12 = i7;
                while (true) {
                    ArrayList arrayList = this.K;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    mh0 mh0Var = (mh0) arrayList.get(i12);
                    if (mh0Var.b0 >= mh0Var.e[i7]) {
                        arrayList.remove(i12);
                        i12--;
                    } else {
                        float f16 = L / 2.0f;
                        mh0Var.setBounds((int) (((org.telegram.messenger.g0.L(15.0f) * T1) + rectF.left) - f16), (int) (rectF.centerY() - f16), (int) p5.c.e(org.telegram.messenger.g0.L(15.0f), T1, rectF.left, f16), (int) (rectF.centerY() + f16));
                        mh0Var.setAlpha((int) (this.E * f11));
                        mh0Var.draw(canvas);
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
                org.telegram.ui.Components.m6 m6Var = this.w;
                m6Var.C = (int) (d * f11);
                m6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), org.telegram.ui.ActionBar.n6.r1(d, -1442840576));
                m6Var.o(centerX - org.telegram.messenger.g0.L(100.0f), rectF.top - org.telegram.messenger.g0.L(48.0f), centerX + org.telegram.messenger.g0.L(100.0f), rectF.top - org.telegram.messenger.g0.L(24.0f));
                m6Var.draw(canvas);
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

    public ch.q0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).O;
        }
        if (zVar instanceof org.telegram.ui.Cells.u0) {
            return ((org.telegram.ui.Cells.u0) zVar).F0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ch.q0 reactionsLayoutInBubble;
        if (this.b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        w2 w2Var = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                ch.n0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.X.c(true);
                }
                org.telegram.messenger.g0.r(w2Var);
                org.telegram.messenger.g0.h3(w2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ch.n0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.X.c(false);
            }
            this.x = false;
            org.telegram.messenger.g0.r(w2Var);
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
        } else if (zVar2 instanceof org.telegram.ui.Cells.u0) {
            ((org.telegram.ui.Cells.u0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.u0) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = zVar;
        this.c = getMessageObject() == null ? 0 : getMessageObject().e1();
        org.telegram.ui.Cells.z zVar3 = this.b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.q1) this.b).setInvalidateListener(new i6(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.u0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.u0) this.b).setInvalidateListener(new i6(this, 1));
        }
        invalidate();
    }
}
