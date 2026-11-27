// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hta extends View {
    public final TextPaint a;
    public final f66 b;
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

    public hta(Context context) {
        super(context);
        this.h = hl.L(6.0f);
        this.n = hl.L(2.0f);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(hl.L(13.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setPathEffect(new CornerPathEffect(hl.L(9.66f)));
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setPathEffect(new CornerPathEffect(hl.L(9.66f)));
        this.b = new f66(0);
    }

    public final void a(int i, CharSequence charSequence) {
        if (i <= 0) {
            this.x = charSequence;
            return;
        }
        this.e = new StaticLayout(charSequence, this.a, i - hl.L(18.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        f66 f66Var = this.b;
        f66Var.rewind();
        int i2 = this.h;
        int i3 = this.n;
        f66Var.e = i2;
        f66Var.f = i3;
        if (this.f) {
            f66Var.e(null, 0, 0.0f, 0.0f);
            float width = this.e.getWidth();
            float f = Float.MIN_VALUE;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < this.e.getLineCount(); i4++) {
                width = Math.min(width, this.e.getLineLeft(i4));
                f = Math.min(f, this.e.getLineTop(i4));
                f2 = Math.max(f2, this.e.getLineRight(i4));
                this.e.getLineBottom(i4);
            }
            this.b.addRect(width, f, f2, this.e.getHeight(), Path.Direction.CW);
        } else {
            f66Var.e(this.e, 0, 0.0f, 0.0f);
            StaticLayout staticLayout = this.e;
            staticLayout.getSelectionPath(0, staticLayout.getText().length(), f66Var);
            f66Var.a();
        }
        invalidate();
    }

    public final void b(int i, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null || savedStarGift.from_id == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        long e = yac.h(i).e();
        long n = wf3.n(savedStarGift.from_id);
        long n2 = wf3.n(savedStarGift.gift.owner_id);
        if (e == n) {
            set(hl.S2(ob6.a0(null, null, savedStarGift.gift.crafted ? 2131749397 : 2131749398, ob6.r(savedStarGift.date, false))));
        } else if (e == n2) {
            set(hl.S2(ob6.a0(null, null, 2131749364, wf3.r(i, n), ob6.r(savedStarGift.date, false))));
        } else {
            set(hl.S2(ob6.a0(null, null, 2131749363, wf3.r(i, n), wf3.r(i, n2), ob6.r(savedStarGift.date, false))));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Matrix matrix;
        super.onDraw(canvas);
        if (this.e != null) {
            canvas.save();
            canvas.translate((getWidth() - this.e.getWidth()) / 2.0f, hl.L(16.0f));
            Matrix matrix2 = this.s;
            if (matrix2 != null) {
                matrix2.reset();
                this.w.reset();
                View view = this;
                while (true) {
                    matrix = this.w;
                    if (view == null) {
                        break;
                    }
                    matrix.postConcat(view.getMatrix());
                    view = view.getParent() instanceof View ? (View) view.getParent() : null;
                }
                matrix.invert(this.s);
                this.s.preTranslate((-this.h) / 2, -hl.L(16.0f));
                this.s.preScale(12.0f, 12.0f);
                this.r.setLocalMatrix(this.s);
            }
            Paint paint = this.c;
            f66 f66Var = this.b;
            canvas.drawPath(f66Var, paint);
            int p1 = aob.p1(0.35f, -16777216);
            Paint paint2 = this.d;
            paint2.setColor(p1);
            canvas.drawPath(f66Var, paint2);
            this.e.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        CharSequence charSequence = this.x;
        if (charSequence != null) {
            a(size, charSequence);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        StaticLayout staticLayout = this.e;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(staticLayout == null ? 0 : staticLayout.getHeight() + hl.L(32.0f), TLObject.FLAG_30));
        setPivotX(getMeasuredWidth() / 2.0f);
        setPivotY(getMeasuredHeight());
    }

    public void set(r47 r47Var) {
        TLRPC.Message message;
        if (r47Var == null || (message = r47Var.k) == null || message.action == null) {
            setVisibility(8);
            return;
        }
        int i = r47Var.K1;
        long e = yac.h(i).e();
        TLRPC.MessageAction messageAction = r47Var.k.action;
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
        long n = wf3.n(peer);
        long n2 = wf3.n(tL_messageActionStarGiftUnique.peer);
        if (e == n) {
            set(hl.S2(ob6.a0(null, null, (tL_messageActionStarGiftUnique.craft || tL_messageActionStarGiftUnique.gift.crafted) ? 2131749397 : 2131749398, ob6.r(r47Var.k.date, false))));
        } else if (e == n2) {
            set(hl.S2(ob6.a0(null, null, 2131749364, wf3.r(i, n), ob6.r(r47Var.k.date, false))));
        } else {
            set(hl.S2(ob6.a0(null, null, 2131749363, wf3.r(i, n), wf3.r(i, n2), ob6.r(r47Var.k.date, false))));
        }
        setVisibility(0);
    }

    public void setFullRect(boolean z) {
        this.f = z;
    }

    public void setRoundRadius(float f) {
        this.c.setPathEffect(new CornerPathEffect(f));
        this.d.setPathEffect(new CornerPathEffect(f));
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        invalidate();
    }

    public void set(CharSequence charSequence) {
        a(getMeasuredWidth(), charSequence);
    }
}
