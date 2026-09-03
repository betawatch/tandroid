package mh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l5 extends View {
    public ValueAnimator B;
    public long C;
    public float D;
    public final j5 E;
    public boolean F;
    public final ArrayList G;
    public final int[] H;
    public final xn a;
    public org.telegram.ui.Cells.a0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.z5 s;
    public final org.telegram.ui.Components.j6 v;
    public boolean w;
    public final m2 x;
    public float y;

    public l5(xn xnVar) {
        super(xnVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.z5(this, 0L, 420L, pr.h);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.v = j6Var;
        new Matrix();
        this.G = new ArrayList();
        this.H = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = xnVar;
        j6Var.setCallback(this);
        j6Var.o(false, true, false);
        j6Var.t(AndroidUtilities.dp(40.0f));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.r(-1);
        j6Var.b = 17;
        this.E = new j5(this, 0);
        this.x = new m2(9, this, xnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
        }
        if (a0Var instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) a0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            xn xnVar = this.a;
            t7 y10 = t7.y(xnVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (!y10.e || y10.q(false, false, null).amount >= E) {
                return;
            }
            s7 s7Var = t7.y(xnVar.getCurrentAccount(), false).B;
            if (s7Var != null) {
                s7Var.a();
            }
            long a2 = xnVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(xnVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = xnVar.getMessagesController().getChat(Long.valueOf(-a2));
                str = chat == null ? "" : chat.title;
            }
            new z9(xnVar.getParentActivity(), xnVar.getResourceProvider(), E, 5, str, new b2(this, y10, messageObject, E, 3), 0L).show();
        }
    }

    public final void b(float f10, j5 j5Var) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            this.B = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f10);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new eg.m1(this, 15));
        this.B.addListener(new k5(this, f10, j5Var, 0));
        this.B.setInterpolator(pr.h);
        this.B.setDuration(320L);
        this.B.start();
    }

    public final void c() {
        this.F = true;
        AndroidUtilities.cancelRunOnUIThread(this.E);
        this.v.q("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new j5(this, 2));
    }

    public final void d(float f10, float f11, boolean z4) {
        ArrayList arrayList;
        if (this.b == null || this.F) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        ng.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        xn xnVar = this.a;
        t7 y10 = t7.y(xnVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.G;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((hj0) arrayList.remove(0)).A(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = this.H;
        hj0 hj0Var = new hj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        hj0Var.s0 = this;
        hj0Var.H(true);
        hj0Var.I(0);
        hj0Var.start();
        arrayList.add(hj0Var);
        invalidate();
        ng.o0 l10 = reactionsLayoutInBubble.l("stars");
        if (l10 != null) {
            l10.q();
        }
        if (z4) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            t7.y(xnVar.getCurrentAccount(), false).d0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.j6 j6Var = this.v;
        j6Var.b();
        j6Var.q("+" + y10.E(messageObject), true, true);
        this.r = true;
        j5 j5Var = this.E;
        AndroidUtilities.cancelRunOnUIThread(j5Var);
        AndroidUtilities.runOnUIThread(j5Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.C < 100) {
            this.D += 0.5f;
            return;
        }
        this.D = Utilities.clamp(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.D;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || xnVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            xnVar.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.b0(iArr2[0] + f10, iArr2[1] + f11, Utilities.clamp(this.D, 0.9f, 0.3f));
        this.D = 0.0f;
        this.C = currentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        char c3;
        char c10;
        Integer num;
        float f11;
        RectF rectF;
        float f12;
        float f13;
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            if (!((org.telegram.ui.Cells.t1) a0Var).J0) {
                return;
            }
        } else if ((a0Var instanceof org.telegram.ui.Cells.v0) && !((org.telegram.ui.Cells.v0) a0Var).R1) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.getId() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        ng.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, this.y);
        xn xnVar = this.a;
        float y10 = xnVar.u0.getY() + (((xnVar.S9 == null || (xnVar.O9 && !xnVar.P9)) && !xnVar.La) ? (xnVar.p9 - xnVar.r9) - AndroidUtilities.dp(4.0f) : 0.0f);
        float bottom = (xnVar.fragmentView.getBottom() - xnVar.u0.getBottom()) + (((xnVar.S9 == null || (xnVar.O9 && !xnVar.P9)) && !xnVar.La) ? xnVar.xa : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.y) * y10, getWidth(), yh.c(1.0f, this.y, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        int[] iArr2 = this.d;
        a0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) xnVar.va);
        canvas.save();
        ng.o0 l10 = reactionsLayoutInBubble.l("stars");
        RectF rectF2 = this.f;
        if (l10 != null) {
            f10 = 4.0f;
            int i10 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.c + l10.x;
            int i11 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.d + l10.y;
            float f14 = i10;
            float f15 = i11;
            c3 = 1;
            rectF2.set(f14, f15, i10 + l10.A, i11 + l10.B);
            AndroidUtilities.scaleRect(rectF2, lerp, (l10.A * 0.1f) + f14, (l10.B / 2.0f) + f15);
            Paint paint = this.n;
            paint.setColor(0);
            c10 = 0;
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.k6.l1(this.y, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(lerp, lerp, (l10.A * 0.1f) + f14, (l10.B / 2.0f) + f15);
            num = Integer.valueOf(l10.r.hashCode());
        } else {
            f10 = 4.0f;
            c3 = 1;
            c10 = 0;
            num = null;
        }
        canvas.translate(iArr2[c10] - iArr[c10], this.b.getPaddingTop() + (iArr2[c3] - iArr[c3]));
        org.telegram.ui.Cells.a0 a0Var3 = this.b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) a0Var3;
            t1Var.setScrimReaction(null);
            t1Var.d2(canvas, 1.0f, num);
            t1Var.e2(canvas);
            t1Var.setScrimReaction(num);
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) a0Var3;
            v0Var.setScrimReaction(null);
            v0Var.C(canvas, true, num);
            org.telegram.ui.Cells.u0 u0Var = v0Var.f2;
            ng.r0 r0Var = v0Var.z0;
            float alpha = v0Var.getAlpha();
            org.telegram.ui.ActionBar.g6 g6Var = v0Var.V0;
            if (g6Var != null) {
                f11 = 255.0f;
                g6Var.l(v0Var.r0, v0Var.q0 + AndroidUtilities.dp(f10), v0Var.getMeasuredWidth(), v0Var.s0);
            } else {
                f11 = 255.0f;
                org.telegram.ui.ActionBar.k6.q(v0Var.r0, v0Var.q0 + AndroidUtilities.dp(f10), v0Var.getMeasuredWidth(), v0Var.s0);
            }
            MessageObject messageObject2 = v0Var.E0;
            if (messageObject2 == null || !messageObject2.shouldDrawReactions() || (r0Var.b && !(u0Var.b && r0Var.l))) {
                rectF = rectF2;
            } else {
                r0Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, v0Var.getWidth(), v0Var.getHeight(), (int) (alpha * f11), 31);
                } else {
                    rectF = rectF2;
                }
                r0Var.e(canvas, u0Var.b ? u0Var.c : 1.0f);
                if (alpha < 1.0f) {
                    canvas.restore();
                }
            }
            v0Var.setScrimReaction(num);
            canvas.restore();
            canvas.restore();
            if (l10 != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(42.0f));
                int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.G;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    hj0 hj0Var = (hj0) arrayList.get(i12);
                    if (hj0Var.Y >= hj0Var.e[c10]) {
                        arrayList.remove(i12);
                        i12--;
                    } else {
                        float f16 = dp / 2.0f;
                        hj0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f16), (int) (rectF.centerY() - f16), (int) e2.c.A(AndroidUtilities.dp(15.0f), lerp, rectF.left, f16), (int) (rectF.centerY() + f16));
                        hj0Var.setAlpha((int) (this.y * f11));
                        hj0Var.draw(canvas);
                    }
                    i12++;
                }
                float centerX = rectF.centerX();
                float dp2 = rectF.top - AndroidUtilities.dp(36.0f);
                canvas.save();
                float e6 = this.s.e(this.r);
                if (this.r) {
                    f13 = AndroidUtilities.dp(60.0f);
                    f12 = 1.0f;
                } else {
                    f12 = 1.0f;
                    f13 = -AndroidUtilities.dp(30.0f);
                }
                canvas.translate(0.0f, (f12 - e6) * f13);
                float lerp2 = AndroidUtilities.lerp(this.r ? 1.8f : 1.3f, f12, e6);
                canvas.scale(lerp2, lerp2, centerX, dp2);
                org.telegram.ui.Components.j6 j6Var = this.v;
                j6Var.w = (int) (e6 * f11);
                j6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), org.telegram.ui.ActionBar.k6.l1(e6, -1442840576));
                j6Var.l(centerX - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), centerX + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
                j6Var.draw(canvas);
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

    public ng.r0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).K;
        }
        if (a0Var instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) a0Var).z0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ng.r0 reactionsLayoutInBubble;
        if (this.b == null || this.F || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        m2 m2Var = this.x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.w = true;
                ng.o0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(m2Var);
                AndroidUtilities.runOnUIThread(m2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ng.o0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.Y.c(false);
            }
            this.w = false;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
        }
        return this.w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = a0Var;
        this.c = getMessageObject() == null ? 0 : getMessageObject().getId();
        org.telegram.ui.Cells.a0 a0Var3 = this.b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.t1) this.b).setInvalidateListener(new j5(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.v0) this.b).setInvalidateListener(new j5(this, 1));
        }
        invalidate();
    }
}
