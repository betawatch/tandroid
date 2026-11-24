// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hzb extends FrameLayout implements vlb {
    public boolean E;
    public ed0 F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public int J;
    public int K;
    public ValueAnimator L;
    public int M;
    public final int a;
    public final ylb b;
    public cba c;
    public final l66 d;
    public final ho e;
    public final yc f;
    public final ImageView h;
    public boolean n;
    public final ln r;
    public boolean s;
    public int w;
    public long x;
    public boolean y;

    public hzb(int i, ylb ylbVar, Context context) {
        super(context);
        this.r = new ln(360L, this, d53.h);
        this.s = false;
        this.y = false;
        this.E = false;
        this.J = cmb.T8;
        this.M = 0;
        this.a = i;
        this.b = ylbVar;
        setClipChildren(false);
        setClipToPadding(false);
        l66 l66Var = new l66(context, ylbVar);
        this.d = l66Var;
        l66Var.setTextSize(1, 14.0f);
        l66Var.setTypeface(gm.o());
        addView(l66Var, qoe.d(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
        rve.a(l66Var);
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        addView(imageView, qoe.e(34, 34, 17));
        ho hoVar = new ho(false, false, false);
        this.e = hoVar;
        hoVar.w(gm.L(11.0f));
        hoVar.x(gm.o());
        hoVar.N = gm.q.x;
        hoVar.b = 17;
        yc ycVar = new yc(this, context, ylbVar);
        this.f = ycVar;
        addView(ycVar, qoe.d(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
        rve.a(ycVar);
        h();
    }

    private int getMeasuringWidth() {
        float L = gm.L(16.66f);
        ho hoVar = this.e;
        return gm.L(11.0f) + this.d.getMeasuredWidth() + gm.L(11.0f) + (hoVar.d > 0.0f ? gm.L(4.66f) + ((int) Math.max(L, hoVar.d + gm.L(10.0f))) : 0) + this.M;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTextColor() {
        int i = cmb.y6;
        ylb ylbVar = this.b;
        return on2.f(this.y ? 1.0f : this.G, cmb.v0(i, ylbVar), cmb.v0(cmb.Ei, ylbVar));
    }

    private void setLayout(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.Ei));
    }

    public final void b(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        setLayout(false);
        long j2 = this.x;
        long j3 = tL_forumTopic.id;
        boolean z2 = j2 == j3;
        this.x = j3;
        this.h.setVisibility(8);
        l66 l66Var = this.d;
        l66Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (tL_forumTopic.id == 1) {
            spannableStringBuilder.append((CharSequence) "#");
            spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
            pn2 pn2Var = new pn2(R.drawable.msg_filled_general, 0);
            pn2Var.I = 0.66f;
            pn2Var.J = 0.66f;
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 18);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            spannableStringBuilder.append((CharSequence) "x ");
            spannableStringBuilder.setSpan(new gn(tL_forumTopic.icon_emoji_id, l66Var.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        if (!tL_forumTopic.hidden) {
            spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
        }
        l66Var.setText(spannableStringBuilder);
        setSelected(z);
        h();
        e(tL_forumTopic.unread_count, oc7.r1(this.a).o2(j, this.x, null), z2);
        boolean z3 = tL_forumTopic.pinned;
        if (this.s != z3) {
            this.s = z3;
        }
    }

    public final void c() {
        setLayout(false);
        this.x = 0L;
        this.y = true;
        this.h.setVisibility(8);
        l66 l66Var = this.d;
        l66Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
        spannableStringBuilder.setSpan(new pn2(R.drawable.menu_topic_add, 0), 0, 1, 33);
        l66Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        int i;
        setLayout(z2);
        this.x = 0L;
        this.y = false;
        int i2 = z ? 0 : 8;
        ImageView imageView = this.h;
        imageView.setVisibility(i2);
        if (z) {
            ezb ezbVar = new ezb(getContext());
            ezbVar.b.setColor(cmb.v0(cmb.Ei, this.b));
            imageView.setImageDrawable(ezbVar);
            i = 2131753029;
        } else {
            i = 2131754254;
        }
        String M0 = jb6.M0(i, null);
        l66 l66Var = this.d;
        l66Var.setText(M0);
        l66Var.setVisibility(z ? 8 : 0);
        setSelected(z3);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.d) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float d = this.r.d(this.n);
        if (d > 0.0f) {
            if (this.c == null) {
                this.c = new cba(this);
            }
            canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
            this.c.a(canvas, d);
            canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e(int i, boolean z, boolean z2) {
        ho hoVar = this.e;
        if (i > 0) {
            this.J = z ? cmb.U8 : cmb.T8;
            hoVar.t(jb6.E(i, ','), z2, true);
        } else {
            this.J = cmb.U8;
            hoVar.t("", z2, true);
        }
        if (z2 && this.K < i) {
            ValueAnimator valueAnimator = this.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.L = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.L = ofFloat;
            ofFloat.addUpdateListener(new fzb(this, (byte) 0));
            this.L.addListener(new q7b(this, (byte) 9));
            b10.n(2.0f, this.L);
            this.L.setDuration(200L);
            this.L.start();
        }
        this.K = i;
        this.f.invalidate();
        if (getMeasuringWidth() != getMeasuredWidth()) {
            requestLayout();
        }
    }

    public final void f() {
        setLayout(false);
        this.x = -1L;
        this.h.setVisibility(8);
        l66 l66Var = this.d;
        l66Var.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        ta6 ta6Var = new ta6(gm.L(42.0f), l66Var);
        ta6Var.e = 0.95f;
        spannableStringBuilder.setSpan(ta6Var, 0, 1, 33);
        l66Var.setText(spannableStringBuilder);
        setSelected(false);
        h();
        e(0, true, false);
        if (this.s) {
            this.s = false;
        }
    }

    public final void g(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        setLayout(true);
        long n = pg3.n(tL_forumTopic.from_id);
        boolean z2 = this.x == n;
        this.x = n;
        this.h.setVisibility(8);
        l66 l66Var = this.d;
        l66Var.setVisibility(0);
        ed0 ed0Var = this.F;
        int i = this.a;
        if (ed0Var == null) {
            ed0 ed0Var2 = new ed0(18.0f, i, l66Var);
            this.F = ed0Var2;
            ed0Var2.w = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TLObject a2 = oc7.r1(i).a2(n);
        if (a2 != null) {
            spannableStringBuilder.append((CharSequence) "x  ");
            ed0 ed0Var3 = this.F;
            pc0 pc0Var = ed0Var3.c;
            pc0Var.o(a2);
            ed0Var3.b.U(a2, pc0Var, null);
            spannableStringBuilder.setSpan(this.F, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) pg3.k(z8c.t0, n));
        l66Var.setText(TextUtils.ellipsize(spannableStringBuilder, l66Var.getPaint(), gm.L(150.0f), TextUtils.TruncateAt.END));
        setSelected(z);
        e(tL_forumTopic.unread_count, oc7.r1(i).o2(j, n, null), z2);
        if (this.s) {
            this.s = false;
        }
    }

    public long getTopicId() {
        return this.x;
    }

    public final void h() {
        int textColor = getTextColor();
        l66 l66Var = this.d;
        l66Var.setTextColor(textColor);
        l66Var.setEmojiColor(textColor);
        this.f.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        ImageView imageView = this.h;
        int measuredWidth = (i5 - imageView.getMeasuredWidth()) / 2;
        int measuredHeight = (i6 - imageView.getMeasuredHeight()) / 2;
        imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight() + measuredHeight);
        int L = gm.L(11.0f);
        int i7 = i6 / 2;
        l66 l66Var = this.d;
        l66Var.layout(L, i7 - (l66Var.getMeasuredHeight() / 2), l66Var.getMeasuredWidth() + gm.L(11.0f), (l66Var.getMeasuredHeight() / 2) + i7);
        float f = this.e.d;
        yc ycVar = this.f;
        if (f > 0.0f) {
            ycVar.layout(((i5 - gm.L(11.0f)) - this.M) - ycVar.getMeasuredWidth(), i7 - (ycVar.getMeasuredHeight() / 2), (i5 - gm.L(11.0f)) - this.M, (ycVar.getMeasuredHeight() / 2) + i7);
        } else {
            ycVar.layout(gm.L(4.66f) + l66Var.getMeasuredWidth() + gm.L(11.0f), i7 - (ycVar.getMeasuredHeight() / 2), ycVar.getMeasuredWidth() + gm.L(4.66f) + l66Var.getMeasuredWidth() + gm.L(11.0f), (ycVar.getMeasuredHeight() / 2) + i7);
        }
        if (this.w != 0 && ycVar.getLeft() != this.w) {
            ycVar.setTranslationX((-ycVar.getLeft()) + this.w);
            ycVar.animate().translationX(0.0f).setDuration(320L).setInterpolator(d53.h).start();
        }
        this.w = ycVar.getLeft();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.d.measure(i, i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(36.0f), TLObject.FLAG_30));
    }

    public void setReorder(boolean z) {
        this.n = z;
        invalidate();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        if (this.H == z) {
            return;
        }
        this.H = z;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, z ? 1.0f : 0.0f);
        this.I = ofFloat;
        ofFloat.addUpdateListener(new fzb(this, (byte) 1));
        this.I.addListener(new sw9((byte) 11, this, z));
        this.I.setInterpolator(d53.h);
        this.I.setDuration(320L);
        this.I.start();
    }

    @Override // vlb
    public final void updateColors() {
        try {
            if (this.d != null && this.f != null) {
                h();
            }
            ImageView imageView = this.h;
            if (imageView == null || !(imageView.getDrawable() instanceof ezb)) {
                return;
            }
            ezb ezbVar = (ezb) imageView.getDrawable();
            ezbVar.b.setColor(cmb.v0(cmb.Ei, this.b));
            imageView.invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
