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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tn extends LinearLayout {
    public final org.telegram.ui.ActionBar.p6 a;
    public final TextView b;
    public final ArrayList c;
    public final ArrayList d;

    public tn(Activity activity, View view, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.a = p6Var;
        int L = org.telegram.messenger.i0.L(18.0f);
        Paint d = p6Var != null ? p6Var.d("paintChatActionBackground") : null;
        d = d == null ? org.telegram.ui.ActionBar.t6.V0("paintChatActionBackground") : d;
        int i11 = org.telegram.ui.ActionBar.t6.a;
        setBackground(new org.telegram.ui.ActionBar.g6(this, view, L, d));
        setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        setOrientation(1);
        if (i10 == 0) {
            TextView textView = new TextView(activity);
            this.b = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Wc, p6Var);
            textView.setGravity(1);
            textView.setMaxWidth(org.telegram.messenger.i0.L(210.0f));
            arrayList.add(textView);
            addView(textView, w7.b6.r(-2, -2, 49));
        } else if (i10 == 1) {
            TextView textView2 = new TextView(activity);
            this.b = textView2;
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Wc, p6Var);
            textView2.setGravity(1);
            textView2.setMaxWidth(org.telegram.messenger.i0.L(210.0f));
            arrayList.add(textView2);
            addView(textView2, w7.b6.r(-2, -2, 49));
        } else {
            ei0 ei0Var = new ei0(activity);
            ei0Var.setAutoRepeat(true);
            ei0Var.f(R.raw.utyan_saved_messages, 120, 120, null);
            ei0Var.d();
            addView(ei0Var, w7.b6.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i10 == 0) {
            textView3.setText(org.telegram.messenger.cd.L0(2131751136, null));
            textView3.setTextSize(1, 15.0f);
        } else if (i10 == 1) {
            textView3.setText(org.telegram.messenger.cd.L0(2131749446, null));
            textView3.setTextSize(1, 15.0f);
        } else {
            textView3.setText(org.telegram.messenger.cd.L0(2131752183, null));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(org.telegram.messenger.i0.o());
            textView3.setGravity(1);
        }
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Wc, p6Var);
        arrayList.add(textView3);
        float f7 = 260.0f;
        textView3.setMaxWidth(org.telegram.messenger.i0.L(260.0f));
        addView(textView3, w7.b6.t(-2, -2, (i10 != 2 ? org.telegram.messenger.cd.X ? 5 : 3 : 1) | 48, 0, 8, 0, i10 != 2 ? 0 : 8));
        int i12 = 0;
        while (i12 < 4) {
            LinearLayout e = org.telegram.messenger.m5.e(activity, 0);
            addView(e, w7.b6.t(-2, -2, org.telegram.messenger.cd.X ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(activity);
            float f10 = f7;
            int i13 = org.telegram.ui.ActionBar.t6.Wc;
            org.telegram.ui.ActionBar.a7.t(imageView, i13, p6Var, PorterDuff.Mode.MULTIPLY);
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
            org.telegram.ui.ActionBar.a7.V(textView4, i13, p6Var);
            this.c.add(textView4);
            textView4.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
            textView4.setMaxWidth(org.telegram.messenger.i0.L(f10));
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            if (i10 == 0) {
                                textView4.setText(org.telegram.messenger.cd.L0(2131751137, null));
                            } else if (i10 == 2) {
                                textView4.setText(org.telegram.messenger.cd.L0(2131752185, null));
                            } else {
                                textView4.setText(org.telegram.messenger.cd.L0(2131749454, null));
                            }
                        }
                    } else if (i10 == 0) {
                        textView4.setText(org.telegram.messenger.cd.L0(2131751138, null));
                    } else if (i10 == 2) {
                        textView4.setText(org.telegram.messenger.cd.L0(2131752186, null));
                    } else {
                        textView4.setText(org.telegram.messenger.cd.L0(2131749455, null));
                    }
                } else if (i10 == 0) {
                    textView4.setText(org.telegram.messenger.cd.L0(2131751139, null));
                } else if (i10 == 2) {
                    textView4.setText(org.telegram.messenger.cd.L0(2131752187, null));
                } else {
                    textView4.setText(org.telegram.messenger.cd.L0(2131749456, null));
                }
            } else if (i10 == 0) {
                textView4.setText(org.telegram.messenger.cd.L0(2131751140, null));
            } else if (i10 == 2) {
                textView4.setText(org.telegram.messenger.cd.L0(2131752188, null));
            } else {
                textView4.setText(org.telegram.messenger.cd.L0(2131749457, null));
            }
            if (org.telegram.messenger.cd.X) {
                e.addView(textView4, w7.b6.o(-2, -2));
                if (i10 == 0) {
                    e.addView(imageView, w7.b6.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    e.addView(imageView, w7.b6.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e.addView(imageView, w7.b6.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i10 == 0) {
                    e.addView(imageView, w7.b6.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i10 == 2) {
                    e.addView(imageView, w7.b6.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    e.addView(imageView, w7.b6.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                e.addView(textView4, w7.b6.o(-2, -2));
            }
            i12++;
            f7 = f10;
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
            ((ImageView) arrayList2.get(i11)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, this.a), PorterDuff.Mode.MULTIPLY));
            i11++;
        }
    }
}
