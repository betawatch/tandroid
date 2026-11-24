// default package

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class kp0 extends h11 {
    public final wjb a;
    public final ip0 b;
    public final jp0 c;
    public final TextView d;
    public final TextView e;
    public lp0 f;
    public int h;

    public kp0(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.h = 0;
        this.a = wjbVar;
        ip0 ip0Var = new ip0(gl.L(10.0f));
        ip0Var.a.setColor(bkb.v0(bkb.vj, wjbVar));
        this.b = ip0Var;
        setBackground(ip0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        jp0 jp0Var = new jp0(context, imageView);
        this.c = jp0Var;
        imageView.setImageDrawable(jp0Var);
        addView(imageView, nme.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i = bkb.xj;
        zkb.X(textView, i, wjbVar);
        textView.setTypeface(gl.o());
        TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.e = m;
        m.setTextSize(1, 13.0f);
        zkb.X(m, i, wjbVar);
        linearLayout.addView(m, nme.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i) {
        if (this.h != i) {
            this.h = i;
            if (i == 0) {
                setButton((g11) null);
                return;
            }
            wjb wjbVar = this.a;
            final byte b = 1;
            if (i == 1) {
                k21 k21Var = new k21(wjbVar, getContext(), true);
                k21Var.e(k96.M0(2131753071, null));
                final byte b2 = 0;
                k21Var.b = new Runnable(this) { // from class: hp0
                    public final /* synthetic */ kp0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        File file;
                        byte b3 = b2;
                        kp0 kp0Var = this.b;
                        switch (b3) {
                            case 0:
                                m21 bulletin = kp0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.j = 2750;
                                    bulletin.i(true);
                                }
                                lp0 lp0Var = kp0Var.f;
                                if (lp0Var != null) {
                                    lp0Var.a();
                                    break;
                                }
                                break;
                            default:
                                m21 bulletin2 = kp0Var.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                lp0 lp0Var2 = kp0Var.f;
                                if (lp0Var2 != null && (file = lp0Var2.d) != null && file.exists()) {
                                    File file2 = lp0Var2.d;
                                    gl.s2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (getBulletin() != null) {
                    k21Var.d = getBulletin();
                }
                setButton(k21Var);
                return;
            }
            if (i == 2) {
                k21 k21Var2 = new k21(wjbVar, getContext(), true);
                k21Var2.e(k96.M0(2131753070, null));
                k21Var2.b = new Runnable(this) { // from class: hp0
                    public final /* synthetic */ kp0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        File file;
                        byte b3 = b;
                        kp0 kp0Var = this.b;
                        switch (b3) {
                            case 0:
                                m21 bulletin = kp0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.j = 2750;
                                    bulletin.i(true);
                                }
                                lp0 lp0Var = kp0Var.f;
                                if (lp0Var != null) {
                                    lp0Var.a();
                                    break;
                                }
                                break;
                            default:
                                m21 bulletin2 = kp0Var.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                lp0 lp0Var2 = kp0Var.f;
                                if (lp0Var2 != null && (file = lp0Var2.d) != null && file.exists()) {
                                    File file2 = lp0Var2.d;
                                    gl.s2(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (getBulletin() != null) {
                    k21Var2.d = getBulletin();
                }
                setButton(k21Var2);
            }
        }
    }

    public final boolean c(lp0 lp0Var) {
        lp0 lp0Var2 = this.f;
        jp0 jp0Var = this.c;
        if (lp0Var2 != lp0Var) {
            lm lmVar = jp0Var.k;
            jp0Var.h = false;
            lmVar.getClass();
            lmVar.e(true, 0.0f);
            oy8 oy8Var = jp0Var.l;
            if (oy8Var != null) {
                oy8Var.x(true);
                jp0Var.l = null;
            }
            lm lmVar2 = jp0Var.i;
            jp0Var.f = false;
            lmVar2.getClass();
            lmVar2.e(true, 0.0f);
        }
        this.f = lp0Var;
        this.d.setText(lp0Var.c);
        boolean c = lp0Var.c();
        TextView textView = this.e;
        if (c) {
            Pair b = lp0Var.b();
            jp0Var.getClass();
            boolean z = ((Long) b.second).longValue() > 0;
            jp0Var.f = z;
            if (z) {
                jp0Var.g = Utilities.i(((Long) b.first).longValue() / ((Long) b.second).longValue(), 1.0f, 0.0f);
            }
            jp0Var.invalidateSelf();
            if (((Long) b.first).longValue() <= 0) {
                textView.setText(k96.M0(2131753068, null));
            } else {
                long longValue = ((Long) b.second).longValue();
                Object obj = b.first;
                if (longValue <= 0) {
                    textView.setText(gl.i0(((Long) obj).longValue(), false, false));
                } else {
                    textView.setText(gl.i0(((Long) obj).longValue(), false, false) + " / " + gl.i0(((Long) b.second).longValue(), false, false));
                }
            }
            setButton(1);
            return false;
        }
        if (lp0Var.i) {
            m21 bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        }
        if (lp0Var.h) {
            textView.setText(k96.M0(2131753069, null));
            setButton(2);
            if (!jp0Var.h) {
                jp0Var.h = true;
                oy8 oy8Var2 = new oy8(R.raw.contact_check, gl.L(40.0f), gl.L(40.0f));
                jp0Var.l = oy8Var2;
                oy8Var2.M(jp0Var.a);
                jp0Var.l.E(true);
                jp0Var.l.start();
                jp0Var.g = 1.0f;
            }
            m21 bulletin2 = getBulletin();
            if (bulletin2 != null) {
                bulletin2.i(false);
                bulletin2.j = 5000;
                bulletin2.i(true);
            }
        }
        return false;
    }

    @Override // h11, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(68.0f), TLObject.FLAG_30));
    }

    public void setArrow(int i) {
        ip0 ip0Var = this.b;
        ip0Var.getClass();
        boolean z = i >= 0;
        ip0Var.e = z;
        if (z) {
            ip0Var.f = i;
        }
        ip0Var.invalidateSelf();
    }

    @Override // q11, tjb
    public final void updateColors() {
        super.updateColors();
        ip0 ip0Var = this.b;
        if (ip0Var != null) {
            try {
                ip0Var.a.setColor(bkb.v0(bkb.vj, this.a));
                ip0Var.invalidateSelf();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
