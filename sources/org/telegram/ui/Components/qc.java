package org.telegram.ui.Components;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class qc extends l80 {
    public rc H;
    public rc I;

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.I == null || getMeasuredWidth() <= 0) {
            return;
        }
        SpannableString spannableString = new SpannableString(" btn");
        spannableString.setSpan(this.I, 1, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.ellipsize(getText(), getPaint(), (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - this.I.a()) - AndroidUtilities.dp(4.0f), TextUtils.TruncateAt.END));
        spannableStringBuilder.append((CharSequence) spannableString);
        setText(spannableStringBuilder);
        this.I = null;
    }

    @Override // org.telegram.ui.Components.l80, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Layout layout;
        rc rcVar;
        Runnable runnable;
        rc rcVar2;
        int action = motionEvent.getAction();
        float x10 = motionEvent.getX() - getPaddingLeft();
        int y10 = ((int) motionEvent.getY()) - getPaddingTop();
        if ((getText() instanceof Spanned) && (layout = getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(y10);
            Spanned spanned = (Spanned) getText();
            rc[] rcVarArr = (rc[]) spanned.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), rc.class);
            for (int i9 = 0; i9 < rcVarArr.length; i9++) {
                rcVar = rcVarArr[i9];
                float primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(rcVar));
                float primaryHorizontal2 = layout.getPrimaryHorizontal(spanned.getSpanEnd(rcVar));
                if (primaryHorizontal2 < primaryHorizontal) {
                    primaryHorizontal2 = primaryHorizontal;
                    primaryHorizontal = primaryHorizontal2;
                }
                if (x10 >= primaryHorizontal && x10 <= primaryHorizontal2) {
                    break;
                }
            }
        }
        rcVar = null;
        if (action == 0) {
            this.H = rcVar;
            if (rcVar != null) {
                rcVar.c(this, true);
                return true;
            }
        } else if (action == 1 || action == 3) {
            rc rcVar3 = this.H;
            if (rcVar3 != null) {
                rcVar3.c(this, false);
                if (action == 1 && (runnable = this.H.d) != null) {
                    runnable.run();
                }
            }
            this.H = null;
        } else if (action == 2 && (rcVar2 = this.H) != null && rcVar2 != rcVar) {
            rcVar2.c(this, false);
            this.H = null;
        }
        return this.H != null || super.onTouchEvent(motionEvent);
    }
}
