// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kta extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final jta I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final yv1 a;
    public hg0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final ln s;
    public final ho w;
    public boolean x;
    public final e6a y;

    public kta(yv1 yv1Var) {
        super(yv1Var.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        this.s = new ln(this, 0L, 420L, d53.h);
        ho hoVar = new ho(false, false, false);
        this.w = hoVar;
        this.K = new ArrayList();
        this.L = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = yv1Var;
        hoVar.setCallback(this);
        hoVar.r(false, true);
        hoVar.w(gm.L(40.0f));
        hoVar.x(gm.n1("fonts/num.otf"));
        hoVar.s(gm.L(12.0f), gm.L(3.5f), 0);
        hoVar.N = gm.q.x;
        hoVar.u(-1);
        hoVar.b = 17;
        this.I = new jta(this, (byte) 0);
        this.y = new e6a((Object) this, (Object) yv1Var, (byte) 26);
    }

    private k47 getMessageObject() {
        hg0 hg0Var = this.b;
        if (hg0Var instanceof rc2) {
            return ((rc2) hg0Var).getPrimaryMessageObject();
        }
        if (hg0Var instanceof cm1) {
            return ((cm1) hg0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            k47 messageObject = getMessageObject();
            yv1 yv1Var = this.a;
            jva v = jva.v(yv1Var.getCurrentAccount(), false);
            long B = v.B(messageObject);
            if (!v.e || v.n(null, false, false).amount >= B) {
                return;
            }
            hva hvaVar = jva.v(yv1Var.getCurrentAccount(), false).B;
            if (hvaVar != null) {
                hvaVar.a();
            }
            long a = yv1Var.a();
            if (a >= 0) {
                str = m9c.l(yv1Var.getMessagesController().W1(Long.valueOf(a)));
            } else {
                TLRPC.Chat L0 = yv1Var.getMessagesController().L0(Long.valueOf(-a));
                str = L0 == null ? "" : L0.title;
            }
            new dxa(yv1Var.getParentActivity(), yv1Var.getResourceProvider(), B, 5, str, new nz8((Object) this, (Object) v, (Object) messageObject, B, (byte) 6), 0L).show();
        }
    }

    public final void b(float f, jta jtaVar) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new rha(this, (byte) 7));
        this.F.addListener(new ok4(this, f, jtaVar, (byte) 4));
        this.F.setInterpolator(d53.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        gm.r(this.I);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new jta(this, (byte) 2));
    }

    public final void d(float f, float f2, boolean z) {
        ArrayList arrayList;
        if (this.b == null || this.J) {
            return;
        }
        k47 messageObject = getMessageObject();
        l39 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        yv1 yv1Var = this.a;
        jva v = jva.v(yv1Var.getCurrentAccount(), false);
        while (true) {
            arrayList = this.K;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((p09) arrayList.remove(0)).x(true);
            }
        }
        z0d z0dVar = Utilities.c;
        int[] iArr = this.L;
        p09 p09Var = new p09(iArr[z0dVar.nextInt(iArr.length)], gm.L(70.0f), gm.L(70.0f));
        p09Var.M(this);
        p09Var.E(true);
        p09Var.F(0);
        p09Var.start();
        arrayList.add(p09Var);
        invalidate();
        i39 l = reactionsLayoutInBubble.l("stars");
        if (l != null) {
            l.p();
        }
        if (z) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            jva.v(yv1Var.getCurrentAccount(), false).b0(messageObject, this.a, 1L, true, false, null);
        }
        ho hoVar = this.w;
        hoVar.a();
        hoVar.t("+" + v.B(messageObject), true, true);
        this.r = true;
        jta jtaVar = this.I;
        gm.r(jtaVar);
        gm.d3(jtaVar, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.G;
        float f3 = this.H;
        if (j < 100) {
            this.H = f3 + 0.5f;
            return;
        }
        this.H = Utilities.i(1.0f - ((j - 100) / 200.0f), 1.0f, 0.0f) * f3;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || yv1Var.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            yv1Var.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.a0(iArr2[0] + f, iArr2[1] + f2, Utilities.i(this.H, 0.9f, 0.3f));
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
        float f;
        int i;
        boolean z;
        Integer num;
        float f2;
        RectF rectF;
        float f3;
        float f4;
        hg0 hg0Var = this.b;
        if (hg0Var instanceof rc2) {
            if (!((rc2) hg0Var).O0) {
                return;
            }
        } else if ((hg0Var instanceof cm1) && !((cm1) hg0Var).j2) {
            return;
        }
        k47 messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.e1() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        l39 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float R1 = gm.R1(1.0f, 1.8f, this.E);
        yv1 yv1Var = this.a;
        float y = yv1Var.A0.getY() + (((yv1Var.sa == null || (yv1Var.oa && !yv1Var.pa)) && !yv1Var.mb) ? (yv1Var.P9 - yv1Var.R9) - gm.L(4.0f) : 0.0f);
        float bottom = (yv1Var.fragmentView.getBottom() - yv1Var.A0.getBottom()) + (((yv1Var.sa == null || (yv1Var.oa && !yv1Var.pa)) && !yv1Var.mb) ? yv1Var.Ya : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.E) * y, getWidth(), kt6.B(1.0f, this.E, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        hg0 hg0Var2 = this.b;
        int[] iArr2 = this.d;
        hg0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) yv1Var.Wa);
        canvas.save();
        i39 l = reactionsLayoutInBubble.l("stars");
        RectF rectF2 = this.f;
        if (l != null) {
            f = 4.0f;
            int i2 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.b + l.w;
            int i3 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.c + l.x;
            float f5 = i2;
            float f6 = i3;
            z = 1;
            rectF2.set(f5, f6, i2 + l.z, i3 + l.A);
            gm.e3(rectF2, R1, (l.z * 0.1f) + f5, (l.A / 2.0f) + f6);
            Paint paint = this.n;
            paint.setColor(0);
            i = 0;
            paint.setShadowLayer(gm.L(12.0f), 0.0f, gm.L(3.0f), cmb.p1(this.E, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(R1, R1, (l.z * 0.1f) + f5, (l.A / 2.0f) + f6);
            num = Integer.valueOf(l.q.hashCode());
        } else {
            f = 4.0f;
            i = 0;
            z = 1;
            num = null;
        }
        canvas.translate(iArr2[i] - iArr[i], this.b.getPaddingTop() + (iArr2[z] - iArr[z]));
        hg0 hg0Var3 = this.b;
        if (hg0Var3 instanceof rc2) {
            rc2 rc2Var = (rc2) hg0Var3;
            rc2Var.setScrimReaction(null);
            rc2Var.q1(canvas, 1.0f, num);
            rc2Var.r1(canvas);
            rc2Var.setScrimReaction(num);
        } else if (hg0Var3 instanceof cm1) {
            cm1 cm1Var = (cm1) hg0Var3;
            cm1Var.setScrimReaction(null);
            cm1Var.J(canvas, z, num);
            bm1 bm1Var = cm1Var.x2;
            l39 l39Var = cm1Var.F0;
            float alpha = cm1Var.getAlpha();
            ylb ylbVar = cm1Var.h1;
            if (ylbVar != null) {
                f2 = 255.0f;
                ylbVar.b(cm1Var.v0, cm1Var.u0 + gm.L(f), cm1Var.getMeasuredWidth(), cm1Var.w0);
            } else {
                f2 = 255.0f;
                cmb.q(cm1Var.v0, cm1Var.u0 + gm.L(f), cm1Var.getMeasuredWidth(), cm1Var.w0);
            }
            k47 k47Var = cm1Var.Q0;
            if (k47Var == null || !k47Var.N5()) {
                rectF = rectF2;
            } else {
                l39Var.getClass();
                l39Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, cm1Var.getWidth(), cm1Var.getHeight(), (int) (alpha * f2), 31);
                } else {
                    rectF = rectF2;
                }
                l39Var.e(canvas, bm1Var.b ? bm1Var.c : 1.0f);
                if (alpha < 1.0f) {
                    canvas.restore();
                }
            }
            cm1Var.setScrimReaction(num);
            canvas.restore();
            canvas.restore();
            if (l != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-gm.L(42.0f), -gm.L(42.0f));
                int L = (int) (gm.L(90.0f) * R1);
                int i4 = i;
                while (true) {
                    ArrayList arrayList = this.K;
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    p09 p09Var = (p09) arrayList.get(i4);
                    if (p09Var.b0 >= p09Var.e[i]) {
                        arrayList.remove(i4);
                        i4--;
                    } else {
                        float f7 = L / 2.0f;
                        p09Var.setBounds((int) (((gm.L(15.0f) * R1) + rectF.left) - f7), (int) (rectF.centerY() - f7), (int) ts2.i(gm.L(15.0f), R1, rectF.left, f7), (int) (rectF.centerY() + f7));
                        p09Var.setAlpha((int) (this.E * f2));
                        p09Var.draw(canvas);
                    }
                    i4++;
                }
                float centerX = rectF.centerX();
                float L2 = rectF.top - gm.L(36.0f);
                canvas.save();
                float d = this.s.d(this.r);
                if (this.r) {
                    f4 = gm.L(60.0f);
                    f3 = 1.0f;
                } else {
                    f3 = 1.0f;
                    f4 = -gm.L(30.0f);
                }
                canvas.translate(0.0f, (f3 - d) * f4);
                float R12 = gm.R1(this.r ? 1.8f : 1.3f, f3, d);
                canvas.scale(R12, R12, centerX, L2);
                ho hoVar = this.w;
                hoVar.C = (int) (d * f2);
                hoVar.s(gm.L(12.0f), gm.L(3.5f), cmb.p1(d, -1442840576));
                hoVar.o(centerX - gm.L(100.0f), rectF.top - gm.L(48.0f), centerX + gm.L(100.0f), rectF.top - gm.L(24.0f));
                hoVar.draw(canvas);
                canvas.restore();
            }
            if (!this.r) {
                a();
            }
            invalidate();
        }
        rectF = rectF2;
        f2 = 255.0f;
        canvas.restore();
        canvas.restore();
        if (l != null) {
        }
        if (!this.r) {
        }
        invalidate();
    }

    public l39 getReactionsLayoutInBubble() {
        hg0 hg0Var = this.b;
        if (hg0Var instanceof rc2) {
            return ((rc2) hg0Var).O;
        }
        if (hg0Var instanceof cm1) {
            return ((cm1) hg0Var).F0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l39 reactionsLayoutInBubble;
        if (this.b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        e6a e6aVar = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                i39 l = reactionsLayoutInBubble.l("stars");
                if (l != null) {
                    l.X.c(true);
                }
                gm.r(e6aVar);
                gm.d3(e6aVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            i39 l2 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l2 != null) {
                l2.X.c(false);
            }
            this.x = false;
            gm.r(e6aVar);
        }
        return this.x;
    }

    public void setMessageCell(hg0 hg0Var) {
        hg0 hg0Var2 = this.b;
        if (hg0Var2 == hg0Var) {
            return;
        }
        if (hg0Var2 instanceof rc2) {
            ((rc2) hg0Var2).setScrimReaction(null);
            ((rc2) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (hg0Var2 instanceof cm1) {
            ((cm1) hg0Var2).setScrimReaction(null);
            ((cm1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = hg0Var;
        this.c = getMessageObject() == null ? 0 : getMessageObject().e1();
        hg0 hg0Var3 = this.b;
        if (hg0Var3 instanceof rc2) {
            hg0Var3.invalidate();
            ((rc2) this.b).setInvalidateListener(new jta(this, (byte) 1));
        } else if (hg0Var3 instanceof cm1) {
            hg0Var3.invalidate();
            ((cm1) this.b).setInvalidateListener(new jta(this, (byte) 1));
        }
        invalidate();
    }
}
