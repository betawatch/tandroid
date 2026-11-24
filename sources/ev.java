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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ev extends FrameLayout implements fkb, vlb {
    public AnimatorSet E;
    public final boolean F;
    public TL_iv.pageBlockChannel G;
    public int a;
    public final ui5 b;
    public final ey c;
    public final mx2 d;
    public final TextView e;
    public final ImageView f;
    public byte h;
    public bx n;
    public int r;
    public final int s;
    public final int w;
    public int x;
    public final Paint y;

    /* JADX WARN: Multi-variable type inference failed */
    public ev(Context context, ui5 ui5Var, ey eyVar, int i) {
        super(context);
        this.s = gm.L(18.0f);
        this.w = gm.L(11.0f);
        this.b = ui5Var;
        this.c = eyVar;
        setWillNotDraw(false);
        this.y = new Paint();
        this.F = i;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131752341, null));
        textView.setGravity(19);
        addView(textView, qoe.e(-2, 39, 53));
        textView.setOnClickListener(new t(this, ui5Var, (byte) 18));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.e(39, 39, 53));
        mx2 mx2Var = new mx2(context, 0);
        this.d = mx2Var;
        addView(mx2Var, qoe.e(39, 39, 53));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, boolean z) {
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i;
        ImageView imageView = this.f;
        mx2 mx2Var = this.d;
        TextView textView = this.e;
        if (!z) {
            textView.setAlpha(i == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i == 0 ? 1.0f : 0.1f);
            mx2Var.setAlpha(i == 1 ? 1.0f : 0.0f);
            mx2Var.setScaleX(i == 1 ? 1.0f : 0.1f);
            mx2Var.setScaleY(i == 1 ? 1.0f : 0.1f);
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
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f), ObjectAnimator.ofFloat(mx2Var, (Property<mx2, Float>) property, i == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(mx2Var, (Property<mx2, Float>) property2, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(mx2Var, (Property<mx2, Float>) property3, i == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i == 2 ? 1.0f : 0.1f));
        this.E.setDuration(150L);
        this.E.start();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.L6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.x6));
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.n;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.n;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.n;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.G != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), gm.L(39.0f), this.y);
            bx bxVar = this.n;
            if (bxVar == null || bxVar.d.getLineCount() <= 0) {
                return;
            }
            canvas.save();
            int i = this.w;
            int i2 = this.s;
            ey eyVar = this.c;
            if (eyVar == null || !eyVar.H) {
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
        bx bxVar = this.n;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754904, o.g(this.b, this.c, bxVar)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f.layout(((this.r / 2) + this.x) - gm.L(19.0f), 0, gm.L(20.0f) + (this.r / 2) + this.x, gm.L(39.0f));
        this.d.layout(((this.r / 2) + this.x) - gm.L(19.0f), 0, gm.L(20.0f) + (this.r / 2) + this.x, gm.L(39.0f));
        int i5 = this.x;
        TextView textView = this.e;
        textView.layout(i5, 0, textView.getMeasuredWidth() + i5, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, gm.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm.L(39.0f), TLObject.FLAG_30);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(gm.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(39.0f), TLObject.FLAG_30));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(gm.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.G;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - gm.L(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.G;
            Layout.Alignment[] alignmentArr = oya.a;
            this.n = o.n(this.b, this, str, null, L, this.w, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.c);
            int i3 = this.s;
            ey eyVar = this.c;
            if (eyVar == null || !eyVar.H) {
                this.x = (getMeasuredWidth() - i3) - this.r;
            } else {
                this.x = i3;
            }
            bx bxVar = this.n;
            if (bxVar != null) {
                bxVar.s = i3;
                bxVar.w = this.w;
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
        ev evVar;
        this.G = pageblockchannel;
        boolean z = this.F;
        ImageView imageView = this.f;
        Paint paint = this.y;
        TextView textView = this.e;
        ui5 ui5Var = this.b;
        if (z) {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        } else {
            int i = cmb.L6;
            o oVar = (o) ui5Var;
            oVar.getClass();
            int w0 = cmb.w0(null, i, false);
            int red = Color.red(w0);
            int green = Color.green(w0);
            int blue = Color.blue(w0);
            oVar.getClass();
            textView.setTextColor(cmb.w0(null, cmb.I6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            oVar.getClass();
            this.a = cmb.w0(null, cmb.x6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat L0 = oc7.r1(((o) ui5Var).Y).L0(Long.valueOf(pageblockchannel.channel.id));
        if (L0 == null || L0.min) {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (ui5Var.r || !sd2.t0(chat)) {
                evVar = this;
            } else {
                ui5Var.r = true;
                int i2 = ((o) ui5Var).Y;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                evVar = this;
                ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new af((Object) ui5Var, (Object) this.c, i2, (Object) evVar, (byte) 1));
            }
            evVar.a(1, false);
        } else {
            ui5Var.n = L0;
            if (!L0.left || L0.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
            evVar = this;
        }
        evVar.requestLayout();
    }

    @Override // vlb
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.F || this.G == null || this.b == null || (textView = this.e) == null || (imageView = this.f) == null || (paint = this.y) == null) {
                return;
            }
            int w0 = cmb.w0(null, cmb.L6, false);
            textView.setTextColor(cmb.w0(null, cmb.I6, false));
            paint.setColor(Color.argb(34, Color.red(w0), Color.green(w0), Color.blue(w0)));
            int w02 = cmb.w0(null, cmb.x6, false);
            if (w02 != this.a) {
                this.a = w02;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
