package ii;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g0 extends ya {
    public final e6 a;
    public final e0 b;
    public final f0 c;
    public final TextView d;
    public final TextView e;
    public h0 f;
    public int h;

    public g0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.h = 0;
        this.a = e6Var;
        e0 e0Var = new e0(org.telegram.messenger.g0.L(10.0f));
        e0Var.a.setColor(k6.w0(k6.tj, e6Var));
        this.b = e0Var;
        setBackground(e0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f0 f0Var = new f0(context, imageView);
        this.c = f0Var;
        imageView.setImageDrawable(f0Var);
        addView(imageView, mf.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, mf.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i3 = k6.vj;
        r6.V(textView, i3, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = f10;
        f10.setTextSize(1, 13.0f);
        r6.V(f10, i3, e6Var);
        linearLayout.addView(f10, mf.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i3) {
        if (this.h == i3) {
            return;
        }
        this.h = i3;
        if (i3 == 0) {
            setButton((xa) null);
            return;
        }
        e6 e6Var = this.a;
        final int i10 = 1;
        if (i3 == 1) {
            yb ybVar = new yb(getContext(), e6Var, true);
            ybVar.e(bd.M0(2131753074, null));
            final int i11 = 0;
            ybVar.b = new Runnable(this) { // from class: ii.d0
                public final /* synthetic */ g0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i11) {
                        case 0:
                            g0 g0Var = this.b;
                            ac bulletin = g0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            h0 h0Var = g0Var.f;
                            if (h0Var != null) {
                                h0Var.a();
                                break;
                            }
                            break;
                        default:
                            g0 g0Var2 = this.b;
                            ac bulletin2 = g0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            h0 h0Var2 = g0Var2.f;
                            if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                File file2 = h0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.K1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ybVar.d = getBulletin();
            }
            setButton(ybVar);
            return;
        }
        if (i3 == 2) {
            yb ybVar2 = new yb(getContext(), e6Var, true);
            ybVar2.e(bd.M0(2131753073, null));
            ybVar2.b = new Runnable(this) { // from class: ii.d0
                public final /* synthetic */ g0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i10) {
                        case 0:
                            g0 g0Var = this.b;
                            ac bulletin = g0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            h0 h0Var = g0Var.f;
                            if (h0Var != null) {
                                h0Var.a();
                                break;
                            }
                            break;
                        default:
                            g0 g0Var2 = this.b;
                            ac bulletin2 = g0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            h0 h0Var2 = g0Var2.f;
                            if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                File file2 = h0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.K1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ybVar2.d = getBulletin();
            }
            setButton(ybVar2);
        }
    }

    public final boolean c(h0 h0Var) {
        h0 h0Var2 = this.f;
        f0 f0Var = this.c;
        if (h0Var2 != h0Var) {
            u5 u5Var = f0Var.k;
            f0Var.h = false;
            u5Var.getClass();
            u5Var.e(true, 0.0f);
            ch0 ch0Var = f0Var.l;
            if (ch0Var != null) {
                ch0Var.C(true);
                f0Var.l = null;
            }
            u5 u5Var2 = f0Var.i;
            f0Var.f = false;
            u5Var2.getClass();
            u5Var2.e(true, 0.0f);
        }
        this.f = h0Var;
        this.d.setText(h0Var.c);
        boolean c2 = h0Var.c();
        TextView textView = this.e;
        if (c2) {
            Pair b10 = h0Var.b();
            f0Var.getClass();
            boolean z10 = ((Long) b10.second).longValue() > 0;
            f0Var.f = z10;
            if (z10) {
                f0Var.g = Utilities.i(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            f0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(bd.M0(2131753071, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        }
        if (h0Var.i) {
            ac bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (h0Var.h) {
            textView.setText(bd.M0(2131753072, null));
            setButton(2);
            if (!f0Var.h) {
                f0Var.h = true;
                ch0 ch0Var2 = new ch0(R.raw.contact_check, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                f0Var.l = ch0Var2;
                ch0Var2.R(f0Var.a);
                f0Var.l.J(true);
                f0Var.l.start();
                f0Var.g = 1.0f;
            }
            ac bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ya, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i3) {
        e0 e0Var = this.b;
        e0Var.getClass();
        boolean z10 = i3 >= 0;
        e0Var.e = z10;
        if (z10) {
            e0Var.f = i3;
        }
        e0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.fb, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        super.updateColors();
        e0 e0Var = this.b;
        if (e0Var != null) {
            try {
                e0Var.a.setColor(k6.w0(k6.tj, this.a));
                e0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
