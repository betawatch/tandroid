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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class eu extends FrameLayout implements eib, tjb {
    public AnimatorSet E;
    public final boolean F;
    public TL_iv.pageBlockChannel G;
    public int a;
    public final vg5 b;
    public final dx c;
    public final cw2 d;
    public final TextView e;
    public final ImageView f;
    public byte h;
    public bw n;
    public int r;
    public final int s;
    public final int w;
    public int x;
    public final Paint y;

    /* JADX WARN: Multi-variable type inference failed */
    public eu(Context context, vg5 vg5Var, dx dxVar, int i) {
        super(context);
        this.s = gl.L(18.0f);
        this.w = gl.L(11.0f);
        this.b = vg5Var;
        this.c = dxVar;
        setWillNotDraw(false);
        this.y = new Paint();
        this.F = i;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131752385, null));
        textView.setGravity(19);
        addView(textView, nme.e(-2, 39, 53));
        textView.setOnClickListener(new t(this, vg5Var, (byte) 18));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.e(39, 39, 53));
        cw2 cw2Var = new cw2(context, 0);
        this.d = cw2Var;
        addView(cw2Var, nme.e(39, 39, 53));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, boolean z) {
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i;
        ImageView imageView = this.f;
        cw2 cw2Var = this.d;
        TextView textView = this.e;
        if (!z) {
            textView.setAlpha(i == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i == 0 ? 1.0f : 0.1f);
            cw2Var.setAlpha(i == 1 ? 1.0f : 0.0f);
            cw2Var.setScaleX(i == 1 ? 1.0f : 0.1f);
            cw2Var.setScaleY(i == 1 ? 1.0f : 0.1f);
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
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f), ObjectAnimator.ofFloat(cw2Var, (Property<cw2, Float>) property, i == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(cw2Var, (Property<cw2, Float>) property2, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(cw2Var, (Property<cw2, Float>) property3, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i == 2 ? 1.0f : 0.1f));
        this.E.setDuration(150L);
        this.E.start();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.L6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.x6));
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        bw bwVar = this.n;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.n;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.n;
        if (bwVar != null) {
            bwVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.G != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gl.L(39.0f), this.y);
            bw bwVar = this.n;
            if (bwVar == null || bwVar.d.getLineCount() <= 0) {
                return;
            }
            canvas.save();
            int i = this.w;
            int i2 = this.s;
            dx dxVar = this.c;
            if (dxVar == null || !dxVar.H) {
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
        bw bwVar = this.n;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754904, o.g(this.b, this.c, bwVar)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.layout(((this.r / 2) + this.x) - gl.L(19.0f), 0, gl.L(20.0f) + (this.r / 2) + this.x, gl.L(39.0f));
        this.d.layout(((this.r / 2) + this.x) - gl.L(19.0f), 0, gl.L(20.0f) + (this.r / 2) + this.x, gl.L(39.0f));
        int i5 = this.x;
        TextView textView = this.e;
        textView.layout(i5, 0, textView.getMeasuredWidth() + i5, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, gl.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), TLObject.FLAG_30);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), TLObject.FLAG_30));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.G;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - gl.L(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.G;
            Layout.Alignment[] alignmentArr = lwa.a;
            this.n = o.n(this.b, this, str, null, L, this.w, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.c);
            int i3 = this.s;
            dx dxVar = this.c;
            if (dxVar == null || !dxVar.H) {
                this.x = (getMeasuredWidth() - i3) - this.r;
            } else {
                this.x = i3;
            }
            bw bwVar = this.n;
            if (bwVar != null) {
                bwVar.s = i3;
                bwVar.w = this.w;
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
        eu euVar;
        this.G = pageblockchannel;
        boolean z = this.F;
        ImageView imageView = this.f;
        Paint paint = this.y;
        TextView textView = this.e;
        vg5 vg5Var = this.b;
        if (z) {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        } else {
            int i = bkb.L6;
            o oVar = (o) vg5Var;
            oVar.getClass();
            int w0 = bkb.w0(null, i, false);
            int red = Color.red(w0);
            int green = Color.green(w0);
            int blue = Color.blue(w0);
            oVar.getClass();
            textView.setTextColor(bkb.w0(null, bkb.I6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            oVar.getClass();
            this.a = bkb.w0(null, bkb.x6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat K0 = na7.q1(((o) vg5Var).Y).K0(Long.valueOf(pageblockchannel.channel.id));
        if (K0 == null || K0.min) {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (vg5Var.r || !hc2.t0(chat)) {
                euVar = this;
            } else {
                vg5Var.r = true;
                int i2 = ((o) vg5Var).Y;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                euVar = this;
                ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new ae((Object) vg5Var, (Object) this.c, i2, (Object) euVar, (byte) 1));
            }
            euVar.a(1, false);
        } else {
            vg5Var.n = K0;
            if (!K0.left || K0.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
            euVar = this;
        }
        euVar.requestLayout();
    }

    @Override // tjb
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.F || this.G == null || this.b == null || (textView = this.e) == null || (imageView = this.f) == null || (paint = this.y) == null) {
                return;
            }
            int w0 = bkb.w0(null, bkb.L6, false);
            textView.setTextColor(bkb.w0(null, bkb.I6, false));
            paint.setColor(Color.argb(34, Color.red(w0), Color.green(w0), Color.blue(w0)));
            int w02 = bkb.w0(null, bkb.x6, false);
            if (w02 != this.a) {
                this.a = w02;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
