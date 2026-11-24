// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cd extends FrameLayout {
    public final ylb a;
    public final bf0 b;
    public final pc0 c;
    public final tm d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final ImageView n;
    public boolean r;

    public cd(int i, ylb ylbVar, Context context) {
        super(context);
        pc0 pc0Var = new pc0((ylb) null);
        this.c = pc0Var;
        this.a = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(8.0f));
        pc0Var.r = gm.L(8.0f);
        addView(bf0Var, qoe.d(28, 28.0f, (jb6.a0 ? 5 : 3) | 16, 15.0f, 0.0f, 15.0f, 0.0f));
        tm tmVar = new tm(gm.L(28.0f), 7, bf0Var, false);
        this.d = tmVar;
        tmVar.y = Integer.valueOf(i);
        LinearLayout i2 = hg9.i(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(cmb.v0(cmb.F6, ylbVar));
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(jb6.a0 ? 5 : 3);
        i2.addView(textView, qoe.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(cmb.v0(cmb.x6, ylbVar));
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        i2.addView(textView2, qoe.k(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        boolean z = jb6.a0;
        addView(i2, qoe.d(-1, -2.0f, 23, z ? 56.0f : 61.0f, 0.0f, z ? 61.0f : 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.checkbig);
        int v0 = cmb.v0(cmb.Ci, ylbVar);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v0, mode));
        addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.l6, ylbVar), mode));
        if (jb6.a0) {
            imageView2.setScaleX(-1.0f);
        }
        addView(imageView2, qoe.d(24, 24.0f, (jb6.a0 ? 3 : 5) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
        setWillNotDraw(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TL_agent.agentProvider agentprovider, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        if (agentprovider != null) {
            str = agentprovider.title;
        }
        String str2 = str;
        this.e.setText(str2);
        TextView textView = this.f;
        if (agentprovider == null) {
            textView.setText("");
        } else if (z || !agentprovider.models_searchable) {
            textView.setText(agentprovider.vendor);
        } else {
            textView.setText(jb6.M0(2131754286, null));
        }
        bf0 bf0Var = this.b;
        tm tmVar = this.d;
        if (agentprovider != null && (agentprovider.flags & 2) != 0) {
            long j = agentprovider.icon_emoji_id;
            if (j != 0) {
                tmVar.j(j, false);
                bf0Var.setImageDrawable(tmVar);
                this.h.setVisibility(!z2 ? 0 : 8);
                this.n.setVisibility(z3 ? 0 : 8);
                this.r = z4;
                invalidate();
            }
        }
        tmVar.i(null, false);
        long hashCode = str2 != null ? str2.hashCode() : 0L;
        pc0 pc0Var = this.c;
        pc0Var.j(hashCode, str2, null, null);
        bf0Var.setImageDrawable(pc0Var);
        this.h.setVisibility(!z2 ? 0 : 8);
        this.n.setVisibility(z3 ? 0 : 8);
        this.r = z4;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.r) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(61.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(61.0f) : 0), getMeasuredHeight() - 1, cmb.U0("paintDivider", this.a));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(60.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }
}
