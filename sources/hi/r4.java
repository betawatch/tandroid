package hi;

import android.R;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;
    public final /* synthetic */ tg.n c;

    public /* synthetic */ r4(v5 v5Var, tg.n nVar, int i7) {
        this.a = i7;
        this.b = v5Var;
        this.c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        int i7 = this.a;
        final tg.n nVar = this.c;
        final v5 v5Var = this.b;
        switch (i7) {
            case 0:
                v5Var.B0(nVar);
                break;
            default:
                q5 q5Var = v5Var.B0;
                e5 e5Var = v5Var.y1;
                n5 n5Var = v5Var.q1;
                LinearLayout linearLayout = new LinearLayout(v5Var.getContext());
                final int i10 = 0;
                linearLayout.setOrientation(0);
                boolean z10 = nVar instanceof tg.z0;
                final int i11 = 1;
                if (!z10) {
                    TextView textView = new TextView(v5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, n5Var);
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(gd.N0(2131747478, "PaintDelete"));
                    textView.setOnClickListener(new View.OnClickListener() { // from class: hi.w4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.n nVar2;
                            switch (i10) {
                                case 0:
                                    tg.n nVar3 = nVar;
                                    boolean z11 = nVar3 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z11) {
                                        db dbVar = ((pa) v5Var2).o2.d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar4 = nVar;
                                    v5Var5.L0((tg.s0) nVar4, new bi.r6(9, v5Var5, nVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.n nVar5 = nVar;
                                    if (nVar5 instanceof tg.j2) {
                                        ((tg.j2) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.v1) {
                                        ((tg.v1) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar5;
                                        w1Var.t0 = !w1Var.t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar5).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar6 = nVar;
                                    if (nVar6 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar6);
                                        if (nVar6 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar6, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            nVar2 = j2Var;
                                        } else if (nVar6 instanceof tg.q2) {
                                            tg.q2 q2Var = new tg.q2(v5Var9.getContext(), (tg.q2) nVar6, Q0);
                                            q2Var.setDelegate(v5Var9);
                                            q2Var.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            nVar2 = q2Var;
                                        }
                                        v5Var9.A0(nVar2);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, c8.na.o(-2, 44));
                }
                final int i12 = 3;
                if (nVar instanceof tg.q2) {
                    TextView textView2 = new TextView(v5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.E8, n5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(org.telegram.messenger.g0.o());
                    textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!e5Var.c() || e5Var.d) && v5Var.h2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(gd.N0(2131747476, null));
                        final int i13 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.w4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.n nVar2;
                                switch (i13) {
                                    case 0:
                                        tg.n nVar3 = nVar;
                                        boolean z11 = nVar3 instanceof tg.w1;
                                        v5 v5Var2 = v5Var;
                                        if (z11) {
                                            db dbVar = ((pa) v5Var2).o2.d1;
                                            if (dbVar != null) {
                                                dbVar.B();
                                            }
                                        } else {
                                            v5Var2.B0(nVar3);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = v5Var2.r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            v5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.q2) nVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        v5 v5Var3 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            v5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        v5 v5Var4 = v5Var;
                                        v5Var4.D0(nVar, true);
                                        v5Var4.q0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            v5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        v5 v5Var5 = v5Var;
                                        v5Var5.D0(null, true);
                                        tg.n nVar4 = nVar;
                                        v5Var5.L0((tg.s0) nVar4, new bi.r6(9, v5Var5, nVar4));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            v5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        v5 v5Var6 = v5Var;
                                        v5Var6.D0(null, true);
                                        v5Var6.K0((tg.p0) nVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            v5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.n nVar5 = nVar;
                                        if (nVar5 instanceof tg.j2) {
                                            ((tg.j2) nVar5).r(true);
                                        } else if (nVar5 instanceof tg.v1) {
                                            ((tg.v1) nVar5).r(true);
                                        } else if (nVar5 instanceof tg.w1) {
                                            tg.w1 w1Var = (tg.w1) nVar5;
                                            w1Var.t0 = !w1Var.t0;
                                            w1Var.invalidate();
                                        } else {
                                            ((tg.s1) nVar5).r(true);
                                        }
                                        v5 v5Var7 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            v5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        v5 v5Var8 = v5Var;
                                        v5Var8.getClass();
                                        nVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            v5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        v5 v5Var9 = v5Var;
                                        q5 q5Var2 = v5Var9.B0;
                                        tg.n nVar6 = nVar;
                                        if (nVar6 != null) {
                                            PointF Q0 = v5Var9.Q0(nVar6);
                                            if (nVar6 instanceof tg.j2) {
                                                tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar6, Q0);
                                                j2Var.setDelegate(v5Var9);
                                                q5Var2.addView(j2Var);
                                                v5Var9.e0();
                                                nVar2 = j2Var;
                                            } else if (nVar6 instanceof tg.q2) {
                                                tg.q2 q2Var = new tg.q2(v5Var9.getContext(), (tg.q2) nVar6, Q0);
                                                q2Var.setDelegate(v5Var9);
                                                q2Var.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                q5Var2.addView(q2Var, c8.na.c(-2.0f, -2));
                                                v5Var9.e0();
                                                nVar2 = q2Var;
                                            }
                                            v5Var9.A0(nVar2);
                                            v5Var9.D0(null, true);
                                            v5Var9.c0(nVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            v5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(gd.N0(2131747241, null));
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: hi.w4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.n nVar2;
                                switch (i11) {
                                    case 0:
                                        tg.n nVar3 = nVar;
                                        boolean z11 = nVar3 instanceof tg.w1;
                                        v5 v5Var2 = v5Var;
                                        if (z11) {
                                            db dbVar = ((pa) v5Var2).o2.d1;
                                            if (dbVar != null) {
                                                dbVar.B();
                                            }
                                        } else {
                                            v5Var2.B0(nVar3);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = v5Var2.r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            v5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.q2) nVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        v5 v5Var3 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            v5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        v5 v5Var4 = v5Var;
                                        v5Var4.D0(nVar, true);
                                        v5Var4.q0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            v5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        v5 v5Var5 = v5Var;
                                        v5Var5.D0(null, true);
                                        tg.n nVar4 = nVar;
                                        v5Var5.L0((tg.s0) nVar4, new bi.r6(9, v5Var5, nVar4));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            v5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        v5 v5Var6 = v5Var;
                                        v5Var6.D0(null, true);
                                        v5Var6.K0((tg.p0) nVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            v5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.n nVar5 = nVar;
                                        if (nVar5 instanceof tg.j2) {
                                            ((tg.j2) nVar5).r(true);
                                        } else if (nVar5 instanceof tg.v1) {
                                            ((tg.v1) nVar5).r(true);
                                        } else if (nVar5 instanceof tg.w1) {
                                            tg.w1 w1Var = (tg.w1) nVar5;
                                            w1Var.t0 = !w1Var.t0;
                                            w1Var.invalidate();
                                        } else {
                                            ((tg.s1) nVar5).r(true);
                                        }
                                        v5 v5Var7 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            v5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        v5 v5Var8 = v5Var;
                                        v5Var8.getClass();
                                        nVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            v5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        v5 v5Var9 = v5Var;
                                        q5 q5Var2 = v5Var9.B0;
                                        tg.n nVar6 = nVar;
                                        if (nVar6 != null) {
                                            PointF Q0 = v5Var9.Q0(nVar6);
                                            if (nVar6 instanceof tg.j2) {
                                                tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar6, Q0);
                                                j2Var.setDelegate(v5Var9);
                                                q5Var2.addView(j2Var);
                                                v5Var9.e0();
                                                nVar2 = j2Var;
                                            } else if (nVar6 instanceof tg.q2) {
                                                tg.q2 q2Var = new tg.q2(v5Var9.getContext(), (tg.q2) nVar6, Q0);
                                                q2Var.setDelegate(v5Var9);
                                                q2Var.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                q5Var2.addView(q2Var, c8.na.c(-2.0f, -2));
                                                v5Var9.e0();
                                                nVar2 = q2Var;
                                            }
                                            v5Var9.A0(nVar2);
                                            v5Var9.D0(null, true);
                                            v5Var9.c0(nVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            v5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, c8.na.o(-2, 44));
                    f10 = 14.0f;
                } else if (nVar instanceof tg.s0) {
                    TextView f02 = v5Var.f0(1, gd.N0(2131747476, null));
                    f10 = 14.0f;
                    f02.setOnClickListener(new View.OnClickListener() { // from class: hi.w4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.n nVar2;
                            switch (i12) {
                                case 0:
                                    tg.n nVar3 = nVar;
                                    boolean z11 = nVar3 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z11) {
                                        db dbVar = ((pa) v5Var2).o2.d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar4 = nVar;
                                    v5Var5.L0((tg.s0) nVar4, new bi.r6(9, v5Var5, nVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.n nVar5 = nVar;
                                    if (nVar5 instanceof tg.j2) {
                                        ((tg.j2) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.v1) {
                                        ((tg.v1) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar5;
                                        w1Var.t0 = !w1Var.t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar5).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar6 = nVar;
                                    if (nVar6 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar6);
                                        if (nVar6 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar6, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            nVar2 = j2Var;
                                        } else if (nVar6 instanceof tg.q2) {
                                            tg.q2 q2Var = new tg.q2(v5Var9.getContext(), (tg.q2) nVar6, Q0);
                                            q2Var.setDelegate(v5Var9);
                                            q2Var.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            nVar2 = q2Var;
                                        }
                                        v5Var9.A0(nVar2);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(f02, c8.na.o(-2, 44));
                } else {
                    f10 = 14.0f;
                    if (nVar instanceof tg.p0) {
                        TextView f03 = v5Var.f0(1, gd.N0(2131747476, null));
                        final int i14 = 4;
                        f03.setOnClickListener(new View.OnClickListener() { // from class: hi.w4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                tg.n nVar2;
                                switch (i14) {
                                    case 0:
                                        tg.n nVar3 = nVar;
                                        boolean z11 = nVar3 instanceof tg.w1;
                                        v5 v5Var2 = v5Var;
                                        if (z11) {
                                            db dbVar = ((pa) v5Var2).o2.d1;
                                            if (dbVar != null) {
                                                dbVar.B();
                                            }
                                        } else {
                                            v5Var2.B0(nVar3);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var = v5Var2.r1;
                                        if (g1Var != null && g1Var.isShowing()) {
                                            v5Var2.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        try {
                                            ((tg.q2) nVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                        }
                                        v5 v5Var3 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.r1;
                                        if (g1Var2 != null && g1Var2.isShowing()) {
                                            v5Var3.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        v5 v5Var4 = v5Var;
                                        v5Var4.D0(nVar, true);
                                        v5Var4.q0();
                                        org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.r1;
                                        if (g1Var3 != null && g1Var3.isShowing()) {
                                            v5Var4.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        v5 v5Var5 = v5Var;
                                        v5Var5.D0(null, true);
                                        tg.n nVar4 = nVar;
                                        v5Var5.L0((tg.s0) nVar4, new bi.r6(9, v5Var5, nVar4));
                                        org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.r1;
                                        if (g1Var4 != null && g1Var4.isShowing()) {
                                            v5Var5.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        v5 v5Var6 = v5Var;
                                        v5Var6.D0(null, true);
                                        v5Var6.K0((tg.p0) nVar);
                                        org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.r1;
                                        if (g1Var5 != null && g1Var5.isShowing()) {
                                            v5Var6.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        tg.n nVar5 = nVar;
                                        if (nVar5 instanceof tg.j2) {
                                            ((tg.j2) nVar5).r(true);
                                        } else if (nVar5 instanceof tg.v1) {
                                            ((tg.v1) nVar5).r(true);
                                        } else if (nVar5 instanceof tg.w1) {
                                            tg.w1 w1Var = (tg.w1) nVar5;
                                            w1Var.t0 = !w1Var.t0;
                                            w1Var.invalidate();
                                        } else {
                                            ((tg.s1) nVar5).r(true);
                                        }
                                        v5 v5Var7 = v5Var;
                                        org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.r1;
                                        if (g1Var6 != null && g1Var6.isShowing()) {
                                            v5Var7.r1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        v5 v5Var8 = v5Var;
                                        v5Var8.getClass();
                                        nVar.bringToFront();
                                        org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.r1;
                                        if (g1Var7 != null && g1Var7.isShowing()) {
                                            v5Var8.r1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        v5 v5Var9 = v5Var;
                                        q5 q5Var2 = v5Var9.B0;
                                        tg.n nVar6 = nVar;
                                        if (nVar6 != null) {
                                            PointF Q0 = v5Var9.Q0(nVar6);
                                            if (nVar6 instanceof tg.j2) {
                                                tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar6, Q0);
                                                j2Var.setDelegate(v5Var9);
                                                q5Var2.addView(j2Var);
                                                v5Var9.e0();
                                                nVar2 = j2Var;
                                            } else if (nVar6 instanceof tg.q2) {
                                                tg.q2 q2Var = new tg.q2(v5Var9.getContext(), (tg.q2) nVar6, Q0);
                                                q2Var.setDelegate(v5Var9);
                                                q2Var.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                                q5Var2.addView(q2Var, c8.na.c(-2.0f, -2));
                                                v5Var9.e0();
                                                nVar2 = q2Var;
                                            }
                                            v5Var9.A0(nVar2);
                                            v5Var9.D0(null, true);
                                            v5Var9.c0(nVar2);
                                        }
                                        org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.r1;
                                        if (g1Var8 != null && g1Var8.isShowing()) {
                                            v5Var9.r1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayout.addView(f03, c8.na.o(-2, 44));
                    }
                }
                if ((nVar instanceof tg.j2) || (nVar instanceof tg.w1) || (nVar instanceof tg.s1) || (nVar instanceof tg.v1)) {
                    TextView f04 = v5Var.f0(4, gd.N0(2131750673, null));
                    final int i15 = 5;
                    f04.setOnClickListener(new View.OnClickListener() { // from class: hi.w4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.n nVar2;
                            switch (i15) {
                                case 0:
                                    tg.n nVar3 = nVar;
                                    boolean z11 = nVar3 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z11) {
                                        db dbVar = ((pa) v5Var2).o2.d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar4 = nVar;
                                    v5Var5.L0((tg.s0) nVar4, new bi.r6(9, v5Var5, nVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.n nVar5 = nVar;
                                    if (nVar5 instanceof tg.j2) {
                                        ((tg.j2) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.v1) {
                                        ((tg.v1) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar5;
                                        w1Var.t0 = !w1Var.t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar5).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar6 = nVar;
                                    if (nVar6 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar6);
                                        if (nVar6 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar6, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            nVar2 = j2Var;
                                        } else if (nVar6 instanceof tg.q2) {
                                            tg.q2 q2Var = new tg.q2(v5Var9.getContext(), (tg.q2) nVar6, Q0);
                                            q2Var.setDelegate(v5Var9);
                                            q2Var.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            nVar2 = q2Var;
                                        }
                                        v5Var9.A0(nVar2);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(f04, c8.na.o(-2, 44));
                }
                boolean z11 = nVar instanceof tg.s1;
                if (q5Var.indexOfChild(nVar) != q5Var.getChildCount() - 1 && !(nVar instanceof tg.v1)) {
                    TextView textView3 = new TextView(v5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.E8, n5Var);
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(org.telegram.messenger.g0.o());
                    textView3.setPadding(org.telegram.messenger.g0.L(f10), 0, org.telegram.messenger.g0.L(f10), 0);
                    textView3.setTextSize(1, f10);
                    textView3.setTag(2);
                    textView3.setText(gd.N0(2131747481, null));
                    final int i16 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: hi.w4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.n nVar2;
                            switch (i16) {
                                case 0:
                                    tg.n nVar3 = nVar;
                                    boolean z112 = nVar3 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z112) {
                                        db dbVar = ((pa) v5Var2).o2.d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar4 = nVar;
                                    v5Var5.L0((tg.s0) nVar4, new bi.r6(9, v5Var5, nVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.n nVar5 = nVar;
                                    if (nVar5 instanceof tg.j2) {
                                        ((tg.j2) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.v1) {
                                        ((tg.v1) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar5;
                                        w1Var.t0 = !w1Var.t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar5).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar6 = nVar;
                                    if (nVar6 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar6);
                                        if (nVar6 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar6, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            nVar2 = j2Var;
                                        } else if (nVar6 instanceof tg.q2) {
                                            tg.q2 q2Var = new tg.q2(v5Var9.getContext(), (tg.q2) nVar6, Q0);
                                            q2Var.setDelegate(v5Var9);
                                            q2Var.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            nVar2 = q2Var;
                                        }
                                        v5Var9.A0(nVar2);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, c8.na.o(-2, 44));
                } else if (!(nVar instanceof tg.d) && !z11 && !z10 && !(nVar instanceof tg.w1) && !(nVar instanceof tg.s0) && !(nVar instanceof tg.r2) && !(nVar instanceof tg.p0) && !(nVar instanceof tg.v1)) {
                    TextView textView4 = new TextView(v5Var.getContext());
                    org.telegram.ui.ActionBar.u6.U(textView4, org.telegram.ui.ActionBar.n6.E8, n5Var);
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(org.telegram.messenger.g0.o());
                    textView4.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(gd.N0(2131747477, "PaintDuplicate"));
                    final int i17 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: hi.w4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            tg.n nVar2;
                            switch (i17) {
                                case 0:
                                    tg.n nVar3 = nVar;
                                    boolean z112 = nVar3 instanceof tg.w1;
                                    v5 v5Var2 = v5Var;
                                    if (z112) {
                                        db dbVar = ((pa) v5Var2).o2.d1;
                                        if (dbVar != null) {
                                            dbVar.B();
                                        }
                                    } else {
                                        v5Var2.B0(nVar3);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var = v5Var2.r1;
                                    if (g1Var != null && g1Var.isShowing()) {
                                        v5Var2.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    try {
                                        ((tg.q2) nVar).getEditText().onTextContextMenuItem(R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    v5 v5Var3 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var2 = v5Var3.r1;
                                    if (g1Var2 != null && g1Var2.isShowing()) {
                                        v5Var3.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    v5 v5Var4 = v5Var;
                                    v5Var4.D0(nVar, true);
                                    v5Var4.q0();
                                    org.telegram.ui.ActionBar.g1 g1Var3 = v5Var4.r1;
                                    if (g1Var3 != null && g1Var3.isShowing()) {
                                        v5Var4.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    v5 v5Var5 = v5Var;
                                    v5Var5.D0(null, true);
                                    tg.n nVar4 = nVar;
                                    v5Var5.L0((tg.s0) nVar4, new bi.r6(9, v5Var5, nVar4));
                                    org.telegram.ui.ActionBar.g1 g1Var4 = v5Var5.r1;
                                    if (g1Var4 != null && g1Var4.isShowing()) {
                                        v5Var5.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    v5 v5Var6 = v5Var;
                                    v5Var6.D0(null, true);
                                    v5Var6.K0((tg.p0) nVar);
                                    org.telegram.ui.ActionBar.g1 g1Var5 = v5Var6.r1;
                                    if (g1Var5 != null && g1Var5.isShowing()) {
                                        v5Var6.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    tg.n nVar5 = nVar;
                                    if (nVar5 instanceof tg.j2) {
                                        ((tg.j2) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.v1) {
                                        ((tg.v1) nVar5).r(true);
                                    } else if (nVar5 instanceof tg.w1) {
                                        tg.w1 w1Var = (tg.w1) nVar5;
                                        w1Var.t0 = !w1Var.t0;
                                        w1Var.invalidate();
                                    } else {
                                        ((tg.s1) nVar5).r(true);
                                    }
                                    v5 v5Var7 = v5Var;
                                    org.telegram.ui.ActionBar.g1 g1Var6 = v5Var7.r1;
                                    if (g1Var6 != null && g1Var6.isShowing()) {
                                        v5Var7.r1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    v5 v5Var8 = v5Var;
                                    v5Var8.getClass();
                                    nVar.bringToFront();
                                    org.telegram.ui.ActionBar.g1 g1Var7 = v5Var8.r1;
                                    if (g1Var7 != null && g1Var7.isShowing()) {
                                        v5Var8.r1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    v5 v5Var9 = v5Var;
                                    q5 q5Var2 = v5Var9.B0;
                                    tg.n nVar6 = nVar;
                                    if (nVar6 != null) {
                                        PointF Q0 = v5Var9.Q0(nVar6);
                                        if (nVar6 instanceof tg.j2) {
                                            tg.n j2Var = new tg.j2(v5Var9.getContext(), (tg.j2) nVar6, Q0);
                                            j2Var.setDelegate(v5Var9);
                                            q5Var2.addView(j2Var);
                                            v5Var9.e0();
                                            nVar2 = j2Var;
                                        } else if (nVar6 instanceof tg.q2) {
                                            tg.q2 q2Var = new tg.q2(v5Var9.getContext(), (tg.q2) nVar6, Q0);
                                            q2Var.setDelegate(v5Var9);
                                            q2Var.setMaxWidth(v5Var9.B1 - org.telegram.messenger.g0.L(32.0f));
                                            q5Var2.addView(q2Var, c8.na.c(-2.0f, -2));
                                            v5Var9.e0();
                                            nVar2 = q2Var;
                                        }
                                        v5Var9.A0(nVar2);
                                        v5Var9.D0(null, true);
                                        v5Var9.c0(nVar2);
                                    }
                                    org.telegram.ui.ActionBar.g1 g1Var8 = v5Var9.r1;
                                    if (g1Var8 != null && g1Var8.isShowing()) {
                                        v5Var9.r1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, c8.na.o(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int i19 = org.telegram.ui.ActionBar.n6.i6;
                    int w02 = org.telegram.ui.ActionBar.n6.w0(i19, n5Var);
                    int i20 = 8;
                    int i21 = i18 == 0 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i23 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i20 = 0;
                    }
                    org.telegram.ui.ActionBar.u6.Q(childAt, org.telegram.ui.ActionBar.n6.c0(w02, i21, i22, i23, i20), null, org.telegram.ui.ActionBar.u6.M(i19), n5Var);
                    i18++;
                }
                v5Var.s1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
