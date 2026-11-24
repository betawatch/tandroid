// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k4a extends View implements tjb {
    public static final gia x;
    public ImageReceiver a;
    public pb0 b;
    public ff0 c;
    public Paint d;
    public Paint e;
    public yla f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public boolean s;
    public int w;

    static {
        gia giaVar = new gia(new ho9((byte) 7), new ho9((byte) 8));
        giaVar.c = 100.0f;
        x = giaVar;
    }

    public final void a(boolean z, boolean z2, float f) {
        if (!z) {
            this.n = f;
            invalidate();
            return;
        }
        yla ylaVar = this.f;
        if (ylaVar != null) {
            ylaVar.d();
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.s = false;
        this.r = false;
        float f2 = this.n;
        if (!z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(s33.f);
            this.h.addUpdateListener(new x89(this, (byte) 22));
            this.h.addListener(new ng9((Object) this, (byte) 11));
            this.h.start();
            return;
        }
        float f3 = f2 * 100.0f;
        yla ylaVar2 = new yla(this, x);
        ylaVar2.b = f3;
        ylaVar2.c = true;
        this.f = ylaVar2;
        boolean z3 = f < this.n;
        float f4 = f * 100.0f;
        this.s = z3;
        this.r = !z3;
        zla zlaVar = new zla(f4);
        zlaVar.i = f4;
        zlaVar.b(450.0f);
        zlaVar.a(1.0f);
        ylaVar2.m = zlaVar;
        this.f.b(new nz1(this, z3, f3, f4));
        this.f.a(new zv0(this, (byte) 8));
        this.f.h();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.n;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.c.jumpToCurrentState();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f = 1.0f;
        if (this.r) {
            f = 1.0f - this.n;
        } else if (this.s) {
            f = this.n;
        }
        canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.a.h(canvas, null);
        int i = (int) (this.n * 255.0f);
        paint.setAlpha(i);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i);
        float strokeWidth = paint2.getStrokeWidth() + gl.L(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.c.setBounds(0, 0, getWidth(), getHeight());
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, TLObject.FLAG_30));
        this.a.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        pb0 pb0Var = this.b;
        setContentDescription(k96.a0("AccDescrSendAsPeer", null, 2131754774, tLObject instanceof TLRPC.User ? l7c.k((TLRPC.User) tLObject, true) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : tLObject instanceof TLRPC.ChatInvite ? ((TLRPC.ChatInvite) tLObject).title : ""));
        pb0Var.k(tLObject);
        this.a.U(tLObject, pb0Var, null);
    }

    public void setProgress(float f) {
        a(true, f != 0.0f, f);
    }

    @Override // tjb
    public final void updateColors() {
        this.d.setColor(bkb.w0(null, bkb.Tf, false));
        this.e.setColor(bkb.w0(null, bkb.Sf, false));
        if (this.c != null) {
            int p1 = bkb.p1(0.2f, bkb.w0(null, bkb.c6, false));
            if (p1 != this.w) {
                this.w = p1;
                bkb.F1(this.c, p1, true);
            }
            invalidate();
            return;
        }
        this.w = bkb.p1(0.2f, bkb.w0(null, bkb.c6, false));
        int L = gl.L(18.0f);
        int i = this.w;
        ff0 i0 = bkb.i0(L, L, L, L, 0, i, i);
        this.c = i0;
        i0.setCallback(this);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.c == drawable;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
