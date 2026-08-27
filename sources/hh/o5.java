package hh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o5 extends View {
    public ValueAnimator A;
    public long B;
    public float C;
    public final l5 D;
    public boolean E;
    public final ArrayList F;
    public final int[] G;
    public final rn a;
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
    public final m5 x;
    public float y;

    public o5(rn rnVar) {
        super(rnVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.y5(this, 0L, 420L, er.h);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.v = i6Var;
        new Matrix();
        this.F = new ArrayList();
        this.G = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = rnVar;
        i6Var.setCallback(this);
        i6Var.o(false, true, false);
        i6Var.t(AndroidUtilities.dp(40.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        i6Var.b = 17;
        int i10 = 0;
        this.D = new l5(this, i10);
        this.x = new m5(i10, this, rnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) a0Var).getPrimaryMessageObject();
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
            rn rnVar = this.a;
            u7 y10 = u7.y(rnVar.getCurrentAccount(), false);
            long E = y10.E(messageObject);
            if (!y10.e || y10.q(false, false, null).amount >= E) {
                return;
            }
            t7 t7Var = u7.y(rnVar.getCurrentAccount(), false).B;
            if (t7Var != null) {
                t7Var.a();
            }
            long a2 = rnVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(rnVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = rnVar.getMessagesController().getChat(Long.valueOf(-a2));
                str = chat == null ? "" : chat.title;
            }
            new ea(rnVar.getParentActivity(), rnVar.getResourceProvider(), E, 5, str, new e2(this, y10, messageObject, E, 3), 0L).show();
        }
    }

    public final void b(float f10, l5 l5Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            this.A = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f10);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new ag.u(this, 9));
        this.A.addListener(new n5(this, f10, l5Var, 0));
        this.A.setInterpolator(er.h);
        this.A.setDuration(320L);
        this.A.start();
    }

    public final void c() {
        this.E = true;
        AndroidUtilities.cancelRunOnUIThread(this.D);
        this.v.q("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new l5(this, 2));
    }

    public final void d(float f10, float f11, boolean z10) {
        ArrayList arrayList;
        if (this.b == null || this.E) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        ig.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        rn rnVar = this.a;
        u7 y10 = u7.y(rnVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.F;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((oi0) arrayList.remove(0)).A(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = this.G;
        int i10 = iArr[random.nextInt(iArr.length)];
        oi0 oi0Var = new oi0(i10, AndroidUtilities.dp(70.0f), i0.a.k(i10, ""), AndroidUtilities.dp(70.0f));
        oi0Var.r0 = this;
        oi0Var.H(true);
        oi0Var.I(0);
        oi0Var.start();
        arrayList.add(oi0Var);
        invalidate();
        ig.o0 m10 = reactionsLayoutInBubble.m("stars");
        if (m10 != null) {
            m10.q();
        }
        if (z10) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            u7.y(rnVar.getCurrentAccount(), false).d0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.i6 i6Var = this.v;
        i6Var.b();
        i6Var.q("+" + y10.E(messageObject), true, true);
        this.r = true;
        l5 l5Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(l5Var);
        AndroidUtilities.runOnUIThread(l5Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.B < 100) {
            this.C += 0.5f;
            return;
        }
        this.C = Utilities.clamp(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.C;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || rnVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            rnVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            if (!((org.telegram.ui.Cells.s1) a0Var).I0) {
                return;
            }
        } else if ((a0Var instanceof org.telegram.ui.Cells.v0) && !((org.telegram.ui.Cells.v0) a0Var).Q1) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.getId() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        ig.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, this.y);
        rn rnVar = this.a;
        float y10 = rnVar.t0.getY() + (((rnVar.R9 == null || (rnVar.N9 && !rnVar.O9)) && !rnVar.Ka) ? (rnVar.o9 - rnVar.q9) - AndroidUtilities.dp(4.0f) : 0.0f);
        float bottom = (rnVar.fragmentView.getBottom() - rnVar.t0.getBottom()) + (((rnVar.R9 == null || (rnVar.N9 && !rnVar.O9)) && !rnVar.Ka) ? rnVar.wa : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.y) * y10, getWidth(), org.telegram.ui.Cells.pa.b(1.0f, this.y, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        int[] iArr2 = this.d;
        a0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) rnVar.ua);
        canvas.save();
        ig.o0 m10 = reactionsLayoutInBubble.m("stars");
        RectF rectF2 = this.f;
        if (m10 != null) {
            f10 = 4.0f;
            int i10 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.c + m10.x;
            int i11 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.d + m10.y;
            float f14 = i10;
            float f15 = i11;
            c10 = 1;
            rectF2.set(f14, f15, i10 + m10.A, i11 + m10.B);
            AndroidUtilities.scaleRect(rectF2, lerp, (m10.A * 0.1f) + f14, (m10.B / 2.0f) + f15);
            Paint paint = this.n;
            paint.setColor(0);
            c11 = 0;
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.l1(this.y, 1426063360));
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
        if (a0Var3 instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) a0Var3;
            s1Var.setScrimReaction(null);
            s1Var.c2(canvas, 1.0f, num);
            s1Var.d2(canvas);
            s1Var.setScrimReaction(num);
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) a0Var3;
            v0Var.setScrimReaction(null);
            v0Var.D(canvas, true, num);
            org.telegram.ui.Cells.u0 u0Var = v0Var.e2;
            ig.r0 r0Var = v0Var.y0;
            float alpha = v0Var.getAlpha();
            org.telegram.ui.ActionBar.c6 c6Var = v0Var.U0;
            if (c6Var != null) {
                f11 = 255.0f;
                c6Var.m(v0Var.q0, v0Var.p0 + AndroidUtilities.dp(f10), v0Var.getMeasuredWidth(), v0Var.r0);
            } else {
                f11 = 255.0f;
                org.telegram.ui.ActionBar.g6.q(v0Var.q0, v0Var.p0 + AndroidUtilities.dp(f10), v0Var.getMeasuredWidth(), v0Var.r0);
            }
            MessageObject messageObject2 = v0Var.D0;
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
            if (m10 != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(42.0f));
                int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.F;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    oi0 oi0Var = (oi0) arrayList.get(i12);
                    if (oi0Var.X >= oi0Var.e[c11]) {
                        arrayList.remove(i12);
                        i12--;
                    } else {
                        float f16 = dp / 2.0f;
                        oi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f16), (int) (rectF.centerY() - f16), (int) com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(15.0f), lerp, rectF.left, f16), (int) (rectF.centerY() + f16));
                        oi0Var.setAlpha((int) (this.y * f11));
                        oi0Var.draw(canvas);
                    }
                    i12++;
                }
                float centerX = rectF.centerX();
                float dp2 = rectF.top - AndroidUtilities.dp(36.0f);
                canvas.save();
                float e9 = this.s.e(this.r);
                if (this.r) {
                    f13 = AndroidUtilities.dp(60.0f);
                    f12 = 1.0f;
                } else {
                    f12 = 1.0f;
                    f13 = -AndroidUtilities.dp(30.0f);
                }
                canvas.translate(0.0f, (f12 - e9) * f13);
                float lerp2 = AndroidUtilities.lerp(this.r ? 1.8f : 1.3f, f12, e9);
                canvas.scale(lerp2, lerp2, centerX, dp2);
                org.telegram.ui.Components.i6 i6Var = this.v;
                i6Var.w = (int) (e9 * f11);
                i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), org.telegram.ui.ActionBar.g6.l1(e9, -1442840576));
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

    public ig.r0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) a0Var).J;
        }
        if (a0Var instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) a0Var).y0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ig.r0 reactionsLayoutInBubble;
        if (this.b == null || this.E || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        m5 m5Var = this.x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.w = true;
                ig.o0 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(m5Var);
                AndroidUtilities.runOnUIThread(m5Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ig.o0 m11 = reactionsLayoutInBubble.m("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (m11 != null) {
                m11.Y.c(false);
            }
            this.w = false;
            AndroidUtilities.cancelRunOnUIThread(m5Var);
        }
        return this.w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.s1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = a0Var;
        this.c = getMessageObject() == null ? 0 : getMessageObject().getId();
        org.telegram.ui.Cells.a0 a0Var3 = this.b;
        if (a0Var3 instanceof org.telegram.ui.Cells.s1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.s1) this.b).setInvalidateListener(new l5(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.v0) this.b).setInvalidateListener(new l5(this, 1));
        }
        invalidate();
    }
}
