package gg;

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
import cg.r2;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s extends FrameLayout {
    public final cg.i a;
    public final p b;
    public final TextView c;
    public final y80 d;
    public final c6 e;
    public final v80 f;
    public final Paint[] h;
    public ValueAnimator n;

    public s(Context context, c6 c6Var) {
        super(context);
        this.e = c6Var;
        LinearLayout g10 = x3.g(context, 1);
        cg.i iVar = new cg.i(context, 1, 0, 2);
        this.a = iVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = g6.Mj;
        canvas.drawColor(i0.a.d(0.5f, g6.v0(i10, c6Var), g6.v0(g6.h5, c6Var)));
        iVar.setBackgroundBitmap(createBitmap);
        dg.a aVar = iVar.b;
        aVar.w = i10;
        aVar.x = g6.Lj;
        aVar.b();
        g10.addView(iVar, f6.q(160, 160, 1));
        p pVar = new p(this, context);
        this.b = pVar;
        this.h = new Paint[20];
        a(0.0f);
        r2 r2Var = pVar.a;
        r2Var.q = false;
        r2Var.K = false;
        r2Var.L = true;
        r2Var.H = true;
        r2Var.l = new bg.b0(this, 1);
        r2Var.c();
        iVar.setStarParticlesView(pVar);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.g(22.0f, 1, textView);
        int i11 = g6.G6;
        textView.setTextColor(g6.v0(i11, c6Var));
        textView.setGravity(1);
        g10.addView(textView, f6.t(-2, -2, 1, 24, -8, 24, 0));
        v80 v80Var = new v80(this);
        this.f = v80Var;
        y80 y80Var = new y80(context, v80Var, c6Var);
        this.d = y80Var;
        y80Var.setTextSize(1, 15.0f);
        y80Var.setGravity(17);
        y80Var.setTextColor(g6.v0(i11, c6Var));
        y80Var.setMovementMethod(LinkMovementMethod.getInstance());
        y80Var.setLinkTextColor(g6.v0(g6.J6, c6Var));
        y80Var.setImportantForAccessibility(2);
        g10.addView(y80Var, f6.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(pVar, f6.e(-1, 234, 48));
        addView(g10);
        setWillNotDraw(false);
    }

    public final void a(float f9) {
        int i10 = g6.Lj;
        c6 c6Var = this.e;
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.Mj, c6Var);
        int d = i0.a.d(f9, v02, -371690);
        int d10 = i0.a.d(f9, v03, -14281);
        int i11 = 0;
        while (true) {
            Paint[] paintArr = this.h;
            if (i11 >= paintArr.length) {
                return;
            }
            paintArr[i11] = new Paint(1);
            paintArr[i11].setColorFilter(new PorterDuffColorFilter(i0.a.d(i11 / (paintArr.length - 1), d, d10), PorterDuff.Mode.SRC_IN));
            i11++;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        v80 v80Var = this.f;
        if (v80Var != null) {
            canvas.save();
            y80 y80Var = this.d;
            canvas.translate(y80Var.getLeft(), y80Var.getTop());
            if (v80Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        cg.i iVar = this.a;
        p pVar = this.b;
        pVar.setTranslationY(((iVar.getMeasuredHeight() / 2.0f) + iVar.getTop()) - (pVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new q());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = g6.a7;
        c6 c6Var = this.e;
        setBackgroundColor(g6.v0(i10, c6Var));
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        y80 y80Var = this.d;
        y80Var.setText(formatString);
        y80Var.setTextColor(g6.v0(g6.r5, c6Var));
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
        cg.i iVar = this.a;
        final float f9 = iVar.b.i;
        final float f10 = z10 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(iVar.Q);
        iVar.d();
        iVar.i();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gg.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f11 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                s sVar = s.this;
                cg.i iVar2 = sVar.a;
                iVar2.b.i = AndroidUtilities.lerp(f9, f10, floatValue);
                dg.a aVar = iVar2.b;
                aVar.f = (f11 * 360.0f * (z10 ? 1 : -1)) + aVar.f;
                aVar.b();
                sVar.a(iVar2.b.i);
            }
        });
        this.n.addListener(new r(this, fArr, f9, f10, z10));
        this.n.setDuration(680L);
        this.n.setInterpolator(jr.h);
        this.n.start();
    }
}
