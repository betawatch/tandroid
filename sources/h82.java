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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h82 extends LinearLayout {
    public final vnb a;
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
    public h82(Activity activity, View view, int i, vnb vnbVar) {
        super(activity);
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.a = vnbVar;
        int L = hl.L(18.0f);
        Paint d = vnbVar != null ? vnbVar.d("paintChatActionBackground") : null;
        d = d == null ? aob.T0("paintChatActionBackground") : d;
        int i4 = aob.a;
        setBackground(new pnb(this, view, L, d));
        setPadding(hl.L(16.0f), hl.L(12.0f), hl.L(16.0f), hl.L(12.0f));
        setOrientation(1);
        if (i == 0) {
            TextView textView = new TextView(activity);
            this.b = textView;
            textView.setTextSize(1, 15.0f);
            yob.X(textView, aob.Zc, vnbVar);
            textView.setGravity(1);
            textView.setMaxWidth(hl.L(210.0f));
            arrayList.add(textView);
            addView(textView, tre.r(-2, -2, 49));
        } else if (i == 1) {
            TextView textView2 = new TextView(activity);
            this.b = textView2;
            textView2.setTextSize(1, 15.0f);
            yob.X(textView2, aob.Zc, vnbVar);
            textView2.setGravity(1);
            textView2.setMaxWidth(hl.L(210.0f));
            arrayList.add(textView2);
            addView(textView2, tre.r(-2, -2, 49));
        } else {
            e29 e29Var = new e29(activity);
            e29Var.setAutoRepeat(true);
            e29Var.f(R.raw.utyan_saved_messages, jn7.E1, jn7.E1, null);
            e29Var.d();
            addView(e29Var, tre.t(-2, -2, 49, 0, 2, 0, 0));
        }
        TextView textView3 = new TextView(activity);
        if (i == 0) {
            i2 = 2131751100;
        } else {
            if (i != 1) {
                textView3.setText(ob6.M0(2131752148, null));
                textView3.setTextSize(1, 16.0f);
                textView3.setTypeface(hl.o());
                textView3.setGravity(1);
                yob.X(textView3, aob.Zc, vnbVar);
                arrayList.add(textView3);
                float f = 260.0f;
                textView3.setMaxWidth(hl.L(260.0f));
                addView(textView3, tre.t(-2, -2, (i == 2 ? ob6.a0 ? 5 : 3 : 1) | 48, 0, 8, 0, i == 2 ? 0 : 8));
                i3 = 0;
                while (i3 < 4) {
                    LinearLayout m = bs2.m(activity, 0);
                    addView(m, tre.t(-2, -2, ob6.a0 ? 5 : 3, 0, 8, 0, 0));
                    ImageView imageView = new ImageView(activity);
                    float f2 = f;
                    int i5 = aob.Zc;
                    yob.s(imageView, i5, vnbVar, PorterDuff.Mode.MULTIPLY);
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
                    yob.X(textView4, i5, vnbVar);
                    this.c.add(textView4);
                    textView4.setGravity((ob6.a0 ? 5 : 3) | 16);
                    textView4.setMaxWidth(hl.L(f2));
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    if (i == 0) {
                                        textView4.setText(ob6.M0(2131751101, null));
                                    } else if (i == 2) {
                                        textView4.setText(ob6.M0(2131752150, null));
                                    } else {
                                        textView4.setText(ob6.M0(2131749199, null));
                                    }
                                }
                            } else if (i == 0) {
                                textView4.setText(ob6.M0(2131751102, null));
                            } else if (i == 2) {
                                textView4.setText(ob6.M0(2131752151, null));
                            } else {
                                textView4.setText(ob6.M0(2131749200, null));
                            }
                        } else if (i == 0) {
                            textView4.setText(ob6.M0(2131751103, null));
                        } else if (i == 2) {
                            textView4.setText(ob6.M0(2131752152, null));
                        } else {
                            textView4.setText(ob6.M0(2131749201, null));
                        }
                    } else if (i == 0) {
                        textView4.setText(ob6.M0(2131751104, null));
                    } else if (i == 2) {
                        textView4.setText(ob6.M0(2131752153, null));
                    } else {
                        textView4.setText(ob6.M0(2131749202, null));
                    }
                    if (ob6.a0) {
                        m.addView(textView4, tre.o(-2, -2));
                        if (i == 0) {
                            m.addView(imageView, tre.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                        } else if (i == 2) {
                            m.addView(imageView, tre.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                        } else {
                            m.addView(imageView, tre.k(8.0f, 3.0f, 0.0f, 0.0f, -2, -2));
                        }
                    } else {
                        if (i == 0) {
                            m.addView(imageView, tre.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                        } else if (i == 2) {
                            m.addView(imageView, tre.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                        } else {
                            m.addView(imageView, tre.k(0.0f, 4.0f, 8.0f, 0.0f, -2, -2));
                        }
                        m.addView(textView4, tre.o(-2, -2));
                    }
                    i3++;
                    f = f2;
                }
            }
            i2 = 2131749191;
        }
        qd4.u(15.0f, i2, 1, textView3, null);
        yob.X(textView3, aob.Zc, vnbVar);
        arrayList.add(textView3);
        float f3 = 260.0f;
        textView3.setMaxWidth(hl.L(260.0f));
        addView(textView3, tre.t(-2, -2, (i == 2 ? ob6.a0 ? 5 : 3 : 1) | 48, 0, 8, 0, i == 2 ? 0 : 8));
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
            ((ImageView) arrayList2.get(i2)).setColorFilter(new PorterDuffColorFilter(aob.v0(aob.Zc, this.a), PorterDuff.Mode.MULTIPLY));
            i2++;
        }
    }
}
