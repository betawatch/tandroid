package hg;

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
import bi.d8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.k9;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout {
    public final f6 a;
    public final k9 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public n1(Context context, f6 f6Var) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = f6Var;
        setWillNotDraw(false);
        k9 k9Var = new k9(this, false);
        this.b = k9Var;
        k9Var.l = true;
        k9Var.p = AndroidUtilities.dp(75.0f);
        k9Var.o = AndroidUtilities.dp(48.0f);
        k9Var.x = true;
        k9Var.s = AndroidUtilities.dp(22.0f);
        int i10 = 0;
        while (i10 < 2) {
            this.c[i10] = new TextView(context);
            this.c[i10].setTextColor(j6.v0(j6.G6, f6Var));
            this.c[i10].setTypeface(AndroidUtilities.bold());
            this.c[i10].setTextSize(1, 14.0f);
            int i11 = 8;
            this.c[i10].setVisibility(i10 == 0 ? 0 : 8);
            addView(this.c[i10], x5.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i10] = new TextView(context);
            this.d[i10].setTextColor(j6.v0(j6.z6, f6Var));
            this.d[i10].setTextSize(1, 12.0f);
            TextView textView = this.d[i10];
            if (i10 == 0) {
                i11 = 0;
            }
            textView.setVisibility(i11);
            addView(this.d[i10], x5.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i10++;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.P5, f6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, x5.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(d8 d8Var) {
        String str;
        k9 k9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = d8Var.i;
            str = d8Var.D;
            int size = arrayList.size();
            k9Var = this.b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) d8Var.i.get(i10);
            long j3 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            k9Var.l(i11, messageObject.storyItem, d8Var.c);
            i11++;
            i10++;
        }
        k9Var.k(i11);
        k9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", d8Var.J));
        } else {
            textViewArr[0].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", d8Var.J, "@" + str), j6.v0(j6.Oh, this.a), null));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, d8Var.C));
        return i11 > 0;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        } else {
            textViewArr[1].setText(AndroidUtilities.replaceSingleLink(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, p6.i("@", str2)), j6.v0(j6.Oh, this.a), null));
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
        Paint T0 = j6.T0("paintDivider", this.a);
        if (T0 == null) {
            T0 = j6.k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), T0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
