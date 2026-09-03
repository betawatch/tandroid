package ig;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ut;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m extends LinearLayout {
    public final ut a;
    public final TextView b;
    public l c;

    public m(Context context, f6 f6Var) {
        super(context);
        setOrientation(0);
        ut utVar = new ut(context, f6Var);
        this.a = utVar;
        utVar.setLines(1);
        utVar.setSingleLine(true);
        InputFilter[] inputFilterArr = {new k(this)};
        utVar.setInputType(16384);
        utVar.setFilters(inputFilterArr);
        utVar.setTextSize(1, 16.0f);
        utVar.setTextColor(j6.v0(j6.Ud, f6Var));
        utVar.setLinkTextColor(j6.v0(j6.hc, f6Var));
        utVar.setHighlightColor(j6.v0(j6.uf, f6Var));
        int i10 = j6.Vd;
        utVar.setHintColor(j6.v0(i10, f6Var));
        utVar.setHintTextColor(j6.v0(i10, f6Var));
        utVar.setCursorColor(j6.v0(j6.Wd, f6Var));
        utVar.setHandlesColor(j6.v0(j6.vf, f6Var));
        utVar.setBackground(null);
        utVar.setHint(LocaleController.getString(R.string.BoostingGiveawayEnterYourPrize));
        utVar.addTextChangedListener(new dh.c(this, 2));
        utVar.setImeOptions(6);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.j5, f6Var));
        if (!LocaleController.isRTL) {
            addView(textView, b6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(utVar, b6.t(-1, -2, 16, 36, 0, 20, 0));
        } else {
            LinearLayout.LayoutParams t6 = b6.t(-1, -2, 16, 20, 0, 36, 0);
            t6.weight = 1.0f;
            addView(utVar, t6);
            addView(textView, b6.t(-2, -2, 16, 0, 0, 20, 0));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    public void setAfterTextChangedListener(l lVar) {
        this.c = lVar;
    }

    public void setCount(int i10) {
        this.b.setText(String.valueOf(i10));
    }
}
