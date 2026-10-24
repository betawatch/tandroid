package org.telegram.ui.Cells;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ta extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int n = 0;
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final sa d;
    public final sa e;
    public int f;
    public int h;

    public ta(Activity activity) {
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
        linearLayout.addView(textView, w7.z5.p(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(AndroidUtilities.dpf2(2.0f), 1.0f);
        linearLayout.addView(textView2, w7.z5.p(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), w7.z5.o(-2, 1, 17.0f, 1));
        sa saVar = new sa(activity);
        this.d = saVar;
        saVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        saVar.setTypeface(AndroidUtilities.bold());
        saVar.setTextSize(1, 14.22f);
        saVar.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
        linearLayout2.addView(saVar, w7.z5.n(-2, 30));
        linearLayout2.addView(new Space(activity), w7.z5.o(-2, 1, 17.0f, 1));
        sa saVar2 = new sa(activity);
        this.e = saVar2;
        saVar2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        saVar2.setTypeface(AndroidUtilities.bold());
        saVar2.setTextSize(1, 14.22f);
        saVar2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
        linearLayout2.addView(saVar2, w7.z5.n(-2, 30));
        linearLayout2.addView(new Space(activity), w7.z5.o(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, w7.z5.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, w7.z5.e(-1, -1, 119));
        updateColors();
    }

    public static String a(UnconfirmedAuthController.UnconfirmedAuth unconfirmedAuth) {
        if (unconfirmedAuth == null) {
            return "";
        }
        String str = "" + unconfirmedAuth.device;
        if (!TextUtils.isEmpty(unconfirmedAuth.location) && !str.isEmpty()) {
            str = str.concat(", ");
        }
        StringBuilder u10 = a1.g.u(str);
        u10.append(unconfirmedAuth.location);
        return u10.toString();
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        TextView textView;
        sa saVar;
        sa saVar2;
        TextView textView2 = this.b;
        if (textView2 == null || (textView = this.c) == null || (saVar = this.d) == null || (saVar2 = this.e) == null) {
            return;
        }
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false));
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        saVar.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int o12 = org.telegram.ui.ActionBar.k6.o1(org.telegram.ui.ActionBar.k6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        if (saVar.getBackground() == null) {
            saVar.setBackground(org.telegram.ui.ActionBar.k6.g0(o12, 7, AndroidUtilities.dp(8.0f)));
        } else if (o12 != this.f) {
            org.telegram.ui.ActionBar.k6.E1(saVar.getBackground(), o12, true);
        }
        int i11 = org.telegram.ui.ActionBar.k6.q7;
        saVar2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        int o13 = org.telegram.ui.ActionBar.k6.o1(org.telegram.ui.ActionBar.k6.I.q() ? 0.3f : 0.15f, org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        if (saVar2.getBackground() == null) {
            saVar2.setBackground(org.telegram.ui.ActionBar.k6.g0(o13, 7, AndroidUtilities.dp(8.0f)));
        } else if (o13 != this.h) {
            org.telegram.ui.ActionBar.k6.E1(saVar2.getBackground(), o13, true);
        }
        this.f = o12;
        this.h = o13;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
