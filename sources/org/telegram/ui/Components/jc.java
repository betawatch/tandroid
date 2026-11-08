package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class jc extends w70 {
    public final Path L;
    public final RectF M;
    public kc N;
    public kc O;

    public jc(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.L = new Path();
        this.M = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.O == null || getMeasuredWidth() <= 0) {
            return;
        }
        SpannableString spannableString = new SpannableString(" btn");
        spannableString.setSpan(this.O, 1, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.O.a()) - org.telegram.messenger.g0.L(4.0f), TextUtils.TruncateAt.END));
        spannableStringBuilder.append((CharSequence) spannableString);
        setText(spannableStringBuilder);
        this.O = null;
    }

    @Override // org.telegram.ui.Components.w70, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        kc kcVar;
        Runnable runnable;
        kc kcVar2;
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - getPaddingLeft();
        int y10 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null && y10 >= 0 && y10 < layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(y10);
            Spanned spanned = (Spanned) getText();
            kc[] kcVarArr = (kc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), kc.class);
            for (int i7 = 0; i7 < kcVarArr.length; i7++) {
                kcVar = kcVarArr[i7];
                int spanStart = spanned.getSpanStart(kcVar);
                int spanEnd = spanned.getSpanEnd(kcVar);
                Path path = this.L;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = this.M;
                path.computeBounds(rectF, true);
                if (rectF.contains(x10, y10)) {
                    break;
                }
            }
        }
        kcVar = null;
        if (action == 0) {
            this.N = kcVar;
            if (kcVar != null) {
                kcVar.c(this, true);
                return true;
            }
        } else if (action == 1 || action == 3) {
            kc kcVar3 = this.N;
            if (kcVar3 != null) {
                kcVar3.c(this, false);
                if (action == 1 && (runnable = this.N.d) != null) {
                    runnable.run();
                }
            }
            this.N = null;
        } else if (action == 2 && (kcVar2 = this.N) != null && kcVar2 != kcVar) {
            kcVar2.c(this, false);
            this.N = null;
        }
        return this.N != null || super.onTouchEvent(motionEvent);
    }

    public jc(Context context) {
        super(context, null);
        this.L = new Path();
        this.M = new RectF();
    }
}
