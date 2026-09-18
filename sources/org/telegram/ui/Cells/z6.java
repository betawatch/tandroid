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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.p01;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class z6 extends LinearLayout {
    public TextView a;
    public c90 b;
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
        c90 c90Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i10;
        if (i10 != 0) {
            if (i10 == 1) {
                textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
                c90Var.setText(LocaleController.getString(R.string.YourPasswordRemember));
                textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
                textView3.setVisibility(0);
                textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
                return;
            }
            if (i10 == 2) {
                textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
                c90Var.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
                textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.w1.j(new StringBuilder("+"), MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).clientUserId)).phone, gf.b.c())));
        String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf("**");
        int lastIndexOf = string.lastIndexOf("**");
        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new n51(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), (p01) null), indexOf, lastIndexOf - 2, 33);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        c90Var.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        textView3.setVisibility(0);
        textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
    }
}
