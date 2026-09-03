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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.s01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class x6 extends LinearLayout {
    public TextView a;
    public f90 b;
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
        f90 f90Var = this.b;
        TextView textView2 = this.a;
        TextView textView3 = this.d;
        this.e = i10;
        if (i10 != 0) {
            if (i10 == 1) {
                textView2.setText(LocaleController.getString(R.string.YourPasswordHeader));
                f90Var.setText(LocaleController.getString(R.string.YourPasswordRemember));
                textView.setText(LocaleController.getString(R.string.YourPasswordRememberYes));
                textView3.setVisibility(0);
                textView3.setText(LocaleController.getString(R.string.YourPasswordRememberNo));
                return;
            }
            if (i10 == 2) {
                textView2.setText(LocaleController.getString(R.string.GraceSuggestionTitle));
                f90Var.setText(LocaleController.getString(R.string.GraceSuggestionMessage));
                textView.setText(LocaleController.getString(R.string.GraceSuggestionButton));
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        textView2.setText(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.y3.j(new StringBuilder("+"), MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).clientUserId)).phone, se.b.c())));
        String string = LocaleController.getString(R.string.CheckPhoneNumberInfo);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf("**");
        int lastIndexOf = string.lastIndexOf("**");
        if (indexOf >= 0 && lastIndexOf >= 0 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 2, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) "");
            try {
                spannableStringBuilder.setSpan(new m51(LocaleController.getString(R.string.CheckPhoneNumberLearnMoreUrl), (s01) null), indexOf, lastIndexOf - 2, 33);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        f90Var.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
        textView3.setVisibility(0);
        textView3.setText(LocaleController.getString(R.string.CheckPhoneNumberNo));
    }
}
