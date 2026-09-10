package bi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r7 b;
    public final /* synthetic */ pg.j c;

    public /* synthetic */ b6(r7 r7Var, pg.j jVar, int i10) {
        this.a = i10;
        this.b = r7Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C0(this.c);
                break;
            default:
                final r7 r7Var = this.b;
                j7 j7Var = r7Var.R0;
                r6 r6Var = r7Var.O1;
                d7 d7Var = r7Var.G1;
                LinearLayout linearLayout = new LinearLayout(r7Var.getContext());
                linearLayout.setOrientation(0);
                final pg.j jVar = this.c;
                boolean z10 = jVar instanceof pg.e1;
                if (!z10) {
                    TextView textView = new TextView(r7Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, d7Var));
                    textView.setGravity(16);
                    textView.setLines(1);
                    textView.setSingleLine();
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView.setTextSize(1, 14.0f);
                    textView.setTag(0);
                    textView.setText(LocaleController.getString("PaintDelete", R.string.PaintDelete));
                    final int i10 = 0;
                    textView.setOnClickListener(new View.OnClickListener() { // from class: bi.g6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            pg.j jVar2;
                            switch (i10) {
                                case 0:
                                    pg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z11) {
                                        qd qdVar = ((ad) r7Var2).A2.c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    pg.j jVar4 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar5 = jVar;
                                    r7Var5.L0((pg.t0) jVar5, new k6(0, r7Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    pg.j jVar6 = jVar;
                                    if (jVar6 instanceof pg.o2) {
                                        ((pg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.a2) {
                                        ((pg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar6).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar7);
                                        if (jVar7 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar7, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof pg.v2) {
                                            pg.v2 v2Var = new pg.v2(r7Var9.getContext(), (pg.v2) jVar7, Q0);
                                            v2Var.setDelegate(r7Var9);
                                            v2Var.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        r7Var9.B0(jVar2);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, w7.a6.n(-2, 44));
                }
                if (jVar instanceof pg.v2) {
                    TextView textView2 = new TextView(r7Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, d7Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!r6Var.c() || r6Var.d) && r7Var.t2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        final int i11 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: bi.g6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                pg.j jVar2;
                                switch (i11) {
                                    case 0:
                                        pg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof pg.b2;
                                        r7 r7Var2 = r7Var;
                                        if (z11) {
                                            qd qdVar = ((ad) r7Var2).A2.c1;
                                            if (qdVar != null) {
                                                qdVar.B();
                                            }
                                        } else {
                                            r7Var2.C0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            r7Var2.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        pg.j jVar4 = jVar;
                                        r7 r7Var3 = r7Var;
                                        r7Var3.getClass();
                                        try {
                                            ((pg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            r7Var3.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        r7 r7Var4 = r7Var;
                                        r7Var4.D0(jVar, true);
                                        r7Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            r7Var4.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        r7 r7Var5 = r7Var;
                                        r7Var5.D0(null, true);
                                        pg.j jVar5 = jVar;
                                        r7Var5.L0((pg.t0) jVar5, new k6(0, r7Var5, jVar5));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            r7Var5.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        r7 r7Var6 = r7Var;
                                        r7Var6.D0(null, true);
                                        r7Var6.K0((pg.q0) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            r7Var6.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        pg.j jVar6 = jVar;
                                        if (jVar6 instanceof pg.o2) {
                                            ((pg.o2) jVar6).r(true);
                                        } else if (jVar6 instanceof pg.a2) {
                                            ((pg.a2) jVar6).r(true);
                                        } else if (jVar6 instanceof pg.b2) {
                                            pg.b2 b2Var = (pg.b2) jVar6;
                                            b2Var.r0 = !b2Var.r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((pg.x1) jVar6).r(true);
                                        }
                                        r7 r7Var7 = r7Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            r7Var7.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        r7 r7Var8 = r7Var;
                                        r7Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            r7Var8.H1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        r7 r7Var9 = r7Var;
                                        j7 j7Var2 = r7Var9.R0;
                                        pg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF Q0 = r7Var9.Q0(jVar7);
                                            if (jVar7 instanceof pg.o2) {
                                                pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar7, Q0);
                                                o2Var.setDelegate(r7Var9);
                                                j7Var2.addView(o2Var);
                                                r7Var9.g0();
                                                jVar2 = o2Var;
                                            } else if (jVar7 instanceof pg.v2) {
                                                pg.v2 v2Var = new pg.v2(r7Var9.getContext(), (pg.v2) jVar7, Q0);
                                                v2Var.setDelegate(r7Var9);
                                                v2Var.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j7Var2.addView(v2Var, w7.a6.c(-2.0f, -2));
                                                r7Var9.g0();
                                                jVar2 = v2Var;
                                            }
                                            r7Var9.B0(jVar2);
                                            r7Var9.D0(null, true);
                                            r7Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            r7Var9.H1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        textView2.setTag(3);
                        textView2.setText(LocaleController.getString(R.string.Paste));
                        final int i12 = 1;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: bi.g6
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                pg.j jVar2;
                                switch (i12) {
                                    case 0:
                                        pg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof pg.b2;
                                        r7 r7Var2 = r7Var;
                                        if (z11) {
                                            qd qdVar = ((ad) r7Var2).A2.c1;
                                            if (qdVar != null) {
                                                qdVar.B();
                                            }
                                        } else {
                                            r7Var2.C0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                        if (p1Var != null && p1Var.isShowing()) {
                                            r7Var2.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        pg.j jVar4 = jVar;
                                        r7 r7Var3 = r7Var;
                                        r7Var3.getClass();
                                        try {
                                            ((pg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                        if (p1Var2 != null && p1Var2.isShowing()) {
                                            r7Var3.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        r7 r7Var4 = r7Var;
                                        r7Var4.D0(jVar, true);
                                        r7Var4.r0();
                                        org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                        if (p1Var3 != null && p1Var3.isShowing()) {
                                            r7Var4.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        r7 r7Var5 = r7Var;
                                        r7Var5.D0(null, true);
                                        pg.j jVar5 = jVar;
                                        r7Var5.L0((pg.t0) jVar5, new k6(0, r7Var5, jVar5));
                                        org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                        if (p1Var4 != null && p1Var4.isShowing()) {
                                            r7Var5.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        r7 r7Var6 = r7Var;
                                        r7Var6.D0(null, true);
                                        r7Var6.K0((pg.q0) jVar);
                                        org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                        if (p1Var5 != null && p1Var5.isShowing()) {
                                            r7Var6.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        pg.j jVar6 = jVar;
                                        if (jVar6 instanceof pg.o2) {
                                            ((pg.o2) jVar6).r(true);
                                        } else if (jVar6 instanceof pg.a2) {
                                            ((pg.a2) jVar6).r(true);
                                        } else if (jVar6 instanceof pg.b2) {
                                            pg.b2 b2Var = (pg.b2) jVar6;
                                            b2Var.r0 = !b2Var.r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((pg.x1) jVar6).r(true);
                                        }
                                        r7 r7Var7 = r7Var;
                                        org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                        if (p1Var6 != null && p1Var6.isShowing()) {
                                            r7Var7.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        r7 r7Var8 = r7Var;
                                        r7Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                        if (p1Var7 != null && p1Var7.isShowing()) {
                                            r7Var8.H1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        r7 r7Var9 = r7Var;
                                        j7 j7Var2 = r7Var9.R0;
                                        pg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF Q0 = r7Var9.Q0(jVar7);
                                            if (jVar7 instanceof pg.o2) {
                                                pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar7, Q0);
                                                o2Var.setDelegate(r7Var9);
                                                j7Var2.addView(o2Var);
                                                r7Var9.g0();
                                                jVar2 = o2Var;
                                            } else if (jVar7 instanceof pg.v2) {
                                                pg.v2 v2Var = new pg.v2(r7Var9.getContext(), (pg.v2) jVar7, Q0);
                                                v2Var.setDelegate(r7Var9);
                                                v2Var.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                                j7Var2.addView(v2Var, w7.a6.c(-2.0f, -2));
                                                r7Var9.g0();
                                                jVar2 = v2Var;
                                            }
                                            r7Var9.B0(jVar2);
                                            r7Var9.D0(null, true);
                                            r7Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                        if (p1Var8 != null && p1Var8.isShowing()) {
                                            r7Var9.H1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, w7.a6.n(-2, 44));
                } else if (jVar instanceof pg.t0) {
                    TextView h02 = r7Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i13 = 3;
                    h02.setOnClickListener(new View.OnClickListener() { // from class: bi.g6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            pg.j jVar2;
                            switch (i13) {
                                case 0:
                                    pg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z11) {
                                        qd qdVar = ((ad) r7Var2).A2.c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    pg.j jVar4 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar5 = jVar;
                                    r7Var5.L0((pg.t0) jVar5, new k6(0, r7Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    pg.j jVar6 = jVar;
                                    if (jVar6 instanceof pg.o2) {
                                        ((pg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.a2) {
                                        ((pg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar6).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar7);
                                        if (jVar7 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar7, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof pg.v2) {
                                            pg.v2 v2Var = new pg.v2(r7Var9.getContext(), (pg.v2) jVar7, Q0);
                                            v2Var.setDelegate(r7Var9);
                                            v2Var.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        r7Var9.B0(jVar2);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h02, w7.a6.n(-2, 44));
                } else if (jVar instanceof pg.q0) {
                    TextView h03 = r7Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i14 = 4;
                    h03.setOnClickListener(new View.OnClickListener() { // from class: bi.g6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            pg.j jVar2;
                            switch (i14) {
                                case 0:
                                    pg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z11) {
                                        qd qdVar = ((ad) r7Var2).A2.c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    pg.j jVar4 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar5 = jVar;
                                    r7Var5.L0((pg.t0) jVar5, new k6(0, r7Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    pg.j jVar6 = jVar;
                                    if (jVar6 instanceof pg.o2) {
                                        ((pg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.a2) {
                                        ((pg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar6).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar7);
                                        if (jVar7 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar7, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof pg.v2) {
                                            pg.v2 v2Var = new pg.v2(r7Var9.getContext(), (pg.v2) jVar7, Q0);
                                            v2Var.setDelegate(r7Var9);
                                            v2Var.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        r7Var9.B0(jVar2);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h03, w7.a6.n(-2, 44));
                }
                if ((jVar instanceof pg.o2) || (jVar instanceof pg.b2) || (jVar instanceof pg.x1) || (jVar instanceof pg.a2)) {
                    TextView h04 = r7Var.h0(4, LocaleController.getString(R.string.Flip));
                    final int i15 = 5;
                    h04.setOnClickListener(new View.OnClickListener() { // from class: bi.g6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            pg.j jVar2;
                            switch (i15) {
                                case 0:
                                    pg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z11) {
                                        qd qdVar = ((ad) r7Var2).A2.c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    pg.j jVar4 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar5 = jVar;
                                    r7Var5.L0((pg.t0) jVar5, new k6(0, r7Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    pg.j jVar6 = jVar;
                                    if (jVar6 instanceof pg.o2) {
                                        ((pg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.a2) {
                                        ((pg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar6).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar7);
                                        if (jVar7 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar7, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof pg.v2) {
                                            pg.v2 v2Var = new pg.v2(r7Var9.getContext(), (pg.v2) jVar7, Q0);
                                            v2Var.setDelegate(r7Var9);
                                            v2Var.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        r7Var9.B0(jVar2);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h04, w7.a6.n(-2, 44));
                }
                boolean z11 = jVar instanceof pg.x1;
                if (j7Var.indexOfChild(jVar) != j7Var.getChildCount() - 1 && !(jVar instanceof pg.a2)) {
                    TextView textView3 = new TextView(r7Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, d7Var));
                    textView3.setLines(1);
                    textView3.setSingleLine();
                    textView3.setEllipsize(TextUtils.TruncateAt.END);
                    textView3.setGravity(16);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTag(2);
                    textView3.setText(LocaleController.getString(R.string.PaintBringToFront));
                    final int i16 = 6;
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: bi.g6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            pg.j jVar2;
                            switch (i16) {
                                case 0:
                                    pg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z112) {
                                        qd qdVar = ((ad) r7Var2).A2.c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    pg.j jVar4 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar5 = jVar;
                                    r7Var5.L0((pg.t0) jVar5, new k6(0, r7Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    pg.j jVar6 = jVar;
                                    if (jVar6 instanceof pg.o2) {
                                        ((pg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.a2) {
                                        ((pg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar6).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar7);
                                        if (jVar7 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar7, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof pg.v2) {
                                            pg.v2 v2Var = new pg.v2(r7Var9.getContext(), (pg.v2) jVar7, Q0);
                                            v2Var.setDelegate(r7Var9);
                                            v2Var.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        r7Var9.B0(jVar2);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, w7.a6.n(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof pg.b2) && !(jVar instanceof pg.t0) && !(jVar instanceof pg.w2) && !(jVar instanceof pg.q0) && !(jVar instanceof pg.a2)) {
                    TextView textView4 = new TextView(r7Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, d7Var));
                    textView4.setLines(1);
                    textView4.setSingleLine();
                    textView4.setEllipsize(TextUtils.TruncateAt.END);
                    textView4.setGravity(16);
                    textView4.setTypeface(AndroidUtilities.bold());
                    textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTag(2);
                    textView4.setText(LocaleController.getString("PaintDuplicate", R.string.PaintDuplicate));
                    final int i17 = 7;
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: bi.g6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            pg.j jVar2;
                            switch (i17) {
                                case 0:
                                    pg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof pg.b2;
                                    r7 r7Var2 = r7Var;
                                    if (z112) {
                                        qd qdVar = ((ad) r7Var2).A2.c1;
                                        if (qdVar != null) {
                                            qdVar.B();
                                        }
                                    } else {
                                        r7Var2.C0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var = r7Var2.H1;
                                    if (p1Var != null && p1Var.isShowing()) {
                                        r7Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    pg.j jVar4 = jVar;
                                    r7 r7Var3 = r7Var;
                                    r7Var3.getClass();
                                    try {
                                        ((pg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var2 = r7Var3.H1;
                                    if (p1Var2 != null && p1Var2.isShowing()) {
                                        r7Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    r7 r7Var4 = r7Var;
                                    r7Var4.D0(jVar, true);
                                    r7Var4.r0();
                                    org.telegram.ui.ActionBar.p1 p1Var3 = r7Var4.H1;
                                    if (p1Var3 != null && p1Var3.isShowing()) {
                                        r7Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    r7 r7Var5 = r7Var;
                                    r7Var5.D0(null, true);
                                    pg.j jVar5 = jVar;
                                    r7Var5.L0((pg.t0) jVar5, new k6(0, r7Var5, jVar5));
                                    org.telegram.ui.ActionBar.p1 p1Var4 = r7Var5.H1;
                                    if (p1Var4 != null && p1Var4.isShowing()) {
                                        r7Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    r7 r7Var6 = r7Var;
                                    r7Var6.D0(null, true);
                                    r7Var6.K0((pg.q0) jVar);
                                    org.telegram.ui.ActionBar.p1 p1Var5 = r7Var6.H1;
                                    if (p1Var5 != null && p1Var5.isShowing()) {
                                        r7Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    pg.j jVar6 = jVar;
                                    if (jVar6 instanceof pg.o2) {
                                        ((pg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.a2) {
                                        ((pg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof pg.b2) {
                                        pg.b2 b2Var = (pg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((pg.x1) jVar6).r(true);
                                    }
                                    r7 r7Var7 = r7Var;
                                    org.telegram.ui.ActionBar.p1 p1Var6 = r7Var7.H1;
                                    if (p1Var6 != null && p1Var6.isShowing()) {
                                        r7Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    r7 r7Var8 = r7Var;
                                    r7Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.p1 p1Var7 = r7Var8.H1;
                                    if (p1Var7 != null && p1Var7.isShowing()) {
                                        r7Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    r7 r7Var9 = r7Var;
                                    j7 j7Var2 = r7Var9.R0;
                                    pg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF Q0 = r7Var9.Q0(jVar7);
                                        if (jVar7 instanceof pg.o2) {
                                            pg.j o2Var = new pg.o2(r7Var9.getContext(), (pg.o2) jVar7, Q0);
                                            o2Var.setDelegate(r7Var9);
                                            j7Var2.addView(o2Var);
                                            r7Var9.g0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof pg.v2) {
                                            pg.v2 v2Var = new pg.v2(r7Var9.getContext(), (pg.v2) jVar7, Q0);
                                            v2Var.setDelegate(r7Var9);
                                            v2Var.setMaxWidth(r7Var9.R1 - AndroidUtilities.dp(32.0f));
                                            j7Var2.addView(v2Var, w7.a6.c(-2.0f, -2));
                                            r7Var9.g0();
                                            jVar2 = v2Var;
                                        }
                                        r7Var9.B0(jVar2);
                                        r7Var9.D0(null, true);
                                        r7Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.p1 p1Var8 = r7Var9.H1;
                                    if (p1Var8 != null && p1Var8.isShowing()) {
                                        r7Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, w7.a6.n(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, d7Var);
                    int i19 = 8;
                    int i20 = i18 == 0 ? 8 : 0;
                    int i21 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    childAt.setBackground(org.telegram.ui.ActionBar.j6.a0(v02, i20, i21, i22, i19));
                    i18++;
                }
                r7Var.I1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
