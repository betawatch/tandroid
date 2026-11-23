package ai;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class u2 extends LinearLayout {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(400.0f), View.MeasureSpec.getSize(i7)), TLObject.FLAG_30), i10);
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
                break;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
                break;
            case 3:
            case 6:
            case 7:
            default:
                super.onMeasure(i7, i10);
                break;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
                break;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(220.0f), View.MeasureSpec.getSize(i7)), View.MeasureSpec.getMode(i7)), i10);
                break;
            case 9:
                super.onMeasure(i7, i10);
                setPivotY(0.0f);
                setPivotX(0.0f);
                break;
            case 10:
                super.onMeasure(i7, i10);
                setPivotY(0.0f);
                setPivotX(getMeasuredWidth());
                break;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(600.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), org.telegram.messenger.g0.L(800.0f)), TLObject.FLAG_30));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(Context context) {
        super(context);
        this.a = 12;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        int i7 = m6.G6;
        t6.U(textView, i7, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.N0(2131754944, null));
        addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        t6.U(textView2, i7, null);
        textView2.setText(org.telegram.messenger.g0.W2(hd.N0(2131754946, null)));
        addView(textView2, ma.q(-1, -2, 0.0f, 0, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        t6.U(textView3, i7, null);
        textView3.setText(org.telegram.messenger.g0.W2(hd.N0(2131754945, null)));
        addView(textView3, ma.q(-1, -2, 0.0f, 0, 0, 24, 0, 0));
    }
}
