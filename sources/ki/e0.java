package ki;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e0 extends db {
    public final i6 a;
    public final c0 b;
    public final d0 c;
    public final TextView d;
    public final TextView e;
    public f0 f;
    public int h;

    public e0(Context context, i6 i6Var) {
        super(context, i6Var);
        this.h = 0;
        this.a = i6Var;
        c0 c0Var = new c0(org.telegram.messenger.g0.L(10.0f));
        c0Var.a.setColor(n6.w0(n6.wj, i6Var));
        this.b = c0Var;
        setBackground(c0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        d0 d0Var = new d0(context, imageView);
        this.c = d0Var;
        imageView.setImageDrawable(d0Var);
        addView(imageView, na.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, na.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = n6.yj;
        u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = m10.f(linearLayout, textView, na.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = f10;
        f10.setTextSize(1, 13.0f);
        u6.U(f10, i7, i6Var);
        linearLayout.addView(f10, na.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
        if (i7 == 0) {
            setButton((cb) null);
            return;
        }
        i6 i6Var = this.a;
        final int i10 = 1;
        if (i7 == 1) {
            dc dcVar = new dc(getContext(), i6Var, true);
            dcVar.e(gd.N0(2131753071, null));
            final int i11 = 0;
            dcVar.b = new Runnable(this) { // from class: ki.b0
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
                            fc bulletin = e0Var.getBulletin();
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
                            fc bulletin2 = e0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            f0 f0Var2 = e0Var2.f;
                            if (f0Var2 != null && (file = f0Var2.d) != null && file.exists()) {
                                File file2 = f0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                dcVar.d = getBulletin();
            }
            setButton(dcVar);
            return;
        }
        if (i7 == 2) {
            dc dcVar2 = new dc(getContext(), i6Var, true);
            dcVar2.e(gd.N0(2131753070, null));
            dcVar2.b = new Runnable(this) { // from class: ki.b0
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
                            fc bulletin = e0Var.getBulletin();
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
                            fc bulletin2 = e0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            f0 f0Var2 = e0Var2.f;
                            if (f0Var2 != null && (file = f0Var2.d) != null && file.exists()) {
                                File file2 = f0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                dcVar2.d = getBulletin();
            }
            setButton(dcVar2);
        }
    }

    public final boolean c(f0 f0Var) {
        f0 f0Var2 = this.f;
        d0 d0Var = this.c;
        if (f0Var2 != f0Var) {
            c6 c6Var = d0Var.k;
            d0Var.h = false;
            c6Var.getClass();
            c6Var.e(true, 0.0f);
            nh0 nh0Var = d0Var.l;
            if (nh0Var != null) {
                nh0Var.C(true);
                d0Var.l = null;
            }
            c6 c6Var2 = d0Var.i;
            d0Var.f = false;
            c6Var2.getClass();
            c6Var2.e(true, 0.0f);
        }
        this.f = f0Var;
        this.d.setText(f0Var.c);
        boolean c10 = f0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = f0Var.b();
            d0Var.getClass();
            boolean z10 = ((Long) b10.second).longValue() > 0;
            d0Var.f = z10;
            if (z10) {
                d0Var.g = Utilities.i(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            d0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(gd.N0(2131753068, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        }
        if (f0Var.i) {
            fc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (f0Var.h) {
            textView.setText(gd.N0(2131753069, null));
            setButton(2);
            if (!d0Var.h) {
                d0Var.h = true;
                nh0 nh0Var2 = new nh0(R.raw.contact_check, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
                d0Var.l = nh0Var2;
                nh0Var2.R(d0Var.a);
                d0Var.l.J(true);
                d0Var.l.start();
                d0Var.g = 1.0f;
            }
            fc bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.db, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i7) {
        c0 c0Var = this.b;
        c0Var.getClass();
        boolean z10 = i7 >= 0;
        c0Var.e = z10;
        if (z10) {
            c0Var.f = i7;
        }
        c0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.kb, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        super.updateColors();
        c0 c0Var = this.b;
        if (c0Var != null) {
            try {
                c0Var.a.setColor(n6.w0(n6.wj, this.a));
                c0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
