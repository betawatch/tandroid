package hi;

import android.R;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;
    public final /* synthetic */ tg.j c;

    public /* synthetic */ i4(m5 m5Var, tg.j jVar, int i7) {
        this.a = i7;
        this.b = m5Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        int i7 = this.a;
        final tg.j jVar = this.c;
        final m5 m5Var = this.b;
        switch (i7) {
            case 0:
                m5Var.z0(jVar);
                break;
            default:
                h5 h5Var = m5Var.B0;
                v4 v4Var = m5Var.y1;
                e5 e5Var = m5Var.q1;
                LinearLayout linearLayout = new LinearLayout(m5Var.getContext());
                final int i10 = 0;
                linearLayout.setOrientation(0);
                boolean z10 = jVar instanceof tg.u0;
                final int i11 = 1;
                if (!z10) {
                    TextView textView = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.E8, e5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(hd.M0(2131747672, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: hi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i10) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        ia iaVar = ((u9) m5Var2).k2.d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.o2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    m5Var5.I0((tg.n0) jVar4, new bi.e4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.g2) {
                                        ((tg.g2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(m5Var9.getContext(), (tg.g2) jVar6, N0);
                                            g2Var.setDelegate(m5Var9);
                                            h5Var2.addView(g2Var);
                                            m5Var9.d0();
                                            jVar2 = g2Var;
                                        } else if (jVar6 instanceof tg.o2) {
                                            tg.o2 o2Var = new tg.o2(m5Var9.getContext(), (tg.o2) jVar6, N0);
                                            o2Var.setDelegate(m5Var9);
                                            o2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(o2Var, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = o2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, c8.ja.o(-2, 44));
                }
                final int i12 = 3;
                if (jVar instanceof tg.o2) {
                    TextView textView2 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.E8, e5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!v4Var.c() || v4Var.d) && m5Var.d2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(hd.M0(2131747670, null));
                        final int i13 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.n4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.j jVar2;
                                switch (i13) {
                                    case 0:
                                        tg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof tg.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            ia iaVar = ((u9) m5Var2).k2.d1;
                                            if (iaVar != null) {
                                                iaVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = m5Var2.r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            m5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.o2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            m5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            m5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        tg.j jVar4 = jVar;
                                        m5Var5.I0((tg.n0) jVar4, new bi.e4(7, m5Var5, jVar4));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            m5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            m5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.j jVar5 = jVar;
                                        if (jVar5 instanceof tg.g2) {
                                            ((tg.g2) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.q1) {
                                            ((tg.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar5;
                                            r1Var.s0 = !r1Var.s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar5).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            m5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            m5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        tg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = m5Var9.N0(jVar6);
                                            if (jVar6 instanceof tg.g2) {
                                                tg.j g2Var = new tg.g2(m5Var9.getContext(), (tg.g2) jVar6, N0);
                                                g2Var.setDelegate(m5Var9);
                                                h5Var2.addView(g2Var);
                                                m5Var9.d0();
                                                jVar2 = g2Var;
                                            } else if (jVar6 instanceof tg.o2) {
                                                tg.o2 o2Var = new tg.o2(m5Var9.getContext(), (tg.o2) jVar6, N0);
                                                o2Var.setDelegate(m5Var9);
                                                o2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(o2Var, c8.ja.c(-2.0f, -2));
                                                m5Var9.d0();
                                                jVar2 = o2Var;
                                            }
                                            m5Var9.y0(jVar2);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            m5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(hd.M0(2131747435, null));
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.n4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.j jVar2;
                                switch (i11) {
                                    case 0:
                                        tg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof tg.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            ia iaVar = ((u9) m5Var2).k2.d1;
                                            if (iaVar != null) {
                                                iaVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = m5Var2.r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            m5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.o2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            m5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            m5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        tg.j jVar4 = jVar;
                                        m5Var5.I0((tg.n0) jVar4, new bi.e4(7, m5Var5, jVar4));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            m5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            m5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.j jVar5 = jVar;
                                        if (jVar5 instanceof tg.g2) {
                                            ((tg.g2) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.q1) {
                                            ((tg.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar5;
                                            r1Var.s0 = !r1Var.s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar5).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            m5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            m5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        tg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = m5Var9.N0(jVar6);
                                            if (jVar6 instanceof tg.g2) {
                                                tg.j g2Var = new tg.g2(m5Var9.getContext(), (tg.g2) jVar6, N0);
                                                g2Var.setDelegate(m5Var9);
                                                h5Var2.addView(g2Var);
                                                m5Var9.d0();
                                                jVar2 = g2Var;
                                            } else if (jVar6 instanceof tg.o2) {
                                                tg.o2 o2Var = new tg.o2(m5Var9.getContext(), (tg.o2) jVar6, N0);
                                                o2Var.setDelegate(m5Var9);
                                                o2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(o2Var, c8.ja.c(-2.0f, -2));
                                                m5Var9.d0();
                                                jVar2 = o2Var;
                                            }
                                            m5Var9.y0(jVar2);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            m5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, c8.ja.o(-2, 44));
                    f10 = 14.0f;
                } else if (jVar instanceof tg.n0) {
                    TextView e02 = m5Var.e0(1, hd.M0(2131747670, null));
                    f10 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() { // from class: hi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i12) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        ia iaVar = ((u9) m5Var2).k2.d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.o2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    m5Var5.I0((tg.n0) jVar4, new bi.e4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.g2) {
                                        ((tg.g2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(m5Var9.getContext(), (tg.g2) jVar6, N0);
                                            g2Var.setDelegate(m5Var9);
                                            h5Var2.addView(g2Var);
                                            m5Var9.d0();
                                            jVar2 = g2Var;
                                        } else if (jVar6 instanceof tg.o2) {
                                            tg.o2 o2Var = new tg.o2(m5Var9.getContext(), (tg.o2) jVar6, N0);
                                            o2Var.setDelegate(m5Var9);
                                            o2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(o2Var, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = o2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e02, c8.ja.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (jVar instanceof tg.k0) {
                        TextView e03 = m5Var.e0(1, hd.M0(2131747670, null));
                        final int i14 = 4;
                        e03.setOnClickListener(new View.OnClickListener() { // from class: hi.n4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.j jVar2;
                                switch (i14) {
                                    case 0:
                                        tg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof tg.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            ia iaVar = ((u9) m5Var2).k2.d1;
                                            if (iaVar != null) {
                                                iaVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = m5Var2.r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            m5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.o2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            m5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            m5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        tg.j jVar4 = jVar;
                                        m5Var5.I0((tg.n0) jVar4, new bi.e4(7, m5Var5, jVar4));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            m5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            m5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.j jVar5 = jVar;
                                        if (jVar5 instanceof tg.g2) {
                                            ((tg.g2) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.q1) {
                                            ((tg.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar5;
                                            r1Var.s0 = !r1Var.s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar5).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            m5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            m5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        tg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = m5Var9.N0(jVar6);
                                            if (jVar6 instanceof tg.g2) {
                                                tg.j g2Var = new tg.g2(m5Var9.getContext(), (tg.g2) jVar6, N0);
                                                g2Var.setDelegate(m5Var9);
                                                h5Var2.addView(g2Var);
                                                m5Var9.d0();
                                                jVar2 = g2Var;
                                            } else if (jVar6 instanceof tg.o2) {
                                                tg.o2 o2Var = new tg.o2(m5Var9.getContext(), (tg.o2) jVar6, N0);
                                                o2Var.setDelegate(m5Var9);
                                                o2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(o2Var, c8.ja.c(-2.0f, -2));
                                                m5Var9.d0();
                                                jVar2 = o2Var;
                                            }
                                            m5Var9.y0(jVar2);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            m5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.addView(e03, c8.ja.o(-2, 44));
                    }
                }
                if ((jVar instanceof tg.g2) || (jVar instanceof tg.r1) || (jVar instanceof tg.n1) || (jVar instanceof tg.q1)) {
                    TextView e04 = m5Var.e0(4, hd.M0(2131750690, null));
                    final int i15 = 5;
                    e04.setOnClickListener(new View.OnClickListener() { // from class: hi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i15) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        ia iaVar = ((u9) m5Var2).k2.d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.o2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    m5Var5.I0((tg.n0) jVar4, new bi.e4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.g2) {
                                        ((tg.g2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(m5Var9.getContext(), (tg.g2) jVar6, N0);
                                            g2Var.setDelegate(m5Var9);
                                            h5Var2.addView(g2Var);
                                            m5Var9.d0();
                                            jVar2 = g2Var;
                                        } else if (jVar6 instanceof tg.o2) {
                                            tg.o2 o2Var = new tg.o2(m5Var9.getContext(), (tg.o2) jVar6, N0);
                                            o2Var.setDelegate(m5Var9);
                                            o2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(o2Var, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = o2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e04, c8.ja.o(-2, 44));
                }
                boolean z11 = jVar instanceof tg.n1;
                if (h5Var.indexOfChild(jVar) != h5Var.getChildCount() - 1 && !(jVar instanceof tg.q1)) {
                    TextView textView3 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.E8, e5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(hd.M0(2131747675, null));
                    final int i16 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: hi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i16) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z112) {
                                        ia iaVar = ((u9) m5Var2).k2.d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.o2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    m5Var5.I0((tg.n0) jVar4, new bi.e4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.g2) {
                                        ((tg.g2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(m5Var9.getContext(), (tg.g2) jVar6, N0);
                                            g2Var.setDelegate(m5Var9);
                                            h5Var2.addView(g2Var);
                                            m5Var9.d0();
                                            jVar2 = g2Var;
                                        } else if (jVar6 instanceof tg.o2) {
                                            tg.o2 o2Var = new tg.o2(m5Var9.getContext(), (tg.o2) jVar6, N0);
                                            o2Var.setDelegate(m5Var9);
                                            o2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(o2Var, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = o2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c8.ja.o(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof tg.r1) && !(jVar instanceof tg.n0) && !(jVar instanceof tg.p2) && !(jVar instanceof tg.k0) && !(jVar instanceof tg.q1)) {
                    TextView textView4 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.E8, e5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(hd.M0(2131747671, "PaintDuplicate"));
                    final int i17 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: hi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i17) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof tg.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z112) {
                                        ia iaVar = ((u9) m5Var2).k2.d1;
                                        if (iaVar != null) {
                                            iaVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = m5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.o2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = m5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = m5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    m5Var5.I0((tg.n0) jVar4, new bi.e4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = m5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = m5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.g2) {
                                        ((tg.g2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = m5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = m5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.g2) {
                                            tg.j g2Var = new tg.g2(m5Var9.getContext(), (tg.g2) jVar6, N0);
                                            g2Var.setDelegate(m5Var9);
                                            h5Var2.addView(g2Var);
                                            m5Var9.d0();
                                            jVar2 = g2Var;
                                        } else if (jVar6 instanceof tg.o2) {
                                            tg.o2 o2Var = new tg.o2(m5Var9.getContext(), (tg.o2) jVar6, N0);
                                            o2Var.setDelegate(m5Var9);
                                            o2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(o2Var, c8.ja.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = o2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = m5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, c8.ja.o(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int i19 = org.telegram.ui.ActionBar.j6.i6;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(i19, e5Var);
                    int i20 = 8;
                    int i21 = i18 == 0 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i23 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i20 = 0;
                    }
                    org.telegram.ui.ActionBar.q6.Q(childAt, org.telegram.ui.ActionBar.j6.c0(w02, i21, i22, i23, i20), null, org.telegram.ui.ActionBar.q6.M(i19), e5Var);
                    i18++;
                }
                m5Var.s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
