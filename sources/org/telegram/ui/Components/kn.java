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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kn extends LinearLayout {
    public final org.telegram.ui.ActionBar.h6 a;
    public final TextView b;
    public final ArrayList c;
    public final ArrayList d;

    public kn(Activity activity, View view, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.a = h6Var;
        int L = org.telegram.messenger.g0.L(18.0f);
        Paint d = h6Var != null ? h6Var.d("paintChatActionBackground") : null;
        d = d == null ? org.telegram.ui.ActionBar.m6.V0("paintChatActionBackground") : d;
        int i10 = org.telegram.ui.ActionBar.m6.a;
        setBackground(new org.telegram.ui.ActionBar.y5(this, view, L, d));
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        setOrientation(1);
        if (i7 == 0) {
            TextView textView = new TextView(activity);
            this.b = textView;
            textView.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Wc, h6Var);
            textView.setGravity(1);
            textView.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
            arrayList.add(textView);
            addView(textView, c8.ha.r(-2, -2, 49));
        } else if (i7 == 1) {
            TextView textView2 = new TextView(activity);
            this.b = textView2;
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.Wc, h6Var);
            textView2.setGravity(1);
            textView2.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
            arrayList.add(textView2);
            addView(textView2, c8.ha.r(-2, -2, 49));
        } else {
            ch0 ch0Var = new ch0(activity);
            ch0Var.setAutoRepeat(true);
            ch0Var.f(R.raw.utyan_saved_messages, 120, 120, null);
            ch0Var.d();
            addView(ch0Var, c8.ha.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i7 == 0) {
            textView3.setText(org.telegram.messenger.id.M0(2131751135, null));
            textView3.setTextSize(1, 15.0f);
        } else if (i7 == 1) {
            textView3.setText(org.telegram.messenger.id.M0(2131749437, null));
            textView3.setTextSize(1, 15.0f);
        } else {
            textView3.setText(org.telegram.messenger.id.M0(2131752183, null));
            textView3.setTextSize(1, 16.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            textView3.setGravity(1);
        }
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.Wc, h6Var);
        arrayList.add(textView3);
        float f10 = 260.0f;
        textView3.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        addView(textView3, c8.ha.t(-2, -2, (i7 != 2 ? org.telegram.messenger.id.a0 ? 5 : 3 : 1) | 48, 0, 8, 0, i7 != 2 ? 0 : 8));
        int i11 = 0;
        while (i11 < 4) {
            LinearLayout e10 = org.telegram.messenger.k5.e(activity, 0);
            addView(e10, c8.ha.t(-2, -2, org.telegram.messenger.id.a0 ? 5 : 3, 0, 8, 0, 0));
            ImageView imageView = new ImageView(activity);
            float f11 = f10;
            int i12 = org.telegram.ui.ActionBar.m6.Wc;
            org.telegram.ui.ActionBar.t6.s(imageView, i12, h6Var, PorterDuff.Mode.MULTIPLY);
            if (i7 == 0) {
                imageView.setImageResource(R.drawable.ic_lock_white);
            } else if (i7 == 2) {
                imageView.setImageResource(R.drawable.list_circle);
            } else {
                imageView.setImageResource(R.drawable.groups_overview_check);
            }
            this.d.add(imageView);
            TextView textView4 = new TextView(activity);
            textView4.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.t6.U(textView4, i12, h6Var);
            this.c.add(textView4);
            textView4.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
            textView4.setMaxWidth(org.telegram.messenger.g0.L(f11));
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (i7 == 0) {
                                textView4.setText(org.telegram.messenger.id.M0(2131751136, null));
                            } else if (i7 == 2) {
                                textView4.setText(org.telegram.messenger.id.M0(2131752185, null));
                            } else {
                                textView4.setText(org.telegram.messenger.id.M0(2131749445, null));
                            }
                        }
                    } else if (i7 == 0) {
                        textView4.setText(org.telegram.messenger.id.M0(2131751137, null));
                    } else if (i7 == 2) {
                        textView4.setText(org.telegram.messenger.id.M0(2131752186, null));
                    } else {
                        textView4.setText(org.telegram.messenger.id.M0(2131749446, null));
                    }
                } else if (i7 == 0) {
                    textView4.setText(org.telegram.messenger.id.M0(2131751138, null));
                } else if (i7 == 2) {
                    textView4.setText(org.telegram.messenger.id.M0(2131752187, null));
                } else {
                    textView4.setText(org.telegram.messenger.id.M0(2131749447, null));
                }
            } else if (i7 == 0) {
                textView4.setText(org.telegram.messenger.id.M0(2131751139, null));
            } else if (i7 == 2) {
                textView4.setText(org.telegram.messenger.id.M0(2131752188, null));
            } else {
                textView4.setText(org.telegram.messenger.id.M0(2131749448, null));
            }
            if (org.telegram.messenger.id.a0) {
                e10.addView(textView4, c8.ha.o(-2, -2));
                if (i7 == 0) {
                    e10.addView(imageView, c8.ha.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                } else if (i7 == 2) {
                    e10.addView(imageView, c8.ha.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    e10.addView(imageView, c8.ha.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                }
            } else {
                if (i7 == 0) {
                    e10.addView(imageView, c8.ha.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                } else if (i7 == 2) {
                    e10.addView(imageView, c8.ha.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                } else {
                    e10.addView(imageView, c8.ha.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                }
                e10.addView(textView4, c8.ha.o(-2, -2));
            }
            i11++;
            f10 = f11;
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i7) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i11)).setTextColor(i7);
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i10 >= arrayList2.size()) {
                return;
            }
            ((ImageView) arrayList2.get(i10)).setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wc, this.a), PorterDuff.Mode.MULTIPLY));
            i10++;
        }
    }
}
