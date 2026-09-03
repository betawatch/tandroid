package jg;

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
import fg.o2;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s extends FrameLayout {
    public final fg.i a;
    public final p b;
    public final TextView c;
    public final g90 d;
    public final g6 e;
    public final d90 f;
    public final Paint[] h;
    public ValueAnimator n;

    public s(Context context, g6 g6Var) {
        super(context);
        this.e = g6Var;
        LinearLayout f10 = y3.f(context, 1);
        fg.i iVar = new fg.i(context, 1, 0, 2);
        this.a = iVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = k6.Mj;
        canvas.drawColor(i0.a.d(0.5f, k6.v0(i10, g6Var), k6.v0(k6.h5, g6Var)));
        iVar.setBackgroundBitmap(createBitmap);
        gg.a aVar = iVar.b;
        aVar.w = i10;
        aVar.x = k6.Lj;
        aVar.b();
        f10.addView(iVar, c6.q(160, 160, 1));
        p pVar = new p(this, context);
        this.b = pVar;
        this.h = new Paint[20];
        a(0.0f);
        o2 o2Var = pVar.a;
        o2Var.q = false;
        o2Var.K = false;
        o2Var.L = true;
        o2Var.H = true;
        o2Var.l = new eg.y(this, 1);
        o2Var.c();
        iVar.setStarParticlesView(pVar);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.g(22.0f, 1, textView);
        int i11 = k6.G6;
        textView.setTextColor(k6.v0(i11, g6Var));
        textView.setGravity(1);
        f10.addView(textView, c6.t(-2, -2, 1, 24, -8, 24, 0));
        d90 d90Var = new d90(this);
        this.f = d90Var;
        g90 g90Var = new g90(context, d90Var, g6Var);
        this.d = g90Var;
        g90Var.setTextSize(1, 15.0f);
        g90Var.setGravity(17);
        g90Var.setTextColor(k6.v0(i11, g6Var));
        g90Var.setMovementMethod(LinkMovementMethod.getInstance());
        g90Var.setLinkTextColor(k6.v0(k6.J6, g6Var));
        g90Var.setImportantForAccessibility(2);
        f10.addView(g90Var, c6.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(pVar, c6.e(-1, 234, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i10 = k6.Lj;
        g6 g6Var = this.e;
        int v02 = k6.v0(i10, g6Var);
        int v03 = k6.v0(k6.Mj, g6Var);
        int d = i0.a.d(f10, v02, -371690);
        int d10 = i0.a.d(f10, v03, -14281);
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
        d90 d90Var = this.f;
        if (d90Var != null) {
            canvas.save();
            g90 g90Var = this.d;
            canvas.translate(g90Var.getLeft(), g90Var.getTop());
            if (d90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        fg.i iVar = this.a;
        p pVar = this.b;
        pVar.setTranslationY(((iVar.getMeasuredHeight() / 2.0f) + iVar.getTop()) - (pVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new q());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = k6.a7;
        g6 g6Var = this.e;
        setBackgroundColor(k6.v0(i10, g6Var));
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        g90 g90Var = this.d;
        g90Var.setText(formatString);
        g90Var.setTextColor(k6.v0(k6.r5, g6Var));
    }

    public void setPaused(boolean z4) {
        this.a.setPaused(z4);
        this.b.setPaused(z4);
    }

    public void setStars(final boolean z4) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        fg.i iVar = this.a;
        final float f10 = iVar.b.i;
        final float f11 = z4 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(iVar.R);
        iVar.d();
        iVar.i();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jg.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f12 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                s sVar = s.this;
                fg.i iVar2 = sVar.a;
                iVar2.b.i = AndroidUtilities.lerp(f10, f11, floatValue);
                gg.a aVar = iVar2.b;
                aVar.f = (f12 * 360.0f * (z4 ? 1 : -1)) + aVar.f;
                aVar.b();
                sVar.a(iVar2.b.i);
            }
        });
        this.n.addListener(new r(this, fArr, f10, f11, z4));
        this.n.setDuration(680L);
        this.n.setInterpolator(pr.h);
        this.n.start();
    }
}
