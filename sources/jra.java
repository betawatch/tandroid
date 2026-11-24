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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jra extends View {
    public float E;
    public ValueAnimator F;
    public long G;
    public float H;
    public final ira I;
    public boolean J;
    public final ArrayList K;
    public final int[] L;
    public final mu1 a;
    public hf0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final lm s;
    public final gn w;
    public boolean x;
    public final t7a y;

    public jra(mu1 mu1Var) {
        super(mu1Var.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        this.s = new lm(this, 0L, 420L, s33.h);
        gn gnVar = new gn(false, false, false);
        this.w = gnVar;
        this.K = new ArrayList();
        this.L = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = mu1Var;
        gnVar.setCallback(this);
        gnVar.r(false, true);
        gnVar.w(gl.L(40.0f));
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.s(gl.L(12.0f), gl.L(3.5f), 0);
        gnVar.N = gl.q.x;
        gnVar.u(-1);
        gnVar.b = 17;
        this.I = new ira(this, (byte) 0);
        this.y = new t7a((Object) this, (Object) mu1Var, (byte) 24);
    }

    private k27 getMessageObject() {
        hf0 hf0Var = this.b;
        if (hf0Var instanceof gb2) {
            return ((gb2) hf0Var).getPrimaryMessageObject();
        }
        if (hf0Var instanceof uk1) {
            return ((uk1) hf0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            k27 messageObject = getMessageObject();
            mu1 mu1Var = this.a;
            gta v = gta.v(mu1Var.getCurrentAccount(), false);
            long B = v.B(messageObject);
            if (!v.e || v.n(null, false, false).amount >= B) {
                return;
            }
            eta etaVar = gta.v(mu1Var.getCurrentAccount(), false).B;
            if (etaVar != null) {
                etaVar.a();
            }
            long a = mu1Var.a();
            if (a >= 0) {
                str = l7c.l(mu1Var.getMessagesController().V1(Long.valueOf(a)));
            } else {
                TLRPC.Chat K0 = mu1Var.getMessagesController().K0(Long.valueOf(-a));
                str = K0 == null ? "" : K0.title;
            }
            new zua(mu1Var.getParentActivity(), mu1Var.getResourceProvider(), B, 5, str, new mx8((Object) this, (Object) v, (Object) messageObject, B, (byte) 6), 0L).show();
        }
    }

    public final void b(float f, ira iraVar) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new gja(this, (byte) 5));
        this.F.addListener(new ji4(this, f, iraVar, (byte) 4));
        this.F.setInterpolator(s33.h);
        this.F.setDuration(320L);
        this.F.start();
    }

    public final void c() {
        this.J = true;
        gl.r(this.I);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new ira(this, (byte) 2));
    }

    public final void d(float f, float f2, boolean z) {
        ArrayList arrayList;
        if (this.b == null || this.J) {
            return;
        }
        k27 messageObject = getMessageObject();
        i19 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        mu1 mu1Var = this.a;
        gta v = gta.v(mu1Var.getCurrentAccount(), false);
        while (true) {
            arrayList = this.K;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((oy8) arrayList.remove(0)).x(true);
            }
        }
        yyc yycVar = Utilities.c;
        int[] iArr = this.L;
        oy8 oy8Var = new oy8(iArr[yycVar.nextInt(iArr.length)], gl.L(70.0f), gl.L(70.0f));
        oy8Var.M(this);
        oy8Var.E(true);
        oy8Var.F(0);
        oy8Var.start();
        arrayList.add(oy8Var);
        invalidate();
        f19 l = reactionsLayoutInBubble.l("stars");
        if (l != null) {
            l.p();
        }
        if (z) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            gta.v(mu1Var.getCurrentAccount(), false).b0(messageObject, this.a, 1L, true, false, null);
        }
        gn gnVar = this.w;
        gnVar.a();
        gnVar.t("+" + v.B(messageObject), true, true);
        this.r = true;
        ira iraVar = this.I;
        gl.r(iraVar);
        gl.e3(iraVar, 1500L);
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
        if (measuredWidth != 0 || mu1Var.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            mu1Var.getLayoutContainer().getLocationInWindow(iArr2);
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
        hf0 hf0Var = this.b;
        if (hf0Var instanceof gb2) {
            if (!((gb2) hf0Var).O0) {
                return;
            }
        } else if ((hf0Var instanceof uk1) && !((uk1) hf0Var).j2) {
            return;
        }
        k27 messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.e1() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        i19 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float R1 = gl.R1(1.0f, 1.8f, this.E);
        mu1 mu1Var = this.a;
        float y = mu1Var.A0.getY() + (((mu1Var.sa == null || (mu1Var.oa && !mu1Var.pa)) && !mu1Var.mb) ? (mu1Var.P9 - mu1Var.R9) - gl.L(4.0f) : 0.0f);
        float bottom = (mu1Var.fragmentView.getBottom() - mu1Var.A0.getBottom()) + (((mu1Var.sa == null || (mu1Var.oa && !mu1Var.pa)) && !mu1Var.mb) ? mu1Var.Ya : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.E) * y, getWidth(), ls6.B(1.0f, this.E, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        hf0 hf0Var2 = this.b;
        int[] iArr2 = this.d;
        hf0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) mu1Var.Wa);
        canvas.save();
        f19 l = reactionsLayoutInBubble.l("stars");
        RectF rectF2 = this.f;
        if (l != null) {
            f = 4.0f;
            int i2 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.b + l.w;
            int i3 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.c + l.x;
            float f5 = i2;
            float f6 = i3;
            z = 1;
            rectF2.set(f5, f6, i2 + l.z, i3 + l.A);
            gl.f3(rectF2, R1, (l.z * 0.1f) + f5, (l.A / 2.0f) + f6);
            Paint paint = this.n;
            paint.setColor(0);
            i = 0;
            paint.setShadowLayer(gl.L(12.0f), 0.0f, gl.L(3.0f), bkb.p1(this.E, 1426063360));
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
        hf0 hf0Var3 = this.b;
        if (hf0Var3 instanceof gb2) {
            gb2 gb2Var = (gb2) hf0Var3;
            gb2Var.setScrimReaction(null);
            gb2Var.q1(canvas, 1.0f, num);
            gb2Var.r1(canvas);
            gb2Var.setScrimReaction(num);
        } else if (hf0Var3 instanceof uk1) {
            uk1 uk1Var = (uk1) hf0Var3;
            uk1Var.setScrimReaction(null);
            uk1Var.O(canvas, z, num);
            tk1 tk1Var = uk1Var.x2;
            i19 i19Var = uk1Var.F0;
            float alpha = uk1Var.getAlpha();
            wjb wjbVar = uk1Var.h1;
            if (wjbVar != null) {
                f2 = 255.0f;
                wjbVar.b(uk1Var.v0, uk1Var.u0 + gl.L(f), uk1Var.getMeasuredWidth(), uk1Var.w0);
            } else {
                f2 = 255.0f;
                bkb.q(uk1Var.v0, uk1Var.u0 + gl.L(f), uk1Var.getMeasuredWidth(), uk1Var.w0);
            }
            k27 k27Var = uk1Var.Q0;
            if (k27Var == null || !k27Var.N5()) {
                rectF = rectF2;
            } else {
                i19Var.getClass();
                i19Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, uk1Var.getWidth(), uk1Var.getHeight(), (int) (alpha * f2), 31);
                } else {
                    rectF = rectF2;
                }
                i19Var.e(canvas, tk1Var.b ? tk1Var.c : 1.0f);
                if (alpha < 1.0f) {
                    canvas.restore();
                }
            }
            uk1Var.setScrimReaction(num);
            canvas.restore();
            canvas.restore();
            if (l != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-gl.L(42.0f), -gl.L(42.0f));
                int L = (int) (gl.L(90.0f) * R1);
                int i4 = i;
                while (true) {
                    ArrayList arrayList = this.K;
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    oy8 oy8Var = (oy8) arrayList.get(i4);
                    if (oy8Var.b0 >= oy8Var.e[i]) {
                        arrayList.remove(i4);
                        i4--;
                    } else {
                        float f7 = L / 2.0f;
                        oy8Var.setBounds((int) (((gl.L(15.0f) * R1) + rectF.left) - f7), (int) (rectF.centerY() - f7), (int) ir2.i(gl.L(15.0f), R1, rectF.left, f7), (int) (rectF.centerY() + f7));
                        oy8Var.setAlpha((int) (this.E * f2));
                        oy8Var.draw(canvas);
                    }
                    i4++;
                }
                float centerX = rectF.centerX();
                float L2 = rectF.top - gl.L(36.0f);
                canvas.save();
                float d = this.s.d(this.r);
                if (this.r) {
                    f4 = gl.L(60.0f);
                    f3 = 1.0f;
                } else {
                    f3 = 1.0f;
                    f4 = -gl.L(30.0f);
                }
                canvas.translate(0.0f, (f3 - d) * f4);
                float R12 = gl.R1(this.r ? 1.8f : 1.3f, f3, d);
                canvas.scale(R12, R12, centerX, L2);
                gn gnVar = this.w;
                gnVar.C = (int) (d * f2);
                gnVar.s(gl.L(12.0f), gl.L(3.5f), bkb.p1(d, -1442840576));
                gnVar.o(centerX - gl.L(100.0f), rectF.top - gl.L(48.0f), centerX + gl.L(100.0f), rectF.top - gl.L(24.0f));
                gnVar.draw(canvas);
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

    public i19 getReactionsLayoutInBubble() {
        hf0 hf0Var = this.b;
        if (hf0Var instanceof gb2) {
            return ((gb2) hf0Var).O;
        }
        if (hf0Var instanceof uk1) {
            return ((uk1) hf0Var).F0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i19 reactionsLayoutInBubble;
        if (this.b == null || this.J || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        t7a t7aVar = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                f19 l = reactionsLayoutInBubble.l("stars");
                if (l != null) {
                    l.X.c(true);
                }
                gl.r(t7aVar);
                gl.e3(t7aVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            f19 l2 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l2 != null) {
                l2.X.c(false);
            }
            this.x = false;
            gl.r(t7aVar);
        }
        return this.x;
    }

    public void setMessageCell(hf0 hf0Var) {
        hf0 hf0Var2 = this.b;
        if (hf0Var2 == hf0Var) {
            return;
        }
        if (hf0Var2 instanceof gb2) {
            ((gb2) hf0Var2).setScrimReaction(null);
            ((gb2) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (hf0Var2 instanceof uk1) {
            ((uk1) hf0Var2).setScrimReaction(null);
            ((uk1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = hf0Var;
        this.c = getMessageObject() == null ? 0 : getMessageObject().e1();
        hf0 hf0Var3 = this.b;
        if (hf0Var3 instanceof gb2) {
            hf0Var3.invalidate();
            ((gb2) this.b).setInvalidateListener(new ira(this, (byte) 1));
        } else if (hf0Var3 instanceof uk1) {
            hf0Var3.invalidate();
            ((uk1) this.b).setInvalidateListener(new ira(this, (byte) 1));
        }
        invalidate();
    }
}
