package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.d61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class h7 extends View {
    public final /* synthetic */ int a = 1;
    public final Paint b;
    public final Object c;
    public final Object d;
    public final Object e;

    public h7(Activity activity, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity);
        this.c = new ne.b(this, bs.h, 380L);
        this.b = new Paint(1);
        this.d = d6Var;
        d61 d61Var = new d61(true);
        this.e = d61Var;
        d61Var.setCallback(this);
        d61Var.b(-1);
        d61Var.i = true;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                ((ImageReceiver) this.c).onAttachedToWindow();
                ((ImageReceiver) this.d).onAttachedToWindow();
                break;
            case 1:
                super.onAttachedToWindow();
                ((d61) this.e).d();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.c).onDetachedFromWindow();
                ((ImageReceiver) this.d).onDetachedFromWindow();
                break;
            case 1:
                super.onDetachedFromWindow();
                ((d61) this.e).e();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int width = (getWidth() / 2) - (AndroidUtilities.dp(156.0f) / 2);
                int height = (getHeight() / 2) - AndroidUtilities.dp(30.0f);
                ImageReceiver imageReceiver = (ImageReceiver) this.c;
                float f7 = height;
                imageReceiver.setImageCoords(width, f7, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver.draw(canvas);
                canvas.save();
                canvas.translate((getWidth() / 2.0f) - (AndroidUtilities.dp(6.166f) / 2.0f), getHeight() / 2.0f);
                canvas.drawPath((Path) this.e, this.b);
                canvas.restore();
                ImageReceiver imageReceiver2 = (ImageReceiver) this.d;
                imageReceiver2.setImageCoords(AndroidUtilities.dp(96.0f) + width, f7, AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
                imageReceiver2.draw(canvas);
                break;
            case 1:
                float width2 = getWidth() / 2.0f;
                float height2 = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Yd, (org.telegram.ui.ActionBar.d6) this.d);
                Paint paint = this.b;
                paint.setColor(w02);
                canvas.drawCircle(width2, height2, AndroidUtilities.dp(19.0f), paint);
                float f10 = ((ne.b) this.c).e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    zf.p.b(canvas, (d61) this.e, f11 * 1.35f);
                    invalidate();
                }
                if (f10 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f10;
                    float dp2 = AndroidUtilities.dp(2.666f) * f10;
                    canvas.drawRoundRect(width2 - dp, height2 - dp, width2 + dp, dp + height2, dp2, dp2, org.telegram.ui.ActionBar.h6.m0(-1));
                    break;
                }
                break;
            case 2:
                super.onDraw(canvas);
                RectF rectF = (RectF) this.e;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, this.b);
                rectF.inset(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, (Paint) this.d);
                rectF.inset(AndroidUtilities.dpf2(4.67f), AndroidUtilities.dpf2(9.066f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, (Paint) this.c);
                break;
            default:
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) this.e;
                n4Var.getClass();
                int themedColor = n4Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6);
                Paint paint2 = this.b;
                paint2.setColor(themedColor);
                n4Var.b0.getLocationInWindow((int[]) this.c);
                getLocationInWindow((int[]) this.d);
                for (View view : ((c91) n4Var.b0).getViewPages()) {
                    if (view != null && view.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view.getLeft() + (r6[0] - r7[0]), view.getTop() + (r6[1] - r7[1]));
                        canvas.concat(view.getMatrix());
                        canvas.drawRect(view.getPaddingLeft(), 0.0f, view.getWidth() - view.getPaddingRight(), AndroidUtilities.dp(100.0f) + view.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                zf.p.d((d61) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 1:
                return super.verifyDrawable(drawable) || (drawable == ((d61) this.e) && !((ne.b) this.c).f);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public h7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new RectF();
        paint2.setColor(-1);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, d6Var));
        paint3.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.wj, d6Var));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(org.telegram.ui.Wallet.n4 n4Var, Context context) {
        super(context);
        this.e = n4Var;
        this.b = new Paint(1);
        this.c = new int[2];
        this.d = new int[2];
    }

    public h7(Context context, TLObject tLObject, TLObject tLObject2) {
        super(context);
        Path path = new Path();
        this.e = path;
        Paint paint = new Paint(1);
        this.b = paint;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(tLObject);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver.setForUserOrChat(tLObject, h9Var);
        org.telegram.ui.Components.h9 h9Var2 = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var2.p(tLObject2);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.d = imageReceiver2;
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(30.0f));
        imageReceiver2.setForUserOrChat(tLObject2, h9Var2);
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E6, false));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        path.rewind();
        path.moveTo(0.0f, -AndroidUtilities.dp(8.0f));
        path.lineTo(AndroidUtilities.dp(6.166f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dp(8.0f));
    }
}
