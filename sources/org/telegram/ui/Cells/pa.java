package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pa extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final oa d;
    public final oa e;

    public pa(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
        linearLayout.addView(textView, i7.f6.p(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(AndroidUtilities.dpf2(2.0f), 1.0f);
        linearLayout.addView(textView2, i7.f6.p(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), i7.f6.o(-2, 1, 17.0f, 1));
        oa oaVar = new oa(activity);
        this.d = oaVar;
        oaVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        oaVar.setTypeface(AndroidUtilities.bold());
        oaVar.setTextSize(1, 14.22f);
        oaVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
        linearLayout2.addView(oaVar, i7.f6.n(-2, 30));
        linearLayout2.addView(new Space(activity), i7.f6.o(-2, 1, 17.0f, 1));
        oa oaVar2 = new oa(activity);
        this.e = oaVar2;
        oaVar2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        oaVar2.setTypeface(AndroidUtilities.bold());
        oaVar2.setTextSize(1, 14.22f);
        oaVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
        linearLayout2.addView(oaVar2, i7.f6.n(-2, 30));
        linearLayout2.addView(new Space(activity), i7.f6.o(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, i7.f6.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, i7.f6.e(-1, -1, 119));
        b();
    }

    public static String a(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth) {
        if (unconfirmedAuth == null) {
            return "";
        }
        String str = "" + unconfirmedAuth.device;
        if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str.isEmpty()) {
            str = str.concat(", ");
        }
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str);
        n10.append(unconfirmedAuth.location);
        return n10.toString();
    }

    public final void b() {
        this.b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y6, false));
        int i10 = org.telegram.ui.ActionBar.g6.I6;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        oa oaVar = this.d;
        oaVar.setTextColor(w02);
        oaVar.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.g6.w0(null, i10, false)), 7, AndroidUtilities.dp(8.0f)));
        int i11 = org.telegram.ui.ActionBar.g6.q7;
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        oa oaVar2 = this.e;
        oaVar2.setTextColor(w03);
        oaVar2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(org.telegram.ui.ActionBar.g6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.g6.w0(null, i11, false)), 7, AndroidUtilities.dp(8.0f)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        if (size <= 0) {
            size = AndroidUtilities.displaySize.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31);
        LinearLayout linearLayout = this.a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, TLObject.FLAG_30));
    }
}
