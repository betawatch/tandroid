package jh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class m5 extends View {
    public ValueAnimator A;
    public long B;
    public float C;
    public final k5 D;
    public boolean E;
    public final ArrayList F;
    public final int[] G;
    public final tn a;
    public org.telegram.ui.Cells.a0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.d6 s;
    public final org.telegram.ui.Components.n6 v;
    public boolean w;
    public final w2 x;
    public float y;

    public m5(tn tnVar) {
        super(tnVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.d6(this, 0L, 420L, jr.h);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.v = n6Var;
        new Matrix();
        this.F = new ArrayList();
        this.G = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = tnVar;
        n6Var.setCallback(this);
        n6Var.o(false, true, false);
        n6Var.t(AndroidUtilities.dp(40.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        n6Var.b = 17;
        this.D = new k5(this, 0);
        this.x = new w2(7, this, tnVar);
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
            tn tnVar = this.a;
            s7 y8 = s7.y(tnVar.getCurrentAccount(), false);
            long E = y8.E(messageObject);
            if (!y8.e || y8.q(false, false, null).amount >= E) {
                return;
            }
            r7 r7Var = s7.y(tnVar.getCurrentAccount(), false).B;
            if (r7Var != null) {
                r7Var.a();
            }
            long a2 = tnVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(tnVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = tnVar.getMessagesController().getChat(Long.valueOf(-a2));
                str = chat == null ? "" : chat.title;
            }
            new y9(tnVar.getParentActivity(), tnVar.getResourceProvider(), E, 5, str, new c2(this, y8, messageObject, E, 3), 0L).show();
        }
    }

    public final void b(float f9, k5 k5Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            this.A = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f9);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new bg.q1(this, 15));
        this.A.addListener(new l5(this, f9, k5Var, 0));
        this.A.setInterpolator(jr.h);
        this.A.setDuration(320L);
        this.A.start();
    }

    public final void c() {
        this.E = true;
        AndroidUtilities.cancelRunOnUIThread(this.D);
        this.v.q("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new k5(this, 2));
    }

    public final void d(float f9, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.b == null || this.E) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        kg.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        tn tnVar = this.a;
        s7 y8 = s7.y(tnVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.F;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((xi0) arrayList.remove(0)).A(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = this.G;
        int i10 = iArr[random.nextInt(iArr.length)];
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(70.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(70.0f));
        xi0Var.r0 = this;
        xi0Var.H(true);
        xi0Var.I(0);
        xi0Var.start();
        arrayList.add(xi0Var);
        invalidate();
        kg.o0 l10 = reactionsLayoutInBubble.l("stars");
        if (l10 != null) {
            l10.q();
        }
        if (z10) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            s7.y(tnVar.getCurrentAccount(), false).d0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.n6 n6Var = this.v;
        n6Var.b();
        n6Var.q("+" + y8.E(messageObject), true, true);
        this.r = true;
        k5 k5Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(k5Var);
        AndroidUtilities.runOnUIThread(k5Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.B < 100) {
            this.C += 0.5f;
            return;
        }
        this.C = Utilities.clamp(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.C;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || tnVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            tnVar.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.b0(iArr2[0] + f9, iArr2[1] + f10, Utilities.clamp(this.C, 0.9f, 0.3f));
        this.C = 0.0f;
        this.B = currentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        char c3;
        char c6;
        Integer num;
        float f10;
        RectF rectF;
        float f11;
        float f12;
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
        kg.r0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, this.y);
        tn tnVar = this.a;
        float y8 = tnVar.t0.getY() + (((tnVar.R9 == null || (tnVar.N9 && !tnVar.O9)) && !tnVar.Ka) ? (tnVar.o9 - tnVar.q9) - AndroidUtilities.dp(4.0f) : 0.0f);
        float bottom = (tnVar.fragmentView.getBottom() - tnVar.t0.getBottom()) + (((tnVar.R9 == null || (tnVar.N9 && !tnVar.O9)) && !tnVar.Ka) ? tnVar.wa : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.y) * y8, getWidth(), th.b(1.0f, this.y, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        int[] iArr2 = this.d;
        a0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) tnVar.ua);
        canvas.save();
        kg.o0 l10 = reactionsLayoutInBubble.l("stars");
        RectF rectF2 = this.f;
        if (l10 != null) {
            f9 = 4.0f;
            int i10 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.c + l10.x;
            int i11 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.d + l10.y;
            float f13 = i10;
            float f14 = i11;
            c3 = 1;
            rectF2.set(f13, f14, i10 + l10.A, i11 + l10.B);
            AndroidUtilities.scaleRect(rectF2, lerp, (l10.A * 0.1f) + f13, (l10.B / 2.0f) + f14);
            Paint paint = this.n;
            paint.setColor(0);
            c6 = 0;
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.l1(this.y, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(lerp, lerp, (l10.A * 0.1f) + f13, (l10.B / 2.0f) + f14);
            num = Integer.valueOf(l10.r.hashCode());
        } else {
            f9 = 4.0f;
            c3 = 1;
            c6 = 0;
            num = null;
        }
        canvas.translate(iArr2[c6] - iArr[c6], this.b.getPaddingTop() + (iArr2[c3] - iArr[c3]));
        org.telegram.ui.Cells.a0 a0Var3 = this.b;
        if (a0Var3 instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) a0Var3;
            s1Var.setScrimReaction(null);
            s1Var.d2(canvas, 1.0f, num);
            s1Var.e2(canvas);
            s1Var.setScrimReaction(num);
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) a0Var3;
            v0Var.setScrimReaction(null);
            v0Var.C(canvas, true, num);
            org.telegram.ui.Cells.u0 u0Var = v0Var.e2;
            kg.r0 r0Var = v0Var.y0;
            float alpha = v0Var.getAlpha();
            org.telegram.ui.ActionBar.c6 c6Var = v0Var.U0;
            if (c6Var != null) {
                f10 = 255.0f;
                c6Var.l(v0Var.q0, v0Var.p0 + AndroidUtilities.dp(f9), v0Var.getMeasuredWidth(), v0Var.r0);
            } else {
                f10 = 255.0f;
                org.telegram.ui.ActionBar.g6.q(v0Var.q0, v0Var.p0 + AndroidUtilities.dp(f9), v0Var.getMeasuredWidth(), v0Var.r0);
            }
            MessageObject messageObject2 = v0Var.D0;
            if (messageObject2 == null || !messageObject2.shouldDrawReactions() || (r0Var.b && !(u0Var.b && r0Var.l))) {
                rectF = rectF2;
            } else {
                r0Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, v0Var.getWidth(), v0Var.getHeight(), (int) (alpha * f10), 31);
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
                    ArrayList arrayList = this.F;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    xi0 xi0Var = (xi0) arrayList.get(i12);
                    if (xi0Var.X >= xi0Var.e[c6]) {
                        arrayList.remove(i12);
                        i12--;
                    } else {
                        float f15 = dp / 2.0f;
                        xi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f15), (int) (rectF.centerY() - f15), (int) com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(15.0f), lerp, rectF.left, f15), (int) (rectF.centerY() + f15));
                        xi0Var.setAlpha((int) (this.y * f10));
                        xi0Var.draw(canvas);
                    }
                    i12++;
                }
                float centerX = rectF.centerX();
                float dp2 = rectF.top - AndroidUtilities.dp(36.0f);
                canvas.save();
                float e10 = this.s.e(this.r);
                if (this.r) {
                    f12 = AndroidUtilities.dp(60.0f);
                    f11 = 1.0f;
                } else {
                    f11 = 1.0f;
                    f12 = -AndroidUtilities.dp(30.0f);
                }
                canvas.translate(0.0f, (f11 - e10) * f12);
                float lerp2 = AndroidUtilities.lerp(this.r ? 1.8f : 1.3f, f11, e10);
                canvas.scale(lerp2, lerp2, centerX, dp2);
                org.telegram.ui.Components.n6 n6Var = this.v;
                n6Var.w = (int) (e10 * f10);
                n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), org.telegram.ui.ActionBar.g6.l1(e10, -1442840576));
                n6Var.l(centerX - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), centerX + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
                n6Var.draw(canvas);
                canvas.restore();
            }
            if (!this.r) {
                a();
            }
            invalidate();
        }
        rectF = rectF2;
        f10 = 255.0f;
        canvas.restore();
        canvas.restore();
        if (l10 != null) {
        }
        if (!this.r) {
        }
        invalidate();
    }

    public kg.r0 getReactionsLayoutInBubble() {
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
        kg.r0 reactionsLayoutInBubble;
        if (this.b == null || this.E || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        w2 w2Var = this.x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.w = true;
                kg.o0 l10 = reactionsLayoutInBubble.l("stars");
                if (l10 != null) {
                    l10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(w2Var);
                AndroidUtilities.runOnUIThread(w2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            kg.o0 l11 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l11 != null) {
                l11.Y.c(false);
            }
            this.w = false;
            AndroidUtilities.cancelRunOnUIThread(w2Var);
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
            ((org.telegram.ui.Cells.s1) this.b).setInvalidateListener(new k5(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.v0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.v0) this.b).setInvalidateListener(new k5(this, 1));
        }
        invalidate();
    }
}
