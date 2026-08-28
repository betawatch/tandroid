package of;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import g7.e6;
import ih.h6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i1 extends FrameLayout {
    public final b6 a;
    public final b9 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public i1(Context context, b6 b6Var) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = b6Var;
        setWillNotDraw(false);
        b9 b9Var = new b9(this, false);
        this.b = b9Var;
        b9Var.l = true;
        b9Var.p = AndroidUtilities.dp(75.0f);
        b9Var.o = AndroidUtilities.dp(48.0f);
        b9Var.x = true;
        b9Var.s = AndroidUtilities.dp(22.0f);
        int i9 = 0;
        while (i9 < 2) {
            this.c[i9] = new TextView(context);
            this.c[i9].setTextColor(f6.v0(f6.G6, b6Var));
            this.c[i9].setTypeface(AndroidUtilities.bold());
            this.c[i9].setTextSize(1, 14.0f);
            int i10 = 8;
            this.c[i9].setVisibility(i9 == 0 ? 0 : 8);
            addView(this.c[i9], e6.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i9] = new TextView(context);
            this.d[i9].setTextColor(f6.v0(f6.z6, b6Var));
            this.d[i9].setTextSize(1, 12.0f);
            TextView textView = this.d[i9];
            if (i9 == 0) {
                i10 = 0;
            }
            textView.setVisibility(i10);
            addView(this.d[i9], e6.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i9++;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.P5, b6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, e6.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(h6 h6Var) {
        String str;
        b9 b9Var;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = h6Var.i;
            str = h6Var.D;
            int size = arrayList.size();
            b9Var = this.b;
            if (i9 >= size || i10 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) h6Var.i.get(i9);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            b9Var.l(i10, messageObject.storyItem, h6Var.c);
            i10++;
            i9++;
        }
        b9Var.k(i10);
        b9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", h6Var.J));
        } else {
            textViewArr[0].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", h6Var.J, "@" + str), f6.v0(f6.Oh, this.a), null));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, h6Var.C));
        return i10 > 0;
    }

    public final void b(int i9, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i9));
        } else {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i9, ta.b.d("@", str2)), f6.v0(f6.Oh, this.a), null));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.e) * 255.0f), 31);
        } else {
            canvas.save();
        }
        canvas.translate(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), this.e), 0.0f);
        this.b.i(canvas);
        canvas.restore();
        super.onDraw(canvas);
        Paint T0 = f6.T0("paintDivider", this.a);
        if (T0 == null) {
            T0 = f6.k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
