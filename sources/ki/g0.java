package ki;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class g0 extends va {
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
        e0Var.a.setColor(j6.w0(j6.wj, e6Var));
        this.b = e0Var;
        setBackground(e0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        f0 f0Var = new f0(context, imageView);
        this.c = f0Var;
        imageView.setImageDrawable(f0Var);
        addView(imageView, ja.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, ja.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i7 = j6.yj;
        q6.U(textView, i7, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView f10 = i20.f(linearLayout, textView, ja.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = f10;
        f10.setTextSize(1, 13.0f);
        q6.U(f10, i7, e6Var);
        linearLayout.addView(f10, ja.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i7) {
        if (this.h == i7) {
            return;
        }
        this.h = i7;
        if (i7 == 0) {
            setButton((ua) null);
            return;
        }
        e6 e6Var = this.a;
        final int i10 = 1;
        if (i7 == 1) {
            vb vbVar = new vb(getContext(), e6Var, true);
            vbVar.e(hd.M0(2131753074, null));
            final int i11 = 0;
            vbVar.b = new Runnable(this) { // from class: ki.d0
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
                            xb bulletin = g0Var.getBulletin();
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
                            xb bulletin2 = g0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            h0 h0Var2 = g0Var2.f;
                            if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                File file2 = h0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                vbVar.d = getBulletin();
            }
            setButton(vbVar);
            return;
        }
        if (i7 == 2) {
            vb vbVar2 = new vb(getContext(), e6Var, true);
            vbVar2.e(hd.M0(2131753073, null));
            vbVar2.b = new Runnable(this) { // from class: ki.d0
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
                            xb bulletin = g0Var.getBulletin();
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
                            xb bulletin2 = g0Var2.getBulletin();
                            if (bulletin2 != null) {
                                bulletin2.b();
                            }
                            h0 h0Var2 = g0Var2.f;
                            if (h0Var2 != null && (file = h0Var2.d) != null && file.exists()) {
                                File file2 = h0Var2.d;
                                org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                break;
                            }
                            break;
                    }
                }
            };
            if (getBulletin() != null) {
                vbVar2.d = getBulletin();
            }
            setButton(vbVar2);
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
        boolean c10 = h0Var.c();
        TextView textView = this.e;
        if (c10) {
            Pair b10 = h0Var.b();
            f0Var.getClass();
            boolean z10 = ((Long) b10.second).longValue() > 0;
            f0Var.f = z10;
            if (z10) {
                f0Var.g = Utilities.i(((Long) b10.first).longValue() / ((Long) b10.second).longValue(), 1.0f, 0.0f);
            }
            f0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(hd.M0(2131753071, null));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false));
            } else {
                textView.setText(org.telegram.messenger.g0.i0(((Long) b10.first).longValue(), false, false) + " / " + org.telegram.messenger.g0.i0(((Long) b10.second).longValue(), false, false));
            }
            setButton(1);
            return false;
        }
        if (h0Var.i) {
            xb bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (h0Var.h) {
            textView.setText(hd.M0(2131753072, null));
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
            xb bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.va, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i7) {
        e0 e0Var = this.b;
        e0Var.getClass();
        boolean z10 = i7 >= 0;
        e0Var.e = z10;
        if (z10) {
            e0Var.f = i7;
        }
        e0Var.invalidateSelf();
    }

    @Override // org.telegram.ui.Components.cb, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        super.updateColors();
        e0 e0Var = this.b;
        if (e0Var != null) {
            try {
                e0Var.a.setColor(j6.w0(j6.wj, this.a));
                e0Var.invalidateSelf();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }
}
