package fi;

import android.R;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;
    public final /* synthetic */ tg.j c;

    public /* synthetic */ l4(o5 o5Var, tg.j jVar, int i7) {
        this.a = i7;
        this.b = o5Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        int i7 = this.a;
        final tg.j jVar = this.c;
        final o5 o5Var = this.b;
        switch (i7) {
            case 0:
                o5Var.z0(jVar);
                break;
            default:
                j5 j5Var = o5Var.A0;
                x4 x4Var = o5Var.x1;
                g5 g5Var = o5Var.p1;
                LinearLayout linearLayout = new LinearLayout(o5Var.getContext());
                final int i10 = 0;
                linearLayout.setOrientation(0);
                boolean z9 = jVar instanceof tg.u0;
                final int i11 = 1;
                if (!z9) {
                    TextView textView = new TextView(o5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.E8, g5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(hd.M0(2131747671, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: fi.q4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i10) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z10) {
                                        la laVar = ((x9) o5Var2).j2.c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    o5Var5.I0((tg.n0) jVar4, new bi.p5(6, o5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.d2) {
                                        ((tg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.r0 = !r1Var.r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.q1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = o5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar6, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof tg.k2) {
                                            tg.k2 k2Var = new tg.k2(o5Var9.getContext(), (tg.k2) jVar6, N0);
                                            k2Var.setDelegate(o5Var9);
                                            k2Var.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            jVar2 = k2Var;
                                        }
                                        o5Var9.y0(jVar2);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.q1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, c8.ha.o(-2, 44));
                }
                final int i12 = 3;
                if (jVar instanceof tg.k2) {
                    TextView textView2 = new TextView(o5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.E8, g5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!x4Var.c() || x4Var.d) && o5Var.c2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(hd.M0(2131747669, null));
                        final int i13 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: fi.q4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.j jVar2;
                                switch (i13) {
                                    case 0:
                                        tg.j jVar3 = jVar;
                                        boolean z10 = jVar3 instanceof tg.r1;
                                        o5 o5Var2 = o5Var;
                                        if (z10) {
                                            la laVar = ((x9) o5Var2).j2.c1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            o5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = o5Var2.q1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            o5Var2.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.k2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        o5 o5Var3 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.q1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            o5Var3.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        o5 o5Var4 = o5Var;
                                        o5Var4.A0(jVar, true);
                                        o5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.q1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            o5Var4.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        o5 o5Var5 = o5Var;
                                        o5Var5.A0(null, true);
                                        tg.j jVar4 = jVar;
                                        o5Var5.I0((tg.n0) jVar4, new bi.p5(6, o5Var5, jVar4));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.q1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            o5Var5.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        o5 o5Var6 = o5Var;
                                        o5Var6.A0(null, true);
                                        o5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.q1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            o5Var6.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.j jVar5 = jVar;
                                        if (jVar5 instanceof tg.d2) {
                                            ((tg.d2) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.q1) {
                                            ((tg.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar5;
                                            r1Var.r0 = !r1Var.r0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar5).r(true);
                                        }
                                        o5 o5Var7 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.q1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            o5Var7.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        o5 o5Var8 = o5Var;
                                        o5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.q1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            o5Var8.q1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        o5 o5Var9 = o5Var;
                                        j5 j5Var2 = o5Var9.A0;
                                        tg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = o5Var9.N0(jVar6);
                                            if (jVar6 instanceof tg.d2) {
                                                tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar6, N0);
                                                d2Var.setDelegate(o5Var9);
                                                j5Var2.addView(d2Var);
                                                o5Var9.d0();
                                                jVar2 = d2Var;
                                            } else if (jVar6 instanceof tg.k2) {
                                                tg.k2 k2Var = new tg.k2(o5Var9.getContext(), (tg.k2) jVar6, N0);
                                                k2Var.setDelegate(o5Var9);
                                                k2Var.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                                j5Var2.addView(k2Var, c8.ha.c(-2.0f, -2));
                                                o5Var9.d0();
                                                jVar2 = k2Var;
                                            }
                                            o5Var9.y0(jVar2);
                                            o5Var9.A0(null, true);
                                            o5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.q1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            o5Var9.q1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(hd.M0(2131747434, null));
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: fi.q4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.j jVar2;
                                switch (i11) {
                                    case 0:
                                        tg.j jVar3 = jVar;
                                        boolean z10 = jVar3 instanceof tg.r1;
                                        o5 o5Var2 = o5Var;
                                        if (z10) {
                                            la laVar = ((x9) o5Var2).j2.c1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            o5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = o5Var2.q1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            o5Var2.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.k2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        o5 o5Var3 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.q1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            o5Var3.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        o5 o5Var4 = o5Var;
                                        o5Var4.A0(jVar, true);
                                        o5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.q1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            o5Var4.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        o5 o5Var5 = o5Var;
                                        o5Var5.A0(null, true);
                                        tg.j jVar4 = jVar;
                                        o5Var5.I0((tg.n0) jVar4, new bi.p5(6, o5Var5, jVar4));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.q1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            o5Var5.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        o5 o5Var6 = o5Var;
                                        o5Var6.A0(null, true);
                                        o5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.q1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            o5Var6.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.j jVar5 = jVar;
                                        if (jVar5 instanceof tg.d2) {
                                            ((tg.d2) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.q1) {
                                            ((tg.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar5;
                                            r1Var.r0 = !r1Var.r0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar5).r(true);
                                        }
                                        o5 o5Var7 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.q1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            o5Var7.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        o5 o5Var8 = o5Var;
                                        o5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.q1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            o5Var8.q1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        o5 o5Var9 = o5Var;
                                        j5 j5Var2 = o5Var9.A0;
                                        tg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = o5Var9.N0(jVar6);
                                            if (jVar6 instanceof tg.d2) {
                                                tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar6, N0);
                                                d2Var.setDelegate(o5Var9);
                                                j5Var2.addView(d2Var);
                                                o5Var9.d0();
                                                jVar2 = d2Var;
                                            } else if (jVar6 instanceof tg.k2) {
                                                tg.k2 k2Var = new tg.k2(o5Var9.getContext(), (tg.k2) jVar6, N0);
                                                k2Var.setDelegate(o5Var9);
                                                k2Var.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                                j5Var2.addView(k2Var, c8.ha.c(-2.0f, -2));
                                                o5Var9.d0();
                                                jVar2 = k2Var;
                                            }
                                            o5Var9.y0(jVar2);
                                            o5Var9.A0(null, true);
                                            o5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.q1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            o5Var9.q1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, c8.ha.o(-2, 44));
                    f10 = 14.0f;
                } else if (jVar instanceof tg.n0) {
                    TextView e02 = o5Var.e0(1, hd.M0(2131747669, null));
                    f10 = 14.0f;
                    e02.setOnClickListener(new View.OnClickListener() { // from class: fi.q4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i12) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z10) {
                                        la laVar = ((x9) o5Var2).j2.c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    o5Var5.I0((tg.n0) jVar4, new bi.p5(6, o5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.d2) {
                                        ((tg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.r0 = !r1Var.r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.q1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = o5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar6, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof tg.k2) {
                                            tg.k2 k2Var = new tg.k2(o5Var9.getContext(), (tg.k2) jVar6, N0);
                                            k2Var.setDelegate(o5Var9);
                                            k2Var.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            jVar2 = k2Var;
                                        }
                                        o5Var9.y0(jVar2);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.q1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e02, c8.ha.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (jVar instanceof tg.k0) {
                        TextView e03 = o5Var.e0(1, hd.M0(2131747669, null));
                        final int i14 = 4;
                        e03.setOnClickListener(new View.OnClickListener() { // from class: fi.q4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.j jVar2;
                                switch (i14) {
                                    case 0:
                                        tg.j jVar3 = jVar;
                                        boolean z10 = jVar3 instanceof tg.r1;
                                        o5 o5Var2 = o5Var;
                                        if (z10) {
                                            la laVar = ((x9) o5Var2).j2.c1;
                                            if (laVar != null) {
                                                laVar.B();
                                            }
                                        } else {
                                            o5Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = o5Var2.q1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            o5Var2.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.k2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        o5 o5Var3 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.q1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            o5Var3.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        o5 o5Var4 = o5Var;
                                        o5Var4.A0(jVar, true);
                                        o5Var4.o0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.q1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            o5Var4.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        o5 o5Var5 = o5Var;
                                        o5Var5.A0(null, true);
                                        tg.j jVar4 = jVar;
                                        o5Var5.I0((tg.n0) jVar4, new bi.p5(6, o5Var5, jVar4));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.q1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            o5Var5.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        o5 o5Var6 = o5Var;
                                        o5Var6.A0(null, true);
                                        o5Var6.H0((tg.k0) jVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.q1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            o5Var6.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.j jVar5 = jVar;
                                        if (jVar5 instanceof tg.d2) {
                                            ((tg.d2) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.q1) {
                                            ((tg.q1) jVar5).r(true);
                                        } else if (jVar5 instanceof tg.r1) {
                                            tg.r1 r1Var = (tg.r1) jVar5;
                                            r1Var.r0 = !r1Var.r0;
                                            r1Var.invalidate();
                                        } else {
                                            ((tg.n1) jVar5).r(true);
                                        }
                                        o5 o5Var7 = o5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.q1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            o5Var7.q1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        o5 o5Var8 = o5Var;
                                        o5Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.q1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            o5Var8.q1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        o5 o5Var9 = o5Var;
                                        j5 j5Var2 = o5Var9.A0;
                                        tg.j jVar6 = jVar;
                                        if (jVar6 != null) {
                                            PointF N0 = o5Var9.N0(jVar6);
                                            if (jVar6 instanceof tg.d2) {
                                                tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar6, N0);
                                                d2Var.setDelegate(o5Var9);
                                                j5Var2.addView(d2Var);
                                                o5Var9.d0();
                                                jVar2 = d2Var;
                                            } else if (jVar6 instanceof tg.k2) {
                                                tg.k2 k2Var = new tg.k2(o5Var9.getContext(), (tg.k2) jVar6, N0);
                                                k2Var.setDelegate(o5Var9);
                                                k2Var.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                                j5Var2.addView(k2Var, c8.ha.c(-2.0f, -2));
                                                o5Var9.d0();
                                                jVar2 = k2Var;
                                            }
                                            o5Var9.y0(jVar2);
                                            o5Var9.A0(null, true);
                                            o5Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.q1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            o5Var9.q1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.addView(e03, c8.ha.o(-2, 44));
                    }
                }
                if ((jVar instanceof tg.d2) || (jVar instanceof tg.r1) || (jVar instanceof tg.n1) || (jVar instanceof tg.q1)) {
                    TextView e04 = o5Var.e0(4, hd.M0(2131750691, null));
                    final int i15 = 5;
                    e04.setOnClickListener(new View.OnClickListener() { // from class: fi.q4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i15) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z10 = jVar3 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z10) {
                                        la laVar = ((x9) o5Var2).j2.c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    o5Var5.I0((tg.n0) jVar4, new bi.p5(6, o5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.d2) {
                                        ((tg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.r0 = !r1Var.r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.q1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = o5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar6, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof tg.k2) {
                                            tg.k2 k2Var = new tg.k2(o5Var9.getContext(), (tg.k2) jVar6, N0);
                                            k2Var.setDelegate(o5Var9);
                                            k2Var.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            jVar2 = k2Var;
                                        }
                                        o5Var9.y0(jVar2);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.q1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e04, c8.ha.o(-2, 44));
                }
                boolean z10 = jVar instanceof tg.n1;
                if (j5Var.indexOfChild(jVar) != j5Var.getChildCount() - 1 && !(jVar instanceof tg.q1)) {
                    TextView textView3 = new TextView(o5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.E8, g5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(hd.M0(2131747674, null));
                    final int i16 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: fi.q4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i16) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z102 = jVar3 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z102) {
                                        la laVar = ((x9) o5Var2).j2.c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    o5Var5.I0((tg.n0) jVar4, new bi.p5(6, o5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.d2) {
                                        ((tg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.r0 = !r1Var.r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.q1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = o5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar6, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof tg.k2) {
                                            tg.k2 k2Var = new tg.k2(o5Var9.getContext(), (tg.k2) jVar6, N0);
                                            k2Var.setDelegate(o5Var9);
                                            k2Var.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            jVar2 = k2Var;
                                        }
                                        o5Var9.y0(jVar2);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.q1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c8.ha.o(-2, 44));
                } else if (!z10 && !z9 && !(jVar instanceof tg.r1) && !(jVar instanceof tg.n0) && !(jVar instanceof tg.l2) && !(jVar instanceof tg.k0) && !(jVar instanceof tg.q1)) {
                    TextView textView4 = new TextView(o5Var.getContext());
                    org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.E8, g5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(hd.M0(2131747670, "PaintDuplicate"));
                    final int i17 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: fi.q4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.j jVar2;
                            switch (i17) {
                                case 0:
                                    tg.j jVar3 = jVar;
                                    boolean z102 = jVar3 instanceof tg.r1;
                                    o5 o5Var2 = o5Var;
                                    if (z102) {
                                        la laVar = ((x9) o5Var2).j2.c1;
                                        if (laVar != null) {
                                            laVar.B();
                                        }
                                    } else {
                                        o5Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = o5Var2.q1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        o5Var2.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.k2) jVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    o5 o5Var3 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = o5Var3.q1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        o5Var3.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    o5 o5Var4 = o5Var;
                                    o5Var4.A0(jVar, true);
                                    o5Var4.o0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = o5Var4.q1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        o5Var4.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    o5 o5Var5 = o5Var;
                                    o5Var5.A0(null, true);
                                    tg.j jVar4 = jVar;
                                    o5Var5.I0((tg.n0) jVar4, new bi.p5(6, o5Var5, jVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = o5Var5.q1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        o5Var5.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    o5 o5Var6 = o5Var;
                                    o5Var6.A0(null, true);
                                    o5Var6.H0((tg.k0) jVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = o5Var6.q1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        o5Var6.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.j jVar5 = jVar;
                                    if (jVar5 instanceof tg.d2) {
                                        ((tg.d2) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.q1) {
                                        ((tg.q1) jVar5).r(true);
                                    } else if (jVar5 instanceof tg.r1) {
                                        tg.r1 r1Var = (tg.r1) jVar5;
                                        r1Var.r0 = !r1Var.r0;
                                        r1Var.invalidate();
                                    } else {
                                        ((tg.n1) jVar5).r(true);
                                    }
                                    o5 o5Var7 = o5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = o5Var7.q1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        o5Var7.q1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    o5 o5Var8 = o5Var;
                                    o5Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = o5Var8.q1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        o5Var8.q1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    o5 o5Var9 = o5Var;
                                    j5 j5Var2 = o5Var9.A0;
                                    tg.j jVar6 = jVar;
                                    if (jVar6 != null) {
                                        PointF N0 = o5Var9.N0(jVar6);
                                        if (jVar6 instanceof tg.d2) {
                                            tg.j d2Var = new tg.d2(o5Var9.getContext(), (tg.d2) jVar6, N0);
                                            d2Var.setDelegate(o5Var9);
                                            j5Var2.addView(d2Var);
                                            o5Var9.d0();
                                            jVar2 = d2Var;
                                        } else if (jVar6 instanceof tg.k2) {
                                            tg.k2 k2Var = new tg.k2(o5Var9.getContext(), (tg.k2) jVar6, N0);
                                            k2Var.setDelegate(o5Var9);
                                            k2Var.setMaxWidth(o5Var9.A1 - org.telegram.messenger.g0.L(32.0f));
                                            j5Var2.addView(k2Var, c8.ha.c(-2.0f, -2));
                                            o5Var9.d0();
                                            jVar2 = k2Var;
                                        }
                                        o5Var9.y0(jVar2);
                                        o5Var9.A0(null, true);
                                        o5Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = o5Var9.q1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        o5Var9.q1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, c8.ha.o(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int i19 = org.telegram.ui.ActionBar.k6.i6;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i19, g5Var);
                    int i20 = 8;
                    int i21 = i18 == 0 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i23 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i20 = 0;
                    }
                    org.telegram.ui.ActionBar.r6.R(childAt, org.telegram.ui.ActionBar.k6.c0(w02, i21, i22, i23, i20), null, org.telegram.ui.ActionBar.r6.N(i19), g5Var);
                    i18++;
                }
                o5Var.r1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
