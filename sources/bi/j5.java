package bi;

import android.content.Context;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.r70;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j5 extends View {
    public final TextPaint a;
    public final r70 b;
    public final Paint c;
    public final Paint d;
    public StaticLayout e;
    public boolean f;
    public int h;
    public int n;
    public BitmapShader r;
    public Matrix s;
    public Matrix w;
    public CharSequence x;

    public j5(Context context) {
        super(context);
        this.h = org.telegram.messenger.g0.L(6.0f);
        this.n = org.telegram.messenger.g0.L(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(org.telegram.messenger.g0.L(9.66f)));
        this.b = new r70(0);
    }

    public final void a(int i7, CharSequence charSequence) {
        if (i7 <= 0) {
            this.x = charSequence;
            return;
        }
        this.e = new StaticLayout(charSequence, this.a, i7 - org.telegram.messenger.g0.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        r70 r70Var = this.b;
        r70Var.rewind();
        int i10 = this.h;
        int i11 = this.n;
        r70Var.e = i10;
        r70Var.f = i11;
        if (this.f) {
            r70Var.e(null, 0, 0.0f, 0.0f);
            float f10 = Float.MAX_VALUE;
            float width = this.e.getWidth();
            float f11 = Float.MIN_VALUE;
            float f12 = 0.0f;
            for (int i12 = 0; i12 < this.e.getLineCount(); i12++) {
                width = Math.min(width, this.e.getLineLeft(i12));
                f11 = Math.min(f11, this.e.getLineTop(i12));
                f12 = Math.max(f12, this.e.getLineRight(i12));
                f10 = Math.max(f10, this.e.getLineBottom(i12));
            }
            this.b.addRect(width, f11, f12, this.e.getHeight(), Path.Direction.CW);
        } else {
            r70Var.e(this.e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), r70Var);
            r70Var.a();
        }
        invalidate();
    }

    public final void b(int i7, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null || savedStarGift.from_id == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        long e10 = p10.i(i7).e();
        long o4 = org.telegram.messenger.m5.o(savedStarGift.from_id);
        long o10 = org.telegram.messenger.m5.o(savedStarGift.gift.owner_id);
        if (e10 == o4) {
            set(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, savedStarGift.gift.crafted ? 2131749612 : 2131749613, org.telegram.messenger.id.r(savedStarGift.date, false))));
        } else if (e10 == o10) {
            set(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749594, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.id.r(savedStarGift.date, false))));
        } else {
            set(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749593, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.m5.s(i7, o10), org.telegram.messenger.id.r(savedStarGift.date, false))));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.e.getWidth()) / 2.0f, org.telegram.messenger.g0.L(16.0f));
            Matrix matrix = this.s;
            if (matrix != null) {
                matrix.reset();
                this.w.reset();
                View view = this;
                while (view != null) {
                    this.w.postConcat(view.getMatrix());
                    view = view.getParent() instanceof View ? (View) view.getParent() : null;
                }
                this.w.invert(this.s);
                this.s.preTranslate((-this.h) / 2, -org.telegram.messenger.g0.L(16.0f));
                this.s.preScale(12.0f, 12.0f);
                this.r.setLocalMatrix(this.s);
            }
            Paint paint = this.c;
            r70 r70Var = this.b;
            canvas.drawPath(r70Var, paint);
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(r12);
            canvas.drawPath(r70Var, paint2);
            this.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        CharSequence charSequence = this.x;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        StaticLayout staticLayout = this.e;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(staticLayout == null ? 0 : staticLayout.getHeight() + org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(ij ijVar) {
        TLRPC.Message message;
        if (ijVar == null || (message = ijVar.k) == null || message.action == null) {
            setVisibility(8);
            return;
        }
        int i7 = ijVar.I1;
        long e10 = p10.i(i7).e();
        TLRPC.MessageAction messageAction = ijVar.k.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            setVisibility(8);
            return;
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            setVisibility(8);
            return;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer == null) {
            setVisibility(8);
            return;
        }
        long o4 = org.telegram.messenger.m5.o(peer);
        long o10 = org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.peer);
        if (e10 == o4) {
            set(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, (tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? 2131749612 : 2131749613, org.telegram.messenger.id.r(ijVar.k.date, false))));
        } else if (e10 == o10) {
            set(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749594, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.id.r(ijVar.k.date, false))));
        } else {
            set(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131749593, org.telegram.messenger.m5.s(i7, o4), org.telegram.messenger.m5.s(i7, o10), org.telegram.messenger.id.r(ijVar.k.date, false))));
        }
        setVisibility(0);
    }

    public void setFullRect(boolean z9) {
        this.f = z9;
    }

    public void setRoundRadius(float f10) {
        this.c.setPathEffect(new CornerPathEffect(f10));
        this.d.setPathEffect(new CornerPathEffect(f10));
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}
