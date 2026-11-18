package hi;

import android.R;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;
    public final /* synthetic */ tg.j c;

    public /* synthetic */ h4(l5 l5Var, tg.j jVar, int i7) {
        this.a = i7;
        this.b = l5Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        int i7 = this.a;
        final tg.j jVar = this.c;
        final l5 l5Var = this.b;
        switch (i7) {
            case 0:
                l5Var.z0(jVar);
                break;
            default:
                g5 g5Var = l5Var.B0;
                t4 t4Var = l5Var.y1;
                d5 d5Var = l5Var.q1;
                LinearLayout linearLayout = new LinearLayout(l5Var.getContext());
                final int i10 = 0;
                linearLayout.setOrientation(0);
                boolean z10 = jVar instanceof tg.u0;
                final int i11 = 1;
                if (!z10) {
                    TextView textView = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, d5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(gd.M0(2131747479, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: hi.m4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i10) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z11) {
                                        ja jaVar = ((v9) l5Var2).k2.d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    l5Var5.I0((tg.n0) jVar4, new bi.l6(9, l5Var5, jVar4));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.f2) {
                                        ((tg.f2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = l5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar6, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            jVar2 = f2Var;
                                        } else if (jVar6 instanceof tg.m2) {
                                            tg.m2 m2Var = new tg.m2(l5Var9.getContext(), (tg.m2) jVar6, N0);
                                            m2Var.setDelegate(l5Var9);
                                            m2Var.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            jVar2 = m2Var;
                                        }
                                        l5Var9.y0(jVar2);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, c8.ma.o(-2, 44));
                }
                final int i12 = 3;
                if (jVar instanceof tg.m2) {
                    TextView textView2 = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.E8, d5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!t4Var.c() || t4Var.d) && l5Var.d2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(gd.M0(2131747477, null));
                        final int i13 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.m4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.j jVar2;
                                switch (i13) {
                                    case 0:
                                        tg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof tg.r1;
                                        l5 l5Var2 = l5Var;
                                        if (z11) {
                                            ja jaVar = ((v9) l5Var2).k2.d1;
                                            if (jaVar != null) {
                                                jaVar.B();
                                            }
                                        } else {
                                            l5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var = l5Var2.r1;
                                        if (h1Var != null && h1Var.isShowing()) {
                                            l5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.m2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        l5 l5Var3 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.r1;
                                        if (h1Var2 != null && h1Var2.isShowing()) {
                                            l5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        l5 l5Var4 = l5Var;
                                        l5Var4.A0(jVar, true);
                                        l5Var4.o0();
                                        org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.r1;
                                        if (h1Var3 != null && h1Var3.isShowing()) {
                                            l5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        l5 l5Var5 = l5Var;
                                        l5Var5.A0(null, true);
                                        tg.j jVar4 = jVar;
                                        l5Var5.I0((tg.n0) jVar4, new bi.l6(9, l5Var5, jVar4));
                                        org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.r1;
                                        if (h1Var4 != null && h1Var4.isShowing()) {
                                            l5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        l5 l5Var6 = l5Var;
                                        l5Var6.A0(null, true);
                                        l5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.r1;
                                        if (h1Var5 != null && h1Var5.isShowing()) {
                                            l5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.j jVar5 = jVar;
                                        if (jVar5 instanceof tg.f2) {
                                            ((tg.f2) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.q1) {
                                            ((tg.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar5;
                                            r1Var.s0 = !r1Var.s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar5).r(true);
                                        }
                                        l5 l5Var7 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.r1;
                                        if (h1Var6 != null && h1Var6.isShowing()) {
                                            l5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        l5 l5Var8 = l5Var;
                                        l5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.r1;
                                        if (h1Var7 != null && h1Var7.isShowing()) {
                                            l5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        l5 l5Var9 = l5Var;
                                        g5 g5Var2 = l5Var9.B0;
                                        tg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = l5Var9.N0(jVar6);
                                            if (jVar6 instanceof tg.f2) {
                                                tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar6, N0);
                                                f2Var.setDelegate(l5Var9);
                                                g5Var2.addView(f2Var);
                                                l5Var9.d0();
                                                jVar2 = f2Var;
                                            } else if (jVar6 instanceof tg.m2) {
                                                tg.m2 m2Var = new tg.m2(l5Var9.getContext(), (tg.m2) jVar6, N0);
                                                m2Var.setDelegate(l5Var9);
                                                m2Var.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                g5Var2.addView(m2Var, c8.ma.c(-2.0f, -2));
                                                l5Var9.d0();
                                                jVar2 = m2Var;
                                            }
                                            l5Var9.y0(jVar2);
                                            l5Var9.A0(null, true);
                                            l5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.r1;
                                        if (h1Var8 != null && h1Var8.isShowing()) {
                                            l5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(gd.M0(2131747242, null));
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.m4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.j jVar2;
                                switch (i11) {
                                    case 0:
                                        tg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof tg.r1;
                                        l5 l5Var2 = l5Var;
                                        if (z11) {
                                            ja jaVar = ((v9) l5Var2).k2.d1;
                                            if (jaVar != null) {
                                                jaVar.B();
                                            }
                                        } else {
                                            l5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var = l5Var2.r1;
                                        if (h1Var != null && h1Var.isShowing()) {
                                            l5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.m2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        l5 l5Var3 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.r1;
                                        if (h1Var2 != null && h1Var2.isShowing()) {
                                            l5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        l5 l5Var4 = l5Var;
                                        l5Var4.A0(jVar, true);
                                        l5Var4.o0();
                                        org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.r1;
                                        if (h1Var3 != null && h1Var3.isShowing()) {
                                            l5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        l5 l5Var5 = l5Var;
                                        l5Var5.A0(null, true);
                                        tg.j jVar4 = jVar;
                                        l5Var5.I0((tg.n0) jVar4, new bi.l6(9, l5Var5, jVar4));
                                        org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.r1;
                                        if (h1Var4 != null && h1Var4.isShowing()) {
                                            l5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        l5 l5Var6 = l5Var;
                                        l5Var6.A0(null, true);
                                        l5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.r1;
                                        if (h1Var5 != null && h1Var5.isShowing()) {
                                            l5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.j jVar5 = jVar;
                                        if (jVar5 instanceof tg.f2) {
                                            ((tg.f2) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.q1) {
                                            ((tg.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar5;
                                            r1Var.s0 = !r1Var.s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar5).r(true);
                                        }
                                        l5 l5Var7 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.r1;
                                        if (h1Var6 != null && h1Var6.isShowing()) {
                                            l5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        l5 l5Var8 = l5Var;
                                        l5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.r1;
                                        if (h1Var7 != null && h1Var7.isShowing()) {
                                            l5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        l5 l5Var9 = l5Var;
                                        g5 g5Var2 = l5Var9.B0;
                                        tg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = l5Var9.N0(jVar6);
                                            if (jVar6 instanceof tg.f2) {
                                                tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar6, N0);
                                                f2Var.setDelegate(l5Var9);
                                                g5Var2.addView(f2Var);
                                                l5Var9.d0();
                                                jVar2 = f2Var;
                                            } else if (jVar6 instanceof tg.m2) {
                                                tg.m2 m2Var = new tg.m2(l5Var9.getContext(), (tg.m2) jVar6, N0);
                                                m2Var.setDelegate(l5Var9);
                                                m2Var.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                g5Var2.addView(m2Var, c8.ma.c(-2.0f, -2));
                                                l5Var9.d0();
                                                jVar2 = m2Var;
                                            }
                                            l5Var9.y0(jVar2);
                                            l5Var9.A0(null, true);
                                            l5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.r1;
                                        if (h1Var8 != null && h1Var8.isShowing()) {
                                            l5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, c8.ma.o(-2, 44));
                    f10 = 14.0f;
                } else if (jVar instanceof tg.n0) {
                    TextView e02 = l5Var.e0(1, gd.M0(2131747477, null));
                    f10 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() { // from class: hi.m4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i12) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z11) {
                                        ja jaVar = ((v9) l5Var2).k2.d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    l5Var5.I0((tg.n0) jVar4, new bi.l6(9, l5Var5, jVar4));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.f2) {
                                        ((tg.f2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = l5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar6, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            jVar2 = f2Var;
                                        } else if (jVar6 instanceof tg.m2) {
                                            tg.m2 m2Var = new tg.m2(l5Var9.getContext(), (tg.m2) jVar6, N0);
                                            m2Var.setDelegate(l5Var9);
                                            m2Var.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            jVar2 = m2Var;
                                        }
                                        l5Var9.y0(jVar2);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e02, c8.ma.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (jVar instanceof tg.k0) {
                        TextView e03 = l5Var.e0(1, gd.M0(2131747477, null));
                        final int i14 = 4;
                        e03.setOnClickListener(new View.OnClickListener() { // from class: hi.m4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.j jVar2;
                                switch (i14) {
                                    case 0:
                                        tg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof tg.r1;
                                        l5 l5Var2 = l5Var;
                                        if (z11) {
                                            ja jaVar = ((v9) l5Var2).k2.d1;
                                            if (jaVar != null) {
                                                jaVar.B();
                                            }
                                        } else {
                                            l5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var = l5Var2.r1;
                                        if (h1Var != null && h1Var.isShowing()) {
                                            l5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.m2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        l5 l5Var3 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.r1;
                                        if (h1Var2 != null && h1Var2.isShowing()) {
                                            l5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        l5 l5Var4 = l5Var;
                                        l5Var4.A0(jVar, true);
                                        l5Var4.o0();
                                        org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.r1;
                                        if (h1Var3 != null && h1Var3.isShowing()) {
                                            l5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        l5 l5Var5 = l5Var;
                                        l5Var5.A0(null, true);
                                        tg.j jVar4 = jVar;
                                        l5Var5.I0((tg.n0) jVar4, new bi.l6(9, l5Var5, jVar4));
                                        org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.r1;
                                        if (h1Var4 != null && h1Var4.isShowing()) {
                                            l5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        l5 l5Var6 = l5Var;
                                        l5Var6.A0(null, true);
                                        l5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.r1;
                                        if (h1Var5 != null && h1Var5.isShowing()) {
                                            l5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.j jVar5 = jVar;
                                        if (jVar5 instanceof tg.f2) {
                                            ((tg.f2) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.q1) {
                                            ((tg.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar5;
                                            r1Var.s0 = !r1Var.s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar5).r(true);
                                        }
                                        l5 l5Var7 = l5Var;
                                        org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.r1;
                                        if (h1Var6 != null && h1Var6.isShowing()) {
                                            l5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        l5 l5Var8 = l5Var;
                                        l5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.r1;
                                        if (h1Var7 != null && h1Var7.isShowing()) {
                                            l5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        l5 l5Var9 = l5Var;
                                        g5 g5Var2 = l5Var9.B0;
                                        tg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = l5Var9.N0(jVar6);
                                            if (jVar6 instanceof tg.f2) {
                                                tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar6, N0);
                                                f2Var.setDelegate(l5Var9);
                                                g5Var2.addView(f2Var);
                                                l5Var9.d0();
                                                jVar2 = f2Var;
                                            } else if (jVar6 instanceof tg.m2) {
                                                tg.m2 m2Var = new tg.m2(l5Var9.getContext(), (tg.m2) jVar6, N0);
                                                m2Var.setDelegate(l5Var9);
                                                m2Var.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                g5Var2.addView(m2Var, c8.ma.c(-2.0f, -2));
                                                l5Var9.d0();
                                                jVar2 = m2Var;
                                            }
                                            l5Var9.y0(jVar2);
                                            l5Var9.A0(null, true);
                                            l5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.r1;
                                        if (h1Var8 != null && h1Var8.isShowing()) {
                                            l5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.addView(e03, c8.ma.o(-2, 44));
                    }
                }
                if ((jVar instanceof tg.f2) || (jVar instanceof tg.r1) || (jVar instanceof tg.n1) || (jVar instanceof tg.q1)) {
                    TextView e04 = l5Var.e0(4, gd.M0(2131750674, null));
                    final int i15 = 5;
                    e04.setOnClickListener(new View.OnClickListener() { // from class: hi.m4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i15) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z11) {
                                        ja jaVar = ((v9) l5Var2).k2.d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    l5Var5.I0((tg.n0) jVar4, new bi.l6(9, l5Var5, jVar4));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.f2) {
                                        ((tg.f2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = l5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar6, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            jVar2 = f2Var;
                                        } else if (jVar6 instanceof tg.m2) {
                                            tg.m2 m2Var = new tg.m2(l5Var9.getContext(), (tg.m2) jVar6, N0);
                                            m2Var.setDelegate(l5Var9);
                                            m2Var.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            jVar2 = m2Var;
                                        }
                                        l5Var9.y0(jVar2);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e04, c8.ma.o(-2, 44));
                }
                boolean z11 = jVar instanceof tg.n1;
                if (g5Var.indexOfChild(jVar) != g5Var.getChildCount() - 1 && !(jVar instanceof tg.q1)) {
                    TextView textView3 = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.E8, d5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(gd.M0(2131747482, null));
                    final int i16 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: hi.m4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i16) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z112) {
                                        ja jaVar = ((v9) l5Var2).k2.d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    l5Var5.I0((tg.n0) jVar4, new bi.l6(9, l5Var5, jVar4));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.f2) {
                                        ((tg.f2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = l5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar6, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            jVar2 = f2Var;
                                        } else if (jVar6 instanceof tg.m2) {
                                            tg.m2 m2Var = new tg.m2(l5Var9.getContext(), (tg.m2) jVar6, N0);
                                            m2Var.setDelegate(l5Var9);
                                            m2Var.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            jVar2 = m2Var;
                                        }
                                        l5Var9.y0(jVar2);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c8.ma.o(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof tg.r1) && !(jVar instanceof tg.n0) && !(jVar instanceof tg.n2) && !(jVar instanceof tg.k0) && !(jVar instanceof tg.q1)) {
                    TextView textView4 = new TextView(l5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.E8, d5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(gd.M0(2131747478, "PaintDuplicate"));
                    final int i17 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: hi.m4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i17) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof tg.r1;
                                    l5 l5Var2 = l5Var;
                                    if (z112) {
                                        ja jaVar = ((v9) l5Var2).k2.d1;
                                        if (jaVar != null) {
                                            jaVar.B();
                                        }
                                    } else {
                                        l5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var = l5Var2.r1;
                                    if (h1Var != null && h1Var.isShowing()) {
                                        l5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.m2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    l5 l5Var3 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var2 = l5Var3.r1;
                                    if (h1Var2 != null && h1Var2.isShowing()) {
                                        l5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    l5 l5Var4 = l5Var;
                                    l5Var4.A0(jVar, true);
                                    l5Var4.o0();
                                    org.telegram.ui.ActionBar.h1 h1Var3 = l5Var4.r1;
                                    if (h1Var3 != null && h1Var3.isShowing()) {
                                        l5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    l5 l5Var5 = l5Var;
                                    l5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    l5Var5.I0((tg.n0) jVar4, new bi.l6(9, l5Var5, jVar4));
                                    org.telegram.ui.ActionBar.h1 h1Var4 = l5Var5.r1;
                                    if (h1Var4 != null && h1Var4.isShowing()) {
                                        l5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    l5 l5Var6 = l5Var;
                                    l5Var6.A0(null, true);
                                    l5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.h1 h1Var5 = l5Var6.r1;
                                    if (h1Var5 != null && h1Var5.isShowing()) {
                                        l5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.f2) {
                                        ((tg.f2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    l5 l5Var7 = l5Var;
                                    org.telegram.ui.ActionBar.h1 h1Var6 = l5Var7.r1;
                                    if (h1Var6 != null && h1Var6.isShowing()) {
                                        l5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    l5 l5Var8 = l5Var;
                                    l5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.h1 h1Var7 = l5Var8.r1;
                                    if (h1Var7 != null && h1Var7.isShowing()) {
                                        l5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    l5 l5Var9 = l5Var;
                                    g5 g5Var2 = l5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = l5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.f2) {
                                            tg.j f2Var = new tg.f2(l5Var9.getContext(), (tg.f2) jVar6, N0);
                                            f2Var.setDelegate(l5Var9);
                                            g5Var2.addView(f2Var);
                                            l5Var9.d0();
                                            jVar2 = f2Var;
                                        } else if (jVar6 instanceof tg.m2) {
                                            tg.m2 m2Var = new tg.m2(l5Var9.getContext(), (tg.m2) jVar6, N0);
                                            m2Var.setDelegate(l5Var9);
                                            m2Var.setMaxWidth(l5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            g5Var2.addView(m2Var, c8.ma.c(-2.0f, -2));
                                            l5Var9.d0();
                                            jVar2 = m2Var;
                                        }
                                        l5Var9.y0(jVar2);
                                        l5Var9.A0(null, true);
                                        l5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.h1 h1Var8 = l5Var9.r1;
                                    if (h1Var8 != null && h1Var8.isShowing()) {
                                        l5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, c8.ma.o(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int i19 = org.telegram.ui.ActionBar.n6.i6;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i19, d5Var);
                    int i20 = 8;
                    int i21 = i18 == 0 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i23 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i20 = 0;
                    }
                    org.telegram.ui.ActionBar.u6.Q(childAt, org.telegram.ui.ActionBar.n6.c0(w02, i21, i22, i23, i20), null, org.telegram.ui.ActionBar.u6.M(i19), d5Var);
                    i18++;
                }
                l5Var.s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
