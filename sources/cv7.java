// default package

import android.R;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv7 b;
    public final /* synthetic */ w44 c;

    public /* synthetic */ cv7(xv7 xv7Var, w44 w44Var, byte b) {
        this.a = b;
        this.b = xv7Var;
        this.c = w44Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final w44 w44Var = this.c;
        final xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.B0(w44Var);
                break;
            default:
                tv7 tv7Var = xv7Var.H0;
                kv7 kv7Var = xv7Var.E1;
                rk5 rk5Var = xv7Var.w1;
                LinearLayout linearLayout = new LinearLayout(xv7Var.getContext());
                final byte b2 = 0;
                linearLayout.setOrientation(0);
                boolean z = w44Var instanceof u37;
                final byte b3 = 1;
                if (!z) {
                    TextView textView = new TextView(xv7Var.getContext());
                    anb.X(textView, cmb.D8, rk5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(gm.o());
                    textView.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(jb6.M0(2131747405, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: fv7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            w44 w44Var2;
                            byte b4 = b2;
                            w44 w44Var3 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b4) {
                                case 0:
                                    if (w44Var3 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var3);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((xjb) w44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    xv7Var2.D0(w44Var3, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var3, new s87(xv7Var2, w44Var3, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var3);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (w44Var3 instanceof z1b) {
                                        ((z1b) w44Var3).r(true);
                                    } else if (w44Var3 instanceof g29) {
                                        ((g29) w44Var3).r(true);
                                    } else if (w44Var3 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var3;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var3).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    w44Var3.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var3 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var3);
                                        if (w44Var3 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var3, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            w44Var2 = z1bVar;
                                        } else if (w44Var3 instanceof xjb) {
                                            xjb xjbVar = new xjb(xv7Var2.getContext(), (xjb) w44Var3, Q0);
                                            xjbVar.setDelegate(xv7Var2);
                                            xjbVar.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            w44Var2 = xjbVar;
                                        }
                                        xv7Var2.A0(w44Var2);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(w44Var2);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, qoe.o(-2, 44));
                }
                final byte b4 = 3;
                if (w44Var instanceof xjb) {
                    TextView textView2 = new TextView(xv7Var.getContext());
                    anb.X(textView2, cmb.D8, rk5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(gm.o());
                    textView2.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!kv7Var.c() || kv7Var.d) && xv7Var.n2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(jb6.M0(2131747403, null));
                        final byte b5 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: fv7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                w44 w44Var2;
                                byte b42 = b5;
                                w44 w44Var3 = w44Var;
                                xv7 xv7Var2 = xv7Var;
                                switch (b42) {
                                    case 0:
                                        if (w44Var3 instanceof ao9) {
                                            l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                            if (l9bVar != null) {
                                                l9bVar.B();
                                            }
                                        } else {
                                            xv7Var2.B0(w44Var3);
                                        }
                                        m8 m8Var = xv7Var2.x1;
                                        if (m8Var != null && m8Var.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((xjb) w44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        m8 m8Var2 = xv7Var2.x1;
                                        if (m8Var2 != null && m8Var2.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        xv7Var2.D0(w44Var3, true);
                                        xv7Var2.o0();
                                        m8 m8Var3 = xv7Var2.x1;
                                        if (m8Var3 != null && m8Var3.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        xv7Var2.D0(null, true);
                                        xv7Var2.L0((nd6) w44Var3, new s87(xv7Var2, w44Var3, (byte) 6));
                                        m8 m8Var4 = xv7Var2.x1;
                                        if (m8Var4 != null && m8Var4.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        xv7Var2.D0(null, true);
                                        xv7Var2.K0((o66) w44Var3);
                                        m8 m8Var5 = xv7Var2.x1;
                                        if (m8Var5 != null && m8Var5.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        if (w44Var3 instanceof z1b) {
                                            ((z1b) w44Var3).r(true);
                                        } else if (w44Var3 instanceof g29) {
                                            ((g29) w44Var3).r(true);
                                        } else if (w44Var3 instanceof ao9) {
                                            ao9 ao9Var = (ao9) w44Var3;
                                            ao9Var.t0 = !ao9Var.t0;
                                            ao9Var.invalidate();
                                        } else {
                                            ((g88) w44Var3).r(true);
                                        }
                                        m8 m8Var6 = xv7Var2.x1;
                                        if (m8Var6 != null && m8Var6.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        w44Var3.bringToFront();
                                        m8 m8Var7 = xv7Var2.x1;
                                        if (m8Var7 != null && m8Var7.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        tv7 tv7Var2 = xv7Var2.H0;
                                        if (w44Var3 != null) {
                                            PointF Q0 = xv7Var2.Q0(w44Var3);
                                            if (w44Var3 instanceof z1b) {
                                                w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var3, Q0);
                                                z1bVar.setDelegate(xv7Var2);
                                                tv7Var2.addView(z1bVar);
                                                xv7Var2.c0();
                                                w44Var2 = z1bVar;
                                            } else if (w44Var3 instanceof xjb) {
                                                xjb xjbVar = new xjb(xv7Var2.getContext(), (xjb) w44Var3, Q0);
                                                xjbVar.setDelegate(xv7Var2);
                                                xjbVar.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                                tv7Var2.addView(xjbVar, qoe.c(-2.0f, -2));
                                                xv7Var2.c0();
                                                w44Var2 = xjbVar;
                                            }
                                            xv7Var2.A0(w44Var2);
                                            xv7Var2.D0(null, true);
                                            xv7Var2.a0(w44Var2);
                                        }
                                        m8 m8Var8 = xv7Var2.x1;
                                        if (m8Var8 != null && m8Var8.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(jb6.M0(2131747168, null));
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: fv7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                w44 w44Var2;
                                byte b42 = b3;
                                w44 w44Var3 = w44Var;
                                xv7 xv7Var2 = xv7Var;
                                switch (b42) {
                                    case 0:
                                        if (w44Var3 instanceof ao9) {
                                            l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                            if (l9bVar != null) {
                                                l9bVar.B();
                                            }
                                        } else {
                                            xv7Var2.B0(w44Var3);
                                        }
                                        m8 m8Var = xv7Var2.x1;
                                        if (m8Var != null && m8Var.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((xjb) w44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        m8 m8Var2 = xv7Var2.x1;
                                        if (m8Var2 != null && m8Var2.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        xv7Var2.D0(w44Var3, true);
                                        xv7Var2.o0();
                                        m8 m8Var3 = xv7Var2.x1;
                                        if (m8Var3 != null && m8Var3.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        xv7Var2.D0(null, true);
                                        xv7Var2.L0((nd6) w44Var3, new s87(xv7Var2, w44Var3, (byte) 6));
                                        m8 m8Var4 = xv7Var2.x1;
                                        if (m8Var4 != null && m8Var4.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        xv7Var2.D0(null, true);
                                        xv7Var2.K0((o66) w44Var3);
                                        m8 m8Var5 = xv7Var2.x1;
                                        if (m8Var5 != null && m8Var5.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        if (w44Var3 instanceof z1b) {
                                            ((z1b) w44Var3).r(true);
                                        } else if (w44Var3 instanceof g29) {
                                            ((g29) w44Var3).r(true);
                                        } else if (w44Var3 instanceof ao9) {
                                            ao9 ao9Var = (ao9) w44Var3;
                                            ao9Var.t0 = !ao9Var.t0;
                                            ao9Var.invalidate();
                                        } else {
                                            ((g88) w44Var3).r(true);
                                        }
                                        m8 m8Var6 = xv7Var2.x1;
                                        if (m8Var6 != null && m8Var6.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        w44Var3.bringToFront();
                                        m8 m8Var7 = xv7Var2.x1;
                                        if (m8Var7 != null && m8Var7.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        tv7 tv7Var2 = xv7Var2.H0;
                                        if (w44Var3 != null) {
                                            PointF Q0 = xv7Var2.Q0(w44Var3);
                                            if (w44Var3 instanceof z1b) {
                                                w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var3, Q0);
                                                z1bVar.setDelegate(xv7Var2);
                                                tv7Var2.addView(z1bVar);
                                                xv7Var2.c0();
                                                w44Var2 = z1bVar;
                                            } else if (w44Var3 instanceof xjb) {
                                                xjb xjbVar = new xjb(xv7Var2.getContext(), (xjb) w44Var3, Q0);
                                                xjbVar.setDelegate(xv7Var2);
                                                xjbVar.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                                tv7Var2.addView(xjbVar, qoe.c(-2.0f, -2));
                                                xv7Var2.c0();
                                                w44Var2 = xjbVar;
                                            }
                                            xv7Var2.A0(w44Var2);
                                            xv7Var2.D0(null, true);
                                            xv7Var2.a0(w44Var2);
                                        }
                                        m8 m8Var8 = xv7Var2.x1;
                                        if (m8Var8 != null && m8Var8.isShowing()) {
                                            xv7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, qoe.o(-2, 44));
                } else if (w44Var instanceof nd6) {
                    TextView d0 = xv7Var.d0(1, jb6.M0(2131747403, null));
                    d0.setOnClickListener(new View.OnClickListener() { // from class: fv7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            w44 w44Var2;
                            byte b42 = b4;
                            w44 w44Var3 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b42) {
                                case 0:
                                    if (w44Var3 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var3);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((xjb) w44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    xv7Var2.D0(w44Var3, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var3, new s87(xv7Var2, w44Var3, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var3);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (w44Var3 instanceof z1b) {
                                        ((z1b) w44Var3).r(true);
                                    } else if (w44Var3 instanceof g29) {
                                        ((g29) w44Var3).r(true);
                                    } else if (w44Var3 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var3;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var3).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    w44Var3.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var3 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var3);
                                        if (w44Var3 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var3, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            w44Var2 = z1bVar;
                                        } else if (w44Var3 instanceof xjb) {
                                            xjb xjbVar = new xjb(xv7Var2.getContext(), (xjb) w44Var3, Q0);
                                            xjbVar.setDelegate(xv7Var2);
                                            xjbVar.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            w44Var2 = xjbVar;
                                        }
                                        xv7Var2.A0(w44Var2);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(w44Var2);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(d0, qoe.o(-2, 44));
                } else if (w44Var instanceof o66) {
                    TextView d02 = xv7Var.d0(1, jb6.M0(2131747403, null));
                    final byte b6 = 4;
                    d02.setOnClickListener(new View.OnClickListener() { // from class: fv7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            w44 w44Var2;
                            byte b42 = b6;
                            w44 w44Var3 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b42) {
                                case 0:
                                    if (w44Var3 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var3);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((xjb) w44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    xv7Var2.D0(w44Var3, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var3, new s87(xv7Var2, w44Var3, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var3);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (w44Var3 instanceof z1b) {
                                        ((z1b) w44Var3).r(true);
                                    } else if (w44Var3 instanceof g29) {
                                        ((g29) w44Var3).r(true);
                                    } else if (w44Var3 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var3;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var3).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    w44Var3.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var3 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var3);
                                        if (w44Var3 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var3, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            w44Var2 = z1bVar;
                                        } else if (w44Var3 instanceof xjb) {
                                            xjb xjbVar = new xjb(xv7Var2.getContext(), (xjb) w44Var3, Q0);
                                            xjbVar.setDelegate(xv7Var2);
                                            xjbVar.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            w44Var2 = xjbVar;
                                        }
                                        xv7Var2.A0(w44Var2);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(w44Var2);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(d02, qoe.o(-2, 44));
                }
                if ((w44Var instanceof z1b) || (w44Var instanceof ao9) || (w44Var instanceof g88) || (w44Var instanceof g29)) {
                    TextView d03 = xv7Var.d0(4, jb6.M0(2131750622, null));
                    final byte b7 = 5;
                    d03.setOnClickListener(new View.OnClickListener() { // from class: fv7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            w44 w44Var2;
                            byte b42 = b7;
                            w44 w44Var3 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b42) {
                                case 0:
                                    if (w44Var3 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var3);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((xjb) w44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    xv7Var2.D0(w44Var3, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var3, new s87(xv7Var2, w44Var3, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var3);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (w44Var3 instanceof z1b) {
                                        ((z1b) w44Var3).r(true);
                                    } else if (w44Var3 instanceof g29) {
                                        ((g29) w44Var3).r(true);
                                    } else if (w44Var3 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var3;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var3).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    w44Var3.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var3 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var3);
                                        if (w44Var3 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var3, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            w44Var2 = z1bVar;
                                        } else if (w44Var3 instanceof xjb) {
                                            xjb xjbVar = new xjb(xv7Var2.getContext(), (xjb) w44Var3, Q0);
                                            xjbVar.setDelegate(xv7Var2);
                                            xjbVar.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            w44Var2 = xjbVar;
                                        }
                                        xv7Var2.A0(w44Var2);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(w44Var2);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(d03, qoe.o(-2, 44));
                }
                boolean z2 = w44Var instanceof g88;
                if (tv7Var.indexOfChild(w44Var) != tv7Var.getChildCount() - 1 && !(w44Var instanceof g29)) {
                    TextView textView3 = new TextView(xv7Var.getContext());
                    anb.X(textView3, cmb.D8, rk5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(gm.o());
                    textView3.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(jb6.M0(2131747408, null));
                    final byte b8 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: fv7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            w44 w44Var2;
                            byte b42 = b8;
                            w44 w44Var3 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b42) {
                                case 0:
                                    if (w44Var3 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var3);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((xjb) w44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    xv7Var2.D0(w44Var3, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var3, new s87(xv7Var2, w44Var3, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var3);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (w44Var3 instanceof z1b) {
                                        ((z1b) w44Var3).r(true);
                                    } else if (w44Var3 instanceof g29) {
                                        ((g29) w44Var3).r(true);
                                    } else if (w44Var3 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var3;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var3).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    w44Var3.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var3 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var3);
                                        if (w44Var3 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var3, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            w44Var2 = z1bVar;
                                        } else if (w44Var3 instanceof xjb) {
                                            xjb xjbVar = new xjb(xv7Var2.getContext(), (xjb) w44Var3, Q0);
                                            xjbVar.setDelegate(xv7Var2);
                                            xjbVar.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            w44Var2 = xjbVar;
                                        }
                                        xv7Var2.A0(w44Var2);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(w44Var2);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, qoe.o(-2, 44));
                } else if (!(w44Var instanceof kd1) && !z2 && !z && !(w44Var instanceof ao9) && !(w44Var instanceof nd6) && !(w44Var instanceof kuc) && !(w44Var instanceof o66) && !(w44Var instanceof g29)) {
                    TextView textView4 = new TextView(xv7Var.getContext());
                    anb.X(textView4, cmb.D8, rk5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(gm.o());
                    textView4.setPadding(gm.L(14.0f), 0, gm.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(jb6.M0(2131747404, "PaintDuplicate"));
                    final byte b9 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: fv7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            w44 w44Var2;
                            byte b42 = b9;
                            w44 w44Var3 = w44Var;
                            xv7 xv7Var2 = xv7Var;
                            switch (b42) {
                                case 0:
                                    if (w44Var3 instanceof ao9) {
                                        l9b l9bVar = ((z8b) xv7Var2).u2.d1;
                                        if (l9bVar != null) {
                                            l9bVar.B();
                                        }
                                    } else {
                                        xv7Var2.B0(w44Var3);
                                    }
                                    m8 m8Var = xv7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((xjb) w44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    m8 m8Var2 = xv7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    xv7Var2.D0(w44Var3, true);
                                    xv7Var2.o0();
                                    m8 m8Var3 = xv7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.L0((nd6) w44Var3, new s87(xv7Var2, w44Var3, (byte) 6));
                                    m8 m8Var4 = xv7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    xv7Var2.D0(null, true);
                                    xv7Var2.K0((o66) w44Var3);
                                    m8 m8Var5 = xv7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (w44Var3 instanceof z1b) {
                                        ((z1b) w44Var3).r(true);
                                    } else if (w44Var3 instanceof g29) {
                                        ((g29) w44Var3).r(true);
                                    } else if (w44Var3 instanceof ao9) {
                                        ao9 ao9Var = (ao9) w44Var3;
                                        ao9Var.t0 = !ao9Var.t0;
                                        ao9Var.invalidate();
                                    } else {
                                        ((g88) w44Var3).r(true);
                                    }
                                    m8 m8Var6 = xv7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    w44Var3.bringToFront();
                                    m8 m8Var7 = xv7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    tv7 tv7Var2 = xv7Var2.H0;
                                    if (w44Var3 != null) {
                                        PointF Q0 = xv7Var2.Q0(w44Var3);
                                        if (w44Var3 instanceof z1b) {
                                            w44 z1bVar = new z1b(xv7Var2.getContext(), (z1b) w44Var3, Q0);
                                            z1bVar.setDelegate(xv7Var2);
                                            tv7Var2.addView(z1bVar);
                                            xv7Var2.c0();
                                            w44Var2 = z1bVar;
                                        } else if (w44Var3 instanceof xjb) {
                                            xjb xjbVar = new xjb(xv7Var2.getContext(), (xjb) w44Var3, Q0);
                                            xjbVar.setDelegate(xv7Var2);
                                            xjbVar.setMaxWidth(xv7Var2.H1 - gm.L(32.0f));
                                            tv7Var2.addView(xjbVar, qoe.c(-2.0f, -2));
                                            xv7Var2.c0();
                                            w44Var2 = xjbVar;
                                        }
                                        xv7Var2.A0(w44Var2);
                                        xv7Var2.D0(null, true);
                                        xv7Var2.a0(w44Var2);
                                    }
                                    m8 m8Var8 = xv7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        xv7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, qoe.o(-2, 44));
                }
                int i = 0;
                while (i < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i);
                    int i2 = cmb.h6;
                    int v0 = cmb.v0(i2, rk5Var);
                    int i3 = 8;
                    int i4 = i == 0 ? 8 : 0;
                    int i5 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i6 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i != 0) {
                        i3 = 0;
                    }
                    anb.R(childAt, cmb.a0(v0, i4, i5, i6, i3), null, anb.M(i2), rk5Var);
                    i++;
                }
                xv7Var.y1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
