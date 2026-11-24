// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b92 extends LinearLayout {
    public final ylb a;
    public final TextView b;
    public final ArrayList c;
    public final ArrayList d;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b92(Activity activity, View view, int i, ylb ylbVar) {
        super(activity);
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.a = ylbVar;
        int L = gm.L(18.0f);
        Paint d = ylbVar != null ? ylbVar.d("paintChatActionBackground") : null;
        d = d == null ? cmb.T0("paintChatActionBackground") : d;
        int i4 = cmb.a;
        setBackground(new slb(this, view, L, d));
        setPadding(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), gm.L(12.0f));
        setOrientation(1);
        if (i == 0) {
            TextView textView = new TextView(activity);
            this.b = textView;
            textView.setTextSize(1, 15.0f);
            anb.X(textView, cmb.Yc, ylbVar);
            textView.setGravity(1);
            textView.setMaxWidth(gm.L(210.0f));
            arrayList.add(textView);
            addView(textView, qoe.r(-2, -2, 49));
        } else if (i == 1) {
            TextView textView2 = new TextView(activity);
            this.b = textView2;
            textView2.setTextSize(1, 15.0f);
            anb.X(textView2, cmb.Yc, ylbVar);
            textView2.setGravity(1);
            textView2.setMaxWidth(gm.L(210.0f));
            arrayList.add(textView2);
            addView(textView2, qoe.r(-2, -2, 49));
        } else {
            s09 s09Var = new s09(activity);
            s09Var.setAutoRepeat(true);
            s09Var.f(R.raw.utyan_saved_messages, nm7.E1, nm7.E1, null);
            s09Var.d();
            addView(s09Var, qoe.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i == 0) {
            i2 = 2131751072;
        } else {
            if (i != 1) {
                textView3.setText(jb6.M0(2131752120, null));
                textView3.setTextSize(1, 16.0f);
                textView3.setTypeface(gm.o());
                textView3.setGravity(1);
                anb.X(textView3, cmb.Yc, ylbVar);
                arrayList.add(textView3);
                float f = 260.0f;
                textView3.setMaxWidth(gm.L(260.0f));
                addView(textView3, qoe.t(-2, -2, (i == 2 ? jb6.a0 ? 5 : 3 : 1) | 48, 0, 8, 0, i == 2 ? 0 : 8));
                i3 = 0;
                while (i3 < 4) {
                    LinearLayout l = td4.l(activity, 0);
                    addView(l, qoe.t(-2, -2, jb6.a0 ? 5 : 3, 0, 8, 0, 0));
                    ImageView imageView = new ImageView(activity);
                    float f2 = f;
                    int i5 = cmb.Yc;
                    anb.s(imageView, i5, ylbVar, PorterDuff.Mode.MULTIPLY);
                    if (i == 0) {
                        imageView.setImageResource(R.drawable.ic_lock_white);
                    } else if (i == 2) {
                        imageView.setImageResource(R.drawable.list_circle);
                    } else {
                        imageView.setImageResource(R.drawable.groups_overview_check);
                    }
                    this.d.add(imageView);
                    TextView textView4 = new TextView(activity);
                    textView4.setTextSize(1, 15.0f);
                    anb.X(textView4, i5, ylbVar);
                    this.c.add(textView4);
                    textView4.setGravity((jb6.a0 ? 5 : 3) | 16);
                    textView4.setMaxWidth(gm.L(f2));
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    if (i == 0) {
                                        textView4.setText(jb6.M0(2131751073, null));
                                    } else if (i == 2) {
                                        textView4.setText(jb6.M0(2131752122, null));
                                    } else {
                                        textView4.setText(jb6.M0(2131749202, null));
                                    }
                                }
                            } else if (i == 0) {
                                textView4.setText(jb6.M0(2131751074, null));
                            } else if (i == 2) {
                                textView4.setText(jb6.M0(2131752123, null));
                            } else {
                                textView4.setText(jb6.M0(2131749203, null));
                            }
                        } else if (i == 0) {
                            textView4.setText(jb6.M0(2131751075, null));
                        } else if (i == 2) {
                            textView4.setText(jb6.M0(2131752124, null));
                        } else {
                            textView4.setText(jb6.M0(2131749204, null));
                        }
                    } else if (i == 0) {
                        textView4.setText(jb6.M0(2131751076, null));
                    } else if (i == 2) {
                        textView4.setText(jb6.M0(2131752125, null));
                    } else {
                        textView4.setText(jb6.M0(2131749205, null));
                    }
                    if (jb6.a0) {
                        l.addView(textView4, qoe.o(-2, -2));
                        if (i == 0) {
                            l.addView(imageView, qoe.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                        } else if (i == 2) {
                            l.addView(imageView, qoe.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                        } else {
                            l.addView(imageView, qoe.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                        }
                    } else {
                        if (i == 0) {
                            l.addView(imageView, qoe.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                        } else if (i == 2) {
                            l.addView(imageView, qoe.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                        } else {
                            l.addView(imageView, qoe.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                        }
                        l.addView(textView4, qoe.o(-2, -2));
                    }
                    i3++;
                    f = f2;
                }
            }
            i2 = 2131749194;
        }
        td4.v(15.0f, i2, 1, textView3, null);
        anb.X(textView3, cmb.Yc, ylbVar);
        arrayList.add(textView3);
        float f3 = 260.0f;
        textView3.setMaxWidth(gm.L(260.0f));
        addView(textView3, qoe.t(-2, -2, (i == 2 ? jb6.a0 ? 5 : 3 : 1) | 48, 0, 8, 0, i == 2 ? 0 : 8));
        i3 = 0;
        while (i3 < 4) {
        }
    }

    public void setStatusText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public void setTextColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((TextView) arrayList.get(i3)).setTextColor(i);
            i3++;
        }
        while (true) {
            ArrayList arrayList2 = this.d;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((ImageView) arrayList2.get(i2)).setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.Yc, this.a), PorterDuff.Mode.MULTIPLY));
            i2++;
        }
    }
}
