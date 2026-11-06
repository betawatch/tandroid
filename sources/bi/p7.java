package bi;

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
import org.telegram.messenger.ij;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class p7 extends View {
    public float D;
    public ValueAnimator E;
    public long F;
    public float G;
    public final n7 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final an a;
    public org.telegram.ui.Cells.z b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.w5 s;
    public final org.telegram.ui.Components.i6 w;
    public boolean x;
    public final a4 y;

    public p7(an anVar) {
        super(anVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.w5(this, 0L, 420L, xq.h);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false);
        this.w = i6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = anVar;
        i6Var.setCallback(this);
        i6Var.r(false, true);
        i6Var.w(org.telegram.messenger.g0.L(40.0f));
        i6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        i6Var.M = org.telegram.messenger.g0.q.x;
        i6Var.u(-1);
        i6Var.b = 17;
        this.H = new n7(this, 0);
        this.y = new a4(5, this, anVar);
    }

    private ij getMessageObject() {
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
            ij messageObject = getMessageObject();
            an anVar = this.a;
            ea y10 = ea.y(anVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (!y10.e || y10.q(null, false, false).amount >= E) {
                return;
            }
            ca caVar = ea.y(anVar.getCurrentAccount(), false).B;
            if (caVar != null) {
                caVar.a();
            }
            long a10 = anVar.a();
            if (a10 >= 0) {
                str = t10.k(anVar.getMessagesController().a2(Long.valueOf(a10)));
            } else {
                TLRPC.Chat M0 = anVar.getMessagesController().M0(Long.valueOf(-a10));
                str = M0 == null ? "" : M0.title;
            }
            new tc(anVar.getParentActivity(), anVar.getResourceProvider(), E, 5, str, new w2(this, y10, messageObject, E, 3), 0L).show();
        }
    }

    public final void b(float f10, n7 n7Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, f10);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 7));
        this.E.addListener(new o7(this, f10, n7Var, 0));
        this.E.setInterpolator(xq.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        org.telegram.messenger.g0.r(this.H);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new n7(this, 2));
    }

    public final void d(float f10, float f11, boolean z9) {
        ArrayList arrayList;
        if (this.b == null || this.I) {
            return;
        }
        ij messageObject = getMessageObject();
        ch.p0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        an anVar = this.a;
        ea y10 = ea.y(anVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.J;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((zg0) arrayList.remove(0)).C(true);
            }
        }
        g5.a aVar = Utilities.c;
        int[] iArr = this.K;
        zg0 zg0Var = new zg0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        zg0Var.R(this);
        zg0Var.J(true);
        zg0Var.K(0);
        zg0Var.start();
        arrayList.add(zg0Var);
        invalidate();
        ch.m0 l10 = reactionsLayoutInBubble.l("stars");
        if (l10 != null) {
            l10.p();
        }
        if (z9) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            ea.y(anVar.getCurrentAccount(), false).b0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.i6 i6Var = this.w;
        i6Var.a();
        i6Var.t("+" + y10.E(messageObject), true, true);
        this.r = true;
        n7 n7Var = this.H;
        org.telegram.messenger.g0.r(n7Var);
        org.telegram.messenger.g0.i3(n7Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.F < 100) {
            this.G += 0.5f;
            return;
        }
        this.G = Utilities.i(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.G;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || anVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            anVar.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.b0(iArr2[0] + f10, iArr2[1] + f11, Utilities.i(this.G, 0.9f, 0.3f));
        this.G = 0.0f;
        this.F = currentTimeMillis;
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
        boolean z9;
        Integer num;
        float f11;
        RectF rectF;
        float f12;
        float f13;
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            if (!((org.telegram.ui.Cells.q1) zVar).N0) {
                return;
            }
        } else if ((zVar instanceof org.telegram.ui.Cells.t0) && !((org.telegram.ui.Cells.t0) zVar).d2) {
            return;
        }
        ij messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.f1() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        ch.p0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(1.0f, 1.8f, this.D);
        an anVar = this.a;
        float y10 = anVar.z0.getY() + (((anVar.oa == null || (anVar.ka && !anVar.la)) && !anVar.ib) ? (anVar.L9 - anVar.N9) - org.telegram.messenger.g0.L(4.0f) : 0.0f);
        float bottom = (anVar.fragmentView.getBottom() - anVar.z0.getBottom()) + (((anVar.oa == null || (anVar.ka && !anVar.la)) && !anVar.ib) ? anVar.Ua : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.D) * y10, getWidth(), com.google.android.recaptcha.internal.a.v(1.0f, this.D, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.z zVar2 = this.b;
        int[] iArr2 = this.d;
        zVar2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) anVar.Sa);
        canvas.save();
        ch.m0 l10 = reactionsLayoutInBubble.l("stars");
        RectF rectF2 = this.f;
        if (l10 != null) {
            f10 = 4.0f;
            int i10 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.b + l10.w;
            int i11 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.c + l10.x;
            float f14 = i10;
            float f15 = i11;
            z9 = 1;
            rectF2.set(f14, f15, i10 + l10.z, i11 + l10.A);
            org.telegram.messenger.g0.j3(rectF2, T1, (l10.z * 0.1f) + f14, (l10.A / 2.0f) + f15);
            Paint paint = this.n;
            paint.setColor(0);
            i7 = 0;
            paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f), 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.k6.r1(this.D, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(T1, T1, (l10.z * 0.1f) + f14, (l10.A / 2.0f) + f15);
            num = Integer.valueOf(l10.q.hashCode());
        } else {
            f10 = 4.0f;
            i7 = 0;
            z9 = 1;
            num = null;
        }
        canvas.translate(iArr2[i7] - iArr[i7], this.b.getPaddingTop() + (iArr2[z9] - iArr[z9]));
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
            t0Var.I(canvas, z9, num);
            org.telegram.ui.Cells.s0 s0Var = t0Var.r2;
            ch.p0 p0Var = t0Var.E0;
            float alpha = t0Var.getAlpha();
            org.telegram.ui.ActionBar.f6 f6Var = t0Var.g1;
            if (f6Var != null) {
                f11 = 255.0f;
                f6Var.b(t0Var.u0, t0Var.t0 + org.telegram.messenger.g0.L(f10), t0Var.getMeasuredWidth(), t0Var.v0);
            } else {
                f11 = 255.0f;
                org.telegram.ui.ActionBar.k6.r(t0Var.u0, t0Var.t0 + org.telegram.messenger.g0.L(f10), t0Var.getMeasuredWidth(), t0Var.v0);
            }
            ij ijVar = t0Var.P0;
            if (ijVar == null || !ijVar.P5()) {
                rectF = rectF2;
            } else {
                p0Var.getClass();
                p0Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, t0Var.getWidth(), t0Var.getHeight(), (int) (alpha * f11), 31);
                } else {
                    rectF = rectF2;
                }
                p0Var.e(canvas, s0Var.b ? s0Var.c : 1.0f);
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
                int i12 = i7;
                while (true) {
                    ArrayList arrayList = this.J;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    zg0 zg0Var = (zg0) arrayList.get(i12);
                    if (zg0Var.a0 >= zg0Var.e[i7]) {
                        arrayList.remove(i12);
                        i12--;
                    } else {
                        float f16 = L / 2.0f;
                        zg0Var.setBounds((int) (((org.telegram.messenger.g0.L(15.0f) * T1) + rectF.left) - f16), (int) (rectF.centerY() - f16), (int) rf.b.d(org.telegram.messenger.g0.L(15.0f), T1, rectF.left, f16), (int) (rectF.centerY() + f16));
                        zg0Var.setAlpha((int) (this.D * f11));
                        zg0Var.draw(canvas);
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
                org.telegram.ui.Components.i6 i6Var = this.w;
                i6Var.B = (int) (d * f11);
                i6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), org.telegram.ui.ActionBar.k6.r1(d, -1442840576));
                i6Var.o(centerX - org.telegram.messenger.g0.L(100.0f), rectF.top - org.telegram.messenger.g0.L(48.0f), centerX + org.telegram.messenger.g0.L(100.0f), rectF.top - org.telegram.messenger.g0.L(24.0f));
                i6Var.draw(canvas);
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

    public ch.p0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).N;
        }
        if (zVar instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) zVar).E0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ch.p0 reactionsLayoutInBubble;
        if (this.b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        a4 a4Var = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                ch.m0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.X.c(true);
                }
                org.telegram.messenger.g0.r(a4Var);
                org.telegram.messenger.g0.i3(a4Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ch.m0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.X.c(false);
            }
            this.x = false;
            org.telegram.messenger.g0.r(a4Var);
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
            ((org.telegram.ui.Cells.q1) this.b).setInvalidateListener(new n7(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.t0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.t0) this.b).setInvalidateListener(new n7(this, 1));
        }
        invalidate();
    }
}
