package cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.t9;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j extends FrameLayout {
    public final t9 a;
    public final k20 b;
    public final int c;
    public final /* synthetic */ m d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Context context) {
        super(context);
        this.d = mVar;
        k20 k20Var = new k20();
        this.b = k20Var;
        int i10 = mVar.f;
        c6 c6Var = mVar.a;
        if (i10 == 0) {
            this.c = AndroidUtilities.dp(150.0f);
            t9 t9Var = new t9(context);
            this.a = t9Var;
            t9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(t9Var, f6.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            e9 e9Var = new e9((c6) null);
            e9Var.r(currentUser);
            t9Var.getImageReceiver().setForUserOrChat(currentUser, e9Var);
            TextView textView = new TextView(context);
            th.n(20.0f, 1, textView);
            textView.setTextColor(g6.v0(g6.G6, c6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, f6.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            k20Var.m = true;
            k20Var.a = true;
            k20Var.d(g6.w0(null, g6.Mj, false), g6.w0(null, g6.Lj, false), 0, 0);
            k20Var.c.setStyle(Paint.Style.STROKE);
            k20Var.c.setStrokeCap(Paint.Cap.ROUND);
            k20Var.c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
            return;
        }
        if (i10 == 1) {
            h hVar = new h(context, 0);
            addView(hVar, f6.e(-1, 190, 55));
            i iVar = new i(context, 1, 1, 0);
            iVar.setStarParticlesView(hVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = g6.Mj;
            canvas.drawColor(i0.a.d(0.5f, g6.v0(i11, c6Var), g6.v0(g6.h5, c6Var)));
            iVar.setBackgroundBitmap(createBitmap);
            dg.a aVar = iVar.b;
            aVar.w = i11;
            aVar.x = g6.Lj;
            aVar.b();
            addView(iVar, f6.e(160, 160, 1));
            iVar.j(100L);
            TextView h = x3.h(context, 1, 20.0f);
            h.setTypeface(AndroidUtilities.bold());
            h.setTextColor(g6.v0(g6.G6, c6Var));
            org.telegram.ui.b.i(R.string.TelegramBusiness, h, 17);
            addView(h, f6.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(g6.v0(g6.z6, c6Var));
            org.telegram.ui.b.i(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, f6.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d.f == 0) {
            Rect rect = AndroidUtilities.rectTmp2;
            this.a.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            k20 k20Var = this.b;
            k20Var.c(rectF);
            float f9 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f10 = (i10 * f9) - 90.0f;
                float f11 = 5;
                float f12 = f10 + f11;
                canvas.drawArc(AndroidUtilities.rectTmp, f12, ((f10 + f9) - f11) - f12, false, k20Var.c);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.c;
        if (i12 > 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30);
        }
        super.onMeasure(i10, i11);
    }
}
