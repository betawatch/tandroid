package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.d3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l1 extends LinearLayout implements p6 {
    public final u6 a;
    public final ea0 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public l1(Context context, u6 u6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = u6Var;
        setOrientation(1);
        ea0 ea0Var = new ea0();
        this.b = ea0Var;
        int i10 = y6.G6;
        int w02 = y6.w0(i10, u6Var);
        ea0Var.g(y6.o1(0.05f, w02), y6.o1(0.15f, w02), y6.o1(0.1f, w02), y6.o1(0.3f, w02));
        ea0Var.k(4.0f);
        ea0Var.x.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        f7.V(textView, i10, u6Var);
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        addView(textView, kb1.x(-1, -2, 55, z10 ? 70 : 18, 10, z10 ? 18 : 70, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        f7.V(textView2, y6.z6, u6Var);
        d3.o(R.string.BusinessProfileLocation, textView2, 1, 13.0f);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, kb1.x(-1, -2, 55, z11 ? 70 : 18, 0, z11 ? 18 : 70, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.c.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(tL_businessLocation.geo_point, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), "44_44", this.b, 0L, (String) null, (Object) null, 0);
            } else {
                this.c.setImageBitmap((Drawable) null);
            }
        }
        this.e = z10;
        setPadding(0, 0, 0, z10 ? 1 : 0);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float dp = LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : getWidth() - AndroidUtilities.dp(60.0f);
        float dp2 = AndroidUtilities.dp(8.0f);
        float dp3 = AndroidUtilities.dp(44.0f);
        float dp4 = AndroidUtilities.dp(44.0f);
        ImageReceiver imageReceiver = this.c;
        imageReceiver.setImageCoords(dp, dp2, dp3, dp4);
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.e) {
            Paint V0 = y6.V0("paintDivider", this.a);
            if (V0 == null) {
                V0 = y6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 21.33f : 0.0f), getMeasuredHeight(), V0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        ea0 ea0Var = this.b;
        if (ea0Var != null) {
            try {
                int w02 = y6.w0(y6.G6, this.a);
                ea0Var.g(y6.o1(0.05f, w02), y6.o1(0.15f, w02), y6.o1(0.1f, w02), y6.o1(0.3f, w02));
                invalidate();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
