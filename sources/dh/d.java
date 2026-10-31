package dh;

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
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import b2.n0;
import nh.p;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.x41;
import org.telegram.ui.f30;
import sg.o0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d extends ViewGroup implements ge.a, us, fe.e {
    public static final Rect L = new Rect();
    public final a3.d D;
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public b I;
    public final a J;
    public final RectF K;
    public final fe.b a;
    public final fe.b b;
    public final ge.b c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final org.telegram.ui.Components.voip.g h;
    public final ImageReceiver n;
    public f5 r;
    public o0 s;
    public final p w;
    public n0 x;
    public boolean y;

    public d(Context context) {
        super(context);
        gr grVar = gr.h;
        this.a = new fe.b(0, this, grVar, 320L, false);
        this.b = new fe.b(1, this, grVar, 320L, false);
        this.c = new ge.b(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.h = gVar;
        this.D = new a3.d(this, 28);
        this.J = new a(this, 0);
        this.K = new RectF();
        p pVar = new p(context);
        this.w = pVar;
        pVar.setDisablePaddingsOffset(true);
        pVar.setTextSize(14.0f);
        pVar.setTextColor(-1);
        pVar.setLinkTextColor(-11683585);
        pVar.setHintTextColor(-1);
        addView(pVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.J0(i0.L(11.0f));
        gVar.c.setStrokeWidth(i0.L(1.0f));
        this.n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(Spannable spannable) {
        int length = spannable.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = Character.codePointAt(spannable, i10);
            i10 += Character.charCount(codePointAt);
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

    @Override // ge.a
    public final /* synthetic */ boolean I1() {
        return false;
    }

    @Override // ge.a
    public final void N(float f7, float f10) {
        b bVar;
        GroupCallMessage groupCallMessage;
        if (a(f7, f10) != 1 || (bVar = this.I) == null || (groupCallMessage = this.H) == null) {
            return;
        }
        ((f30) bVar).a(groupCallMessage);
    }

    @Override // ge.a
    public final boolean V0(float f7, float f10) {
        return a(f7, f10) == 1;
    }

    public final int a(float f7, float f10) {
        n0 n0Var = this.x;
        if (n0Var == null) {
            return -1;
        }
        RectF rectF = (RectF) n0Var.e;
        RectF rectF2 = this.K;
        rectF2.set(rectF);
        rectF2.inset(-i0.L(5.0f), -i0.L(5.0f));
        if (rectF2.contains(f7, f10)) {
            return 1;
        }
        return ((RectF) this.x.c).contains(f7, f10) ? 0 : -1;
    }

    @Override // ge.a
    public final /* synthetic */ boolean d1(View view, float f7, float f10) {
        return false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.i4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n0 n0Var = this.x;
        if (n0Var == null) {
            return;
        }
        canvas.drawPath((Path) n0Var.d, this.e);
        if (Build.VERSION.SDK_INT >= 29 && this.E != null && canvas.isHardwareAccelerated()) {
            View view = this;
            float f7 = 0.0f;
            while (view != this.G) {
                f7 += view.getY();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                } else {
                    view = (View) parent;
                }
            }
            canvas.save();
            canvas.clipPath((Path) this.x.d);
            canvas.translate(0.0f, -f7);
            float f10 = this.F;
            canvas.scale(f10, f10);
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
            rectF2.inset(i0.L(1.0f), i0.L(1.0f));
            this.h.a(i0.L(14.0f), canvas, rectF2, null);
            invalidate();
        }
        super.dispatchDraw(canvas);
        this.d.h(canvas, null);
        this.n.h(canvas, null);
        f5 f5Var = this.r;
        if (f5Var != null) {
            f5Var.draw(canvas);
        }
    }

    @Override // ge.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.H;
    }

    public float getReactionCenterX() {
        n0 n0Var = this.x;
        if (n0Var != null) {
            return ((RectF) n0Var.f).centerX();
        }
        return 0.0f;
    }

    @Override // ge.a
    public final /* synthetic */ boolean j0() {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.n.P();
        f5 f5Var = this.r;
        if (f5Var != null) {
            f5Var.a(this);
        }
        zs.e().c(this, zs.i4);
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
        f5 f5Var = this.r;
        if (f5Var != null) {
            f5Var.n(this);
        }
        zs.e().n(this, zs.i4);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.D);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n0 n0Var = this.x;
        if (n0Var == null) {
            return;
        }
        int round = Math.round(((PointF) n0Var.g).x);
        int round2 = Math.round(((PointF) this.x.g).y);
        p pVar = this.w;
        pVar.layout(round, round2, pVar.getMeasuredWidth() + round, pVar.getMeasuredHeight() + round2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int ceil;
        int L2;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        n0 n0Var = this.x;
        if (n0Var == null || this.y || n0Var.a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            o0 o0Var = this.s;
            int c10 = z20.c(44.0f, (size - paddingLeft) - paddingRight, TLObject.FLAG_31);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            p pVar = this.w;
            pVar.measure(c10, makeMeasureSpec);
            float measuredWidth = pVar.getMeasuredWidth();
            if (o0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                L2 = i0.L(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                L2 = i0.L(70.0f);
            }
            int i12 = L2 + ceil;
            int b10 = m5.b(8.0f, pVar.getMeasuredHeight(), i0.L(28.0f));
            n0 n0Var2 = new n0();
            n0Var2.c = new RectF();
            n0Var2.d = new Path();
            n0Var2.e = new RectF();
            n0Var2.f = new RectF();
            n0Var2.g = new PointF();
            RectF rectF = (RectF) n0Var2.e;
            PointF pointF = (PointF) n0Var2.g;
            RectF rectF2 = (RectF) n0Var2.f;
            RectF rectF3 = (RectF) n0Var2.c;
            n0Var2.a = size;
            n0Var2.b = b10;
            rectF3.set(0.0f, 0.0f, i12, b10);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) n0Var2.d).addRoundRect(rectF3, i0.L(14.0f), i0.L(14.0f), Path.Direction.CW);
            boolean z10 = pVar.getLayout().getParagraphDirection(0) == -1;
            rectF.set(0.0f, 0.0f, i0.L(22.0f), i0.L(22.0f));
            if (z10) {
                f7 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-i0.L(4.0f)) - rectF.width(), i0.L(3.0f));
            } else {
                f7 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(i0.L(4.0f), i0.L(3.0f));
            }
            rectF2.set(0.0f, 0.0f, i0.L(f7), i0.L(f7));
            if (z10) {
                rectF2.offset(rectF3.left + i0.L(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - i0.L(33.0f), 0.0f);
            }
            rectF2.inset(i0.L(1.0f), i0.L(1.0f));
            pointF.set(0.0f, (rectF3.top + i0.L(19.0f)) - pVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - i0.L(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + i0.L(32.0f), 0.0f);
            }
            this.x = n0Var2;
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
        this.h.f = Math.round(((RectF) this.x.c).width() + i0.L(48.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.a(this, motionEvent);
    }

    public void set(GroupCallMessage groupCallMessage) {
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        a3.d dVar = this.D;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(dVar);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(dVar);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.H.isSendError(), false);
        }
        TLObject d22 = vp.r1(d20.s0).d2(groupCallMessage.fromId);
        String m10 = o5.m(d22);
        r8 r8Var = new r8((p6) null);
        r8Var.p(d22);
        this.d.i0(d22, r8Var, null);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.n(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new x41(i0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        o0 o0Var = groupCallMessage.visibleReaction;
        p pVar = this.w;
        if (o0Var == null) {
            Spannable j02 = jj.j0(groupCallMessage.message, false, true, pVar.getPaint());
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
            spannableStringBuilder2.append((CharSequence) j02);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (o0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(groupCallMessage.currentAccount).r.get(groupCallMessage.visibleReaction.f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(ic.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (o0Var.g != 0) {
            f5 f5Var = new f5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = f5Var;
            f5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.r.a(this);
            }
        }
        this.s = groupCallMessage.visibleReaction;
        this.y = true;
        pVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.e.setColor(i10);
    }

    public void setDelegate(b bVar) {
        this.I = bVar;
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        org.telegram.ui.Components.voip.g gVar = this.h;
        gVar.a.setAlpha(round);
        gVar.c.setAlpha(round);
        invalidate();
    }

    @Override // ge.a
    public final /* synthetic */ void G0() {
    }

    @Override // ge.a
    public final /* synthetic */ void t0() {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }

    @Override // ge.a
    public final /* synthetic */ void r(float f7, float f10) {
    }

    @Override // ge.a
    public final /* synthetic */ void m(View view, float f7, float f10) {
    }

    @Override // ge.a
    public final /* synthetic */ void o1(View view, float f7, float f10) {
    }

    @Override // ge.a
    public final /* synthetic */ void u(View view, float f7, float f10) {
    }
}
