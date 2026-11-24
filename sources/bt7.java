// default package

import android.R;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wt7 b;
    public final /* synthetic */ l34 c;

    public /* synthetic */ bt7(wt7 wt7Var, l34 l34Var, byte b) {
        this.a = b;
        this.b = wt7Var;
        this.c = l34Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final l34 l34Var = this.c;
        final wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.B0(l34Var);
                break;
            default:
                st7 st7Var = wt7Var.H0;
                jt7 jt7Var = wt7Var.E1;
                si5 si5Var = wt7Var.w1;
                LinearLayout linearLayout = new LinearLayout(wt7Var.getContext());
                final byte b2 = 0;
                linearLayout.setOrientation(0);
                boolean z = l34Var instanceof u17;
                final byte b3 = 1;
                if (!z) {
                    TextView textView = new TextView(wt7Var.getContext());
                    zkb.X(textView, bkb.D8, si5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(gl.o());
                    textView.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(k96.M0(2131747479, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: et7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l34 l34Var2;
                            byte b4 = b2;
                            l34 l34Var3 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b4) {
                                case 0:
                                    if (l34Var3 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var3);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((vhb) l34Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    wt7Var2.D0(l34Var3, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var3, new w77(wt7Var2, l34Var3, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var3);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (l34Var3 instanceof yza) {
                                        ((yza) l34Var3).r(true);
                                    } else if (l34Var3 instanceof e09) {
                                        ((e09) l34Var3).r(true);
                                    } else if (l34Var3 instanceof am9) {
                                        am9 am9Var = (am9) l34Var3;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var3).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l34Var3.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var3 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var3);
                                        if (l34Var3 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var3, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            l34Var2 = yzaVar;
                                        } else if (l34Var3 instanceof vhb) {
                                            vhb vhbVar = new vhb(wt7Var2.getContext(), (vhb) l34Var3, Q0);
                                            vhbVar.setDelegate(wt7Var2);
                                            vhbVar.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            l34Var2 = vhbVar;
                                        }
                                        wt7Var2.A0(l34Var2);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(l34Var2);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, nme.o(-2, 44));
                }
                final byte b4 = 3;
                if (l34Var instanceof vhb) {
                    TextView textView2 = new TextView(wt7Var.getContext());
                    zkb.X(textView2, bkb.D8, si5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(gl.o());
                    textView2.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!jt7Var.c() || jt7Var.d) && wt7Var.n2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(k96.M0(2131747477, null));
                        final byte b5 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: et7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                l34 l34Var2;
                                byte b42 = b5;
                                l34 l34Var3 = l34Var;
                                wt7 wt7Var2 = wt7Var;
                                switch (b42) {
                                    case 0:
                                        if (l34Var3 instanceof am9) {
                                            j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                            if (j7bVar != null) {
                                                j7bVar.B();
                                            }
                                        } else {
                                            wt7Var2.B0(l34Var3);
                                        }
                                        m8 m8Var = wt7Var2.x1;
                                        if (m8Var != null && m8Var.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((vhb) l34Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                        m8 m8Var2 = wt7Var2.x1;
                                        if (m8Var2 != null && m8Var2.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        wt7Var2.D0(l34Var3, true);
                                        wt7Var2.o0();
                                        m8 m8Var3 = wt7Var2.x1;
                                        if (m8Var3 != null && m8Var3.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        wt7Var2.D0(null, true);
                                        wt7Var2.L0((ob6) l34Var3, new w77(wt7Var2, l34Var3, (byte) 4));
                                        m8 m8Var4 = wt7Var2.x1;
                                        if (m8Var4 != null && m8Var4.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        wt7Var2.D0(null, true);
                                        wt7Var2.K0((o46) l34Var3);
                                        m8 m8Var5 = wt7Var2.x1;
                                        if (m8Var5 != null && m8Var5.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        if (l34Var3 instanceof yza) {
                                            ((yza) l34Var3).r(true);
                                        } else if (l34Var3 instanceof e09) {
                                            ((e09) l34Var3).r(true);
                                        } else if (l34Var3 instanceof am9) {
                                            am9 am9Var = (am9) l34Var3;
                                            am9Var.t0 = !am9Var.t0;
                                            am9Var.invalidate();
                                        } else {
                                            ((e68) l34Var3).r(true);
                                        }
                                        m8 m8Var6 = wt7Var2.x1;
                                        if (m8Var6 != null && m8Var6.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        l34Var3.bringToFront();
                                        m8 m8Var7 = wt7Var2.x1;
                                        if (m8Var7 != null && m8Var7.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        st7 st7Var2 = wt7Var2.H0;
                                        if (l34Var3 != null) {
                                            PointF Q0 = wt7Var2.Q0(l34Var3);
                                            if (l34Var3 instanceof yza) {
                                                l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var3, Q0);
                                                yzaVar.setDelegate(wt7Var2);
                                                st7Var2.addView(yzaVar);
                                                wt7Var2.c0();
                                                l34Var2 = yzaVar;
                                            } else if (l34Var3 instanceof vhb) {
                                                vhb vhbVar = new vhb(wt7Var2.getContext(), (vhb) l34Var3, Q0);
                                                vhbVar.setDelegate(wt7Var2);
                                                vhbVar.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                                st7Var2.addView(vhbVar, nme.c(-2.0f, -2));
                                                wt7Var2.c0();
                                                l34Var2 = vhbVar;
                                            }
                                            wt7Var2.A0(l34Var2);
                                            wt7Var2.D0(null, true);
                                            wt7Var2.a0(l34Var2);
                                        }
                                        m8 m8Var8 = wt7Var2.x1;
                                        if (m8Var8 != null && m8Var8.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(k96.M0(2131747242, null));
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: et7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                l34 l34Var2;
                                byte b42 = b3;
                                l34 l34Var3 = l34Var;
                                wt7 wt7Var2 = wt7Var;
                                switch (b42) {
                                    case 0:
                                        if (l34Var3 instanceof am9) {
                                            j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                            if (j7bVar != null) {
                                                j7bVar.B();
                                            }
                                        } else {
                                            wt7Var2.B0(l34Var3);
                                        }
                                        m8 m8Var = wt7Var2.x1;
                                        if (m8Var != null && m8Var.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((vhb) l34Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                        m8 m8Var2 = wt7Var2.x1;
                                        if (m8Var2 != null && m8Var2.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        wt7Var2.D0(l34Var3, true);
                                        wt7Var2.o0();
                                        m8 m8Var3 = wt7Var2.x1;
                                        if (m8Var3 != null && m8Var3.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        wt7Var2.D0(null, true);
                                        wt7Var2.L0((ob6) l34Var3, new w77(wt7Var2, l34Var3, (byte) 4));
                                        m8 m8Var4 = wt7Var2.x1;
                                        if (m8Var4 != null && m8Var4.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        wt7Var2.D0(null, true);
                                        wt7Var2.K0((o46) l34Var3);
                                        m8 m8Var5 = wt7Var2.x1;
                                        if (m8Var5 != null && m8Var5.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        if (l34Var3 instanceof yza) {
                                            ((yza) l34Var3).r(true);
                                        } else if (l34Var3 instanceof e09) {
                                            ((e09) l34Var3).r(true);
                                        } else if (l34Var3 instanceof am9) {
                                            am9 am9Var = (am9) l34Var3;
                                            am9Var.t0 = !am9Var.t0;
                                            am9Var.invalidate();
                                        } else {
                                            ((e68) l34Var3).r(true);
                                        }
                                        m8 m8Var6 = wt7Var2.x1;
                                        if (m8Var6 != null && m8Var6.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        l34Var3.bringToFront();
                                        m8 m8Var7 = wt7Var2.x1;
                                        if (m8Var7 != null && m8Var7.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        st7 st7Var2 = wt7Var2.H0;
                                        if (l34Var3 != null) {
                                            PointF Q0 = wt7Var2.Q0(l34Var3);
                                            if (l34Var3 instanceof yza) {
                                                l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var3, Q0);
                                                yzaVar.setDelegate(wt7Var2);
                                                st7Var2.addView(yzaVar);
                                                wt7Var2.c0();
                                                l34Var2 = yzaVar;
                                            } else if (l34Var3 instanceof vhb) {
                                                vhb vhbVar = new vhb(wt7Var2.getContext(), (vhb) l34Var3, Q0);
                                                vhbVar.setDelegate(wt7Var2);
                                                vhbVar.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                                st7Var2.addView(vhbVar, nme.c(-2.0f, -2));
                                                wt7Var2.c0();
                                                l34Var2 = vhbVar;
                                            }
                                            wt7Var2.A0(l34Var2);
                                            wt7Var2.D0(null, true);
                                            wt7Var2.a0(l34Var2);
                                        }
                                        m8 m8Var8 = wt7Var2.x1;
                                        if (m8Var8 != null && m8Var8.isShowing()) {
                                            wt7Var2.x1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, nme.o(-2, 44));
                } else if (l34Var instanceof ob6) {
                    TextView d0 = wt7Var.d0(1, k96.M0(2131747477, null));
                    d0.setOnClickListener(new View.OnClickListener() { // from class: et7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l34 l34Var2;
                            byte b42 = b4;
                            l34 l34Var3 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b42) {
                                case 0:
                                    if (l34Var3 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var3);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((vhb) l34Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    wt7Var2.D0(l34Var3, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var3, new w77(wt7Var2, l34Var3, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var3);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (l34Var3 instanceof yza) {
                                        ((yza) l34Var3).r(true);
                                    } else if (l34Var3 instanceof e09) {
                                        ((e09) l34Var3).r(true);
                                    } else if (l34Var3 instanceof am9) {
                                        am9 am9Var = (am9) l34Var3;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var3).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l34Var3.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var3 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var3);
                                        if (l34Var3 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var3, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            l34Var2 = yzaVar;
                                        } else if (l34Var3 instanceof vhb) {
                                            vhb vhbVar = new vhb(wt7Var2.getContext(), (vhb) l34Var3, Q0);
                                            vhbVar.setDelegate(wt7Var2);
                                            vhbVar.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            l34Var2 = vhbVar;
                                        }
                                        wt7Var2.A0(l34Var2);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(l34Var2);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(d0, nme.o(-2, 44));
                } else if (l34Var instanceof o46) {
                    TextView d02 = wt7Var.d0(1, k96.M0(2131747477, null));
                    final byte b6 = 4;
                    d02.setOnClickListener(new View.OnClickListener() { // from class: et7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l34 l34Var2;
                            byte b42 = b6;
                            l34 l34Var3 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b42) {
                                case 0:
                                    if (l34Var3 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var3);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((vhb) l34Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    wt7Var2.D0(l34Var3, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var3, new w77(wt7Var2, l34Var3, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var3);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (l34Var3 instanceof yza) {
                                        ((yza) l34Var3).r(true);
                                    } else if (l34Var3 instanceof e09) {
                                        ((e09) l34Var3).r(true);
                                    } else if (l34Var3 instanceof am9) {
                                        am9 am9Var = (am9) l34Var3;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var3).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l34Var3.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var3 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var3);
                                        if (l34Var3 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var3, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            l34Var2 = yzaVar;
                                        } else if (l34Var3 instanceof vhb) {
                                            vhb vhbVar = new vhb(wt7Var2.getContext(), (vhb) l34Var3, Q0);
                                            vhbVar.setDelegate(wt7Var2);
                                            vhbVar.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            l34Var2 = vhbVar;
                                        }
                                        wt7Var2.A0(l34Var2);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(l34Var2);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(d02, nme.o(-2, 44));
                }
                if ((l34Var instanceof yza) || (l34Var instanceof am9) || (l34Var instanceof e68) || (l34Var instanceof e09)) {
                    TextView d03 = wt7Var.d0(4, k96.M0(2131750673, null));
                    final byte b7 = 5;
                    d03.setOnClickListener(new View.OnClickListener() { // from class: et7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l34 l34Var2;
                            byte b42 = b7;
                            l34 l34Var3 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b42) {
                                case 0:
                                    if (l34Var3 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var3);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((vhb) l34Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    wt7Var2.D0(l34Var3, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var3, new w77(wt7Var2, l34Var3, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var3);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (l34Var3 instanceof yza) {
                                        ((yza) l34Var3).r(true);
                                    } else if (l34Var3 instanceof e09) {
                                        ((e09) l34Var3).r(true);
                                    } else if (l34Var3 instanceof am9) {
                                        am9 am9Var = (am9) l34Var3;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var3).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l34Var3.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var3 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var3);
                                        if (l34Var3 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var3, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            l34Var2 = yzaVar;
                                        } else if (l34Var3 instanceof vhb) {
                                            vhb vhbVar = new vhb(wt7Var2.getContext(), (vhb) l34Var3, Q0);
                                            vhbVar.setDelegate(wt7Var2);
                                            vhbVar.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            l34Var2 = vhbVar;
                                        }
                                        wt7Var2.A0(l34Var2);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(l34Var2);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(d03, nme.o(-2, 44));
                }
                boolean z2 = l34Var instanceof e68;
                if (st7Var.indexOfChild(l34Var) != st7Var.getChildCount() - 1 && !(l34Var instanceof e09)) {
                    TextView textView3 = new TextView(wt7Var.getContext());
                    zkb.X(textView3, bkb.D8, si5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(gl.o());
                    textView3.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(k96.M0(2131747482, null));
                    final byte b8 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: et7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l34 l34Var2;
                            byte b42 = b8;
                            l34 l34Var3 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b42) {
                                case 0:
                                    if (l34Var3 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var3);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((vhb) l34Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    wt7Var2.D0(l34Var3, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var3, new w77(wt7Var2, l34Var3, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var3);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (l34Var3 instanceof yza) {
                                        ((yza) l34Var3).r(true);
                                    } else if (l34Var3 instanceof e09) {
                                        ((e09) l34Var3).r(true);
                                    } else if (l34Var3 instanceof am9) {
                                        am9 am9Var = (am9) l34Var3;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var3).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l34Var3.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var3 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var3);
                                        if (l34Var3 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var3, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            l34Var2 = yzaVar;
                                        } else if (l34Var3 instanceof vhb) {
                                            vhb vhbVar = new vhb(wt7Var2.getContext(), (vhb) l34Var3, Q0);
                                            vhbVar.setDelegate(wt7Var2);
                                            vhbVar.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            l34Var2 = vhbVar;
                                        }
                                        wt7Var2.A0(l34Var2);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(l34Var2);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, nme.o(-2, 44));
                } else if (!(l34Var instanceof cc1) && !z2 && !z && !(l34Var instanceof am9) && !(l34Var instanceof ob6) && !(l34Var instanceof hsc) && !(l34Var instanceof o46) && !(l34Var instanceof e09)) {
                    TextView textView4 = new TextView(wt7Var.getContext());
                    zkb.X(textView4, bkb.D8, si5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(gl.o());
                    textView4.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(k96.M0(2131747478, "PaintDuplicate"));
                    final byte b9 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: et7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            l34 l34Var2;
                            byte b42 = b9;
                            l34 l34Var3 = l34Var;
                            wt7 wt7Var2 = wt7Var;
                            switch (b42) {
                                case 0:
                                    if (l34Var3 instanceof am9) {
                                        j7b j7bVar = ((x6b) wt7Var2).u2.d1;
                                        if (j7bVar != null) {
                                            j7bVar.B();
                                        }
                                    } else {
                                        wt7Var2.B0(l34Var3);
                                    }
                                    m8 m8Var = wt7Var2.x1;
                                    if (m8Var != null && m8Var.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((vhb) l34Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                    m8 m8Var2 = wt7Var2.x1;
                                    if (m8Var2 != null && m8Var2.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    wt7Var2.D0(l34Var3, true);
                                    wt7Var2.o0();
                                    m8 m8Var3 = wt7Var2.x1;
                                    if (m8Var3 != null && m8Var3.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.L0((ob6) l34Var3, new w77(wt7Var2, l34Var3, (byte) 4));
                                    m8 m8Var4 = wt7Var2.x1;
                                    if (m8Var4 != null && m8Var4.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    wt7Var2.D0(null, true);
                                    wt7Var2.K0((o46) l34Var3);
                                    m8 m8Var5 = wt7Var2.x1;
                                    if (m8Var5 != null && m8Var5.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (l34Var3 instanceof yza) {
                                        ((yza) l34Var3).r(true);
                                    } else if (l34Var3 instanceof e09) {
                                        ((e09) l34Var3).r(true);
                                    } else if (l34Var3 instanceof am9) {
                                        am9 am9Var = (am9) l34Var3;
                                        am9Var.t0 = !am9Var.t0;
                                        am9Var.invalidate();
                                    } else {
                                        ((e68) l34Var3).r(true);
                                    }
                                    m8 m8Var6 = wt7Var2.x1;
                                    if (m8Var6 != null && m8Var6.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l34Var3.bringToFront();
                                    m8 m8Var7 = wt7Var2.x1;
                                    if (m8Var7 != null && m8Var7.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    st7 st7Var2 = wt7Var2.H0;
                                    if (l34Var3 != null) {
                                        PointF Q0 = wt7Var2.Q0(l34Var3);
                                        if (l34Var3 instanceof yza) {
                                            l34 yzaVar = new yza(wt7Var2.getContext(), (yza) l34Var3, Q0);
                                            yzaVar.setDelegate(wt7Var2);
                                            st7Var2.addView(yzaVar);
                                            wt7Var2.c0();
                                            l34Var2 = yzaVar;
                                        } else if (l34Var3 instanceof vhb) {
                                            vhb vhbVar = new vhb(wt7Var2.getContext(), (vhb) l34Var3, Q0);
                                            vhbVar.setDelegate(wt7Var2);
                                            vhbVar.setMaxWidth(wt7Var2.H1 - gl.L(32.0f));
                                            st7Var2.addView(vhbVar, nme.c(-2.0f, -2));
                                            wt7Var2.c0();
                                            l34Var2 = vhbVar;
                                        }
                                        wt7Var2.A0(l34Var2);
                                        wt7Var2.D0(null, true);
                                        wt7Var2.a0(l34Var2);
                                    }
                                    m8 m8Var8 = wt7Var2.x1;
                                    if (m8Var8 != null && m8Var8.isShowing()) {
                                        wt7Var2.x1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, nme.o(-2, 44));
                }
                int i = 0;
                while (i < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i);
                    int i2 = bkb.h6;
                    int v0 = bkb.v0(i2, si5Var);
                    int i3 = 8;
                    int i4 = i == 0 ? 8 : 0;
                    int i5 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i6 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i != 0) {
                        i3 = 0;
                    }
                    zkb.R(childAt, bkb.a0(v0, i4, i5, i6, i3), null, zkb.M(i2), si5Var);
                    i++;
                }
                wt7Var.y1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
