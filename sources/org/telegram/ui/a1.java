package org.telegram.ui;

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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a1 extends FrameLayout implements org.telegram.ui.Cells.h9, org.telegram.ui.ActionBar.a6 {
    public AnimatorSet D;
    public final int E;
    public TL_iv.pageBlockChannel F;
    public int a;
    public final o50 b;
    public final e4 c;
    public final org.telegram.ui.Components.zp d;
    public final TextView e;
    public final ImageView f;
    public int h;
    public z2 n;
    public int r;
    public final int s;
    public final int w;
    public int x;
    public final Paint y;

    public a1(Context context, o50 o50Var, e4 e4Var, int i7) {
        super(context);
        this.s = org.telegram.messenger.g0.L(18.0f);
        this.w = org.telegram.messenger.g0.L(11.0f);
        this.b = o50Var;
        this.c = e4Var;
        setWillNotDraw(false);
        this.y = new Paint();
        this.E = i7;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.hd.M0(2131752397, null));
        textView.setGravity(19);
        addView(textView, c8.ha.e(-2, 39, 53));
        textView.setOnClickListener(new org.telegram.ui.ActionBar.l1(2, this, o50Var));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.e(39, 39, 53));
        org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(context, 0);
        this.d = zpVar;
        addView(zpVar, c8.ha.e(39, 39, 53));
    }

    public final void a(int i7, boolean z9) {
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i7;
        ImageView imageView = this.f;
        org.telegram.ui.Components.zp zpVar = this.d;
        TextView textView = this.e;
        if (!z9) {
            textView.setAlpha(i7 == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i7 == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i7 == 0 ? 1.0f : 0.1f);
            zpVar.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            zpVar.setScaleX(i7 == 1 ? 1.0f : 0.1f);
            zpVar.setScaleY(i7 == 1 ? 1.0f : 0.1f);
            imageView.setAlpha(i7 == 2 ? 1.0f : 0.0f);
            imageView.setScaleX(i7 == 2 ? 1.0f : 0.1f);
            imageView.setScaleY(i7 == 2 ? 1.0f : 0.1f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.D = animatorSet2;
        float[] fArr = {i7 == 0 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {i7 == 0 ? 1.0f : 0.1f};
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr2);
        float f10 = i7 == 0 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f10), ObjectAnimator.ofFloat(zpVar, (Property<org.telegram.ui.Components.zp, Float>) property, i7 == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(zpVar, (Property<org.telegram.ui.Components.zp, Float>) property2, i7 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(zpVar, (Property<org.telegram.ui.Components.zp, Float>) property3, i7 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i7 == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i7 == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i7 == 2 ? 1.0f : 0.1f));
        this.D.setDuration(150L);
        this.D.start();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.n;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.n;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.n;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.F == null) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(39.0f), this.y);
        z2 z2Var = this.n;
        if (z2Var == null || z2Var.d.getLineCount() <= 0) {
            return;
        }
        canvas.save();
        int i7 = this.w;
        int i10 = this.s;
        e4 e4Var = this.c;
        if (e4Var == null || !e4Var.G) {
            canvas.translate(i10, i7);
        } else {
            canvas.translate((getMeasuredWidth() - this.n.d.getLineWidth(0)) - i10, i7);
        }
        if (this.E == 0) {
            g4.t(this.b, canvas, this, 0);
        }
        this.n.d(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.n;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754904, g4.h(this.b, this.c, z2Var)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f.layout(((this.r / 2) + this.x) - org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(20.0f) + (this.r / 2) + this.x, org.telegram.messenger.g0.L(39.0f));
        this.d.layout(((this.r / 2) + this.x) - org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(20.0f) + (this.r / 2) + this.x, org.telegram.messenger.g0.L(39.0f));
        int i13 = this.x;
        TextView textView = this.e;
        textView.layout(i13, 0, textView.getMeasuredWidth() + i13, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        setMeasuredDimension(size, org.telegram.messenger.g0.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.F;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - org.telegram.messenger.g0.L(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.F;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.mu0.a;
            this.n = g4.n(this.b, this, str, null, L, this.w, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.c);
            int i11 = this.s;
            e4 e4Var = this.c;
            if (e4Var == null || !e4Var.G) {
                this.x = (getMeasuredWidth() - i11) - this.r;
            } else {
                this.x = i11;
            }
            z2 z2Var = this.n;
            if (z2Var != null) {
                z2Var.s = i11;
                z2Var.w = this.w;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return g4.j(this.b, this.c, motionEvent, this, this.n, this.s, this.w) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.F = pageblockchannel;
        int i7 = this.E;
        ImageView imageView = this.f;
        Paint paint = this.y;
        TextView textView = this.e;
        o50 o50Var = this.b;
        if (i7 == 0) {
            int i10 = org.telegram.ui.ActionBar.k6.M6;
            g4 g4Var = (g4) o50Var;
            g4Var.getClass();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int red = Color.red(x02);
            int green = Color.green(x02);
            int blue = Color.blue(x02);
            g4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            g4Var.getClass();
            this.a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(((g4) o50Var).X).M0(Long.valueOf(pageblockchannel.channel.id));
        if (M0 == null || M0.min) {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (!o50Var.r && org.telegram.messenger.t3.t0(chat)) {
                o50Var.r = true;
                int i11 = ((g4) o50Var).X;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new di.i8(o50Var, this.c, i11, this, 2));
            }
            a(1, false);
        } else {
            o50Var.n = M0;
            if (!M0.left || M0.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
        }
        requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.E != 0 || this.F == null || this.b == null || (textView = this.e) == null || (imageView = this.f) == null || (paint = this.y) == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.M6, false);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
            paint.setColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
            if (x03 != this.a) {
                this.a = x03;
                imageView.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
