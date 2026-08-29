package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.yd0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i2 extends View {
    public final Paint a;
    public final TextPaint b;
    public final ArrayList c;
    public float[] d;
    public d1 e;
    public final /* synthetic */ k2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(k2 k2Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f = k2Var;
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        paint.setColor(436207615);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        textPaint.setTextSize(AndroidUtilities.dpf2(21.3f));
        textPaint.setColor(-1);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        setPadding(0, 0, 0, 0);
        if (k2Var.m0(4)) {
            f2 f2Var = new f2(this, 4, R.drawable.msg_limit_links, LocaleController.getString(R.string.StoryWidgetLink));
            i11 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
            if (!UserConfig.getInstance(i11).isPremium()) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                f2Var.j = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.l1(0.6f, -1), PorterDuff.Mode.SRC_IN));
                Paint paint2 = new Paint(1);
                f2Var.n = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            arrayList.add(f2Var);
        }
        if (k2Var.m0(0)) {
            arrayList.add(new f2(this, 0, R.drawable.map_pin3, LocaleController.getString(R.string.StoryWidgetLocation)));
        }
        if (k2Var.m0(5)) {
            dc dcVar = ec.b;
            f2[] f2VarArr = {null};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dcVar == null ? "🌤" : dcVar.c);
            sb2.append(" ");
            sb2.append(dcVar == null ? ec.b() ? "24°C" : "72°F" : dcVar.a());
            CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), textPaint.getFontMetricsInt(), false);
            i10 = ((org.telegram.ui.ActionBar.f3) k2Var).currentAccount;
            CharSequence charSequence = replaceEmoji;
            if (MessagesController.getInstance(i10).storyWeatherPreload) {
                charSequence = replaceEmoji;
                charSequence = replaceEmoji;
                if (yd0.f("android.permission.ACCESS_COARSE_LOCATION") && dcVar == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("___");
                    spannableStringBuilder.setSpan(new d90(AndroidUtilities.dp(68.0f), this), 0, spannableStringBuilder.length(), 33);
                    f2VarArr[0] = new f2(this, spannableStringBuilder);
                    ec.a(false, new ih.b1(9, this, f2VarArr));
                    charSequence = spannableStringBuilder;
                }
            }
            f2 f2Var2 = f2VarArr[0];
            arrayList.add(f2Var2 == null ? new f2(this, charSequence) : f2Var2);
        }
        if (k2Var.m0(1)) {
            arrayList.add(new f2(this, 1, R.drawable.filled_widget_music, LocaleController.getString(R.string.StoryWidgetAudio)));
        }
        if (k2Var.m0(2)) {
            arrayList.add(new f2(this, 2, R.drawable.filled_premium_camera, LocaleController.getString(R.string.StoryWidgetPhoto)));
        }
        if (k2Var.m0(3)) {
            arrayList.add(new h2(this));
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.c;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                float[] fArr = this.d;
                if (i11 >= fArr.length) {
                    break;
                }
                fArr[i11] = 0.0f;
                i11++;
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            e2 e2Var = (e2) obj;
            int i13 = e2Var.e - 1;
            float[] fArr2 = this.d;
            float f9 = fArr2[i13];
            if (f9 > 0.0f) {
                fArr2[i13] = f9 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i13] = fArr3[i13] + e2Var.h.d(e2Var.b, false);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            e2 e2Var2 = (e2) obj2;
            e2Var2.a(canvas, com.google.android.recaptcha.internal.a.A((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), this.d[e2Var2.e - 1], 2.0f, getPaddingLeft()) + e2Var2.d, org.telegram.messenger.x3.D(48.0f, e2Var2.e - 1, AndroidUtilities.dp(12.0f)));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((e2) obj).b(true);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((e2) obj).b(false);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        ArrayList arrayList = this.c;
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        float f9 = 0.0f;
        int i14 = 0;
        while (i14 < size2) {
            Object obj = arrayList.get(i14);
            i14++;
            e2 e2Var = (e2) obj;
            e2Var.d = f9;
            float dp = e2Var.b + AndroidUtilities.dp(10.0f) + f9;
            if (dp > paddingLeft) {
                i13++;
                e2Var.d = 0.0f;
                f9 = e2Var.b + AndroidUtilities.dp(10.0f) + 0.0f;
            } else {
                f9 = dp;
            }
            e2Var.e = i13;
        }
        float[] fArr = this.d;
        if (fArr == null || fArr.length != i13) {
            this.d = new float[i13];
        } else {
            Arrays.fill(fArr, 0.0f);
        }
        int size3 = arrayList.size();
        while (i12 < size3) {
            Object obj2 = arrayList.get(i12);
            i12++;
            e2 e2Var2 = (e2) obj2;
            int i15 = e2Var2.e - 1;
            float[] fArr2 = this.d;
            float f10 = fArr2[i15];
            if (f10 > 0.0f) {
                fArr2[i15] = f10 + AndroidUtilities.dp(10.0f);
            }
            float[] fArr3 = this.d;
            fArr3[i15] = fArr3[i15] + e2Var2.b;
        }
        setMeasuredDimension(size, org.telegram.messenger.x3.D(12.0f, i13 - 1, org.telegram.messenger.x3.D(36.0f, i13, AndroidUtilities.dp(24.0f))));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e2 e2Var;
        d1 d1Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                e2Var = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            e2Var = (e2) obj;
            if (e2Var.f.contains(motionEvent.getX(), motionEvent.getY())) {
                break;
            }
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            e2 e2Var2 = (e2) obj2;
            if (e2Var2 != e2Var) {
                e2Var2.g.c(false);
            }
        }
        if (e2Var != null) {
            e2Var.g.c((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) ? false : true);
        }
        if (motionEvent.getAction() == 1 && e2Var != null && (d1Var = this.e) != null) {
            d1Var.run(Integer.valueOf(e2Var.a));
        }
        return e2Var != null;
    }
}
