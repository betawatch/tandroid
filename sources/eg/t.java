package eg;

import ag.j3;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t extends FrameLayout {
    public final ag.k a;
    public final q b;
    public final TextView c;
    public final p80 d;
    public final c6 e;
    public final m80 f;
    public final Paint[] h;
    public ValueAnimator n;

    public t(Context context, c6 c6Var) {
        super(context);
        this.e = c6Var;
        LinearLayout g10 = y1.g(context, 1);
        ag.k kVar = new ag.k(context, 1, 0, 2);
        this.a = kVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = g6.Mj;
        canvas.drawColor(i0.b.d(0.5f, g6.v0(i10, c6Var), g6.v0(g6.h5, c6Var)));
        kVar.setBackgroundBitmap(createBitmap);
        bg.a aVar = kVar.b;
        aVar.w = i10;
        aVar.x = g6.Lj;
        aVar.b();
        g10.addView(kVar, z5.q(160, 160, 1));
        q qVar = new q(this, context);
        this.b = qVar;
        this.h = new Paint[20];
        a(0.0f);
        j3 j3Var = qVar.a;
        j3Var.q = false;
        j3Var.K = false;
        j3Var.L = true;
        j3Var.H = true;
        j3Var.l = new o(this, 0);
        j3Var.c();
        kVar.setStarParticlesView(qVar);
        TextView textView = new TextView(context);
        this.c = textView;
        rl.h(22.0f, 1, textView);
        int i11 = g6.G6;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setGravity(1);
        g10.addView(textView, z5.t(-2, -2, 1, 24, -8, 24, 0));
        m80 m80Var = new m80(this);
        this.f = m80Var;
        p80 p80Var = new p80(context, m80Var, c6Var);
        this.d = p80Var;
        p80Var.setTextSize(1, 15.0f);
        p80Var.setGravity(17);
        p80Var.setTextColor(g6.v0(i11, c6Var));
        p80Var.setMovementMethod(LinkMovementMethod.getInstance());
        p80Var.setLinkTextColor(g6.v0(g6.J6, c6Var));
        p80Var.setImportantForAccessibility(2);
        g10.addView(p80Var, z5.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(qVar, z5.e(-1, 234, 48));
        addView(g10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i10 = g6.Lj;
        c6 c6Var = this.e;
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.Mj, c6Var);
        int d = i0.b.d(f10, v02, -371690);
        int d10 = i0.b.d(f10, v03, -14281);
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i11 >= paintArr.length) {
                return;
            }
            paintArr[i11] = new Paint(1);
            paintArr[i11].setColorFilter(new PorterDuffColorFilter(i0.b.d(i11 / (paintArr.length - 1), d, d10), PorterDuff.Mode.SRC_IN));
            i11++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m80 m80Var = this.f;
        if (m80Var != null) {
            canvas.save();
            p80 p80Var = this.d;
            canvas.translate(p80Var.getLeft(), p80Var.getTop());
            if (m80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ag.k kVar = this.a;
        q qVar = this.b;
        qVar.setTranslationY(((kVar.getMeasuredHeight() / 2.0f) + kVar.getTop()) - (qVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new r());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = g6.a7;
        c6 c6Var = this.e;
        setBackgroundColor(g6.v0(i10, c6Var));
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        p80 p80Var = this.d;
        p80Var.setText(formatString);
        p80Var.setTextColor(g6.v0(g6.r5, c6Var));
    }

    public void setPaused(boolean z10) {
        this.a.setPaused(z10);
        this.b.setPaused(z10);
    }

    public void setStars(final boolean z10) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ag.k kVar = this.a;
        final float f10 = kVar.b.i;
        final float f11 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(kVar.Q);
        kVar.d();
        kVar.i();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eg.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f12 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                t tVar = t.this;
                ag.k kVar2 = tVar.a;
                kVar2.b.i = AndroidUtilities.lerp(f10, f11, floatValue);
                bg.a aVar = kVar2.b;
                aVar.f = (f12 * 360.0f * (z10 ? 1 : -1)) + aVar.f;
                aVar.b();
                tVar.a(kVar2.b.i);
            }
        });
        this.n.addListener(new s(this, fArr, f10, f11, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(er.h);
        this.n.start();
    }
}
