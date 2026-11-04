package gi;

import android.R;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;
    public final /* synthetic */ ug.j c;

    public /* synthetic */ i4(m5 m5Var, ug.j jVar, int i3) {
        this.a = i3;
        this.b = m5Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        int i3 = this.a;
        final ug.j jVar = this.c;
        final m5 m5Var = this.b;
        switch (i3) {
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
                boolean z10 = jVar instanceof ug.t0;
                final int i11 = 1;
                if (!z10) {
                    TextView textView = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, e5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(bd.M0(2131747680, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: gi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ug.j jVar2;
                            switch (i10) {
                                case 0:
                                    ug.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        la laVar = ((x9) m5Var2).k2.d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar4 = jVar;
                                    m5Var5.I0((ug.m0) jVar4, new ai.q4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    ug.j jVar5 = jVar;
                                    if (jVar5 instanceof ug.d2) {
                                        ((ug.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.q1) {
                                        ((ug.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar6, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof ug.l2) {
                                            ug.l2 l2Var = new ug.l2(m5Var9.getContext(), (ug.l2) jVar6, N0);
                                            l2Var.setDelegate(m5Var9);
                                            l2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = l2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, mf.o(-2, 44));
                }
                final int i12 = 3;
                if (jVar instanceof ug.l2) {
                    TextView textView2 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.E8, e5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!v4Var.c() || v4Var.d) && m5Var.d2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(bd.M0(2131747678, null));
                        final int i13 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: gi.n4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ug.j jVar2;
                                switch (i13) {
                                    case 0:
                                        ug.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof ug.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            la laVar = ((x9) m5Var2).k2.d1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var = m5Var2.r1;
                                        if (f1Var != null && f1Var.isShowing()) {
                                            m5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((ug.l2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.r1;
                                        if (f1Var2 != null && f1Var2.isShowing()) {
                                            m5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.r1;
                                        if (f1Var3 != null && f1Var3.isShowing()) {
                                            m5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        ug.j jVar4 = jVar;
                                        m5Var5.I0((ug.m0) jVar4, new ai.q4(7, m5Var5, jVar4));
                                        org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.r1;
                                        if (f1Var4 != null && f1Var4.isShowing()) {
                                            m5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((ug.j0) jVar);
                                        org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.r1;
                                        if (f1Var5 != null && f1Var5.isShowing()) {
                                            m5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        ug.j jVar5 = jVar;
                                        if (jVar5 instanceof ug.d2) {
                                            ((ug.d2) jVar5).r(true);
                                        } else if (jVar5 instanceof ug.q1) {
                                            ((ug.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof ug.r1) {
                                            ug.r1 r1Var = (ug.r1) jVar5;
                                            r1Var.s0 = !r1Var.s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((ug.n1) jVar5).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.r1;
                                        if (f1Var6 != null && f1Var6.isShowing()) {
                                            m5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.r1;
                                        if (f1Var7 != null && f1Var7.isShowing()) {
                                            m5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        ug.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = m5Var9.N0(jVar6);
                                            if (jVar6 instanceof ug.d2) {
                                                ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar6, N0);
                                                d2Var.setDelegate(m5Var9);
                                                h5Var2.addView(d2Var);
                                                m5Var9.d0();
                                                jVar2 = d2Var;
                                            } else if (jVar6 instanceof ug.l2) {
                                                ug.l2 l2Var = new ug.l2(m5Var9.getContext(), (ug.l2) jVar6, N0);
                                                l2Var.setDelegate(m5Var9);
                                                l2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(l2Var, mf.c(-2.0f, -2));
                                                m5Var9.d0();
                                                jVar2 = l2Var;
                                            }
                                            m5Var9.y0(jVar2);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.r1;
                                        if (f1Var8 != null && f1Var8.isShowing()) {
                                            m5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(bd.M0(2131747443, null));
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: gi.n4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ug.j jVar2;
                                switch (i11) {
                                    case 0:
                                        ug.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof ug.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            la laVar = ((x9) m5Var2).k2.d1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var = m5Var2.r1;
                                        if (f1Var != null && f1Var.isShowing()) {
                                            m5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((ug.l2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.r1;
                                        if (f1Var2 != null && f1Var2.isShowing()) {
                                            m5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.r1;
                                        if (f1Var3 != null && f1Var3.isShowing()) {
                                            m5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        ug.j jVar4 = jVar;
                                        m5Var5.I0((ug.m0) jVar4, new ai.q4(7, m5Var5, jVar4));
                                        org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.r1;
                                        if (f1Var4 != null && f1Var4.isShowing()) {
                                            m5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((ug.j0) jVar);
                                        org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.r1;
                                        if (f1Var5 != null && f1Var5.isShowing()) {
                                            m5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        ug.j jVar5 = jVar;
                                        if (jVar5 instanceof ug.d2) {
                                            ((ug.d2) jVar5).r(true);
                                        } else if (jVar5 instanceof ug.q1) {
                                            ((ug.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof ug.r1) {
                                            ug.r1 r1Var = (ug.r1) jVar5;
                                            r1Var.s0 = !r1Var.s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((ug.n1) jVar5).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.r1;
                                        if (f1Var6 != null && f1Var6.isShowing()) {
                                            m5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.r1;
                                        if (f1Var7 != null && f1Var7.isShowing()) {
                                            m5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        ug.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = m5Var9.N0(jVar6);
                                            if (jVar6 instanceof ug.d2) {
                                                ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar6, N0);
                                                d2Var.setDelegate(m5Var9);
                                                h5Var2.addView(d2Var);
                                                m5Var9.d0();
                                                jVar2 = d2Var;
                                            } else if (jVar6 instanceof ug.l2) {
                                                ug.l2 l2Var = new ug.l2(m5Var9.getContext(), (ug.l2) jVar6, N0);
                                                l2Var.setDelegate(m5Var9);
                                                l2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(l2Var, mf.c(-2.0f, -2));
                                                m5Var9.d0();
                                                jVar2 = l2Var;
                                            }
                                            m5Var9.y0(jVar2);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.r1;
                                        if (f1Var8 != null && f1Var8.isShowing()) {
                                            m5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, mf.o(-2, 44));
                    f10 = 14.0f;
                } else if (jVar instanceof ug.m0) {
                    TextView e02 = m5Var.e0(1, bd.M0(2131747678, null));
                    f10 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() { // from class: gi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ug.j jVar2;
                            switch (i12) {
                                case 0:
                                    ug.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        la laVar = ((x9) m5Var2).k2.d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar4 = jVar;
                                    m5Var5.I0((ug.m0) jVar4, new ai.q4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    ug.j jVar5 = jVar;
                                    if (jVar5 instanceof ug.d2) {
                                        ((ug.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.q1) {
                                        ((ug.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar6, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof ug.l2) {
                                            ug.l2 l2Var = new ug.l2(m5Var9.getContext(), (ug.l2) jVar6, N0);
                                            l2Var.setDelegate(m5Var9);
                                            l2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = l2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e02, mf.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (jVar instanceof ug.j0) {
                        TextView e03 = m5Var.e0(1, bd.M0(2131747678, null));
                        final int i14 = 4;
                        e03.setOnClickListener(new View.OnClickListener() { // from class: gi.n4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ug.j jVar2;
                                switch (i14) {
                                    case 0:
                                        ug.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof ug.r1;
                                        m5 m5Var2 = m5Var;
                                        if (z11) {
                                            la laVar = ((x9) m5Var2).k2.d1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            m5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var = m5Var2.r1;
                                        if (f1Var != null && f1Var.isShowing()) {
                                            m5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((ug.l2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        m5 m5Var3 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.r1;
                                        if (f1Var2 != null && f1Var2.isShowing()) {
                                            m5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        m5 m5Var4 = m5Var;
                                        m5Var4.A0(jVar, true);
                                        m5Var4.o0();
                                        org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.r1;
                                        if (f1Var3 != null && f1Var3.isShowing()) {
                                            m5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        m5 m5Var5 = m5Var;
                                        m5Var5.A0(null, true);
                                        ug.j jVar4 = jVar;
                                        m5Var5.I0((ug.m0) jVar4, new ai.q4(7, m5Var5, jVar4));
                                        org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.r1;
                                        if (f1Var4 != null && f1Var4.isShowing()) {
                                            m5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        m5 m5Var6 = m5Var;
                                        m5Var6.A0(null, true);
                                        m5Var6.H0((ug.j0) jVar);
                                        org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.r1;
                                        if (f1Var5 != null && f1Var5.isShowing()) {
                                            m5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        ug.j jVar5 = jVar;
                                        if (jVar5 instanceof ug.d2) {
                                            ((ug.d2) jVar5).r(true);
                                        } else if (jVar5 instanceof ug.q1) {
                                            ((ug.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof ug.r1) {
                                            ug.r1 r1Var = (ug.r1) jVar5;
                                            r1Var.s0 = !r1Var.s0;
                                            r1Var.invalidate();
                                        } else {
                                            ((ug.n1) jVar5).r(true);
                                        }
                                        m5 m5Var7 = m5Var;
                                        org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.r1;
                                        if (f1Var6 != null && f1Var6.isShowing()) {
                                            m5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        m5 m5Var8 = m5Var;
                                        m5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.r1;
                                        if (f1Var7 != null && f1Var7.isShowing()) {
                                            m5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        m5 m5Var9 = m5Var;
                                        h5 h5Var2 = m5Var9.B0;
                                        ug.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = m5Var9.N0(jVar6);
                                            if (jVar6 instanceof ug.d2) {
                                                ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar6, N0);
                                                d2Var.setDelegate(m5Var9);
                                                h5Var2.addView(d2Var);
                                                m5Var9.d0();
                                                jVar2 = d2Var;
                                            } else if (jVar6 instanceof ug.l2) {
                                                ug.l2 l2Var = new ug.l2(m5Var9.getContext(), (ug.l2) jVar6, N0);
                                                l2Var.setDelegate(m5Var9);
                                                l2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                h5Var2.addView(l2Var, mf.c(-2.0f, -2));
                                                m5Var9.d0();
                                                jVar2 = l2Var;
                                            }
                                            m5Var9.y0(jVar2);
                                            m5Var9.A0(null, true);
                                            m5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.r1;
                                        if (f1Var8 != null && f1Var8.isShowing()) {
                                            m5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.addView(e03, mf.o(-2, 44));
                    }
                }
                if ((jVar instanceof ug.d2) || (jVar instanceof ug.r1) || (jVar instanceof ug.n1) || (jVar instanceof ug.q1)) {
                    TextView e04 = m5Var.e0(4, bd.M0(2131750691, null));
                    final int i15 = 5;
                    e04.setOnClickListener(new View.OnClickListener() { // from class: gi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ug.j jVar2;
                            switch (i15) {
                                case 0:
                                    ug.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z11) {
                                        la laVar = ((x9) m5Var2).k2.d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar4 = jVar;
                                    m5Var5.I0((ug.m0) jVar4, new ai.q4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    ug.j jVar5 = jVar;
                                    if (jVar5 instanceof ug.d2) {
                                        ((ug.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.q1) {
                                        ((ug.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar6, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof ug.l2) {
                                            ug.l2 l2Var = new ug.l2(m5Var9.getContext(), (ug.l2) jVar6, N0);
                                            l2Var.setDelegate(m5Var9);
                                            l2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = l2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e04, mf.o(-2, 44));
                }
                boolean z11 = jVar instanceof ug.n1;
                if (h5Var.indexOfChild(jVar) != h5Var.getChildCount() - 1 && !(jVar instanceof ug.q1)) {
                    TextView textView3 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.E8, e5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(bd.M0(2131747683, null));
                    final int i16 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: gi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ug.j jVar2;
                            switch (i16) {
                                case 0:
                                    ug.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z112) {
                                        la laVar = ((x9) m5Var2).k2.d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar4 = jVar;
                                    m5Var5.I0((ug.m0) jVar4, new ai.q4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    ug.j jVar5 = jVar;
                                    if (jVar5 instanceof ug.d2) {
                                        ((ug.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.q1) {
                                        ((ug.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar6, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof ug.l2) {
                                            ug.l2 l2Var = new ug.l2(m5Var9.getContext(), (ug.l2) jVar6, N0);
                                            l2Var.setDelegate(m5Var9);
                                            l2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = l2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, mf.o(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof ug.r1) && !(jVar instanceof ug.m0) && !(jVar instanceof ug.m2) && !(jVar instanceof ug.j0) && !(jVar instanceof ug.q1)) {
                    TextView textView4 = new TextView(m5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.E8, e5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(bd.M0(2131747679, "PaintDuplicate"));
                    final int i17 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: gi.n4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ug.j jVar2;
                            switch (i17) {
                                case 0:
                                    ug.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof ug.r1;
                                    m5 m5Var2 = m5Var;
                                    if (z112) {
                                        la laVar = ((x9) m5Var2).k2.d1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        m5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var = m5Var2.r1;
                                    if (f1Var != null && f1Var.isShowing()) {
                                        m5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((ug.l2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    m5 m5Var3 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var2 = m5Var3.r1;
                                    if (f1Var2 != null && f1Var2.isShowing()) {
                                        m5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    m5 m5Var4 = m5Var;
                                    m5Var4.A0(jVar, true);
                                    m5Var4.o0();
                                    org.telegram.ui.ActionBar.f1 f1Var3 = m5Var4.r1;
                                    if (f1Var3 != null && f1Var3.isShowing()) {
                                        m5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    m5 m5Var5 = m5Var;
                                    m5Var5.A0(null, true);
                                    ug.j jVar4 = jVar;
                                    m5Var5.I0((ug.m0) jVar4, new ai.q4(7, m5Var5, jVar4));
                                    org.telegram.ui.ActionBar.f1 f1Var4 = m5Var5.r1;
                                    if (f1Var4 != null && f1Var4.isShowing()) {
                                        m5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    m5 m5Var6 = m5Var;
                                    m5Var6.A0(null, true);
                                    m5Var6.H0((ug.j0) jVar);
                                    org.telegram.ui.ActionBar.f1 f1Var5 = m5Var6.r1;
                                    if (f1Var5 != null && f1Var5.isShowing()) {
                                        m5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    ug.j jVar5 = jVar;
                                    if (jVar5 instanceof ug.d2) {
                                        ((ug.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.q1) {
                                        ((ug.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof ug.r1) {
                                        ug.r1 r1Var = (ug.r1) jVar5;
                                        r1Var.s0 = !r1Var.s0;
                                        r1Var.invalidate();
                                    } else {
                                        ((ug.n1) jVar5).r(true);
                                    }
                                    m5 m5Var7 = m5Var;
                                    org.telegram.ui.ActionBar.f1 f1Var6 = m5Var7.r1;
                                    if (f1Var6 != null && f1Var6.isShowing()) {
                                        m5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    m5 m5Var8 = m5Var;
                                    m5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.f1 f1Var7 = m5Var8.r1;
                                    if (f1Var7 != null && f1Var7.isShowing()) {
                                        m5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    m5 m5Var9 = m5Var;
                                    h5 h5Var2 = m5Var9.B0;
                                    ug.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = m5Var9.N0(jVar6);
                                        if (jVar6 instanceof ug.d2) {
                                            ug.j d2Var = new ug.d2(m5Var9.getContext(), (ug.d2) jVar6, N0);
                                            d2Var.setDelegate(m5Var9);
                                            h5Var2.addView(d2Var);
                                            m5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof ug.l2) {
                                            ug.l2 l2Var = new ug.l2(m5Var9.getContext(), (ug.l2) jVar6, N0);
                                            l2Var.setDelegate(m5Var9);
                                            l2Var.setMaxWidth(m5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            h5Var2.addView(l2Var, mf.c(-2.0f, -2));
                                            m5Var9.d0();
                                            jVar2 = l2Var;
                                        }
                                        m5Var9.y0(jVar2);
                                        m5Var9.A0(null, true);
                                        m5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.f1 f1Var8 = m5Var9.r1;
                                    if (f1Var8 != null && f1Var8.isShowing()) {
                                        m5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, mf.o(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int i19 = org.telegram.ui.ActionBar.k6.i6;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i19, e5Var);
                    int i20 = 8;
                    int i21 = i18 == 0 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i23 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i20 = 0;
                    }
                    org.telegram.ui.ActionBar.r6.R(childAt, org.telegram.ui.ActionBar.k6.c0(w02, i21, i22, i23, i20), null, org.telegram.ui.ActionBar.r6.N(i19), e5Var);
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
