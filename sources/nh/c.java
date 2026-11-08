package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import ch.o0;
import e2.j0;
import fi.ka;
import l2.w;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.voip.n;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.g20;
import xh.l;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class c extends ViewGroup implements ue.a, ls, te.b {
    public static final Rect L = new Rect();
    public final w D;
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public a I;
    public final ka J;
    public final RectF K;
    public final te.a a;
    public final te.a b;
    public final l9 c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final n h;
    public final ImageReceiver n;
    public i5 r;
    public o0 s;
    public final l w;
    public j0 x;
    public boolean y;

    public c(Context context) {
        super(context);
        xq xqVar = xq.h;
        this.a = new te.a(0, this, xqVar, 320L, false);
        this.b = new te.a(1, this, xqVar, 320L, false);
        this.c = new l9(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        n nVar = new n();
        this.h = nVar;
        this.D = new w(this, 14);
        this.J = new ka(this, 1);
        this.K = new RectF();
        l lVar = new l(context);
        this.w = lVar;
        lVar.setDisablePaddingsOffset(true);
        lVar.setTextSize(14.0f);
        lVar.setTextColor(-1);
        lVar.setLinkTextColor(-11683585);
        lVar.setHintTextColor(-1);
        addView(lVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.J0(g0.L(11.0f));
        nVar.c.setStrokeWidth(g0.L(1.0f));
        this.n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            int codePointAt = Character.codePointAt(charSequence, i7);
            i7 += Character.charCount(codePointAt);
            byte directionality = Character.getDirectionality(codePointAt);
            if (directionality == 0) {
                break;
            }
            if (directionality == 1 || directionality == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // ue.a
    public final void O(float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) != 1 || (aVar = this.I) == null || (groupCallMessage = this.H) == null) {
            return;
        }
        ((g20) aVar).a(groupCallMessage);
    }

    @Override // ue.a
    public final boolean U0(float f10, float f11) {
        return a(f10, f11) == 1;
    }

    @Override // te.b
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        n nVar = this.h;
        nVar.a.setAlpha(round);
        nVar.c.setAlpha(round);
        invalidate();
    }

    public final int a(float f10, float f11) {
        j0 j0Var = this.x;
        if (j0Var == null) {
            return -1;
        }
        RectF rectF = (RectF) j0Var.e;
        RectF rectF2 = this.K;
        rectF2.set(rectF);
        rectF2.inset(-g0.L(5.0f), -g0.L(5.0f));
        if (rectF2.contains(f10, f11)) {
            return 1;
        }
        return ((RectF) this.x.c).contains(f10, f11) ? 0 : -1;
    }

    @Override // ue.a
    public final /* synthetic */ boolean c1(View view, float f10, float f11) {
        return false;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.i4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j0 j0Var = this.x;
        if (j0Var == null) {
            return;
        }
        canvas.drawPath((Path) j0Var.d, this.e);
        if (Build.VERSION.SDK_INT >= 29 && this.E != null && canvas.isHardwareAccelerated()) {
            View view = this;
            float f10 = 0.0f;
            while (view != this.G) {
                f10 += view.getY();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                } else {
                    view = (View) parent;
                }
            }
            canvas.save();
            canvas.clipPath((Path) this.x.d);
            canvas.translate(0.0f, -f10);
            float f11 = this.F;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(this.E);
            canvas.restore();
        }
        Paint paint = this.f;
        if (paint.getAlpha() > 0) {
            canvas.drawPath((Path) this.x.d, paint);
        }
        if (this.a.e > 0.0f) {
            RectF rectF = (RectF) this.x.c;
            RectF rectF2 = this.K;
            rectF2.set(rectF);
            rectF2.inset(g0.L(1.0f), g0.L(1.0f));
            this.h.a(g0.L(14.0f), canvas, rectF2, null);
            invalidate();
        }
        super.dispatchDraw(canvas);
        this.d.h(canvas, null);
        this.n.h(canvas, null);
        i5 i5Var = this.r;
        if (i5Var != null) {
            i5Var.draw(canvas);
        }
    }

    @Override // ue.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.H;
    }

    public float getReactionCenterX() {
        j0 j0Var = this.x;
        if (j0Var != null) {
            return ((RectF) j0Var.f).centerX();
        }
        return 0.0f;
    }

    @Override // ue.a
    public final /* synthetic */ boolean j0() {
        return true;
    }

    @Override // ue.a
    public final /* synthetic */ boolean o1() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.n.P();
        i5 i5Var = this.r;
        if (i5Var != null) {
            i5Var.a(this);
        }
        qs.e().c(this, qs.i4);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.D);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.n.R();
        i5 i5Var = this.r;
        if (i5Var != null) {
            i5Var.n(this);
        }
        qs.e().n(this, qs.i4);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.D);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        j0 j0Var = this.x;
        if (j0Var == null) {
            return;
        }
        int round = Math.round(((PointF) j0Var.g).x);
        int round2 = Math.round(((PointF) this.x.g).y);
        l lVar = this.w;
        lVar.layout(round, round2, lVar.getMeasuredWidth() + round, lVar.getMeasuredHeight() + round2);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int ceil;
        int L2;
        float f10;
        int size = View.MeasureSpec.getSize(i7);
        j0 j0Var = this.x;
        if (j0Var == null || this.y || j0Var.a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            o0 o0Var = this.s;
            int c10 = q.c(44.0f, (size - paddingLeft) - paddingRight, TLObject.FLAG_31);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            l lVar = this.w;
            lVar.measure(c10, makeMeasureSpec);
            float measuredWidth = lVar.getMeasuredWidth();
            if (o0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                L2 = g0.L(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                L2 = g0.L(70.0f);
            }
            int i11 = L2 + ceil;
            int b10 = k5.b(8.0f, lVar.getMeasuredHeight(), g0.L(28.0f));
            j0 j0Var2 = new j0();
            j0Var2.c = new RectF();
            j0Var2.d = new Path();
            j0Var2.e = new RectF();
            j0Var2.f = new RectF();
            j0Var2.g = new PointF();
            RectF rectF = (RectF) j0Var2.e;
            PointF pointF = (PointF) j0Var2.g;
            RectF rectF2 = (RectF) j0Var2.f;
            RectF rectF3 = (RectF) j0Var2.c;
            j0Var2.a = size;
            j0Var2.b = b10;
            rectF3.set(0.0f, 0.0f, i11, b10);
            rectF3.offset((size - i11) / 2.0f, 0.0f);
            ((Path) j0Var2.d).addRoundRect(rectF3, g0.L(14.0f), g0.L(14.0f), Path.Direction.CW);
            boolean z9 = lVar.getLayout().getParagraphDirection(0) == -1;
            rectF.set(0.0f, 0.0f, g0.L(22.0f), g0.L(22.0f));
            if (z9) {
                f10 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-g0.L(4.0f)) - rectF.width(), g0.L(3.0f));
            } else {
                f10 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(g0.L(4.0f), g0.L(3.0f));
            }
            rectF2.set(0.0f, 0.0f, g0.L(f10), g0.L(f10));
            if (z9) {
                rectF2.offset(rectF3.left + g0.L(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - g0.L(33.0f), 0.0f);
            }
            rectF2.inset(g0.L(1.0f), g0.L(1.0f));
            pointF.set(0.0f, (rectF3.top + g0.L(19.0f)) - lVar.getLayout().getLineBaseline(0));
            if (z9) {
                pointF.offset((rectF3.right - g0.L(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + g0.L(32.0f), 0.0f);
            }
            this.x = j0Var2;
            this.d.A0(rectF);
            this.n.A0((RectF) this.x.f);
            if (this.r != null) {
                RectF rectF4 = (RectF) this.x.f;
                Rect rect = L;
                rectF4.round(rect);
                this.r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.x.b);
        this.h.f = Math.round(((RectF) this.x.c).width() + g0.L(48.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.a(this, motionEvent);
    }

    public void set(GroupCallMessage groupCallMessage) {
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        w wVar = this.D;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(wVar);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(wVar);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.H.isSendError(), false);
        }
        TLObject e22 = qp.s1(p10.s0).e2(groupCallMessage.fromId);
        String m10 = m5.m(e22);
        w8 w8Var = new w8((f6) null);
        w8Var.p(e22);
        this.d.i0(e22, w8Var, null);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.n(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new u31(g0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        o0 o0Var = groupCallMessage.visibleReaction;
        l lVar = this.w;
        if (o0Var == null) {
            CharSequence j02 = ij.j0(groupCallMessage.message, false, true, lVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b10 = b(spannableStringBuilder);
            boolean b11 = b(j02);
            if (b10 != b11) {
                spannableStringBuilder2.append(b11 ? (char) 8295 : (char) 8294);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(j02);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (o0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(groupCallMessage.currentAccount).r.get(groupCallMessage.visibleReaction.f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(hc.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (o0Var.g != 0) {
            i5 i5Var = new i5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = i5Var;
            i5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.r.a(this);
            }
        }
        this.s = groupCallMessage.visibleReaction;
        this.y = true;
        lVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.e.setColor(i7);
    }

    public void setDelegate(a aVar) {
        this.I = aVar;
    }

    @Override // ue.a
    public final /* synthetic */ void H0() {
    }

    @Override // ue.a
    public final /* synthetic */ void t0() {
    }

    @Override // te.b
    public final /* synthetic */ void F(float f10, int i7) {
    }

    @Override // ue.a
    public final /* synthetic */ void s(float f10, float f11) {
    }

    @Override // ue.a
    public final /* synthetic */ void l1(View view, float f10, float f11) {
    }

    @Override // ue.a
    public final /* synthetic */ void m(View view, float f10, float f11) {
    }

    @Override // ue.a
    public final /* synthetic */ void w(View view, float f10, float f11) {
    }
}
