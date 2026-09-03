package eg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.z8;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class j extends FrameLayout {
    public final p9 a;
    public final q20 b;
    public final int c;
    public final /* synthetic */ m d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Context context) {
        super(context);
        this.d = mVar;
        q20 q20Var = new q20();
        this.b = q20Var;
        int i10 = mVar.f;
        f6 f6Var = mVar.a;
        if (i10 == 0) {
            this.c = AndroidUtilities.dp(150.0f);
            p9 p9Var = new p9(context);
            this.a = p9Var;
            p9Var.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(p9Var, b6.d(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            z8 z8Var = new z8((f6) null);
            z8Var.r(currentUser);
            p9Var.getImageReceiver().setForUserOrChat(currentUser, z8Var);
            TextView textView = new TextView(context);
            ai.o(20.0f, 1, textView);
            textView.setTextColor(j6.v0(j6.G6, f6Var));
            textView.setText(LocaleController.getString(R.string.UpgradedStories));
            addView(textView, b6.d(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            q20Var.m = true;
            q20Var.a = true;
            q20Var.d(j6.w0(null, j6.Mj, false), j6.w0(null, j6.Lj, false), 0, 0);
            q20Var.c.setStyle(Paint.Style.STROKE);
            q20Var.c.setStrokeCap(Paint.Cap.ROUND);
            q20Var.c.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
            return;
        }
        if (i10 == 1) {
            h hVar = new h(context, 0);
            addView(hVar, b6.e(-1, 190, 55));
            i iVar = new i(context, 1, 1, 0);
            iVar.setStarParticlesView(hVar);
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            int i11 = j6.Mj;
            canvas.drawColor(i0.a.d(0.5f, j6.v0(i11, f6Var), j6.v0(j6.h5, f6Var)));
            iVar.setBackgroundBitmap(createBitmap);
            fg.a aVar = iVar.b;
            aVar.w = i11;
            aVar.x = j6.Lj;
            aVar.b();
            addView(iVar, b6.e(160, 160, 1));
            iVar.j(100L);
            TextView g10 = y3.g(context, 1, 20.0f);
            g10.setTypeface(AndroidUtilities.bold());
            g10.setTextColor(j6.v0(j6.G6, f6Var));
            y3.r(R.string.TelegramBusiness, g10, 17);
            addView(g10, b6.d(-2, -2.0f, 1, 33.0f, 150.0f, 33.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(j6.z6, f6Var));
            y3.r(R.string.TelegramBusinessSubtitle2, textView2, 17);
            addView(textView2, b6.d(-2, -2.0f, 1, 33.0f, 183.0f, 33.0f, 20.0f));
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
            q20 q20Var = this.b;
            q20Var.c(rectF);
            float f10 = 360.0f / 7;
            for (int i10 = 0; i10 < 7; i10++) {
                float f11 = (i10 * f10) - 90.0f;
                float f12 = 5;
                float f13 = f11 + f12;
                canvas.drawArc(AndroidUtilities.rectTmp, f13, ((f11 + f10) - f12) - f13, false, q20Var.c);
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
