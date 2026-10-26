package ig;

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
import di.t6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.p10;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m1 extends FrameLayout {
    public final u6 a;
    public final l9 b;
    public final TextView[] c;
    public final TextView[] d;
    public float e;
    public ValueAnimator f;

    public m1(Context context, u6 u6Var) {
        super(context);
        this.c = new TextView[2];
        this.d = new TextView[2];
        this.a = u6Var;
        setWillNotDraw(false);
        l9 l9Var = new l9(this, false);
        this.b = l9Var;
        l9Var.l = true;
        l9Var.p = AndroidUtilities.dp(75.0f);
        l9Var.o = AndroidUtilities.dp(48.0f);
        l9Var.x = true;
        l9Var.s = AndroidUtilities.dp(22.0f);
        int i10 = 0;
        while (i10 < 2) {
            this.c[i10] = new TextView(context);
            f7.V(this.c[i10], y6.G6, u6Var);
            this.c[i10].setTypeface(AndroidUtilities.bold());
            this.c[i10].setTextSize(1, 14.0f);
            int i11 = 8;
            this.c[i10].setVisibility(i10 == 0 ? 0 : 8);
            addView(this.c[i10], gb1.h(-1, -2.0f, 48, 76.0f, 7.0f, 40.0f, 0.0f));
            this.d[i10] = new TextView(context);
            f7.V(this.d[i10], y6.z6, u6Var);
            this.d[i10].setTextSize(1, 12.0f);
            TextView textView = this.d[i10];
            if (i10 == 0) {
                i11 = 0;
            }
            textView.setVisibility(i11);
            addView(this.d[i10], gb1.h(-1, -2.0f, 48, 76.0f, 26.33f, 40.0f, 0.0f));
            i10++;
        }
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        f7.t(imageView, y6.P5, u6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 8.66f, 0.0f));
    }

    public final boolean a(t6 t6Var) {
        String str;
        l9 l9Var;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = t6Var.i;
            str = t6Var.D;
            int size = arrayList.size();
            l9Var = this.b;
            if (i10 >= size || i11 >= 3) {
                break;
            }
            MessageObject messageObject = (MessageObject) t6Var.i.get(i10);
            long j10 = messageObject.storyItem.dialogId;
            TextUtils.isEmpty(str);
            l9Var.l(i11, messageObject.storyItem, t6Var.c);
            i11++;
            i10++;
        }
        l9Var.k(i11);
        l9Var.b(false, true);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView[] textViewArr = this.c;
        if (isEmpty) {
            textViewArr[0].setText(LocaleController.formatPluralStringSpaced("HashtagStoriesFound", t6Var.J));
        } else {
            textViewArr[0].setText(c(LocaleController.formatPluralStringSpaced("HashtagStoriesFoundChannel", t6Var.J, b10.j("@", str))));
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
            textViewArr[1].setText(c(LocaleController.formatPluralStringSpaced("HashtagMessagesFoundChannel", i10, b10.j("@", str2))));
        }
        this.d[1].setText(LocaleController.formatString(R.string.HashtagMessagesFoundSubtitle, str));
    }

    public final SpannableStringBuilder c(String str) {
        int i10 = y6.Oh;
        u6 u6Var = this.a;
        SpannableStringBuilder replaceSingleLinkKey = AndroidUtilities.replaceSingleLinkKey(str, i10, u6Var, null);
        try {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) replaceSingleLinkKey.getSpans(0, replaceSingleLinkKey.length(), CharacterStyle.class);
            for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                int spanStart = replaceSingleLinkKey.getSpanStart(characterStyleArr[i11]);
                int spanEnd = replaceSingleLinkKey.getSpanEnd(characterStyleArr[i11]);
                replaceSingleLinkKey.removeSpan(characterStyleArr[i11]);
                replaceSingleLinkKey.setSpan(new p10(y6.Oh, u6Var), spanStart, spanEnd, 0);
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
        Paint V0 = y6.V0("paintDivider", this.a);
        if (V0 == null) {
            V0 = y6.k0;
        }
        canvas.drawRect(0.0f, getHeight() - 1, getWidth(), getHeight(), V0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), TLObject.FLAG_30));
    }
}
