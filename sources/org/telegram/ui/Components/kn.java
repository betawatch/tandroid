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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kn extends LinearLayout {
    public final org.telegram.ui.ActionBar.e6 a;
    public final TextView b;
    public final ArrayList c;
    public final ArrayList d;

    public kn(Activity activity, View view, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.a = e6Var;
        int L = org.telegram.messenger.g0.L(18.0f);
        Paint d = e6Var != null ? e6Var.d("paintChatActionBackground") : null;
        d = d == null ? org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground") : d;
        int i10 = org.telegram.ui.ActionBar.k6.a;
        setBackground(new org.telegram.ui.ActionBar.v5(this, view, L, d));
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        if (i3 == 0) {
            TextView textView = new TextView(activity);
            this.b = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Wc, e6Var);
            textView.setGravity(1);
            textView.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
            arrayList.add(textView);
            addView(textView, b8.mf.r(-2, -2, 49));
        } else if (i3 == 1) {
            TextView textView2 = new TextView(activity);
            this.b = textView2;
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Wc, e6Var);
            textView2.setGravity(1);
            textView2.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
            arrayList.add(textView2);
            addView(textView2, b8.mf.r(-2, -2, 49));
        } else {
            fh0 fh0Var = new fh0(activity);
            fh0Var.setAutoRepeat(true);
            fh0Var.f(R.raw.utyan_saved_messages, 120, 120, null);
            fh0Var.d();
            addView(fh0Var, b8.mf.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i3 == 0) {
            textView3.setText(org.telegram.messenger.bd.M0(2131751136, null));
            textView3.setTextSize(1, 15.0f);
        } else if (i3 == 1) {
            textView3.setText(org.telegram.messenger.bd.M0(2131749445, null));
            textView3.setTextSize(1, 15.0f);
        } else {
            textView3.setText(org.telegram.messenger.bd.M0(2131752183, null));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setGravity(1);
        }
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Wc, e6Var);
        arrayList.add(textView3);
        float f10 = 260.0f;
        textView3.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        addView(textView3, b8.mf.t(-2, -2, (i3 != 2 ? org.telegram.messenger.bd.a0 ? 5 : 3 : 1) | 48, 0, 8, 0, i3 != 2 ? 0 : 8));
        int i11 = 0;
        while (i11 < 4) {
            LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
            addView(e10, b8.mf.t(-2, -2, org.telegram.messenger.bd.a0 ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(activity);
            float f11 = f10;
            int i12 = org.telegram.ui.ActionBar.k6.Wc;
            org.telegram.ui.ActionBar.r6.t(imageView, i12, e6Var, PorterDuff.Mode.MULTIPLY);
            if (i3 == 0) {
                imageView.setImageResource(R.drawable.ic_lock_white);
            } else if (i3 == 2) {
                imageView.setImageResource(R.drawable.list_circle);
            } else {
                imageView.setImageResource(R.drawable.groups_overview_check);
            }
            this.d.add(imageView);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.V(textView4, i12, e6Var);
            this.c.add(textView4);
            textView4.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
            textView4.setMaxWidth(org.telegram.messenger.g0.L(f11));
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (i3 == 0) {
                                textView4.setText(org.telegram.messenger.bd.M0(2131751137, null));
                            } else if (i3 == 2) {
                                textView4.setText(org.telegram.messenger.bd.M0(2131752185, null));
                            } else {
                                textView4.setText(org.telegram.messenger.bd.M0(2131749453, null));
                            }
                        }
                    } else if (i3 == 0) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131751138, null));
                    } else if (i3 == 2) {
                        textView4.setText(org.telegram.messenger.bd.M0(2131752186, null));
                    } else {
                        textView4.setText(org.telegram.messenger.bd.M0(2131749454, null));
                    }
                } else if (i3 == 0) {
                    textView4.setText(org.telegram.messenger.bd.M0(2131751139, null));
                } else if (i3 == 2) {
                    textView4.setText(org.telegram.messenger.bd.M0(2131752187, null));
                } else {
                    textView4.setText(org.telegram.messenger.bd.M0(2131749455, null));
                }
            } else if (i3 == 0) {
                textView4.setText(org.telegram.messenger.bd.M0(2131751140, null));
            } else if (i3 == 2) {
                textView4.setText(org.telegram.messenger.bd.M0(2131752188, null));
            } else {
                textView4.setText(org.telegram.messenger.bd.M0(2131749456, null));
            }
            if (org.telegram.messenger.bd.a0) {
                e10.addView(textView4, b8.mf.o(-2, -2));
                if (i3 == 0) {
                    e10.addView(imageView, b8.mf.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i3 == 2) {
                    e10.addView(imageView, b8.mf.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e10.addView(imageView, b8.mf.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i3 == 0) {
                    e10.addView(imageView, b8.mf.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i3 == 2) {
                    e10.addView(imageView, b8.mf.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    e10.addView(imageView, b8.mf.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                e10.addView(textView4, b8.mf.o(-2, -2));
            }
            i11++;
            f10 = f11;
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i3) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i11)).setTextColor(i3);
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                return;
            }
            ((ImageView) arrayList2.get(i10)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wc, this.a), PorterDuff.Mode.MULTIPLY));
            i10++;
        }
    }
}
