package ag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l extends FrameLayout {
    public final n9 a;
    public final c20 b;
    public final int c;
    public final /* synthetic */ o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Context context) {
        super(context);
        this.d = oVar;
        c20 c20Var = new c20();
        this.b = c20Var;
        int i10 = oVar.f;
        c6 c6Var = oVar.a;
        if (i10 == 0) {
            this.c = AndroidUtilities.dp(150.0f);
            n9 n9Var = new n9(context);
            this.a = n9Var;
            n9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(n9Var, z5.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            y8 y8Var = new y8((c6) null);
            y8Var.r(currentUser);
            n9Var.getImageReceiver().setForUserOrChat(currentUser, y8Var);
            TextView textView = new TextView(context);
            pa.m(20.0f, 1, textView);
            textView.setTextColor(g6.v0(g6.G6, c6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, z5.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            c20Var.m = true;
            c20Var.a = true;
            c20Var.d(g6.w0(null, g6.Mj, false), g6.w0(null, g6.Lj, false), 0, 0);
            c20Var.c.setStyle(Paint.Style.STROKE);
            c20Var.c.setStrokeCap(Paint.Cap.ROUND);
            c20Var.c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
            return;
        }
        if (i10 == 1) {
            j jVar = new j(context, 0);
            addView(jVar, z5.e(-1, 190, 55));
            k kVar = new k(context, 1, 1, 0);
            kVar.setStarParticlesView(jVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = g6.Mj;
            canvas.drawColor(i0.b.d(0.5f, g6.v0(i11, c6Var), g6.v0(g6.h5, c6Var)));
            kVar.setBackgroundBitmap(createBitmap);
            bg.a aVar = kVar.b;
            aVar.w = i11;
            aVar.x = g6.Lj;
            aVar.b();
            addView(kVar, z5.e(160, 160, 1));
            kVar.j(100L);
            TextView h = org.telegram.messenger.y1.h(context, 1, 20.0f);
            h.setTypeface(AndroidUtilities.bold());
            h.setTextColor(g6.v0(g6.G6, c6Var));
            rl.i(R.string.TelegramBusiness, h, 17);
            addView(h, z5.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(g6.v0(g6.z6, c6Var));
            rl.i(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, z5.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
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
            c20 c20Var = this.b;
            c20Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f11 = (i10 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(AndroidUtilities.rectTmp, f13, ((f11 + f10) - f12) - f13, false, c20Var.c);
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
