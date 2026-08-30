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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e1 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public TL_iv.pageBlockChannel B;
    public final n70 a;
    public final j4 b;
    public final org.telegram.ui.Components.rq c;
    public final TextView d;
    public final ImageView e;
    public int f;
    public d3 h;
    public int n;
    public final int r;
    public final int s;
    public int v;
    public final Paint w;
    public AnimatorSet x;
    public final int y;

    public e1(Context context, n70 n70Var, j4 j4Var, int i10) {
        super(context);
        this.r = AndroidUtilities.dp(18.0f);
        this.s = AndroidUtilities.dp(11.0f);
        this.a = n70Var;
        this.b = j4Var;
        setWillNotDraw(false);
        this.w = new Paint();
        this.y = i10;
        TextView textView = new TextView(context);
        this.d = textView;
        yh.p(14.0f, 1, textView);
        org.telegram.messenger.y3.r(R.string.ChannelJoin, textView, 19);
        addView(textView, k7.b6.e(-2, 39, 53));
        textView.setOnClickListener(new org.telegram.messenger.video.g(8, this, n70Var));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.list_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.b6.e(39, 39, 53));
        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(context, 0);
        this.c = rqVar;
        addView(rqVar, k7.b6.e(39, 39, 53));
    }

    public final void a(int i10, boolean z4) {
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f = i10;
        ImageView imageView = this.e;
        org.telegram.ui.Components.rq rqVar = this.c;
        TextView textView = this.d;
        if (!z4) {
            textView.setAlpha(i10 == 0 ? 1.0f : 0.0f);
            textView.setScaleX(i10 == 0 ? 1.0f : 0.1f);
            textView.setScaleY(i10 == 0 ? 1.0f : 0.1f);
            rqVar.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            rqVar.setScaleX(i10 == 1 ? 1.0f : 0.1f);
            rqVar.setScaleY(i10 == 1 ? 1.0f : 0.1f);
            imageView.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            imageView.setScaleX(i10 == 2 ? 1.0f : 0.1f);
            imageView.setScaleY(i10 == 2 ? 1.0f : 0.1f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.x = animatorSet2;
        float[] fArr = {i10 == 0 ? 1.0f : 0.0f};
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr);
        float[] fArr2 = {i10 == 0 ? 1.0f : 0.1f};
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr2);
        float f10 = i10 == 0 ? 1.0f : 0.1f;
        Property property3 = View.SCALE_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, f10), ObjectAnimator.ofFloat(rqVar, (Property<org.telegram.ui.Components.rq, Float>) property, i10 == 1 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(rqVar, (Property<org.telegram.ui.Components.rq, Float>) property2, i10 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(rqVar, (Property<org.telegram.ui.Components.rq, Float>) property3, i10 == 1 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, i10 == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, i10 == 2 ? 1.0f : 0.1f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property3, i10 == 2 ? 1.0f : 0.1f));
        this.x.setDuration(150L);
        this.x.start();
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.h;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.h;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.h;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.B == null) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), AndroidUtilities.dp(39.0f), this.w);
        d3 d3Var = this.h;
        if (d3Var == null || d3Var.d.getLineCount() <= 0) {
            return;
        }
        canvas.save();
        int i10 = this.s;
        int i11 = this.r;
        j4 j4Var = this.b;
        if (j4Var == null || !j4Var.D) {
            canvas.translate(i11, i10);
        } else {
            canvas.translate((getMeasuredWidth() - this.h.d.getLineWidth(0)) - i11, i10);
        }
        if (this.y == 0) {
            l4.v(this.a, canvas, this, 0);
        }
        this.h.draw(canvas, this);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.h;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrChannel, l4.j(this.a, this.b, d3Var)));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.e.layout(((this.n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.n / 2) + this.v, AndroidUtilities.dp(39.0f));
        this.c.layout(((this.n / 2) + this.v) - AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(20.0f) + (this.n / 2) + this.v, AndroidUtilities.dp(39.0f));
        int i14 = this.v;
        TextView textView = this.d;
        textView.layout(i14, 0, textView.getMeasuredWidth() + i14, textView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, AndroidUtilities.dp(48.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30);
        TextView textView = this.d;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.n = textView.getMeasuredWidth();
        this.c.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(39.0f), TLObject.FLAG_30));
        TL_iv.pageBlockChannel pageblockchannel = this.B;
        if (pageblockchannel != null) {
            String str = pageblockchannel.channel.title;
            int dp = (size - AndroidUtilities.dp(52.0f)) - this.n;
            TL_iv.pageBlockChannel pageblockchannel2 = this.B;
            Layout.Alignment[] alignmentArr = org.telegram.ui.Components.kw0.a;
            this.h = l4.p(this.a, this, str, null, dp, this.s, pageblockchannel2, alignmentArr.length >= 5 ? alignmentArr[3] : Layout.Alignment.ALIGN_NORMAL, 1, this.b);
            int i12 = this.r;
            j4 j4Var = this.b;
            if (j4Var == null || !j4Var.D) {
                this.v = (getMeasuredWidth() - i12) - this.n;
            } else {
                this.v = i12;
            }
            d3 d3Var = this.h;
            if (d3Var != null) {
                d3Var.s = i12;
                d3Var.v = this.s;
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.y != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return l4.l(this.a, this.b, motionEvent, this, this.h, this.r, this.s) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockChannel pageblockchannel) {
        this.B = pageblockchannel;
        int i10 = this.y;
        ImageView imageView = this.e;
        Paint paint = this.w;
        TextView textView = this.d;
        n70 n70Var = this.a;
        if (i10 == 0) {
            int i11 = org.telegram.ui.ActionBar.j6.M6;
            l4 l4Var = (l4) n70Var;
            l4Var.getClass();
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
            int red = Color.red(w02);
            int green = Color.green(w02);
            int blue = Color.blue(w02);
            l4Var.getClass();
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            paint.setColor(Color.argb(34, red, green, blue));
            imageView.setColorFilter(new PorterDuffColorFilter(n70Var.a(), PorterDuff.Mode.MULTIPLY));
        } else {
            textView.setTextColor(-1);
            paint.setColor(2130706432);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        }
        TLRPC.Chat chat = MessagesController.getInstance(((l4) n70Var).U).getChat(Long.valueOf(pageblockchannel.channel.id));
        if (chat == null || chat.min) {
            TLRPC.Chat chat2 = pageblockchannel.channel;
            if (!n70Var.r && ChatObject.isPublic(chat2)) {
                n70Var.r = true;
                int i12 = ((l4) n70Var).U;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = chat2.username;
                ConnectionsManager.getInstance(i12).sendRequest(tL_contacts_resolveUsername, new nh.b8(n70Var, this.b, i12, this, 1));
            }
            a(1, false);
        } else {
            n70Var.n = chat;
            if (!chat.left || chat.kicked) {
                a(4, false);
            } else {
                a(0, false);
            }
        }
        requestLayout();
    }
}
