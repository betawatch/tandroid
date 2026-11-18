package ki;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class f0 extends eb {
    public final i6 a;
    public final d0 b;
    public final e0 c;
    public final TextView d;
    public final TextView e;
    public g0 f;
    public int h;

    public f0(Context context, i6 i6Var) {
        super(context, i6Var);
        this.h = 0;
        this.a = i6Var;
        d0 d0Var = new d0(org.telegram.messenger.g0.L(10.0f));
        d0Var.a.setColor(n6.w0(n6.wj, i6Var));
        this.b = d0Var;
        setBackground(d0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        e0 e0Var = new e0(context, imageView);
        this.c = e0Var;
        imageView.setImageDrawable(e0Var);
        addView(imageView, ma.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ma.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = n6.yj;
        u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = n10.f(linearLayout, textView, ma.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = f10;
        f10.setTextSize(1, 13.0f);
        u6.U(f10, i7, i6Var);
        linearLayout.addView(f10, ma.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
        if (i7 == 0) {
            setButton((db) null);
            return;
        }
        i6 i6Var = this.a;
        final int i10 = 1;
        if (i7 == 1) {
            ec ecVar = new ec(getContext(), i6Var, true);
            ecVar.e(gd.M0(2131753072, null));
            final int i11 = 0;
            ecVar.b = new Runnable(this) { // from class: ki.c0
                public final /* synthetic */ f0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i11) {
                        case 0:
                            f0 f0Var = this.b;
                            gc bulletin = f0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            g0 g0Var = f0Var.f;
                            if (g0Var != null) {
                                g0Var.a();
                                break;
                            }
                            break;
                        default:
                            f0 f0Var2 = this.b;
                            gc bulletin2 = f0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            g0 g0Var2 = f0Var2.f;
                            if (g0Var2 != null && (file = g0Var2.d) != null && file.exists()) {
                                File file2 = g0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ecVar.d = getBulletin();
            }
            setButton(ecVar);
            return;
        }
        if (i7 == 2) {
            ec ecVar2 = new ec(getContext(), i6Var, true);
            ecVar2.e(gd.M0(2131753071, null));
            ecVar2.b = new Runnable(this) { // from class: ki.c0
                public final /* synthetic */ f0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    File file;
                    switch (i10) {
                        case 0:
                            f0 f0Var = this.b;
                            gc bulletin = f0Var.getBulletin();
                            if (bulletin != null) {
                                bulletin.j = 2750;
                                bulletin.i(true);
                            }
                            g0 g0Var = f0Var.f;
                            if (g0Var != null) {
                                g0Var.a();
                                break;
                            }
                            break;
                        default:
                            f0 f0Var2 = this.b;
                            gc bulletin2 = f0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            g0 g0Var2 = f0Var2.f;
                            if (g0Var2 != null && (file = g0Var2.d) != null && file.exists()) {
                                File file2 = g0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                ecVar2.d = getBulletin();
            }
            setButton(ecVar2);
        }
    }

    public final boolean c(g0 g0Var) {
        g0 g0Var2 = this.f;
        e0 e0Var = this.c;
        if (g0Var2 != g0Var) {
            c6 c6Var = e0Var.k;
            e0Var.h = false;
            c6Var.getClass();
            c6Var.e(true, 0.0f);
            mh0 mh0Var = e0Var.l;
            if (mh0Var != null) {
                mh0Var.C(true);
                e0Var.l = null;
            }
            c6 c6Var2 = e0Var.i;
            e0Var.f = false;
            c6Var2.getClass();
            c6Var2.e(true, 0.0f);
        }
        this.f = g0Var;
        this.d.setText(g0Var.c);
        boolean c10 = g0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = g0Var.b();
            e0Var.getClass();
            boolean z10 = ((Long) b10.second).longValue() > 0;
            e0Var.f = z10;
            if (z10) {
                e0Var.g = Utilities.i(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            e0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(gd.M0(2131753069, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        }
        if (g0Var.i) {
            gc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (g0Var.h) {
            textView.setText(gd.M0(2131753070, null));
            setButton(2);
            if (!e0Var.h) {
                e0Var.h = true;
                mh0 mh0Var2 = new mh0(R.raw.contact_check, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                e0Var.l = mh0Var2;
                mh0Var2.R(e0Var.a);
                e0Var.l.J(true);
                e0Var.l.start();
                e0Var.g = 1.0f;
            }
            gc bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.eb, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i7) {
        d0 d0Var = this.b;
        d0Var.getClass();
        boolean z10 = i7 >= 0;
        d0Var.e = z10;
        if (z10) {
            d0Var.f = i7;
        }
        d0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.lb, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        super.updateColors();
        d0 d0Var = this.b;
        if (d0Var != null) {
            try {
                d0Var.a.setColor(n6.w0(n6.wj, this.a));
                d0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
