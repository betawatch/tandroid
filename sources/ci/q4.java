package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q4 extends View {
    public final TextPaint a;
    public final n70 b;
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

    public q4(Context context) {
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
        this.b = new n70(0);
    }

    public final void a(int i3, CharSequence charSequence) {
        if (i3 <= 0) {
            this.x = charSequence;
            return;
        }
        this.e = new StaticLayout(charSequence, this.a, i3 - org.telegram.messenger.g0.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        n70 n70Var = this.b;
        n70Var.rewind();
        int i10 = this.h;
        int i11 = this.n;
        n70Var.e = i10;
        n70Var.f = i11;
        if (this.f) {
            n70Var.e(null, 0, 0.0f, 0.0f);
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
            n70Var.e(this.e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), n70Var);
            n70Var.a();
        }
        invalidate();
    }

    public final void b(int i3, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null || savedStarGift.from_id == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        long e10 = h10.i(i3).e();
        long o10 = org.telegram.messenger.m5.o(savedStarGift.from_id);
        long o11 = org.telegram.messenger.m5.o(savedStarGift.gift.owner_id);
        if (e10 == o10) {
            set(org.telegram.messenger.g0.X2(bd.a0(null, null, savedStarGift.gift.crafted ? 2131749619 : 2131749620, bd.r(savedStarGift.date, false))));
        } else if (e10 == o11) {
            set(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749601, org.telegram.messenger.m5.s(i3, o10), bd.r(savedStarGift.date, false))));
        } else {
            set(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749600, org.telegram.messenger.m5.s(i3, o10), org.telegram.messenger.m5.s(i3, o11), bd.r(savedStarGift.date, false))));
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
            n70 n70Var = this.b;
            canvas.drawPath(n70Var, paint);
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(r12);
            canvas.drawPath(n70Var, paint2);
            this.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
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

    public void set(zi ziVar) {
        TLRPC.Message message;
        if (ziVar == null || (message = ziVar.k) == null || message.action == null) {
            setVisibility(8);
            return;
        }
        int i3 = ziVar.I1;
        long e10 = h10.i(i3).e();
        TLRPC.MessageAction messageAction = ziVar.k.action;
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
        long o10 = org.telegram.messenger.m5.o(peer);
        long o11 = org.telegram.messenger.m5.o(tL_messageActionStarGiftUnique.peer);
        if (e10 == o10) {
            set(org.telegram.messenger.g0.X2(bd.a0(null, null, (tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? 2131749619 : 2131749620, bd.r(ziVar.k.date, false))));
        } else if (e10 == o11) {
            set(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749601, org.telegram.messenger.m5.s(i3, o10), bd.r(ziVar.k.date, false))));
        } else {
            set(org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749600, org.telegram.messenger.m5.s(i3, o10), org.telegram.messenger.m5.s(i3, o11), bd.r(ziVar.k.date, false))));
        }
        setVisibility(0);
    }

    public void setFullRect(boolean z10) {
        this.f = z10;
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
