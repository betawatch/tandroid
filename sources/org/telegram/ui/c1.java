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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c1 extends FrameLayout implements org.telegram.ui.Cells.j9, org.telegram.ui.ActionBar.k6 {
    public AnimatorSet D;
    public final int E;
    public TL_iv.pageBlockChannel F;
    public int a;
    public final m60 b;
    public final f4 c;
    public final org.telegram.ui.Components.iq d;
    public final TextView e;
    public final ImageView f;
    public int h;
    public z2 n;
    public int r;
    public final int s;
    public final int w;
    public int x;
    public final Paint y;

    public c1(Context context, m60 m60Var, f4 f4Var, int i10) {
        super(context);
        this.s = org.telegram.messenger.i0.L(18.0f);
        this.w = org.telegram.messenger.i0.L(11.0f);
        this.b = m60Var;
        this.c = f4Var;
        setWillNotDraw(false);
        this.y = new Paint();
        this.E = i10;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(org.telegram.messenger.cd.L0(2131752397, null));
        textView.setGravity(19);
        addView(textView, w7.b6.e(-2, 39, 53));
        textView.setOnClickListener(new ag.t0(24, this, m60Var));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.e(39, 39, 53));
        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(context, 0);
        this.d = iqVar;
        addView(iqVar, w7.b6.e(39, 39, 53));
    }

    public final void a(int i10, boolean z10) {
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i10;
        ImageView imageView = this.f;
        org.telegram.ui.Components.iq iqVar = this.d;
        TextView textView = this.e;
        if (!z10) {
            textView.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i10 == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i10 == 0 ? 1.0f : 0.1f);
            iqVar.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            iqVar.setScaleX(i10 == 1 ? 1.0f : 0.1f);
            iqVar.setScaleY(i10 == 1 ? 1.0f : 0.1f);
            imageView.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            imageView.setScaleX(i10 == 2 ? 1.0f : 0.1f);
            imageView.setScaleY(i10 == 2 ? 1.0f : 0.1f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.D = animatorSet2;
        float[] fArr = {i10 == 0 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {i10 == 0 ? 1.0f : 0.1f};
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr2);
        float f7 = i10 == 0 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f7), ObjectAnimator.ofFloat(iqVar, (Property<org.telegram.ui.Components.iq, Float>) property, i10 == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(iqVar, (Property<org.telegram.ui.Components.iq, Float>) property2, i10 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(iqVar, (Property<org.telegram.ui.Components.iq, Float>) property3, i10 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i10 == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i10 == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i10 == 2 ? 1.0f : 0.1f));
        this.D.setDuration(150L);
        this.D.start();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
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
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(39.0f), this.y);
        z2 z2Var = this.n;
        if (z2Var == null || z2Var.d.getLineCount() <= 0) {
            return;
        }
        canvas.save();
        int i10 = this.w;
        int i11 = this.s;
        f4 f4Var = this.c;
        if (f4Var == null || !f4Var.G) {
            canvas.translate(i11, i10);
        } else {
            canvas.translate((getMeasuredWidth() - this.n.d.getLineWidth(0)) - i11, i10);
        }
        if (this.E == 0) {
            h4.t(this.b, canvas, this, 0);
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
        accessibilityNodeInfo.setText(h4.g(2131754904, h4.h(this.b, this.c, z2Var)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f.layout(((this.r / 2) + this.x) - org.telegram.messenger.i0.L(19.0f), 0, org.telegram.messenger.i0.L(20.0f) + (this.r / 2) + this.x, org.telegram.messenger.i0.L(39.0f));
        this.d.layout(((this.r / 2) + this.x) - org.telegram.messenger.i0.L(19.0f), 0, org.telegram.messenger.i0.L(20.0f) + (this.r / 2) + this.x, org.telegram.messenger.i0.L(39.0f));
        int i14 = this.x;
        TextView textView = this.e;
        textView.layout(i14, 0, textView.getMeasuredWidth() + i14, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, org.telegram.messenger.i0.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), TLObject.FLAG_30);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), TLObject.FLAG_30));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.F;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - org.telegram.messenger.i0.L(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.F;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.ov0.a;
            this.n = h4.n(this.b, this, str, null, L, this.w, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.c);
            int i12 = this.s;
            f4 f4Var = this.c;
            if (f4Var == null || !f4Var.G) {
                this.x = (getMeasuredWidth() - i12) - this.r;
            } else {
                this.x = i12;
            }
            z2 z2Var = this.n;
            if (z2Var != null) {
                z2Var.s = i12;
                z2Var.w = this.w;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return h4.j(this.b, this.c, motionEvent, this, this.n, this.s, this.w) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.F = pageblockchannel;
        int i10 = this.E;
        ImageView imageView = this.f;
        Paint paint = this.y;
        TextView textView = this.e;
        m60 m60Var = this.b;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.t6.M6;
            h4 h4Var = (h4) m60Var;
            h4Var.getClass();
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
            int red = Color.red(x02);
            int green = Color.green(x02);
            int blue = Color.blue(x02);
            h4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            h4Var.getClass();
            this.a = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(((h4) m60Var).X).L0(Long.valueOf(pageblockchannel.channel.id));
        if (L0 == null || L0.min) {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (!m60Var.r && org.telegram.messenger.w3.t0(chat)) {
                m60Var.r = true;
                int i12 = ((h4) m60Var).X;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new b0(m60Var, this.c, i12, this, 0));
            }
            a(1, false);
        } else {
            m60Var.n = L0;
            if (!L0.left || L0.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
        }
        requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.E != 0 || this.F == null || this.b == null || (textView = this.e) == null || (imageView = this.f) == null || (paint = this.y) == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.M6, false);
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J6, false));
            paint.setColor(Color.argb(34, Color.red(x02), Color.green(x02), Color.blue(x02)));
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
            if (x03 != this.a) {
                this.a = x03;
                imageView.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
