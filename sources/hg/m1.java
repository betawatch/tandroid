package hg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ci.t6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.m10;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class m1 extends FrameLayout {
    public final g6 a;
    public final j9 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public m1(Context context, g6 g6Var) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = g6Var;
        setWillNotDraw(false);
        j9 j9Var = new j9(this, false);
        this.b = j9Var;
        j9Var.l = true;
        j9Var.p = AndroidUtilities.dp(75.0f);
        j9Var.o = AndroidUtilities.dp(48.0f);
        j9Var.x = true;
        j9Var.s = AndroidUtilities.dp(22.0f);
        int i10 = 0;
        while (i10 < 2) {
            this.c[i10] = new TextView(context);
            r6.W(this.c[i10], k6.G6, g6Var);
            this.c[i10].setTypeface(AndroidUtilities.bold());
            this.c[i10].setTextSize(1, 14.0f);
            int i11 = 8;
            this.c[i10].setVisibility(i10 == 0 ? 0 : 8);
            addView(this.c[i10], z5.d(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i10] = new TextView(context);
            r6.W(this.d[i10], k6.z6, g6Var);
            this.d[i10].setTextSize(1, 12.0f);
            TextView textView = this.d[i10];
            if (i10 == 0) {
                i11 = 0;
            }
            textView.setVisibility(i11);
            addView(this.d[i10], z5.d(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i10++;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        r6.t(imageView, k6.P5, g6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, z5.d(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(t6 t6Var) {
        String str;
        j9 j9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = t6Var.i;
            str = t6Var.D;
            int size = arrayList.size();
            j9Var = this.b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) t6Var.i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            j9Var.l(i11, messageObject.storyItem, t6Var.c);
            i11++;
            i10++;
        }
        j9Var.k(i11);
        j9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", t6Var.J));
        } else {
            textViewArr[0].setText(c(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", t6Var.J, si.o0.h("@", str))));
        }
        this.d[0].setText(LocaleController.formatString(R.string.HashtagStoriesFoundSubtitle, t6Var.C));
        return i11 > 0;
    }

    public final void b(int i10, String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str2);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[1].setText(LocaleController.formatPluralStringSpaced("HashtagMessagesFound", i10));
        } else {
            textViewArr[1].setText(c(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, si.o0.h("@", str2))));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i10 = k6.Oh;
        g6 g6Var = this.a;
        SpannableStringBuilder replaceSingleLinkKey = AndroidUtilities.replaceSingleLinkKey(str, i10, g6Var, null);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) replaceSingleLinkKey.getSpans(0, replaceSingleLinkKey.length(), CharacterStyle.class);
            for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                int spanStart = replaceSingleLinkKey.getSpanStart(characterStyleArr[i11]);
                int spanEnd = replaceSingleLinkKey.getSpanEnd(characterStyleArr[i11]);
                replaceSingleLinkKey.removeSpan(characterStyleArr[i11]);
                replaceSingleLinkKey.setSpan(new m10(k6.Oh, g6Var), spanStart, spanEnd, 0);
            }
            return replaceSingleLinkKey;
        } catch (Exception e) {
            FileLog.e(e);
            return replaceSingleLinkKey;
        }
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
        Paint V0 = k6.V0("paintDivider", this.a);
        if (V0 == null) {
            V0 = k6.k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), V0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
