package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class po extends LinearLayout {
    public final org.telegram.ui.ActionBar.g6 a;
    public final TextView b;
    public final ArrayList c;
    public final ArrayList d;

    public po(Activity activity, View view, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.a = g6Var;
        int dp = AndroidUtilities.dp(18.0f);
        Paint d = g6Var != null ? g6Var.d("paintChatActionBackground") : null;
        d = d == null ? org.telegram.ui.ActionBar.k6.U0("paintChatActionBackground") : d;
        int i11 = org.telegram.ui.ActionBar.k6.a;
        setBackground(new org.telegram.ui.ActionBar.x5(this, view, dp, d));
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        setOrientation(1);
        if (i10 == 0) {
            TextView textView = new TextView(activity);
            this.b = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.ic, g6Var);
            textView.setGravity(1);
            textView.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView);
            addView(textView, w7.z5.q(-2, -2, 49));
        } else if (i10 == 1) {
            TextView textView2 = new TextView(activity);
            this.b = textView2;
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.ic, g6Var);
            textView2.setGravity(1);
            textView2.setMaxWidth(AndroidUtilities.dp(210.0f));
            arrayList.add(textView2);
            addView(textView2, w7.z5.q(-2, -2, 49));
        } else {
            bk0 bk0Var = new bk0(activity);
            bk0Var.setAutoRepeat(true);
            bk0Var.f(R.raw.utyan_saved_messages, 120, 120, null);
            bk0Var.d();
            addView(bk0Var, w7.z5.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i10 == 0) {
            org.telegram.messenger.sl.n(R.string.EncryptedDescriptionTitle, textView3, 1, 15.0f);
        } else if (i10 == 1) {
            org.telegram.messenger.sl.n(R.string.GroupEmptyTitle2, textView3, 1, 15.0f);
        } else {
            textView3.setText(LocaleController.getString(R.string.ChatYourSelfTitle));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setGravity(1);
        }
        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.ic, g6Var);
        arrayList.add(textView3);
        float f7 = 260.0f;
        textView3.setMaxWidth(AndroidUtilities.dp(260.0f));
        addView(textView3, w7.z5.t(-2, -2, (i10 != 2 ? LocaleController.isRTL ? 5 : 3 : 1) | 48, 0, 8, 0, i10 != 2 ? 0 : 8));
        int i12 = 0;
        while (i12 < 4) {
            LinearLayout f10 = org.telegram.messenger.v0.f(activity, 0);
            addView(f10, w7.z5.t(-2, -2, LocaleController.isRTL ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(activity);
            int i13 = org.telegram.ui.ActionBar.k6.ic;
            float f11 = f7;
            org.telegram.ui.ActionBar.r6.t(imageView, i13, g6Var, PorterDuff.Mode.MULTIPLY);
            if (i10 == 0) {
                imageView.setImageResource(R.drawable.ic_lock_white);
            } else if (i10 == 2) {
                imageView.setImageResource(R.drawable.list_circle);
            } else {
                imageView.setImageResource(R.drawable.groups_overview_check);
            }
            this.d.add(imageView);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.W(textView4, i13, g6Var);
            this.c.add(textView4);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView4.setMaxWidth(AndroidUtilities.dp(f11));
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            if (i10 == 0) {
                                textView4.setText(LocaleController.getString(R.string.EncryptedDescription4));
                            } else if (i10 == 2) {
                                textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription4));
                            } else {
                                textView4.setText(LocaleController.getString(R.string.GroupDescription4));
                            }
                        }
                    } else if (i10 == 0) {
                        textView4.setText(LocaleController.getString(R.string.EncryptedDescription3));
                    } else if (i10 == 2) {
                        textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription3));
                    } else {
                        textView4.setText(LocaleController.getString(R.string.GroupDescription3));
                    }
                } else if (i10 == 0) {
                    textView4.setText(LocaleController.getString(R.string.EncryptedDescription2));
                } else if (i10 == 2) {
                    textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription2));
                } else {
                    textView4.setText(LocaleController.getString(R.string.GroupDescription2));
                }
            } else if (i10 == 0) {
                textView4.setText(LocaleController.getString(R.string.EncryptedDescription1));
            } else if (i10 == 2) {
                textView4.setText(LocaleController.getString(R.string.ChatYourSelfDescription1));
            } else {
                textView4.setText(LocaleController.getString(R.string.GroupDescription1));
            }
            if (LocaleController.isRTL) {
                f10.addView(textView4, w7.z5.n(-2, -2));
                if (i10 == 0) {
                    f10.addView(imageView, w7.z5.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    f10.addView(imageView, w7.z5.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    f10.addView(imageView, w7.z5.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i10 == 0) {
                    f10.addView(imageView, w7.z5.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    f10.addView(imageView, w7.z5.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    f10.addView(imageView, w7.z5.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                f10.addView(textView4, w7.z5.n(-2, -2));
            }
            i12++;
            f7 = f11;
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i10) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i12 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i12)).setTextColor(i10);
            i12++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i11 >= arrayList2.size()) {
                return;
            }
            ((ImageView) arrayList2.get(i11)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ic, this.a), PorterDuff.Mode.MULTIPLY));
            i11++;
        }
    }
}
