// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jo8 extends q8a {
    public final /* synthetic */ ko8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo8(ko8 ko8Var, Context context, wjb wjbVar) {
        super(context);
        this.h = ko8Var;
        this.f = y6c.t0;
        final byte b = 1;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        ir2.t(textView, 1, 15.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        zkb.X(textView, bkb.K6, wjbVar);
        addView(textView, nme.t(-1, -2, (k96.a0 ? 5 : 3) | 48, 21, 15, 21, 0));
        l46 l46Var = new l46(context, wjbVar);
        this.b = l46Var;
        zkb.X(l46Var, bkb.F6, wjbVar);
        l46Var.setTextSize(1, 14.0f);
        zkb.G(l46Var, bkb.I6, wjbVar);
        zkb.C(l46Var, bkb.J6, wjbVar);
        final byte b2 = 0;
        l46Var.setMovementMethod(new cl((byte) 0));
        l46Var.setGravity(k96.a0 ? 5 : 3);
        addView(l46Var, nme.t(-2, -2, k96.a0 ? 5 : 3, 21, 14, 21, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        addView(linearLayout, nme.k(21.0f, 16.0f, 21.0f, 15.0f, -1, 44));
        int i = 0;
        while (i < 2) {
            TextView textView2 = new TextView(context);
            textView2.setBackground(sjb.f(bkb.Ei, 8.0f));
            ote.b(textView2, 0.02f, 1.5f);
            textView2.setLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setGravity(17);
            tb4.w(textView2, bkb.Ii, wjbVar, 1, 14.0f);
            linearLayout.addView(textView2, nme.m(0.5f, 0, 44, i == 0 ? 0 : 4, i == 0 ? 4 : 0, 0));
            if (i == 0) {
                this.c = textView2;
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: p8a
                    public final /* synthetic */ jo8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        jo8 jo8Var = this.b;
                        switch (b3) {
                            case 0:
                                gl.d3(new on7(jo8Var, jo8Var.e, (byte) 6));
                                break;
                            default:
                                int i2 = jo8Var.e;
                                ProfileActivity profileActivity = jo8Var.h.e;
                                if (i2 != 0) {
                                    profileActivity.presentFragment(new p3c(8, null));
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
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: p8a
                    public final /* synthetic */ jo8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        jo8 jo8Var = this.b;
                        switch (b3) {
                            case 0:
                                gl.d3(new on7(jo8Var, jo8Var.e, (byte) 6));
                                break;
                            default:
                                int i2 = jo8Var.e;
                                ProfileActivity profileActivity = jo8Var.h.e;
                                if (i2 != 0) {
                                    profileActivity.presentFragment(new p3c(8, null));
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
