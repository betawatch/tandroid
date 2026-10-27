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
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m7 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final k7 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final wn a;
    public org.telegram.ui.Cells.z b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.h6 s;
    public final org.telegram.ui.Components.r6 v;
    public boolean w;
    public final f2 x;
    public float y;

    public m7(wn wnVar) {
        super(wnVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.h6(this, 0L, 420L, ds.h);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, false, false);
        this.v = r6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = wnVar;
        r6Var.setCallback(this);
        r6Var.r(false, true);
        r6Var.w(AndroidUtilities.dp(40.0f));
        r6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        r6Var.s(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        r6Var.M = AndroidUtilities.displaySize.x;
        r6Var.u(-1);
        r6Var.b = 17;
        this.H = new k7(this, 0);
        this.x = new f2(9, this, wnVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) zVar).getPrimaryMessageObject();
        }
        if (zVar instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) zVar).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            wn wnVar = this.a;
            ca y3 = ca.y(wnVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (!y3.e || y3.q(false, false, null).amount >= E) {
                return;
            }
            aa aaVar = ca.y(wnVar.getCurrentAccount(), false).B;
            if (aaVar != null) {
                aaVar.a();
            }
            long a2 = wnVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(wnVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = wnVar.getMessagesController().getChat(Long.valueOf(-a2));
                str = chat == null ? "" : chat.title;
            }
            new tc(wnVar.getParentActivity(), wnVar.getResourceProvider(), E, 5, str, new y2(this, y3, messageObject, E, 3), 0L).show();
        }
    }

    public final void b(float f7, k7 k7Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ai.g0(this, 7));
        this.E.addListener(new l7(this, f7, k7Var, 0));
        this.E.setInterpolator(ds.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new k7(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.b == null || this.I) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        bh.y0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        wn wnVar = this.a;
        ca y3 = ca.y(wnVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.J;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((yj0) arrayList.remove(0)).C(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = this.K;
        yj0 yj0Var = new yj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        yj0Var.R(this);
        yj0Var.J(true);
        yj0Var.K(0);
        yj0Var.start();
        arrayList.add(yj0Var);
        invalidate();
        bh.v0 m10 = reactionsLayoutInBubble.m("stars");
        if (m10 != null) {
            m10.q();
        }
        if (z10) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            ca.y(wnVar.getCurrentAccount(), false).d0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.r6 r6Var = this.v;
        r6Var.a();
        r6Var.t("+" + y3.E(messageObject), true, true);
        this.r = true;
        k7 k7Var = this.H;
        AndroidUtilities.cancelRunOnUIThread(k7Var);
        AndroidUtilities.runOnUIThread(k7Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.F < 100) {
            this.G += 0.5f;
            return;
        }
        this.G = Utilities.clamp(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.G;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || wnVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            wnVar.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.c0(iArr2[0] + f7, iArr2[1] + f10, Utilities.clamp(this.G, 0.9f, 0.3f));
        this.G = 0.0f;
        this.F = currentTimeMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033b  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        boolean z10;
        Integer num;
        float f10;
        RectF rectF;
        float f11;
        float f12;
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.s1) {
            if (!((org.telegram.ui.Cells.s1) zVar).M0) {
                return;
            }
        } else if ((zVar instanceof org.telegram.ui.Cells.v0) && !((org.telegram.ui.Cells.v0) zVar).d2) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.getId() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        bh.y0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, this.y);
        wn wnVar = this.a;
        float y3 = wnVar.x0.getY() + (((wnVar.la == null || (wnVar.ha && !wnVar.ia)) && !wnVar.fb) ? (wnVar.I9 - wnVar.K9) - AndroidUtilities.dp(4.0f) : 0.0f);
        float bottom = (wnVar.fragmentView.getBottom() - wnVar.x0.getBottom()) + (((wnVar.la == null || (wnVar.ha && !wnVar.ia)) && !wnVar.fb) ? wnVar.Ra : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.y) * y3, getWidth(), ic.a.d(1.0f, this.y, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.z zVar2 = this.b;
        int[] iArr2 = this.d;
        zVar2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) wnVar.Pa);
        canvas.save();
        bh.v0 m10 = reactionsLayoutInBubble.m("stars");
        RectF rectF2 = this.f;
        if (m10 != null) {
            f7 = 4.0f;
            int i11 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.c + m10.x;
            int i12 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.d + m10.y;
            float f13 = i11;
            float f14 = i12;
            z10 = 1;
            rectF2.set(f13, f14, i11 + m10.A, i12 + m10.B);
            AndroidUtilities.scaleRect(rectF2, lerp, (m10.A * 0.1f) + f13, (m10.B / 2.0f) + f14);
            Paint paint = this.n;
            paint.setColor(0);
            i10 = 0;
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.y6.o1(this.y, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(lerp, lerp, (m10.A * 0.1f) + f13, (m10.B / 2.0f) + f14);
            num = Integer.valueOf(m10.r.hashCode());
        } else {
            f7 = 4.0f;
            i10 = 0;
            z10 = 1;
            num = null;
        }
        canvas.translate(iArr2[i10] - iArr[i10], this.b.getPaddingTop() + (iArr2[z10] - iArr[z10]));
        org.telegram.ui.Cells.z zVar3 = this.b;
        if (zVar3 instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) zVar3;
            s1Var.setScrimReaction(null);
            s1Var.d2(canvas, 1.0f, num);
            s1Var.e2(canvas);
            s1Var.setScrimReaction(num);
        } else if (zVar3 instanceof org.telegram.ui.Cells.v0) {
            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) zVar3;
            v0Var.setScrimReaction(null);
            v0Var.C(canvas, z10, num);
            org.telegram.ui.Cells.u0 u0Var = v0Var.r2;
            bh.y0 y0Var = v0Var.E0;
            float alpha = v0Var.getAlpha();
            org.telegram.ui.ActionBar.u6 u6Var = v0Var.g1;
            if (u6Var != null) {
                f10 = 255.0f;
                u6Var.b(v0Var.u0, v0Var.t0 + AndroidUtilities.dp(f7), v0Var.getMeasuredWidth(), v0Var.v0);
            } else {
                f10 = 255.0f;
                org.telegram.ui.ActionBar.y6.q(v0Var.u0, v0Var.t0 + AndroidUtilities.dp(f7), v0Var.getMeasuredWidth(), v0Var.v0);
            }
            MessageObject messageObject2 = v0Var.P0;
            if (messageObject2 == null || !messageObject2.shouldDrawReactions() || (y0Var.b && !(u0Var.b && y0Var.l))) {
                rectF = rectF2;
            } else {
                y0Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, v0Var.getWidth(), v0Var.getHeight(), (int) (alpha * f10), 31);
                } else {
                    rectF = rectF2;
                }
                y0Var.e(canvas, u0Var.b ? u0Var.c : 1.0f);
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
                int i13 = i10;
                while (true) {
                    ArrayList arrayList = this.J;
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    yj0 yj0Var = (yj0) arrayList.get(i13);
                    if (yj0Var.a0 >= yj0Var.e[i10]) {
                        arrayList.remove(i13);
                        i13--;
                    } else {
                        float f15 = dp / 2.0f;
                        yj0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f15), (int) (rectF.centerY() - f15), (int) b10.e(AndroidUtilities.dp(15.0f), lerp, rectF.left, f15), (int) (rectF.centerY() + f15));
                        yj0Var.setAlpha((int) (this.y * f10));
                        yj0Var.draw(canvas);
                    }
                    i13++;
                }
                float centerX = rectF.centerX();
                float dp2 = rectF.top - AndroidUtilities.dp(36.0f);
                canvas.save();
                float e = this.s.e(this.r);
                if (this.r) {
                    f12 = AndroidUtilities.dp(60.0f);
                    f11 = 1.0f;
                } else {
                    f11 = 1.0f;
                    f12 = -AndroidUtilities.dp(30.0f);
                }
                canvas.translate(0.0f, (f11 - e) * f12);
                float lerp2 = AndroidUtilities.lerp(this.r ? 1.8f : 1.3f, f11, e);
                canvas.scale(lerp2, lerp2, centerX, dp2);
                org.telegram.ui.Components.r6 r6Var = this.v;
                r6Var.B = (int) (e * f10);
                r6Var.s(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), org.telegram.ui.ActionBar.y6.o1(e, -1442840576));
                r6Var.o(centerX - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), centerX + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
                r6Var.draw(canvas);
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
        if (m10 != null) {
        }
        if (!this.r) {
        }
        invalidate();
    }

    public bh.y0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) zVar).N;
        }
        if (zVar instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) zVar).E0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bh.y0 reactionsLayoutInBubble;
        if (this.b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        f2 f2Var = this.x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.w = true;
                bh.v0 m10 = reactionsLayoutInBubble.m("stars");
                if (m10 != null) {
                    m10.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(f2Var);
                AndroidUtilities.runOnUIThread(f2Var, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            bh.v0 m11 = reactionsLayoutInBubble.m("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (m11 != null) {
                m11.Y.c(false);
            }
            this.w = false;
            AndroidUtilities.cancelRunOnUIThread(f2Var);
        }
        return this.w;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        org.telegram.ui.Cells.z zVar2 = this.b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.s1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.v0) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = zVar;
        this.c = getMessageObject() == null ? 0 : getMessageObject().getId();
        org.telegram.ui.Cells.z zVar3 = this.b;
        if (zVar3 instanceof org.telegram.ui.Cells.s1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.s1) this.b).setInvalidateListener(new k7(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.v0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.v0) this.b).setInvalidateListener(new k7(this, 1));
        }
        invalidate();
    }
}
