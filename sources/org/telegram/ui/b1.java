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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b1 extends FrameLayout implements org.telegram.ui.Cells.g9, org.telegram.ui.ActionBar.z5 {
    public AnimatorSet E;
    public final int F;
    public TL_iv.pageBlockChannel G;
    public int a;
    public final i50 b;
    public final g4 c;
    public final org.telegram.ui.Components.aq d;
    public final TextView e;
    public final ImageView f;
    public int h;
    public a3 n;
    public int r;
    public final int s;
    public final int w;
    public int x;
    public final Paint y;

    public b1(Context context, i50 i50Var, g4 g4Var, int i3) {
        super(context);
        this.s = org.telegram.messenger.g0.L(18.0f);
        this.w = org.telegram.messenger.g0.L(11.0f);
        this.b = i50Var;
        this.c = g4Var;
        setWillNotDraw(false);
        this.y = new Paint();
        this.F = i3;
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(org.telegram.messenger.bd.M0(2131752397, null));
        textView.setGravity(19);
        addView(textView, b8.mf.e(-2, 39, 53));
        textView.setOnClickListener(new org.telegram.messenger.video.g(8, this, i50Var));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, b8.mf.e(39, 39, 53));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 0);
        this.d = aqVar;
        addView(aqVar, b8.mf.e(39, 39, 53));
    }

    public final void a(int i3, boolean z10) {
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = i3;
        ImageView imageView = this.f;
        org.telegram.ui.Components.aq aqVar = this.d;
        TextView textView = this.e;
        if (!z10) {
            textView.setAlpha(i3 == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i3 == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i3 == 0 ? 1.0f : 0.1f);
            aqVar.setAlpha(i3 == 1 ? 1.0f : 0.0f);
            aqVar.setScaleX(i3 == 1 ? 1.0f : 0.1f);
            aqVar.setScaleY(i3 == 1 ? 1.0f : 0.1f);
            imageView.setAlpha(i3 == 2 ? 1.0f : 0.0f);
            imageView.setScaleX(i3 == 2 ? 1.0f : 0.1f);
            imageView.setScaleY(i3 == 2 ? 1.0f : 0.1f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.E = animatorSet2;
        float[] fArr = {i3 == 0 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {i3 == 0 ? 1.0f : 0.1f};
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr2);
        float f10 = i3 == 0 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f10), ObjectAnimator.ofFloat(aqVar, (Property<org.telegram.ui.Components.aq, Float>) property, i3 == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(aqVar, (Property<org.telegram.ui.Components.aq, Float>) property2, i3 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(aqVar, (Property<org.telegram.ui.Components.aq, Float>) property3, i3 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i3 == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i3 == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i3 == 2 ? 1.0f : 0.1f));
        this.E.setDuration(150L);
        this.E.start();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.M6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.n;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.n;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.n;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.G == null) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(39.0f), this.y);
        a3 a3Var = this.n;
        if (a3Var == null || a3Var.d.getLineCount() <= 0) {
            return;
        }
        canvas.save();
        int i3 = this.w;
        int i10 = this.s;
        g4 g4Var = this.c;
        if (g4Var == null || !g4Var.H) {
            canvas.translate(i10, i3);
        } else {
            canvas.translate((getMeasuredWidth() - this.n.d.getLineWidth(0)) - i10, i3);
        }
        if (this.F == 0) {
            i4.t(this.b, canvas, this, 0);
        }
        this.n.d(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.n;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754904, i4.h(this.b, this.c, a3Var)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.f.layout(((this.r / 2) + this.x) - org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(20.0f) + (this.r / 2) + this.x, org.telegram.messenger.g0.L(39.0f));
        this.d.layout(((this.r / 2) + this.x) - org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(20.0f) + (this.r / 2) + this.x, org.telegram.messenger.g0.L(39.0f));
        int i13 = this.x;
        TextView textView = this.e;
        textView.layout(i13, 0, textView.getMeasuredWidth() + i13, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(size, org.telegram.messenger.g0.L(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30);
        TextView textView = this.e;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.r = textView.getMeasuredWidth();
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.G;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int L = (size - org.telegram.messenger.g0.L(52.0f)) - this.r;
            TL_iv.pageBlockChannel pageblockchannel2 = this.G;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.lu0.a;
            this.n = i4.n(this.b, this, str, null, L, this.w, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.c);
            int i11 = this.s;
            g4 g4Var = this.c;
            if (g4Var == null || !g4Var.H) {
                this.x = (getMeasuredWidth() - i11) - this.r;
            } else {
                this.x = i11;
            }
            a3 a3Var = this.n;
            if (a3Var != null) {
                a3Var.s = i11;
                a3Var.w = this.w;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.F != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return i4.j(this.b, this.c, motionEvent, this, this.n, this.s, this.w) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.G = pageblockchannel;
        int i3 = this.F;
        ImageView imageView = this.f;
        Paint paint = this.y;
        TextView textView = this.e;
        i50 i50Var = this.b;
        if (i3 == 0) {
            int i10 = org.telegram.ui.ActionBar.k6.M6;
            i4 i4Var = (i4) i50Var;
            i4Var.getClass();
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            int red = Color.red(x02);
            int green = Color.green(x02);
            int blue = Color.blue(x02);
            i4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            i4Var.getClass();
            this.a = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
            imageView.setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(((i4) i50Var).Y).M0(Long.valueOf(pageblockchannel.channel.id));
        if (M0 == null || M0.min) {
            TLRPC.Chat chat = pageblockchannel.channel;
            if (!i50Var.r && org.telegram.messenger.t3.t0(chat)) {
                i50Var.r = true;
                int i11 = ((i4) i50Var).Y;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat.username;
                ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new ei.i8(i50Var, this.c, i11, this, 2));
            }
            a(1, false);
        } else {
            i50Var.n = M0;
            if (!M0.left || M0.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
        }
        requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        TextView textView;
        ImageView imageView;
        Paint paint;
        try {
            if (this.F != 0 || this.G == null || this.b == null || (textView = this.e) == null || (imageView = this.f) == null || (paint = this.y) == null) {
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
