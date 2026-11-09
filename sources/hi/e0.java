package hi;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class e0 extends za {
    public final g6 a;
    public final c0 b;
    public final d0 c;
    public final TextView d;
    public final TextView e;
    public f0 f;
    public int h;

    public e0(Context context, g6 g6Var) {
        super(context, g6Var);
        this.h = 0;
        this.a = g6Var;
        c0 c0Var = new c0(org.telegram.messenger.g0.L(10.0f));
        c0Var.a.setColor(l6.w0(l6.tj, g6Var));
        this.b = c0Var;
        setBackground(c0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        d0 d0Var = new d0(context, imageView);
        this.c = d0Var;
        imageView.setImageDrawable(d0Var);
        addView(imageView, ha.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ha.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = l6.vj;
        s6.U(textView, i7, g6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, ha.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = f10;
        f10.setTextSize(1, 13.0f);
        s6.U(f10, i7, g6Var);
        linearLayout.addView(f10, ha.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
        if (i7 == 0) {
            setButton((ya) null);
            return;
        }
        g6 g6Var = this.a;
        final int i10 = 1;
        if (i7 == 1) {
            ac acVar = new ac(getContext(), g6Var, true);
            acVar.e(id.M0(2131753074, null));
            final int i11 = 0;
            acVar.b = new Runnable(this) { // from class: hi.b0
                public final /* synthetic */ e0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i11) {
                        case 0:
                            e0 e0Var = this.b;
                            cc bulletin = e0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            f0 f0Var = e0Var.f;
                            if (f0Var != null) {
                                f0Var.a();
                                break;
                            }
                            break;
                        default:
                            e0 e0Var2 = this.b;
                            cc bulletin2 = e0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            f0 f0Var2 = e0Var2.f;
                            if (f0Var2 != null && (file = f0Var2.d) != null && file.exists()) {
                                File file2 = f0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                acVar.d = getBulletin();
            }
            setButton(acVar);
            return;
        }
        if (i7 == 2) {
            ac acVar2 = new ac(getContext(), g6Var, true);
            acVar2.e(id.M0(2131753073, null));
            acVar2.b = new Runnable(this) { // from class: hi.b0
                public final /* synthetic */ e0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i10) {
                        case 0:
                            e0 e0Var = this.b;
                            cc bulletin = e0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            f0 f0Var = e0Var.f;
                            if (f0Var != null) {
                                f0Var.a();
                                break;
                            }
                            break;
                        default:
                            e0 e0Var2 = this.b;
                            cc bulletin2 = e0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            f0 f0Var2 = e0Var2.f;
                            if (f0Var2 != null && (file = f0Var2.d) != null && file.exists()) {
                                File file2 = f0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                acVar2.d = getBulletin();
            }
            setButton(acVar2);
        }
    }

    public final boolean c(f0 f0Var) {
        f0 f0Var2 = this.f;
        d0 d0Var = this.c;
        if (f0Var2 != f0Var) {
            w5 w5Var = d0Var.k;
            d0Var.h = false;
            w5Var.getClass();
            w5Var.e(true, 0.0f);
            ah0 ah0Var = d0Var.l;
            if (ah0Var != null) {
                ah0Var.C(true);
                d0Var.l = null;
            }
            w5 w5Var2 = d0Var.i;
            d0Var.f = false;
            w5Var2.getClass();
            w5Var2.e(true, 0.0f);
        }
        this.f = f0Var;
        this.d.setText(f0Var.c);
        boolean c10 = f0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = f0Var.b();
            d0Var.getClass();
            boolean z9 = ((Long) b10.second).longValue() > 0;
            d0Var.f = z9;
            if (z9) {
                d0Var.g = Utilities.i(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            d0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(id.M0(2131753071, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        }
        if (f0Var.i) {
            cc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (f0Var.h) {
            textView.setText(id.M0(2131753072, null));
            setButton(2);
            if (!d0Var.h) {
                d0Var.h = true;
                ah0 ah0Var2 = new ah0(R.raw.contact_check, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                d0Var.l = ah0Var2;
                ah0Var2.R(d0Var.a);
                d0Var.l.J(true);
                d0Var.l.start();
                d0Var.g = 1.0f;
            }
            cc bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.za, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i7) {
        c0 c0Var = this.b;
        c0Var.getClass();
        boolean z9 = i7 >= 0;
        c0Var.e = z9;
        if (z9) {
            c0Var.f = i7;
        }
        c0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.gb, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        c0 c0Var = this.b;
        if (c0Var != null) {
            try {
                c0Var.a.setColor(l6.w0(l6.tj, this.a));
                c0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
