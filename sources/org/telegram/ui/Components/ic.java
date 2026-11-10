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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class ic extends w70 {
    public final Path L;
    public final RectF M;
    public jc N;
    public jc O;

    public ic(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
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
        jc jcVar;
        Runnable runnable;
        jc jcVar2;
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - getPaddingLeft();
        int y10 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null && y10 >= 0 && y10 < layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(y10);
            Spanned spanned = (Spanned) getText();
            jc[] jcVarArr = (jc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), jc.class);
            for (int i7 = 0; i7 < jcVarArr.length; i7++) {
                jcVar = jcVarArr[i7];
                int spanStart = spanned.getSpanStart(jcVar);
                int spanEnd = spanned.getSpanEnd(jcVar);
                Path path = this.L;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = this.M;
                path.computeBounds(rectF, true);
                if (rectF.contains(x10, y10)) {
                    break;
                }
            }
        }
        jcVar = null;
        if (action == 0) {
            this.N = jcVar;
            if (jcVar != null) {
                jcVar.c(this, true);
                return true;
            }
        } else if (action == 1 || action == 3) {
            jc jcVar3 = this.N;
            if (jcVar3 != null) {
                jcVar3.c(this, false);
                if (action == 1 && (runnable = this.N.d) != null) {
                    runnable.run();
                }
            }
            this.N = null;
        } else if (action == 2 && (jcVar2 = this.N) != null && jcVar2 != jcVar) {
            jcVar2.c(this, false);
            this.N = null;
        }
        return this.N != null || super.onTouchEvent(motionEvent);
    }

    public ic(Context context) {
        super(context, null);
        this.L = new Path();
        this.M = new RectF();
    }
}
