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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lva extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final kva I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final zu1 a;
    public jf0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final mm s;
    public final hn w;
    public boolean x;
    public final ida y;

    public lva(zu1 zu1Var) {
        super(zu1Var.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        this.s = new mm(this, 0L, 420L, k43.h);
        hn hnVar = new hn(false, false, false);
        this.w = hnVar;
        this.K = new ArrayList();
        this.L = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = zu1Var;
        hnVar.setCallback(this);
        hnVar.r(false, true);
        hnVar.w(hl.L(40.0f));
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.s(hl.L(12.0f), hl.L(3.5f), 0);
        hnVar.N = hl.q.x;
        hnVar.u(-1);
        hnVar.b = 17;
        this.I = new kva(this, (byte) 0);
        this.y = new ida((Object) this, (Object) zu1Var, (byte) 21);
    }

    private r47 getMessageObject() {
        jf0 jf0Var = this.b;
        if (jf0Var instanceof wb2) {
            return ((wb2) jf0Var).getPrimaryMessageObject();
        }
        if (jf0Var instanceof dl1) {
            return ((dl1) jf0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            r47 messageObject = getMessageObject();
            zu1 zu1Var = this.a;
            jxa v = jxa.v(zu1Var.getCurrentAccount(), false);
            long B = v.B(messageObject);
            if (!v.e || v.n(null, false, false).amount >= B) {
                return;
            }
            hxa hxaVar = jxa.v(zu1Var.getCurrentAccount(), false).B;
            if (hxaVar != null) {
                hxaVar.a();
            }
            long a = zu1Var.a();
            if (a >= 0) {
                str = lbc.l(zu1Var.getMessagesController().X1(Long.valueOf(a)));
            } else {
                TLRPC.Chat M0 = zu1Var.getMessagesController().M0(Long.valueOf(-a));
                str = M0 == null ? "" : M0.title;
            }
            new dza(zu1Var.getParentActivity(), zu1Var.getResourceProvider(), B, 5, str, new y09((Object) this, (Object) v, (Object) messageObject, B, (byte) 6), 0L).show();
        }
    }

    public final void b(float f, kva kvaVar) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ija(this, (byte) 7));
        this.F.addListener(new ok4(this, f, kvaVar, (byte) 4));
        this.F.setInterpolator(k43.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        hl.r(this.I);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new kva(this, (byte) 2));
    }

    public final void d(float f, float f2, boolean z) {
        ArrayList arrayList;
        if (this.b == null || this.J) {
            return;
        }
        r47 messageObject = getMessageObject();
        x49 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        zu1 zu1Var = this.a;
        jxa v = jxa.v(zu1Var.getCurrentAccount(), false);
        while (true) {
            arrayList = this.K;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((b29) arrayList.remove(0)).x(true);
            }
        }
        o3d o3dVar = Utilities.c;
        int[] iArr = this.L;
        b29 b29Var = new b29(iArr[o3dVar.nextInt(iArr.length)], hl.L(70.0f), hl.L(70.0f));
        b29Var.M(this);
        b29Var.E(true);
        b29Var.F(0);
        b29Var.start();
        arrayList.add(b29Var);
        invalidate();
        u49 l = reactionsLayoutInBubble.l("stars");
        if (l != null) {
            l.p();
        }
        if (z) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            jxa.v(zu1Var.getCurrentAccount(), false).c0(messageObject, this.a, 1L, true, false, null);
        }
        hn hnVar = this.w;
        hnVar.a();
        hnVar.t("+" + v.B(messageObject), true, true);
        this.r = true;
        kva kvaVar = this.I;
        hl.r(kvaVar);
        hl.d3(kvaVar, 1500L);
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
        if (measuredWidth != 0 || zu1Var.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            zu1Var.getLayoutContainer().getLocationInWindow(iArr2);
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
        jf0 jf0Var = this.b;
        if (jf0Var instanceof wb2) {
            if (!((wb2) jf0Var).O0) {
                return;
            }
        } else if ((jf0Var instanceof dl1) && !((dl1) jf0Var).j2) {
            return;
        }
        r47 messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.e1() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        x49 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float R1 = hl.R1(1.0f, 1.8f, this.E);
        zu1 zu1Var = this.a;
        float y = zu1Var.A0.getY() + (((zu1Var.sa == null || (zu1Var.oa && !zu1Var.pa)) && !zu1Var.mb) ? (zu1Var.P9 - zu1Var.R9) - hl.L(4.0f) : 0.0f);
        float bottom = (zu1Var.fragmentView.getBottom() - zu1Var.A0.getBottom()) + (((zu1Var.sa == null || (zu1Var.oa && !zu1Var.pa)) && !zu1Var.mb) ? zu1Var.Ya : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.E) * y, getWidth(), qu6.B(1.0f, this.E, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        jf0 jf0Var2 = this.b;
        int[] iArr2 = this.d;
        jf0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) zu1Var.Wa);
        canvas.save();
        u49 l = reactionsLayoutInBubble.l("stars");
        RectF rectF2 = this.f;
        if (l != null) {
            f = 4.0f;
            int i2 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.b + l.w;
            int i3 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.c + l.x;
            float f5 = i2;
            float f6 = i3;
            z = 1;
            rectF2.set(f5, f6, i2 + l.z, i3 + l.A);
            hl.e3(rectF2, R1, (l.z * 0.1f) + f5, (l.A / 2.0f) + f6);
            Paint paint = this.n;
            paint.setColor(0);
            i = 0;
            paint.setShadowLayer(hl.L(12.0f), 0.0f, hl.L(3.0f), aob.p1(this.E, 1426063360));
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
        jf0 jf0Var3 = this.b;
        if (jf0Var3 instanceof wb2) {
            wb2 wb2Var = (wb2) jf0Var3;
            wb2Var.setScrimReaction(null);
            wb2Var.q1(canvas, 1.0f, num);
            wb2Var.r1(canvas);
            wb2Var.setScrimReaction(num);
        } else if (jf0Var3 instanceof dl1) {
            dl1 dl1Var = (dl1) jf0Var3;
            dl1Var.setScrimReaction(null);
            dl1Var.M(canvas, z, num);
            cl1 cl1Var = dl1Var.x2;
            x49 x49Var = dl1Var.F0;
            float alpha = dl1Var.getAlpha();
            vnb vnbVar = dl1Var.h1;
            if (vnbVar != null) {
                f2 = 255.0f;
                vnbVar.b(dl1Var.v0, dl1Var.u0 + hl.L(f), dl1Var.getMeasuredWidth(), dl1Var.w0);
            } else {
                f2 = 255.0f;
                aob.q(dl1Var.v0, dl1Var.u0 + hl.L(f), dl1Var.getMeasuredWidth(), dl1Var.w0);
            }
            r47 r47Var = dl1Var.Q0;
            if (r47Var == null || !r47Var.N5()) {
                rectF = rectF2;
            } else {
                x49Var.getClass();
                x49Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, dl1Var.getWidth(), dl1Var.getHeight(), (int) (alpha * f2), 31);
                } else {
                    rectF = rectF2;
                }
                x49Var.e(canvas, cl1Var.b ? cl1Var.c : 1.0f);
                if (alpha < 1.0f) {
                    canvas.restore();
                }
            }
            dl1Var.setScrimReaction(num);
            canvas.restore();
            canvas.restore();
            if (l != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-hl.L(42.0f), -hl.L(42.0f));
                int L = (int) (hl.L(90.0f) * R1);
                int i4 = i;
                while (true) {
                    ArrayList arrayList = this.K;
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    b29 b29Var = (b29) arrayList.get(i4);
                    if (b29Var.b0 >= b29Var.e[i]) {
                        arrayList.remove(i4);
                        i4--;
                    } else {
                        float f7 = L / 2.0f;
                        b29Var.setBounds((int) (((hl.L(15.0f) * R1) + rectF.left) - f7), (int) (rectF.centerY() - f7), (int) bs2.i(hl.L(15.0f), R1, rectF.left, f7), (int) (rectF.centerY() + f7));
                        b29Var.setAlpha((int) (this.E * f2));
                        b29Var.draw(canvas);
                    }
                    i4++;
                }
                float centerX = rectF.centerX();
                float L2 = rectF.top - hl.L(36.0f);
                canvas.save();
                float d = this.s.d(this.r);
                if (this.r) {
                    f4 = hl.L(60.0f);
                    f3 = 1.0f;
                } else {
                    f3 = 1.0f;
                    f4 = -hl.L(30.0f);
                }
                canvas.translate(0.0f, (f3 - d) * f4);
                float R12 = hl.R1(this.r ? 1.8f : 1.3f, f3, d);
                canvas.scale(R12, R12, centerX, L2);
                hn hnVar = this.w;
                hnVar.C = (int) (d * f2);
                hnVar.s(hl.L(12.0f), hl.L(3.5f), aob.p1(d, -1442840576));
                hnVar.o(centerX - hl.L(100.0f), rectF.top - hl.L(48.0f), centerX + hl.L(100.0f), rectF.top - hl.L(24.0f));
                hnVar.draw(canvas);
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

    public x49 getReactionsLayoutInBubble() {
        jf0 jf0Var = this.b;
        if (jf0Var instanceof wb2) {
            return ((wb2) jf0Var).O;
        }
        if (jf0Var instanceof dl1) {
            return ((dl1) jf0Var).F0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x49 reactionsLayoutInBubble;
        if (this.b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        ida idaVar = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                u49 l = reactionsLayoutInBubble.l("stars");
                if (l != null) {
                    l.X.c(true);
                }
                hl.r(idaVar);
                hl.d3(idaVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            u49 l2 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l2 != null) {
                l2.X.c(false);
            }
            this.x = false;
            hl.r(idaVar);
        }
        return this.x;
    }

    public void setMessageCell(jf0 jf0Var) {
        jf0 jf0Var2 = this.b;
        if (jf0Var2 == jf0Var) {
            return;
        }
        if (jf0Var2 instanceof wb2) {
            ((wb2) jf0Var2).setScrimReaction(null);
            ((wb2) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (jf0Var2 instanceof dl1) {
            ((dl1) jf0Var2).setScrimReaction(null);
            ((dl1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = jf0Var;
        this.c = getMessageObject() == null ? 0 : getMessageObject().e1();
        jf0 jf0Var3 = this.b;
        if (jf0Var3 instanceof wb2) {
            jf0Var3.invalidate();
            ((wb2) this.b).setInvalidateListener(new kva(this, (byte) 1));
        } else if (jf0Var3 instanceof dl1) {
            jf0Var3.invalidate();
            ((dl1) this.b).setInvalidateListener(new kva(this, (byte) 1));
        }
        invalidate();
    }
}
