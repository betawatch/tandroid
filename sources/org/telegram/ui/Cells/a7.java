package org.telegram.ui.Cells;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.z51;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class a7 extends LinearLayout {
    public TextView a;
    public n90 b;
    public TextView c;
    public TextView d;
    public int e;
    public int f;

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setType(int i10) {
        int i11 = this.f;
        TextView textView = this.c;
        n90 n90Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i10;
        if (i10 != 0) {
            if (i10 == 1) {
                textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
                n90Var.setText(LocaleController.getString(R.string.YourPasswordRemember));
                textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
                textView3.setVisibility(0);
                textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
                return;
            }
            if (i10 == 2) {
                textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
                n90Var.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
                textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, ok.h(new StringBuilder("+"), MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).clientUserId)).phone, gf.b.c())));
        String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf("**");
        int lastIndexOf = string.lastIndexOf("**");
        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new z51(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), (b11) null), indexOf, lastIndexOf - 2, 33);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        n90Var.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        textView3.setVisibility(0);
        textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
    }
}
