package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.l4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t extends TextView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                super.dispatchDraw(canvas);
                canvas.drawCircle(AndroidUtilities.dp(3.5f), AndroidUtilities.dp(11.5f), AndroidUtilities.dp(2.5f), getPaint());
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        switch (this.a) {
            case 0:
                return Button.class.getName();
            case 15:
                return Button.class.getName();
            case 16:
                return Button.class.getName();
            case 17:
                return Button.class.getName();
            case 18:
                return Button.class.getName();
            case 19:
                return Button.class.getName();
            case 20:
                return Button.class.getName();
            case 21:
                return Button.class.getName();
            case 22:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 5:
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, l4.n1);
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(220.0f)), View.MeasureSpec.getMode(i9)), i10);
                break;
            case 11:
                if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout = getLayout();
                    int i11 = 0;
                    for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                        i11 = Math.max(i11, (int) Math.ceil(layout.getLineWidth(i12)));
                    }
                    i9 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i11, TLObject.FLAG_30);
                }
                super.onMeasure(i9, i10);
                break;
            case 12:
                if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout2 = getLayout();
                    int i13 = 0;
                    for (int i14 = 0; i14 < layout2.getLineCount(); i14++) {
                        i13 = Math.max(i13, (int) Math.ceil(layout2.getLineWidth(i14)));
                    }
                    i9 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i13, TLObject.FLAG_30);
                }
                super.onMeasure(i9, i10);
                break;
            case 13:
                if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && getLayout() != null) {
                    Layout layout3 = getLayout();
                    int i15 = 0;
                    for (int i16 = 0; i16 < layout3.getLineCount(); i16++) {
                        i15 = Math.max(i15, (int) Math.ceil(layout3.getLineWidth(i16)));
                    }
                    i9 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + i15, TLObject.FLAG_30);
                }
                super.onMeasure(i9, i10);
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i9), (int) (AndroidUtilities.displaySize.x * 0.45f)), TLObject.FLAG_31), i10);
                break;
            case 23:
                super.onMeasure(i9, i10);
                try {
                    Layout layout4 = getLayout();
                    if (layout4.getLineCount() <= 1) {
                        break;
                    } else {
                        int i17 = 0;
                        for (int lineCount = layout4.getLineCount() - 1; lineCount >= 0; lineCount--) {
                            i17 = Math.max(i17, Math.round(layout4.getPaint().measureText(getText(), layout4.getLineStart(lineCount), layout4.getLineEnd(lineCount))));
                        }
                        super.onMeasure(Math.min(i17 + getPaddingLeft() + getPaddingRight(), getMeasuredWidth()) | TLObject.FLAG_30, 1073741824 | getMeasuredHeight());
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 24:
                super.onMeasure(i9, i10);
                break;
            case 26:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(8.0f)) / 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
                break;
            case 27:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(8.0f)) / 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), TLObject.FLAG_30));
                break;
            case 28:
                if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
                    i9 = ll.d(52.0f, View.MeasureSpec.getSize(i9), TLObject.FLAG_31);
                }
                super.onMeasure(i9, i10);
                break;
            case 29:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), TLObject.FLAG_31));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 4:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 5:
            default:
                super.setText(charSequence, bufferType);
                break;
            case 6:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 7:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 8:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
            case 9:
                super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), bufferType);
                break;
        }
    }
}
