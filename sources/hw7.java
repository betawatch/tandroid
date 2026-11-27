// default package

import android.R;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx7 b;
    public final /* synthetic */ h44 c;

    public /* synthetic */ hw7(dx7 dx7Var, h44 h44Var, byte b) {
        this.a = b;
        this.b = dx7Var;
        this.c = h44Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final h44 h44Var = this.c;
        final dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                dx7Var.B0(h44Var);
                break;
            default:
                zw7 zw7Var = dx7Var.B0;
                qw7 qw7Var = dx7Var.y1;
                uk5 uk5Var = dx7Var.q1;
                LinearLayout linearLayout = new LinearLayout(dx7Var.getContext());
                final byte b2 = 0;
                linearLayout.setOrientation(0);
                boolean z = h44Var instanceof b47;
                final byte b3 = 1;
                if (!z) {
                    TextView textView = new TextView(dx7Var.getContext());
                    yob.X(textView, aob.E8, uk5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(hl.o());
                    textView.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(ob6.M0(2131747399, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: lw7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            h44 h44Var2;
                            byte b4 = b2;
                            h44 h44Var3 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b4) {
                                case 0:
                                    if (h44Var3 instanceof pp9) {
                                        hbb hbbVar = ((vab) dx7Var2).o2.d1;
                                        if (hbbVar != null) {
                                            hbbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var3);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((rlb) h44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    dx7Var2.C0(h44Var3, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var3, new ia7(dx7Var2, h44Var3, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var3);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (h44Var3 instanceof v3b) {
                                        ((v3b) h44Var3).r(true);
                                    } else if (h44Var3 instanceof s39) {
                                        ((s39) h44Var3).r(true);
                                    } else if (h44Var3 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var3;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var3).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    h44Var3.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var3 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var3);
                                        if (h44Var3 instanceof v3b) {
                                            h44 v3bVar = new v3b(dx7Var2.getContext(), (v3b) h44Var3, P0);
                                            v3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(v3bVar);
                                            dx7Var2.c0();
                                            h44Var2 = v3bVar;
                                        } else if (h44Var3 instanceof rlb) {
                                            rlb rlbVar = new rlb(dx7Var2.getContext(), (rlb) h44Var3, P0);
                                            rlbVar.setDelegate(dx7Var2);
                                            rlbVar.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            h44Var2 = rlbVar;
                                        }
                                        dx7Var2.A0(h44Var2);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(h44Var2);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, tre.o(-2, 44));
                }
                final byte b4 = 3;
                if (h44Var instanceof rlb) {
                    TextView textView2 = new TextView(dx7Var.getContext());
                    yob.X(textView2, aob.E8, uk5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(hl.o());
                    textView2.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!qw7Var.c() || qw7Var.d) && dx7Var.h2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(ob6.M0(2131747397, null));
                        final byte b5 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: lw7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                h44 h44Var2;
                                byte b42 = b5;
                                h44 h44Var3 = h44Var;
                                dx7 dx7Var2 = dx7Var;
                                switch (b42) {
                                    case 0:
                                        if (h44Var3 instanceof pp9) {
                                            hbb hbbVar = ((vab) dx7Var2).o2.d1;
                                            if (hbbVar != null) {
                                                hbbVar.B();
                                            }
                                        } else {
                                            dx7Var2.B0(h44Var3);
                                        }
                                        n8 n8Var = dx7Var2.r1;
                                        if (n8Var != null && n8Var.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((rlb) h44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                        }
                                        n8 n8Var2 = dx7Var2.r1;
                                        if (n8Var2 != null && n8Var2.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        dx7Var2.C0(h44Var3, true);
                                        dx7Var2.o0();
                                        n8 n8Var3 = dx7Var2.r1;
                                        if (n8Var3 != null && n8Var3.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        dx7Var2.C0(null, true);
                                        dx7Var2.K0((sd6) h44Var3, new ia7(dx7Var2, h44Var3, (byte) 4));
                                        n8 n8Var4 = dx7Var2.r1;
                                        if (n8Var4 != null && n8Var4.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        dx7Var2.C0(null, true);
                                        dx7Var2.J0((s66) h44Var3);
                                        n8 n8Var5 = dx7Var2.r1;
                                        if (n8Var5 != null && n8Var5.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        if (h44Var3 instanceof v3b) {
                                            ((v3b) h44Var3).r(true);
                                        } else if (h44Var3 instanceof s39) {
                                            ((s39) h44Var3).r(true);
                                        } else if (h44Var3 instanceof pp9) {
                                            pp9 pp9Var = (pp9) h44Var3;
                                            pp9Var.t0 = !pp9Var.t0;
                                            pp9Var.invalidate();
                                        } else {
                                            ((v98) h44Var3).r(true);
                                        }
                                        n8 n8Var6 = dx7Var2.r1;
                                        if (n8Var6 != null && n8Var6.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        h44Var3.bringToFront();
                                        n8 n8Var7 = dx7Var2.r1;
                                        if (n8Var7 != null && n8Var7.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        zw7 zw7Var2 = dx7Var2.B0;
                                        if (h44Var3 != null) {
                                            PointF P0 = dx7Var2.P0(h44Var3);
                                            if (h44Var3 instanceof v3b) {
                                                h44 v3bVar = new v3b(dx7Var2.getContext(), (v3b) h44Var3, P0);
                                                v3bVar.setDelegate(dx7Var2);
                                                zw7Var2.addView(v3bVar);
                                                dx7Var2.c0();
                                                h44Var2 = v3bVar;
                                            } else if (h44Var3 instanceof rlb) {
                                                rlb rlbVar = new rlb(dx7Var2.getContext(), (rlb) h44Var3, P0);
                                                rlbVar.setDelegate(dx7Var2);
                                                rlbVar.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                                zw7Var2.addView(rlbVar, tre.c(-2.0f, -2));
                                                dx7Var2.c0();
                                                h44Var2 = rlbVar;
                                            }
                                            dx7Var2.A0(h44Var2);
                                            dx7Var2.C0(null, true);
                                            dx7Var2.a0(h44Var2);
                                        }
                                        n8 n8Var8 = dx7Var2.r1;
                                        if (n8Var8 != null && n8Var8.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(ob6.M0(2131747162, null));
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: lw7
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                h44 h44Var2;
                                byte b42 = b3;
                                h44 h44Var3 = h44Var;
                                dx7 dx7Var2 = dx7Var;
                                switch (b42) {
                                    case 0:
                                        if (h44Var3 instanceof pp9) {
                                            hbb hbbVar = ((vab) dx7Var2).o2.d1;
                                            if (hbbVar != null) {
                                                hbbVar.B();
                                            }
                                        } else {
                                            dx7Var2.B0(h44Var3);
                                        }
                                        n8 n8Var = dx7Var2.r1;
                                        if (n8Var != null && n8Var.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((rlb) h44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                        }
                                        n8 n8Var2 = dx7Var2.r1;
                                        if (n8Var2 != null && n8Var2.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        dx7Var2.C0(h44Var3, true);
                                        dx7Var2.o0();
                                        n8 n8Var3 = dx7Var2.r1;
                                        if (n8Var3 != null && n8Var3.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        dx7Var2.C0(null, true);
                                        dx7Var2.K0((sd6) h44Var3, new ia7(dx7Var2, h44Var3, (byte) 4));
                                        n8 n8Var4 = dx7Var2.r1;
                                        if (n8Var4 != null && n8Var4.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        dx7Var2.C0(null, true);
                                        dx7Var2.J0((s66) h44Var3);
                                        n8 n8Var5 = dx7Var2.r1;
                                        if (n8Var5 != null && n8Var5.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        if (h44Var3 instanceof v3b) {
                                            ((v3b) h44Var3).r(true);
                                        } else if (h44Var3 instanceof s39) {
                                            ((s39) h44Var3).r(true);
                                        } else if (h44Var3 instanceof pp9) {
                                            pp9 pp9Var = (pp9) h44Var3;
                                            pp9Var.t0 = !pp9Var.t0;
                                            pp9Var.invalidate();
                                        } else {
                                            ((v98) h44Var3).r(true);
                                        }
                                        n8 n8Var6 = dx7Var2.r1;
                                        if (n8Var6 != null && n8Var6.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        h44Var3.bringToFront();
                                        n8 n8Var7 = dx7Var2.r1;
                                        if (n8Var7 != null && n8Var7.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        zw7 zw7Var2 = dx7Var2.B0;
                                        if (h44Var3 != null) {
                                            PointF P0 = dx7Var2.P0(h44Var3);
                                            if (h44Var3 instanceof v3b) {
                                                h44 v3bVar = new v3b(dx7Var2.getContext(), (v3b) h44Var3, P0);
                                                v3bVar.setDelegate(dx7Var2);
                                                zw7Var2.addView(v3bVar);
                                                dx7Var2.c0();
                                                h44Var2 = v3bVar;
                                            } else if (h44Var3 instanceof rlb) {
                                                rlb rlbVar = new rlb(dx7Var2.getContext(), (rlb) h44Var3, P0);
                                                rlbVar.setDelegate(dx7Var2);
                                                rlbVar.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                                zw7Var2.addView(rlbVar, tre.c(-2.0f, -2));
                                                dx7Var2.c0();
                                                h44Var2 = rlbVar;
                                            }
                                            dx7Var2.A0(h44Var2);
                                            dx7Var2.C0(null, true);
                                            dx7Var2.a0(h44Var2);
                                        }
                                        n8 n8Var8 = dx7Var2.r1;
                                        if (n8Var8 != null && n8Var8.isShowing()) {
                                            dx7Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, tre.o(-2, 44));
                } else if (h44Var instanceof sd6) {
                    TextView d0 = dx7Var.d0(1, ob6.M0(2131747397, null));
                    d0.setOnClickListener(new View.OnClickListener() { // from class: lw7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            h44 h44Var2;
                            byte b42 = b4;
                            h44 h44Var3 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b42) {
                                case 0:
                                    if (h44Var3 instanceof pp9) {
                                        hbb hbbVar = ((vab) dx7Var2).o2.d1;
                                        if (hbbVar != null) {
                                            hbbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var3);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((rlb) h44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    dx7Var2.C0(h44Var3, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var3, new ia7(dx7Var2, h44Var3, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var3);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (h44Var3 instanceof v3b) {
                                        ((v3b) h44Var3).r(true);
                                    } else if (h44Var3 instanceof s39) {
                                        ((s39) h44Var3).r(true);
                                    } else if (h44Var3 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var3;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var3).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    h44Var3.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var3 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var3);
                                        if (h44Var3 instanceof v3b) {
                                            h44 v3bVar = new v3b(dx7Var2.getContext(), (v3b) h44Var3, P0);
                                            v3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(v3bVar);
                                            dx7Var2.c0();
                                            h44Var2 = v3bVar;
                                        } else if (h44Var3 instanceof rlb) {
                                            rlb rlbVar = new rlb(dx7Var2.getContext(), (rlb) h44Var3, P0);
                                            rlbVar.setDelegate(dx7Var2);
                                            rlbVar.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            h44Var2 = rlbVar;
                                        }
                                        dx7Var2.A0(h44Var2);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(h44Var2);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(d0, tre.o(-2, 44));
                } else if (h44Var instanceof s66) {
                    TextView d02 = dx7Var.d0(1, ob6.M0(2131747397, null));
                    final byte b6 = 4;
                    d02.setOnClickListener(new View.OnClickListener() { // from class: lw7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            h44 h44Var2;
                            byte b42 = b6;
                            h44 h44Var3 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b42) {
                                case 0:
                                    if (h44Var3 instanceof pp9) {
                                        hbb hbbVar = ((vab) dx7Var2).o2.d1;
                                        if (hbbVar != null) {
                                            hbbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var3);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((rlb) h44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    dx7Var2.C0(h44Var3, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var3, new ia7(dx7Var2, h44Var3, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var3);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (h44Var3 instanceof v3b) {
                                        ((v3b) h44Var3).r(true);
                                    } else if (h44Var3 instanceof s39) {
                                        ((s39) h44Var3).r(true);
                                    } else if (h44Var3 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var3;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var3).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    h44Var3.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var3 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var3);
                                        if (h44Var3 instanceof v3b) {
                                            h44 v3bVar = new v3b(dx7Var2.getContext(), (v3b) h44Var3, P0);
                                            v3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(v3bVar);
                                            dx7Var2.c0();
                                            h44Var2 = v3bVar;
                                        } else if (h44Var3 instanceof rlb) {
                                            rlb rlbVar = new rlb(dx7Var2.getContext(), (rlb) h44Var3, P0);
                                            rlbVar.setDelegate(dx7Var2);
                                            rlbVar.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            h44Var2 = rlbVar;
                                        }
                                        dx7Var2.A0(h44Var2);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(h44Var2);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(d02, tre.o(-2, 44));
                }
                if ((h44Var instanceof v3b) || (h44Var instanceof pp9) || (h44Var instanceof v98) || (h44Var instanceof s39)) {
                    TextView d03 = dx7Var.d0(4, ob6.M0(2131750650, null));
                    final byte b7 = 5;
                    d03.setOnClickListener(new View.OnClickListener() { // from class: lw7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            h44 h44Var2;
                            byte b42 = b7;
                            h44 h44Var3 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b42) {
                                case 0:
                                    if (h44Var3 instanceof pp9) {
                                        hbb hbbVar = ((vab) dx7Var2).o2.d1;
                                        if (hbbVar != null) {
                                            hbbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var3);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((rlb) h44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    dx7Var2.C0(h44Var3, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var3, new ia7(dx7Var2, h44Var3, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var3);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (h44Var3 instanceof v3b) {
                                        ((v3b) h44Var3).r(true);
                                    } else if (h44Var3 instanceof s39) {
                                        ((s39) h44Var3).r(true);
                                    } else if (h44Var3 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var3;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var3).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    h44Var3.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var3 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var3);
                                        if (h44Var3 instanceof v3b) {
                                            h44 v3bVar = new v3b(dx7Var2.getContext(), (v3b) h44Var3, P0);
                                            v3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(v3bVar);
                                            dx7Var2.c0();
                                            h44Var2 = v3bVar;
                                        } else if (h44Var3 instanceof rlb) {
                                            rlb rlbVar = new rlb(dx7Var2.getContext(), (rlb) h44Var3, P0);
                                            rlbVar.setDelegate(dx7Var2);
                                            rlbVar.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            h44Var2 = rlbVar;
                                        }
                                        dx7Var2.A0(h44Var2);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(h44Var2);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(d03, tre.o(-2, 44));
                }
                boolean z2 = h44Var instanceof v98;
                if (zw7Var.indexOfChild(h44Var) != zw7Var.getChildCount() - 1 && !(h44Var instanceof s39)) {
                    TextView textView3 = new TextView(dx7Var.getContext());
                    yob.X(textView3, aob.E8, uk5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(hl.o());
                    textView3.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(ob6.M0(2131747402, null));
                    final byte b8 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: lw7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            h44 h44Var2;
                            byte b42 = b8;
                            h44 h44Var3 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b42) {
                                case 0:
                                    if (h44Var3 instanceof pp9) {
                                        hbb hbbVar = ((vab) dx7Var2).o2.d1;
                                        if (hbbVar != null) {
                                            hbbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var3);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((rlb) h44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    dx7Var2.C0(h44Var3, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var3, new ia7(dx7Var2, h44Var3, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var3);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (h44Var3 instanceof v3b) {
                                        ((v3b) h44Var3).r(true);
                                    } else if (h44Var3 instanceof s39) {
                                        ((s39) h44Var3).r(true);
                                    } else if (h44Var3 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var3;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var3).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    h44Var3.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var3 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var3);
                                        if (h44Var3 instanceof v3b) {
                                            h44 v3bVar = new v3b(dx7Var2.getContext(), (v3b) h44Var3, P0);
                                            v3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(v3bVar);
                                            dx7Var2.c0();
                                            h44Var2 = v3bVar;
                                        } else if (h44Var3 instanceof rlb) {
                                            rlb rlbVar = new rlb(dx7Var2.getContext(), (rlb) h44Var3, P0);
                                            rlbVar.setDelegate(dx7Var2);
                                            rlbVar.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            h44Var2 = rlbVar;
                                        }
                                        dx7Var2.A0(h44Var2);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(h44Var2);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, tre.o(-2, 44));
                } else if (!(h44Var instanceof kc1) && !z2 && !z && !(h44Var instanceof pp9) && !(h44Var instanceof sd6) && !(h44Var instanceof xwc) && !(h44Var instanceof s66) && !(h44Var instanceof s39)) {
                    TextView textView4 = new TextView(dx7Var.getContext());
                    yob.X(textView4, aob.E8, uk5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(hl.o());
                    textView4.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(ob6.M0(2131747398, "PaintDuplicate"));
                    final byte b9 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: lw7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            h44 h44Var2;
                            byte b42 = b9;
                            h44 h44Var3 = h44Var;
                            dx7 dx7Var2 = dx7Var;
                            switch (b42) {
                                case 0:
                                    if (h44Var3 instanceof pp9) {
                                        hbb hbbVar = ((vab) dx7Var2).o2.d1;
                                        if (hbbVar != null) {
                                            hbbVar.B();
                                        }
                                    } else {
                                        dx7Var2.B0(h44Var3);
                                    }
                                    n8 n8Var = dx7Var2.r1;
                                    if (n8Var != null && n8Var.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((rlb) h44Var3).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                    n8 n8Var2 = dx7Var2.r1;
                                    if (n8Var2 != null && n8Var2.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    dx7Var2.C0(h44Var3, true);
                                    dx7Var2.o0();
                                    n8 n8Var3 = dx7Var2.r1;
                                    if (n8Var3 != null && n8Var3.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.K0((sd6) h44Var3, new ia7(dx7Var2, h44Var3, (byte) 4));
                                    n8 n8Var4 = dx7Var2.r1;
                                    if (n8Var4 != null && n8Var4.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    dx7Var2.C0(null, true);
                                    dx7Var2.J0((s66) h44Var3);
                                    n8 n8Var5 = dx7Var2.r1;
                                    if (n8Var5 != null && n8Var5.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    if (h44Var3 instanceof v3b) {
                                        ((v3b) h44Var3).r(true);
                                    } else if (h44Var3 instanceof s39) {
                                        ((s39) h44Var3).r(true);
                                    } else if (h44Var3 instanceof pp9) {
                                        pp9 pp9Var = (pp9) h44Var3;
                                        pp9Var.t0 = !pp9Var.t0;
                                        pp9Var.invalidate();
                                    } else {
                                        ((v98) h44Var3).r(true);
                                    }
                                    n8 n8Var6 = dx7Var2.r1;
                                    if (n8Var6 != null && n8Var6.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    h44Var3.bringToFront();
                                    n8 n8Var7 = dx7Var2.r1;
                                    if (n8Var7 != null && n8Var7.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    zw7 zw7Var2 = dx7Var2.B0;
                                    if (h44Var3 != null) {
                                        PointF P0 = dx7Var2.P0(h44Var3);
                                        if (h44Var3 instanceof v3b) {
                                            h44 v3bVar = new v3b(dx7Var2.getContext(), (v3b) h44Var3, P0);
                                            v3bVar.setDelegate(dx7Var2);
                                            zw7Var2.addView(v3bVar);
                                            dx7Var2.c0();
                                            h44Var2 = v3bVar;
                                        } else if (h44Var3 instanceof rlb) {
                                            rlb rlbVar = new rlb(dx7Var2.getContext(), (rlb) h44Var3, P0);
                                            rlbVar.setDelegate(dx7Var2);
                                            rlbVar.setMaxWidth(dx7Var2.B1 - hl.L(32.0f));
                                            zw7Var2.addView(rlbVar, tre.c(-2.0f, -2));
                                            dx7Var2.c0();
                                            h44Var2 = rlbVar;
                                        }
                                        dx7Var2.A0(h44Var2);
                                        dx7Var2.C0(null, true);
                                        dx7Var2.a0(h44Var2);
                                    }
                                    n8 n8Var8 = dx7Var2.r1;
                                    if (n8Var8 != null && n8Var8.isShowing()) {
                                        dx7Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, tre.o(-2, 44));
                }
                int i = 0;
                while (i < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i);
                    int i2 = aob.i6;
                    int v0 = aob.v0(i2, uk5Var);
                    int i3 = 8;
                    int i4 = i == 0 ? 8 : 0;
                    int i5 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i6 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i != 0) {
                        i3 = 0;
                    }
                    yob.R(childAt, aob.a0(v0, i4, i5, i6, i3), null, yob.M(i2), uk5Var);
                    i++;
                }
                dx7Var.s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
