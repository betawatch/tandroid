// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hx8 extends FrameLayout implements snb {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public wea d;
    public Drawable e;
    public final og2 f;
    public boolean h;
    public boolean n;
    public int r;
    public final /* synthetic */ ProxyListActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx8(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        this.s = proxyListActivity;
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.G6, null);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        byte b = 5;
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        boolean z = ob6.a0;
        addView(textView, tre.d(-2, -2.0f, (z ? 5 : 3) | 48, z ? 56 : 21, 10.0f, z ? 21 : 56, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(hl.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z2 = ob6.a0;
        addView(textView2, tre.d(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 56 : 21, 35.0f, z2 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        yob.s(imageView, aob.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(ob6.M0(2131751300, null));
        addView(imageView, tre.d(48, 48.0f, (ob6.a0 ? 3 : 5) | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new jn8(this, b));
        og2 og2Var = new og2(21, null, context);
        this.f = og2Var;
        og2Var.b(aob.i7, aob.g7, aob.k7);
        og2Var.setDrawBackgroundAsArc(14);
        og2Var.setVisibility(8);
        addView(og2Var, tre.d(24, 24.0f, (ob6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z, boolean z2) {
        if (this.n == z && z2) {
            return;
        }
        this.n = z;
        float L = ob6.a0 ? -hl.L(32.0f) : hl.L(32.0f);
        float f = 0.0f;
        float f2 = 1.0f;
        if (z2) {
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(200L);
            duration.setInterpolator(k43.f);
            duration.addUpdateListener(new qm1(this, L, (byte) 7));
            duration.addListener(new gf4((byte) 26, this, z));
            duration.start();
            return;
        }
        if (!z) {
            L = 0.0f;
        }
        this.a.setTranslationX(L);
        this.b.setTranslationX(L);
        ImageView imageView = this.c;
        imageView.setTranslationX(L);
        boolean z3 = ob6.a0;
        int L2 = hl.L(32.0f);
        if (!z3) {
            L2 = -L2;
        }
        og2 og2Var = this.f;
        og2Var.setTranslationX(L2 + L);
        imageView.setVisibility(z ? 8 : 0);
        imageView.setAlpha(1.0f);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        og2Var.setVisibility(z ? 0 : 8);
        og2Var.setAlpha(1.0f);
        og2Var.setScaleX(1.0f);
        og2Var.setScaleY(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i;
        Drawable drawable;
        wea weaVar = xea.x1;
        wea weaVar2 = this.d;
        TextView textView = this.b;
        if (weaVar == weaVar2) {
            ProxyListActivity proxyListActivity = this.s;
            if (proxyListActivity.d) {
                int i2 = proxyListActivity.c;
                if (i2 == 3 || i2 == 5) {
                    i = aob.s6;
                    if (weaVar2.b != 0) {
                        textView.setText(ob6.M0(2131751777, null) + ", " + ob6.a0("Ping", null, 2131746963, Long.valueOf(this.d.b)));
                    } else {
                        textView.setText(ob6.M0(2131751777, null));
                    }
                    wea weaVar3 = this.d;
                    if (!weaVar3.c && !weaVar3.d) {
                        weaVar3.e = 0L;
                    }
                } else {
                    i = aob.z6;
                    textView.setText(ob6.M0(2131751774, null));
                }
                this.r = aob.w0(null, i, false);
                textView.setTag(Integer.valueOf(i));
                textView.setTextColor(this.r);
                drawable = this.e;
                if (drawable == null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                    return;
                }
                return;
            }
        }
        if (weaVar2.c) {
            textView.setText(ob6.M0(2131752106, null));
            i = aob.z6;
        } else if (weaVar2.d) {
            if (weaVar2.b != 0) {
                textView.setText(ob6.M0(2131753754, null) + ", " + ob6.a0("Ping", null, 2131746963, Long.valueOf(this.d.b)));
            } else {
                textView.setText(ob6.M0(2131753754, null));
            }
            i = aob.w6;
        } else {
            textView.setText(ob6.M0(2131743568, null));
            i = aob.p7;
        }
        this.r = aob.w0(null, i, false);
        textView.setTag(Integer.valueOf(i));
        textView.setTextColor(this.r);
        drawable = this.e;
        if (drawable == null) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(ob6.a0 ? 0.0f : hl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(20.0f) : 0), getMeasuredHeight() - 1, aob.j0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), ik8.E(64.0f, 1, TLObject.FLAG_30));
    }

    public void setChecked(boolean z) {
        TextView textView = this.b;
        if (!z) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable drawable = this.e;
        if (drawable == null) {
            drawable = getResources().getDrawable(R.drawable.proxy_check).mutate();
            this.e = drawable;
        }
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
        }
        boolean z2 = ob6.a0;
        Drawable drawable2 = this.e;
        if (z2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable2, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setProxy(wea weaVar) {
        String str;
        jx8 jx8Var = weaVar.a;
        if (jx8Var.a == 3) {
            str = c00.k(new StringBuilder(), jx8Var.b, " (WEB)");
        } else {
            str = jx8Var.b + ":" + weaVar.a.c;
        }
        this.a.setText(str);
        this.d = weaVar;
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    @Override // snb
    public final void updateColors() {
        int w0;
        TextView textView = this.b;
        if (textView != null) {
            try {
                if (!(textView.getTag() instanceof Integer) || (w0 = aob.w0(null, ((Integer) textView.getTag()).intValue(), false)) == this.r) {
                    return;
                }
                this.r = w0;
                textView.setTextColor(w0);
                Drawable drawable = this.e;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.MULTIPLY));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
