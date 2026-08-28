package gh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p5 extends View {
    public ValueAnimator A;
    public long B;
    public float C;
    public final n5 D;
    public boolean E;
    public final ArrayList F;
    public final int[] G;
    public final qn a;
    public org.telegram.ui.Cells.a0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.y5 s;
    public final org.telegram.ui.Components.i6 v;
    public boolean w;
    public final e5.u x;
    public float y;

    public p5(qn qnVar) {
        super(qnVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.y5(this, 0L, 420L, gr.h);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.v = i6Var;
        new Matrix();
        this.F = new ArrayList();
        this.G = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = qnVar;
        i6Var.setCallback(this);
        i6Var.o(false, true, false);
        i6Var.t(AndroidUtilities.dp(40.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        i6Var.b = 17;
        this.D = new n5(this, 0);
        this.x = new e5.u(21, this, qnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            qn qnVar = this.a;
            v7 y10 = v7.y(qnVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (!y10.e || y10.q(false, false, null).amount >= E) {
                return;
            }
            u7 u7Var = v7.y(qnVar.getCurrentAccount(), false).B;
            if (u7Var != null) {
                u7Var.a();
            }
            long a2 = qnVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(qnVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = qnVar.getMessagesController().getChat(Long.valueOf(-a2));
                str = chat == null ? "" : chat.title;
            }
            new ea(qnVar.getParentActivity(), qnVar.getResourceProvider(), E, 5, str, new e2(this, y10, messageObject, E, 3), 0L).show();
        }
    }

    public final void b(float f10, n5 n5Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            this.A = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f10);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 6));
        this.A.addListener(new o5(this, f10, n5Var, 0));
        this.A.setInterpolator(gr.h);
        this.A.setDuration(320L);
        this.A.start();
    }

    public final void c() {
        this.E = true;
        AndroidUtilities.cancelRunOnUIThread(this.D);
        this.v.q("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new n5(this, 2));
    }

    public final void d(float f10, float f11, boolean z10) {
        ArrayList arrayList;
        if (this.b == null || this.E) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        hg.s0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        qn qnVar = this.a;
        v7 y10 = v7.y(qnVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.F;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((mi0) arrayList.remove(0)).A(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = this.G;
        int i9 = iArr[random.nextInt(iArr.length)];
        mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(70.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(70.0f));
        mi0Var.r0 = this;
        mi0Var.H(true);
        mi0Var.I(0);
        mi0Var.start();
        arrayList.add(mi0Var);
        invalidate();
        hg.p0 m10 = reactionsLayoutInBubble.m("stars");
        if (m10 != null) {
            m10.q();
        }
        if (z10) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            v7.y(qnVar.getCurrentAccount(), false).d0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.i6 i6Var = this.v;
        i6Var.b();
        i6Var.q("+" + y10.E(messageObject), true, true);
        this.r = true;
        n5 n5Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(n5Var);
        AndroidUtilities.runOnUIThread(n5Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.B < 100) {
            this.C += 0.5f;
            return;
        }
        this.C = Utilities.clamp(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.C;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || qnVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            qnVar.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.b0(iArr2[0] + f10, iArr2[1] + f11, Utilities.clamp(this.C, 0.9f, 0.3f));
        this.C = 0.0f;
        this.B = currentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0340  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        char c10;
        char c11;
        Integer num;
        float f11;
        RectF rectF;
        float f12;
        float f13;
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            if (!((org.telegram.ui.Cells.t1) a0Var).I0) {
                return;
            }
        } else if ((a0Var instanceof org.telegram.ui.Cells.w0) && !((org.telegram.ui.Cells.w0) a0Var).Q1) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.getId() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        hg.s0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, this.y);
        qn qnVar = this.a;
        float y10 = qnVar.t0.getY() + (((qnVar.R9 == null || (qnVar.N9 && !qnVar.O9)) && !qnVar.Ka) ? (qnVar.o9 - qnVar.q9) - AndroidUtilities.dp(4.0f) : 0.0f);
        float bottom = (qnVar.fragmentView.getBottom() - qnVar.t0.getBottom()) + (((qnVar.R9 == null || (qnVar.N9 && !qnVar.O9)) && !qnVar.Ka) ? qnVar.wa : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.y) * y10, getWidth(), j3.r0.C(1.0f, this.y, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        int[] iArr2 = this.d;
        a0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) qnVar.ua);
        canvas.save();
        hg.p0 m10 = reactionsLayoutInBubble.m("stars");
        RectF rectF2 = this.f;
        if (m10 != null) {
            f10 = 4.0f;
            int i9 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.c + m10.x;
            int i10 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.d + m10.y;
            float f14 = i9;
            float f15 = i10;
            c10 = 1;
            rectF2.set(f14, f15, i9 + m10.A, i10 + m10.B);
            AndroidUtilities.scaleRect(rectF2, lerp, (m10.A * 0.1f) + f14, (m10.B / 2.0f) + f15);
            Paint paint = this.n;
            paint.setColor(0);
            c11 = 0;
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.f6.l1(this.y, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(lerp, lerp, (m10.A * 0.1f) + f14, (m10.B / 2.0f) + f15);
            num = Integer.valueOf(m10.r.hashCode());
        } else {
            f10 = 4.0f;
            c10 = 1;
            c11 = 0;
            num = null;
        }
        canvas.translate(iArr2[c11] - iArr[c11], this.b.getPaddingTop() + (iArr2[c10] - iArr[c10]));
        org.telegram.ui.Cells.a0 a0Var3 = this.b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) a0Var3;
            t1Var.setScrimReaction(null);
            t1Var.d2(canvas, 1.0f, num);
            t1Var.e2(canvas);
            t1Var.setScrimReaction(num);
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) a0Var3;
            w0Var.setScrimReaction(null);
            w0Var.C(canvas, true, num);
            org.telegram.ui.Cells.v0 v0Var = w0Var.e2;
            hg.s0 s0Var = w0Var.y0;
            float alpha = w0Var.getAlpha();
            org.telegram.ui.ActionBar.b6 b6Var = w0Var.U0;
            if (b6Var != null) {
                f11 = 255.0f;
                b6Var.o(w0Var.q0, w0Var.p0 + AndroidUtilities.dp(f10), w0Var.getMeasuredWidth(), w0Var.r0);
            } else {
                f11 = 255.0f;
                org.telegram.ui.ActionBar.f6.q(w0Var.q0, w0Var.p0 + AndroidUtilities.dp(f10), w0Var.getMeasuredWidth(), w0Var.r0);
            }
            MessageObject messageObject2 = w0Var.D0;
            if (messageObject2 == null || !messageObject2.shouldDrawReactions() || (s0Var.b && !(v0Var.b && s0Var.l))) {
                rectF = rectF2;
            } else {
                s0Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, w0Var.getWidth(), w0Var.getHeight(), (int) (alpha * f11), 31);
                } else {
                    rectF = rectF2;
                }
                s0Var.e(canvas, v0Var.b ? v0Var.c : 1.0f);
                if (alpha < 1.0f) {
                    canvas.restore();
                }
            }
            w0Var.setScrimReaction(num);
            canvas.restore();
            canvas.restore();
            if (m10 != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(42.0f));
                int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
                int i11 = 0;
                while (true) {
                    ArrayList arrayList = this.F;
                    if (i11 >= arrayList.size()) {
                        break;
                    }
                    mi0 mi0Var = (mi0) arrayList.get(i11);
                    if (mi0Var.X >= mi0Var.e[c11]) {
                        arrayList.remove(i11);
                        i11--;
                    } else {
                        float f16 = dp / 2.0f;
                        mi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f16), (int) (rectF.centerY() - f16), (int) aa.d.w(AndroidUtilities.dp(15.0f), lerp, rectF.left, f16), (int) (rectF.centerY() + f16));
                        mi0Var.setAlpha((int) (this.y * f11));
                        mi0Var.draw(canvas);
                    }
                    i11++;
                }
                float centerX = rectF.centerX();
                float dp2 = rectF.top - AndroidUtilities.dp(36.0f);
                canvas.save();
                float e10 = this.s.e(this.r);
                if (this.r) {
                    f13 = AndroidUtilities.dp(60.0f);
                    f12 = 1.0f;
                } else {
                    f12 = 1.0f;
                    f13 = -AndroidUtilities.dp(30.0f);
                }
                canvas.translate(0.0f, (f12 - e10) * f13);
                float lerp2 = AndroidUtilities.lerp(this.r ? 1.8f : 1.3f, f12, e10);
                canvas.scale(lerp2, lerp2, centerX, dp2);
                org.telegram.ui.Components.i6 i6Var = this.v;
                i6Var.w = (int) (e10 * f11);
                i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), org.telegram.ui.ActionBar.f6.l1(e10, -1442840576));
                i6Var.l(centerX - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), centerX + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
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
        if (m10 != null) {
        }
        if (!this.r) {
        }
        invalidate();
    }

    public hg.s0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).J;
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).y0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hg.s0 reactionsLayoutInBubble;
        if (this.b == null || this.E || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        e5.u uVar = this.x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.w = true;
                hg.p0 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(uVar);
                AndroidUtilities.runOnUIThread(uVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            hg.p0 m11 = reactionsLayoutInBubble.m("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (m11 != null) {
                m11.Y.c(false);
            }
            this.w = false;
            AndroidUtilities.cancelRunOnUIThread(uVar);
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
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = a0Var;
        this.c = getMessageObject() == null ? 0 : getMessageObject().getId();
        org.telegram.ui.Cells.a0 a0Var3 = this.b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.t1) this.b).setInvalidateListener(new n5(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.b).setInvalidateListener(new n5(this, 1));
        }
        invalidate();
    }
}
