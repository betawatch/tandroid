// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kq8 extends qaa {
    public final /* synthetic */ lq8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq8(lq8 lq8Var, Context context, ylb ylbVar) {
        super(context);
        this.h = lq8Var;
        this.f = z8c.t0;
        final byte b = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        ts2.s(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        anb.X(textView, cmb.K6, ylbVar);
        addView(textView, qoe.t(-1, -2, (jb6.a0 ? 5 : 3) | 48, 21, 15, 21, 0));
        l66 l66Var = new l66(context, ylbVar);
        this.b = l66Var;
        anb.X(l66Var, cmb.F6, ylbVar);
        l66Var.setTextSize(1, 14.0f);
        anb.G(l66Var, cmb.I6, ylbVar);
        anb.C(l66Var, cmb.J6, ylbVar);
        final byte b2 = 0;
        l66Var.setMovementMethod(new cm((byte) 0));
        l66Var.setGravity(jb6.a0 ? 5 : 3);
        addView(l66Var, qoe.t(-2, -2, jb6.a0 ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, qoe.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i = 0;
        while (i < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(ulb.f(cmb.Ei, 8.0f));
            rve.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            td4.x(textView2, cmb.Ii, ylbVar, 1, 14.0f);
            linearLayout.addView(textView2, qoe.m(0.5f, 0, 44, i == 0 ? 0 : 4, i == 0 ? 4 : 0, 0));
            if (i == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: paa
                    public final /* synthetic */ kq8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        kq8 kq8Var = this.b;
                        switch (b3) {
                            case 0:
                                gm.c3(new ge7(kq8Var, kq8Var.e, (byte) 8));
                                break;
                            default:
                                int i2 = kq8Var.e;
                                ProfileActivity profileActivity = kq8Var.h.e;
                                if (i2 != 0) {
                                    profileActivity.presentFragment(new p5c(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new u8(3));
                                    break;
                                }
                        }
                    }
                });
            } else {
                this.d = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: paa
                    public final /* synthetic */ kq8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        kq8 kq8Var = this.b;
                        switch (b3) {
                            case 0:
                                gm.c3(new ge7(kq8Var, kq8Var.e, (byte) 8));
                                break;
                            default:
                                int i2 = kq8Var.e;
                                ProfileActivity profileActivity = kq8Var.h.e;
                                if (i2 != 0) {
                                    profileActivity.presentFragment(new p5c(8, null));
                                    break;
                                } else {
                                    profileActivity.presentFragment(new u8(3));
                                    break;
                                }
                        }
                    }
                });
            }
            i++;
        }
    }
}
