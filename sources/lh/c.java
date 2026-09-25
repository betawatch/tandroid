package lh;

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
import b2.i0;
import ci.ac;
import i2.h0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.f0;
import org.telegram.messenger.ok;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s51;
import org.telegram.ui.c40;
import vh.n;
import zg.o0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class c extends ViewGroup implements me.a, NotificationCenter.NotificationCenterDelegate, le.e {
    public static final Rect L = new Rect();
    public RenderNode E;
    public float F;
    public View G;
    public GroupCallMessage H;
    public a I;
    public final ac J;
    public final RectF K;
    public final le.c a;
    public final le.c b;
    public final me.b c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver n;
    public q5 r;
    public o0 s;
    public final n v;
    public i0 w;
    public boolean x;
    public final h0 y;

    public c(Context context) {
        super(context);
        rr rrVar = rr.h;
        this.a = new le.c(0, this, rrVar, 320L, false);
        this.b = new le.c(1, this, rrVar, 320L, false);
        this.c = new me.b(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.y = new h0(this, 11);
        this.J = new ac(this, 1);
        this.K = new RectF();
        n nVar = new n(context);
        this.v = nVar;
        nVar.setDisablePaddingsOffset(true);
        nVar.setTextSize(14.0f);
        nVar.setTextColor(-1);
        nVar.setLinkTextColor(-11683585);
        nVar.setHintTextColor(-1);
        addView(nVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        hVar.c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = Character.codePointAt(charSequence, i10);
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

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.a.setAlpha(round);
        hVar.c.setAlpha(round);
        invalidate();
    }

    public final int a(float f7, float f10) {
        i0 i0Var = this.w;
        if (i0Var == null) {
            return -1;
        }
        RectF rectF = (RectF) i0Var.e;
        RectF rectF2 = this.K;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF2.contains(f7, f10)) {
            return 1;
        }
        return ((RectF) this.w.c).contains(f7, f10) ? 0 : -1;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i0 i0Var = this.w;
        if (i0Var == null) {
            return;
        }
        canvas.drawPath((Path) i0Var.d, this.e);
        if (Build.VERSION.SDK_INT >= 29 && this.E != null && canvas.isHardwareAccelerated()) {
            float f7 = 0.0f;
            View view = this;
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
            canvas.clipPath((Path) this.w.d);
            canvas.translate(0.0f, -f7);
            float f10 = this.F;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(this.E);
            canvas.restore();
        }
        Paint paint = this.f;
        if (paint.getAlpha() > 0) {
            canvas.drawPath((Path) this.w.d, paint);
        }
        if (this.a.e > 0.0f) {
            RectF rectF = (RectF) this.w.c;
            RectF rectF2 = this.K;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF2, null);
            invalidate();
        }
        super.dispatchDraw(canvas);
        this.d.draw(canvas);
        this.n.draw(canvas);
        q5 q5Var = this.r;
        if (q5Var != null) {
            q5Var.draw(canvas);
        }
    }

    @Override // me.a
    public final /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // me.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.H;
    }

    public float getReactionCenterX() {
        i0 i0Var = this.w;
        if (i0Var != null) {
            return ((RectF) i0Var.f).centerX();
        }
        return 0.0f;
    }

    @Override // me.a
    public final /* synthetic */ boolean ignoreHapticFeedbackSettings(float f7, float f10) {
        return false;
    }

    @Override // me.a
    public final /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // me.a
    public final boolean needClickAt(View view, float f7, float f10) {
        return a(f7, f10) == 1;
    }

    @Override // me.a
    public final /* synthetic */ boolean needLongPress(float f7, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.n.onAttachedToWindow();
        q5 q5Var = this.r;
        if (q5Var != null) {
            q5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.y);
        }
    }

    @Override // me.a
    public final void onClickAt(View view, float f7, float f10) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f7, f10) != 1 || (aVar = this.I) == null || (groupCallMessage = this.H) == null) {
            return;
        }
        ((c40) aVar).a(groupCallMessage);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.n.onDetachedFromWindow();
        q5 q5Var = this.r;
        if (q5Var != null) {
            q5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.H;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.y);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        i0 i0Var = this.w;
        if (i0Var == null) {
            return;
        }
        int round = Math.round(((PointF) i0Var.g).x);
        int round2 = Math.round(((PointF) this.w.g).y);
        n nVar = this.v;
        nVar.layout(round, round2, nVar.getMeasuredWidth() + round, nVar.getMeasuredHeight() + round2);
    }

    @Override // me.a
    public final /* synthetic */ boolean onLongPressRequestedAt(View view, float f7, float f10) {
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int ceil;
        int dp;
        float f7;
        int size = View.MeasureSpec.getSize(i10);
        i0 i0Var = this.w;
        if (i0Var == null || this.x || i0Var.a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            o0 o0Var = this.s;
            int c10 = ok.c(44.0f, (size - paddingLeft) - paddingRight, TLObject.FLAG_31);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            n nVar = this.v;
            nVar.measure(c10, makeMeasureSpec);
            float measuredWidth = nVar.getMeasuredWidth();
            if (o0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i12 = dp + ceil;
            int y3 = f0.y(8.0f, nVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            i0 i0Var2 = new i0();
            i0Var2.c = new RectF();
            i0Var2.d = new Path();
            i0Var2.e = new RectF();
            i0Var2.f = new RectF();
            i0Var2.g = new PointF();
            RectF rectF = (RectF) i0Var2.e;
            PointF pointF = (PointF) i0Var2.g;
            RectF rectF2 = (RectF) i0Var2.f;
            RectF rectF3 = (RectF) i0Var2.c;
            i0Var2.a = size;
            i0Var2.b = y3;
            rectF3.set(0.0f, 0.0f, i12, y3);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) i0Var2.d).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            boolean z10 = nVar.getLayout().getParagraphDirection(0) == -1;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z10) {
                f7 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-AndroidUtilities.dp(4.0f)) - rectF.width(), AndroidUtilities.dp(3.0f));
            } else {
                f7 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7));
            if (z10) {
                rectF2.offset(rectF3.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - nVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.w = i0Var2;
            this.d.setImageCoords(rectF);
            this.n.setImageCoords((RectF) this.w.f);
            if (this.r != null) {
                RectF rectF4 = (RectF) this.w.f;
                Rect rect = L;
                rectF4.round(rect);
                this.r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.w.b);
        this.h.f = Math.round(((RectF) this.w.c).width() + AndroidUtilities.dp(48.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        h0 h0Var = this.y;
        if (isAttachedToWindow && (groupCallMessage3 = this.H) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(h0Var);
        }
        this.H = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.H) != null) {
            groupCallMessage2.subscribeToStateUpdates(h0Var);
        }
        GroupCallMessage groupCallMessage4 = this.H;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.H.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        h9 h9Var = new h9((d6) null);
        h9Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, h9Var);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.o(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new s51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.J, 0, spannableStringBuilder.length(), 33);
        o0 o0Var = groupCallMessage.visibleReaction;
        n nVar = this.v;
        if (o0Var == null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, nVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b10 = b(spannableStringBuilder);
            boolean b11 = b(formatTextWithEntities);
            if (b10 != b11) {
                spannableStringBuilder2.append(b11 ? (char) 8295 : (char) 8294);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(formatTextWithEntities);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (o0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (o0Var.g != 0) {
            q5 q5Var = new q5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = q5Var;
            q5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.r.a(this);
            }
        }
        this.s = groupCallMessage.visibleReaction;
        this.x = true;
        nVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.e.setColor(i10);
    }

    public void setDelegate(a aVar) {
        this.I = aVar;
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }

    @Override // me.a
    public final /* synthetic */ void onClickTouchDown(View view, float f7, float f10) {
    }

    @Override // me.a
    public final /* synthetic */ void onClickTouchMove(View view, float f7, float f10) {
    }

    @Override // me.a
    public final /* synthetic */ void onClickTouchUp(View view, float f7, float f10) {
    }

    @Override // me.a
    public final /* synthetic */ void onLongPressCancelled(View view, float f7, float f10) {
    }

    @Override // me.a
    public final /* synthetic */ void onLongPressFinish(View view, float f7, float f10) {
    }

    @Override // me.a
    public final /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f7, float f10, float f11, float f12) {
    }
}
