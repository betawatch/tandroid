package ig;

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
import eg.p2;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class s extends FrameLayout {
    public final eg.i a;
    public final p b;
    public final TextView c;
    public final e90 d;
    public final f6 e;
    public final b90 f;
    public final Paint[] h;
    public ValueAnimator n;

    public s(Context context, f6 f6Var) {
        super(context);
        this.e = f6Var;
        LinearLayout f10 = y3.f(context, 1);
        eg.i iVar = new eg.i(context, 1, 0, 2);
        this.a = iVar;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i10 = j6.Mj;
        canvas.drawColor(i0.a.d(0.5f, j6.v0(i10, f6Var), j6.v0(j6.h5, f6Var)));
        iVar.setBackgroundBitmap(createBitmap);
        fg.a aVar = iVar.b;
        aVar.w = i10;
        aVar.x = j6.Lj;
        aVar.b();
        f10.addView(iVar, b6.q(160, 160, 1));
        p pVar = new p(this, context);
        this.b = pVar;
        this.h = new Paint[20];
        a(0.0f);
        p2 p2Var = pVar.a;
        p2Var.q = false;
        p2Var.K = false;
        p2Var.L = true;
        p2Var.H = true;
        p2Var.l = new dg.a0(this, 1);
        p2Var.c();
        iVar.setStarParticlesView(pVar);
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.g(22.0f, 1, textView);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setGravity(1);
        f10.addView(textView, b6.t(-2, -2, 1, 24, -8, 24, 0));
        b90 b90Var = new b90(this);
        this.f = b90Var;
        e90 e90Var = new e90(context, b90Var, f6Var);
        this.d = e90Var;
        e90Var.setTextSize(1, 15.0f);
        e90Var.setGravity(17);
        e90Var.setTextColor(j6.v0(i11, f6Var));
        e90Var.setMovementMethod(LinkMovementMethod.getInstance());
        e90Var.setLinkTextColor(j6.v0(j6.J6, f6Var));
        e90Var.setImportantForAccessibility(2);
        f10.addView(e90Var, b6.d(-1, -2.0f, 17, 24.0f, 8.0f, 24.0f, 18.0f));
        setClipChildren(false);
        addView(pVar, b6.e(-1, 234, 48));
        addView(f10);
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        int i10 = j6.Lj;
        f6 f6Var = this.e;
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.Mj, f6Var);
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
        b90 b90Var = this.f;
        if (b90Var != null) {
            canvas.save();
            e90 e90Var = this.d;
            canvas.translate(e90Var.getLeft(), e90Var.getTop());
            if (b90Var.f(canvas)) {
                invalidate();
            }
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        eg.i iVar = this.a;
        p pVar = this.b;
        pVar.setTranslationY(((iVar.getMeasuredHeight() / 2.0f) + iVar.getTop()) - (pVar.getMeasuredHeight() / 2.0f));
    }

    public void setBoostViaGifsText(TLRPC.Chat chat) {
        setOutlineProvider(new q());
        setClipToOutline(true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = -AndroidUtilities.dp(6.0f);
        setLayoutParams(marginLayoutParams);
        int i10 = j6.a7;
        f6 f6Var = this.e;
        setBackgroundColor(j6.v0(i10, f6Var));
        this.c.setText(LocaleController.formatString("BoostingBoostsViaGifts", R.string.BoostingBoostsViaGifts, new Object[0]));
        String formatString = LocaleController.formatString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoost2 : R.string.BoostingGetMoreBoostGroup, new Object[0]);
        e90 e90Var = this.d;
        e90Var.setText(formatString);
        e90Var.setTextColor(j6.v0(j6.r5, f6Var));
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
        eg.i iVar = this.a;
        final float f10 = iVar.b.i;
        final float f11 = z4 ? 1.0f : 0.0f;
        this.n = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float[] fArr = {0.0f};
        AndroidUtilities.cancelRunOnUIThread(iVar.R);
        iVar.d();
        iVar.i();
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ig.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float[] fArr2 = fArr;
                float f12 = floatValue - fArr2[0];
                fArr2[0] = floatValue;
                s sVar = s.this;
                eg.i iVar2 = sVar.a;
                iVar2.b.i = AndroidUtilities.lerp(f10, f11, floatValue);
                fg.a aVar = iVar2.b;
                aVar.f = (f12 * 360.0f * (z4 ? 1 : -1)) + aVar.f;
                aVar.b();
                sVar.a(iVar2.b.i);
            }
        });
        this.n.addListener(new r(this, fArr, f10, f11, z4));
        this.n.setDuration(680L);
        this.n.setInterpolator(nr.h);
        this.n.start();
    }
}
