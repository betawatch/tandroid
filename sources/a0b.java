// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class a0b extends FrameLayout {
    public final yza a;
    public final zza b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final pc0 n;
    public final v4b r;
    public final ylb s;
    public uza w;
    public final TLRPC.ChatFull x;
    public boolean y;

    public a0b(Context context, TLRPC.ChatFull chatFull, ylb ylbVar) {
        super(context);
        this.h = new Paint(1);
        this.n = new pc0((ylb) null);
        this.r = new v4b(null, false);
        this.x = chatFull;
        this.s = ylbVar;
        yza yzaVar = new yza(this, context, ylbVar);
        this.a = yzaVar;
        setClipChildren(false);
        boolean z = jb6.a0;
        addView(yzaVar, qoe.d(46, 46.0f, (!z ? 8388611 : 8388613) | 16, !z ? 12.0f : 16.0f, 0.0f, !z ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout i = hg9.i(context, 0);
        zza zzaVar = new zza(context);
        this.b = zzaVar;
        nm7.i(zzaVar);
        zzaVar.setTypeface(gm.o());
        zzaVar.setTextSize(16);
        zzaVar.setMaxLines(1);
        zzaVar.setTextColor(-16777216);
        zzaVar.setGravity(jb6.a0 ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (jb6.a0) {
            i.addView(textView, qoe.r(-2, -2, 80));
            i.addView(zzaVar, qoe.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            i.addView(zzaVar, qoe.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            i.addView(textView, qoe.r(-2, -2, 80));
        }
        linearLayout.addView(i, qoe.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-16777216);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(-16777216);
        textView3.setGravity(16);
        TextView textView4 = new TextView(context);
        this.f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout i2 = hg9.i(context, 0);
        if (jb6.a0) {
            i2.addView(textView3, qoe.t(-2, -2, 16, 0, 0, 10, 0));
            i2.addView(textView4, qoe.r(-2, -2, 16));
            i2.addView(textView2, qoe.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            i2.addView(textView2, qoe.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            i2.addView(textView4, qoe.r(-2, -2, 16));
            i2.addView(textView3, qoe.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(i2, qoe.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z2 = jb6.a0;
        addView(linearLayout, qoe.d(-1, -2.0f, 0, !z2 ? 72.0f : 18.0f, 0.0f, !z2 ? 18.0f : 72.0f, 0.0f));
        int i3 = cmb.i5;
        anb.W(zzaVar, i3, null);
        anb.X(textView, i3, null);
        int i4 = cmb.z6;
        anb.X(textView2, i4, null);
        anb.X(textView3, i4, null);
        anb.X(textView4, i4, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.x(textView4, mutate, i4, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        anb.x(textView3, mutate2, i4, null, mode);
        sn2 sn2Var = new sn2(null, mutate, 0, gm.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        sn2Var.h = intrinsicWidth;
        sn2Var.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(sn2Var, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(gm.L(2.0f));
        sn2 sn2Var2 = new sn2(null, mutate2, 0, gm.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        sn2Var2.h = intrinsicWidth2;
        sn2Var2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(sn2Var2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(gm.L(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y) {
            int v0 = cmb.v0(cmb.c7, this.s);
            Paint paint = this.h;
            paint.setColor(v0);
            if (jb6.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gm.L(72.0f), getHeight(), paint);
            } else {
                canvas.drawRect(gm.L(72.0f), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public bf0 getImageView() {
        return this.a;
    }

    public uza getPostInfo() {
        return this.w;
    }

    public v4b getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(qza qzaVar) {
        TLRPC.User user = qzaVar.a;
        pc0 pc0Var = this.n;
        pc0Var.q(user);
        TLRPC.User user2 = qzaVar.a;
        yza yzaVar = this.a;
        yzaVar.f(user2, pc0Var);
        yzaVar.setRoundRadius(gm.L(46.0f) >> 1);
        this.b.k(qzaVar.a.first_name);
        this.e.setText(qzaVar.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
