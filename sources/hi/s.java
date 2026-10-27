package hi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s extends FrameLayout {
    public final u6 a;
    public final y9 b;
    public final j9 c;
    public final r5 d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final ImageView n;
    public boolean r;

    public s(Context context, int i10, u6 u6Var) {
        super(context);
        j9 j9Var = new j9((u6) null);
        this.c = j9Var;
        this.a = u6Var;
        y9 y9Var = new y9(context);
        this.b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(8.0f));
        j9Var.r = AndroidUtilities.dp(8.0f);
        addView(y9Var, kb1.h(28, 28.0f, (LocaleController.isRTL ? 5 : 3) | 16, 15.0f, 0.0f, 15.0f, 0.0f));
        r5 r5Var = new r5(AndroidUtilities.dp(28.0f), 7, y9Var, false);
        this.d = r5Var;
        r5Var.x = Integer.valueOf(i10);
        LinearLayout d = wh.d(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(y6.w0(y6.G6, u6Var));
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        d.addView(textView, kb1.r(-1, -2));
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(y6.w0(y6.y6, u6Var));
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        d.addView(textView2, kb1.o(0.0f, 2.0f, 0.0f, 0.0f, -1, -2));
        boolean z10 = LocaleController.isRTL;
        addView(d, kb1.h(-1, -2.0f, 23, z10 ? 56.0f : 61.0f, 0.0f, z10 ? 61.0f : 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.checkbig);
        int w02 = y6.w0(y6.Mh, u6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        addView(imageView, kb1.h(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setColorFilter(new PorterDuffColorFilter(y6.w0(y6.m6, u6Var), mode));
        if (LocaleController.isRTL) {
            imageView2.setScaleX(-1.0f);
        }
        addView(imageView2, kb1.h(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
        setWillNotDraw(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TL_agent.agentProvider agentprovider, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (agentprovider != null) {
            str = agentprovider.title;
        }
        this.e.setText(str);
        TextView textView = this.f;
        if (agentprovider == null) {
            textView.setText("");
        } else if (z10 || !agentprovider.models_searchable) {
            textView.setText(agentprovider.vendor);
        } else {
            textView.setText(LocaleController.getString(R.string.AgentHundredsOfModels));
        }
        y9 y9Var = this.b;
        r5 r5Var = this.d;
        if (agentprovider != null && (agentprovider.flags & 2) != 0) {
            long j10 = agentprovider.icon_emoji_id;
            if (j10 != 0) {
                r5Var.j(j10, false);
                y9Var.setImageDrawable(r5Var);
                this.h.setVisibility(!z11 ? 0 : 8);
                this.n.setVisibility(z12 ? 0 : 8);
                this.r = z13;
                invalidate();
            }
        }
        r5Var.i(null, false);
        long hashCode = str != null ? str.hashCode() : 0L;
        j9 j9Var = this.c;
        j9Var.n(hashCode, str, null);
        y9Var.setImageDrawable(j9Var);
        this.h.setVisibility(!z11 ? 0 : 8);
        this.n.setVisibility(z12 ? 0 : 8);
        this.r = z13;
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(61.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(61.0f) : 0), getMeasuredHeight() - 1, y6.V0("paintDivider", this.a));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }
}
