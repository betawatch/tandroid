// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class fu extends FrameLayout implements zlb, snb {
    public AnimatorSet E;
    public final boolean F;
    public TL_iv.pageBlockChannel G;
    public int a;
    public final xi5 b;
    public final ex c;
    public final ww2 d;
    public final TextView e;
    public final ImageView f;
    public byte h;
    public cw n;
    public int r;
    public final int s;
    public final int w;
    public int x;
    public final Paint y;

    /* JADX WARN: Multi-variable type inference failed */
    public fu(Context context, xi5 xi5Var, ex exVar, int i) {
        super(context);
        this.s = hl.L(18.0f);
        this.w = hl.L(11.0f);
        this.b = xi5Var;
        this.c = exVar;
        setWillNotDraw(false);
        this.y = new Paint();
        this.F = i;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131752369, null));
        textView.setGravity(19);
        addView(textView, tre.e(-2, 39, 53));
        textView.setOnClickListener(new t(this, xi5Var, (byte) 18));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.e(39, 39, 53));
        ww2 ww2Var = new ww2(context, 0);
        this.d = ww2Var;
        addView(ww2Var, tre.e(39, 39, 53));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, boolean z) {
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i;
        ImageView imageView = this.f;
        ww2 ww2Var = this.d;
        TextView textView = this.e;
        if (!z) {
            textView.setAlpha(i == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i == 0 ? 1.0f : 0.1f);
            ww2Var.setAlpha(i == 1 ? 1.0f : 0.0f);
            ww2Var.setScaleX(i == 1 ? 1.0f : 0.1f);
            ww2Var.setScaleY(i == 1 ? 1.0f : 0.1f);
            imageView.setAlpha(i == 2 ? 1.0f : 0.0f);
            imageView.setScaleX(i == 2 ? 1.0f : 0.1f);
            imageView.setScaleY(i == 2 ? 1.0f : 0.1f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.E = animatorSet2;
        float[] fArr = {i == 0 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {i == 0 ? 1.0f : 0.1f};
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr2);
        float f = i == 0 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f), ObjectAnimator.ofFloat(ww2Var, (Property<ww2, Float>) property, i == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(ww2Var, (Property<ww2, Float>) property2, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(ww2Var, (Property<ww2, Float>) property3, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i == 2 ? 1.0f : 0.1f));
        this.E.setDuration(150L);
        this.E.start();
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.M6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.y6));
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        cw cwVar = this.n;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.n;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.n;
        if (cwVar != null) {
            cwVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.G != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hl.L(39.0f), this.y);
            cw cwVar = this.n;
            if (cwVar == null || cwVar.d.getLineCount() <= 0) {
                return;
            }
            canvas.save();
            int i = this.w;
            int i2 = this.s;
            ex exVar = this.c;
            if (exVar == null || !exVar.H) {
                canvas.translate(i2, i);
            } else {
                canvas.translate((getMeasuredWidth() - this.n.d.getLineWidth(0)) - i2, i);
            }
            if (!this.F) {
                o.s(this.b, canvas, this, 0);
            }
            this.n.d(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        cw cwVar = this.n;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754900, o.g(this.b, this.c, cwVar)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.layout(((this.r / 2) + this.x) - hl.L(19.0f), 0, hl.L(20.0f) + (this.r / 2) + this.x, hl.L(39.0f));
        this.d.layout(((this.r / 2) + this.x) - hl.L(19.0f), 0, hl.L(20.0f) + (this.r / 2) + this.x, hl.L(39.0f));
        int i5 = this.x;
        TextView textView = this.e;
        textView.layout(i5, 0, textView.getMeasuredWidth() + i5, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, hl.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), TLObject.FLAG_30);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), TLObject.FLAG_30));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.G;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - hl.L(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.G;
            Layout.Alignment[] alignmentArr = o0b.a;
            this.n = o.n(this.b, this, str, null, L, this.w, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.c);
            int i3 = this.s;
            ex exVar = this.c;
            if (exVar == null || !exVar.H) {
                this.x = (getMeasuredWidth() - i3) - this.r;
            } else {
                this.x = i3;
            }
            cw cwVar = this.n;
            if (cwVar != null) {
                cwVar.s = i3;
                cwVar.w = this.w;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.F) {
            return super.onTouchEvent(motionEvent);
        }
        return o.i(this.b, this.c, motionEvent, this, this.n, this.s, this.w) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        fu fuVar;
        this.G = pageblockchannel;
        boolean z = this.F;
        ImageView imageView = this.f;
        Paint paint = this.y;
        TextView textView = this.e;
        xi5 xi5Var = this.b;
        if (z) {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        } else {
            int i = aob.M6;
            o oVar = (o) xi5Var;
            oVar.getClass();
            int w0 = aob.w0(null, i, false);
            int red = Color.red(w0);
            int green = Color.green(w0);
            int blue = Color.blue(w0);
            oVar.getClass();
            textView.setTextColor(aob.w0(null, aob.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            oVar.getClass();
            this.a = aob.w0(null, aob.y6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat M0 = uc7.s1(((o) xi5Var).Y).M0(Long.valueOf(pageblockchannel.channel.id));
        if (M0 == null || M0.min) {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (xi5Var.r || !xc2.t0(chat)) {
                fuVar = this;
            } else {
                xi5Var.r = true;
                int i2 = ((o) xi5Var).Y;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                fuVar = this;
                ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new lh((Object) xi5Var, (Object) this.c, i2, (Object) fuVar, (byte) 1));
            }
            fuVar.a(1, false);
        } else {
            xi5Var.n = M0;
            if (!M0.left || M0.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
            fuVar = this;
        }
        fuVar.requestLayout();
    }

    @Override // snb
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.F || this.G == null || this.b == null || (textView = this.e) == null || (imageView = this.f) == null || (paint = this.y) == null) {
                return;
            }
            int w0 = aob.w0(null, aob.M6, false);
            textView.setTextColor(aob.w0(null, aob.J6, false));
            paint.setColor(Color.argb(34, Color.red(w0), Color.green(w0), Color.blue(w0)));
            int w02 = aob.w0(null, aob.y6, false);
            if (w02 != this.a) {
                this.a = w02;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
