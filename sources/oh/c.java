package oh;

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
import d2.l0;
import dh.n0;
import gi.ka;
import lg.n;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.k5;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.b20;
import yh.l;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c extends ViewGroup implements re.a, cs, qe.b {
    public static final Rect M = new Rect();
    public final n E;
    public RenderNode F;
    public float G;
    public View H;
    public GroupCallMessage I;
    public a J;
    public final ka K;
    public final RectF L;
    public final qe.a a;
    public final qe.a b;
    public final k9 c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final org.telegram.ui.Components.voip.g h;
    public final ImageReceiver n;
    public g5 r;
    public n0 s;
    public final l w;
    public l0 x;
    public boolean y;

    public c(Context context) {
        super(context);
        xq xqVar = xq.h;
        this.a = new qe.a(0, this, xqVar, 320L, false);
        this.b = new qe.a(1, this, xqVar, 320L, false);
        this.c = new k9(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.h = gVar;
        this.E = new n(this, 17);
        this.K = new ka(this, 1);
        this.L = new RectF();
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
        gVar.c.setStrokeWidth(g0.L(1.0f));
        this.n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(CharSequence charSequence) {
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length) {
            int codePointAt = Character.codePointAt(charSequence, i3);
            i3 += Character.charCount(codePointAt);
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

    @Override // re.a
    public final void O(float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) != 1 || (aVar = this.J) == null || (groupCallMessage = this.I) == null) {
            return;
        }
        ((b20) aVar).a(groupCallMessage);
    }

    @Override // re.a
    public final boolean U0(float f10, float f11) {
        return a(f10, f11) == 1;
    }

    @Override // qe.b
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        org.telegram.ui.Components.voip.g gVar = this.h;
        gVar.a.setAlpha(round);
        gVar.c.setAlpha(round);
        invalidate();
    }

    @Override // re.a
    public final /* synthetic */ boolean Z0(View view, float f10, float f11) {
        return false;
    }

    public final int a(float f10, float f11) {
        l0 l0Var = this.x;
        if (l0Var == null) {
            return -1;
        }
        RectF rectF = (RectF) l0Var.e;
        RectF rectF2 = this.L;
        rectF2.set(rectF);
        rectF2.inset(-g0.L(5.0f), -g0.L(5.0f));
        if (rectF2.contains(f10, f11)) {
            return 1;
        }
        return ((RectF) this.x.c).contains(f10, f11) ? 0 : -1;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.i4) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l0 l0Var = this.x;
        if (l0Var == null) {
            return;
        }
        canvas.drawPath((Path) l0Var.d, this.e);
        if (Build.VERSION.SDK_INT >= 29 && this.F != null && canvas.isHardwareAccelerated()) {
            View view = this;
            float f10 = 0.0f;
            while (view != this.H) {
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
            float f11 = this.G;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(this.F);
            canvas.restore();
        }
        Paint paint = this.f;
        if (paint.getAlpha() > 0) {
            canvas.drawPath((Path) this.x.d, paint);
        }
        if (this.a.e > 0.0f) {
            RectF rectF = (RectF) this.x.c;
            RectF rectF2 = this.L;
            rectF2.set(rectF);
            rectF2.inset(g0.L(1.0f), g0.L(1.0f));
            this.h.a(g0.L(14.0f), canvas, rectF2, null);
            invalidate();
        }
        super.dispatchDraw(canvas);
        this.d.h(canvas, null);
        this.n.h(canvas, null);
        g5 g5Var = this.r;
        if (g5Var != null) {
            g5Var.draw(canvas);
        }
    }

    @Override // re.a
    public final /* synthetic */ boolean g0() {
        return true;
    }

    @Override // re.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.I;
    }

    public float getReactionCenterX() {
        l0 l0Var = this.x;
        if (l0Var != null) {
            return ((RectF) l0Var.f).centerX();
        }
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.n.P();
        g5 g5Var = this.r;
        if (g5Var != null) {
            g5Var.a(this);
        }
        hs.e().c(this, hs.i4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.E);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.n.R();
        g5 g5Var = this.r;
        if (g5Var != null) {
            g5Var.n(this);
        }
        hs.e().n(this, hs.i4);
        GroupCallMessage groupCallMessage = this.I;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.E);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        l0 l0Var = this.x;
        if (l0Var == null) {
            return;
        }
        int round = Math.round(((PointF) l0Var.g).x);
        int round2 = Math.round(((PointF) this.x.g).y);
        l lVar = this.w;
        lVar.layout(round, round2, lVar.getMeasuredWidth() + round, lVar.getMeasuredHeight() + round2);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int ceil;
        int L;
        float f10;
        int size = View.MeasureSpec.getSize(i3);
        l0 l0Var = this.x;
        if (l0Var == null || this.y || l0Var.a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            n0 n0Var = this.s;
            int c2 = q.c(44.0f, (size - paddingLeft) - paddingRight, TLObject.FLAG_31);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            l lVar = this.w;
            lVar.measure(c2, makeMeasureSpec);
            float measuredWidth = lVar.getMeasuredWidth();
            if (n0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                L = g0.L(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                L = g0.L(70.0f);
            }
            int i11 = L + ceil;
            int b10 = k5.b(8.0f, lVar.getMeasuredHeight(), g0.L(28.0f));
            l0 l0Var2 = new l0();
            l0Var2.c = new RectF();
            l0Var2.d = new Path();
            l0Var2.e = new RectF();
            l0Var2.f = new RectF();
            l0Var2.g = new PointF();
            RectF rectF = (RectF) l0Var2.e;
            PointF pointF = (PointF) l0Var2.g;
            RectF rectF2 = (RectF) l0Var2.f;
            RectF rectF3 = (RectF) l0Var2.c;
            l0Var2.a = size;
            l0Var2.b = b10;
            rectF3.set(0.0f, 0.0f, i11, b10);
            rectF3.offset((size - i11) / 2.0f, 0.0f);
            ((Path) l0Var2.d).addRoundRect(rectF3, g0.L(14.0f), g0.L(14.0f), Path.Direction.CW);
            boolean z10 = lVar.getLayout().getParagraphDirection(0) == -1;
            rectF.set(0.0f, 0.0f, g0.L(22.0f), g0.L(22.0f));
            if (z10) {
                f10 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-g0.L(4.0f)) - rectF.width(), g0.L(3.0f));
            } else {
                f10 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(g0.L(4.0f), g0.L(3.0f));
            }
            rectF2.set(0.0f, 0.0f, g0.L(f10), g0.L(f10));
            if (z10) {
                rectF2.offset(rectF3.left + g0.L(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - g0.L(33.0f), 0.0f);
            }
            rectF2.inset(g0.L(1.0f), g0.L(1.0f));
            pointF.set(0.0f, (rectF3.top + g0.L(19.0f)) - lVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - g0.L(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + g0.L(32.0f), 0.0f);
            }
            this.x = l0Var2;
            this.d.A0(rectF);
            this.n.A0((RectF) this.x.f);
            if (this.r != null) {
                RectF rectF4 = (RectF) this.x.f;
                Rect rect = M;
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

    @Override // re.a
    public final /* synthetic */ boolean s1() {
        return false;
    }

    public void set(GroupCallMessage groupCallMessage) {
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        n nVar = this.E;
        if (isAttachedToWindow && (groupCallMessage3 = this.I) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(nVar);
        }
        this.I = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.I) != null) {
            groupCallMessage2.subscribeToStateUpdates(nVar);
        }
        GroupCallMessage groupCallMessage4 = this.I;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.I.isSendError(), false);
        }
        TLObject e22 = hp.s1(h10.t0).e2(groupCallMessage.fromId);
        String m10 = m5.m(e22);
        u8 u8Var = new u8((e6) null);
        u8Var.p(e22);
        this.d.i0(e22, u8Var, null);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.q0(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.n(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m10);
        spannableStringBuilder.setSpan(new o31(g0.o()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.K, 0, spannableStringBuilder.length(), 33);
        n0 n0Var = groupCallMessage.visibleReaction;
        l lVar = this.w;
        if (n0Var == null) {
            CharSequence j02 = zi.j0(groupCallMessage.message, false, true, lVar.getPaint());
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
        } else if (n0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(groupCallMessage.currentAccount).r.get(groupCallMessage.visibleReaction.f);
            if (tL_availableReaction != null) {
                imageReceiver.q0(ac.b(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (n0Var.g != 0) {
            g5 g5Var = new g5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = g5Var;
            g5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
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
    public void setBackgroundColor(int i3) {
        this.e.setColor(i3);
    }

    public void setDelegate(a aVar) {
        this.J = aVar;
    }

    @Override // re.a
    public final /* synthetic */ void H0() {
    }

    @Override // re.a
    public final /* synthetic */ void u0() {
    }

    @Override // qe.b
    public final /* synthetic */ void F(float f10, int i3) {
    }

    @Override // re.a
    public final /* synthetic */ void t(float f10, float f11) {
    }

    @Override // re.a
    public final /* synthetic */ void o(View view, float f10, float f11) {
    }

    @Override // re.a
    public final /* synthetic */ void o1(View view, float f10, float f11) {
    }

    @Override // re.a
    public final /* synthetic */ void x(View view, float f10, float f11) {
    }
}
