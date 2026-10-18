package ei;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;
    public final /* synthetic */ rg.j c;

    public /* synthetic */ v4(f6 f6Var, rg.j jVar, int i10) {
        this.a = i10;
        this.b = f6Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0(this.c);
                break;
            default:
                final f6 f6Var = this.b;
                z5 z5Var = f6Var.R0;
                i5 i5Var = f6Var.O1;
                t5 t5Var = f6Var.G1;
                LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
                linearLayout.setOrientation(0);
                final rg.j jVar = this.c;
                boolean z10 = jVar instanceof rg.e1;
                if (!z10) {
                    TextView textView = new TextView(f6Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, t5Var));
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
                    textView.setOnClickListener(new View.OnClickListener() { // from class: ei.a5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            rg.j jVar2;
                            switch (i10) {
                                case 0:
                                    rg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof rg.b2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    rg.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar5 = jVar;
                                    f6Var5.K0((rg.t0) jVar5, new ai.q5(6, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    rg.j jVar6 = jVar;
                                    if (jVar6 instanceof rg.o2) {
                                        ((rg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.a2) {
                                        ((rg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.b2) {
                                        rg.b2 b2Var = (rg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((rg.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF P0 = f6Var9.P0(jVar7);
                                        if (jVar7 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar7, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof rg.v2) {
                                            rg.v2 v2Var = new rg.v2(f6Var9.getContext(), (rg.v2) jVar7, P0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, w7.z5.d(-2.0f, -2));
                                            f6Var9.f0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.A0(jVar2);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, w7.z5.n(-2, 44));
                }
                if (jVar instanceof rg.v2) {
                    TextView textView2 = new TextView(f6Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, t5Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!i5Var.c() || i5Var.d) && f6Var.t2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        final int i11 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: ei.a5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                rg.j jVar2;
                                switch (i11) {
                                    case 0:
                                        rg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof rg.b2;
                                        f6 f6Var2 = f6Var;
                                        if (z11) {
                                            lb lbVar = ((xa) f6Var2).A2.c1;
                                            if (lbVar != null) {
                                                lbVar.B();
                                            }
                                        } else {
                                            f6Var2.B0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                        if (m1Var != null && m1Var.isShowing()) {
                                            f6Var2.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        rg.j jVar4 = jVar;
                                        f6 f6Var3 = f6Var;
                                        f6Var3.getClass();
                                        try {
                                            ((rg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                        if (m1Var2 != null && m1Var2.isShowing()) {
                                            f6Var3.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        f6 f6Var4 = f6Var;
                                        f6Var4.C0(jVar, true);
                                        f6Var4.q0();
                                        org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                        if (m1Var3 != null && m1Var3.isShowing()) {
                                            f6Var4.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        f6 f6Var5 = f6Var;
                                        f6Var5.C0(null, true);
                                        rg.j jVar5 = jVar;
                                        f6Var5.K0((rg.t0) jVar5, new ai.q5(6, f6Var5, jVar5));
                                        org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                        if (m1Var4 != null && m1Var4.isShowing()) {
                                            f6Var5.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        f6 f6Var6 = f6Var;
                                        f6Var6.C0(null, true);
                                        f6Var6.J0((rg.q0) jVar);
                                        org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                        if (m1Var5 != null && m1Var5.isShowing()) {
                                            f6Var6.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        rg.j jVar6 = jVar;
                                        if (jVar6 instanceof rg.o2) {
                                            ((rg.o2) jVar6).r(true);
                                        } else if (jVar6 instanceof rg.a2) {
                                            ((rg.a2) jVar6).r(true);
                                        } else if (jVar6 instanceof rg.b2) {
                                            rg.b2 b2Var = (rg.b2) jVar6;
                                            b2Var.r0 = !b2Var.r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((rg.x1) jVar6).r(true);
                                        }
                                        f6 f6Var7 = f6Var;
                                        org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                        if (m1Var6 != null && m1Var6.isShowing()) {
                                            f6Var7.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        f6 f6Var8 = f6Var;
                                        f6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                        if (m1Var7 != null && m1Var7.isShowing()) {
                                            f6Var8.H1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        f6 f6Var9 = f6Var;
                                        z5 z5Var2 = f6Var9.R0;
                                        rg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF P0 = f6Var9.P0(jVar7);
                                            if (jVar7 instanceof rg.o2) {
                                                rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar7, P0);
                                                o2Var.setDelegate(f6Var9);
                                                z5Var2.addView(o2Var);
                                                f6Var9.f0();
                                                jVar2 = o2Var;
                                            } else if (jVar7 instanceof rg.v2) {
                                                rg.v2 v2Var = new rg.v2(f6Var9.getContext(), (rg.v2) jVar7, P0);
                                                v2Var.setDelegate(f6Var9);
                                                v2Var.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                z5Var2.addView(v2Var, w7.z5.d(-2.0f, -2));
                                                f6Var9.f0();
                                                jVar2 = v2Var;
                                            }
                                            f6Var9.A0(jVar2);
                                            f6Var9.C0(null, true);
                                            f6Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                        if (m1Var8 != null && m1Var8.isShowing()) {
                                            f6Var9.H1.d(true);
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
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: ei.a5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                rg.j jVar2;
                                switch (i12) {
                                    case 0:
                                        rg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof rg.b2;
                                        f6 f6Var2 = f6Var;
                                        if (z11) {
                                            lb lbVar = ((xa) f6Var2).A2.c1;
                                            if (lbVar != null) {
                                                lbVar.B();
                                            }
                                        } else {
                                            f6Var2.B0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                        if (m1Var != null && m1Var.isShowing()) {
                                            f6Var2.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        rg.j jVar4 = jVar;
                                        f6 f6Var3 = f6Var;
                                        f6Var3.getClass();
                                        try {
                                            ((rg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                        if (m1Var2 != null && m1Var2.isShowing()) {
                                            f6Var3.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        f6 f6Var4 = f6Var;
                                        f6Var4.C0(jVar, true);
                                        f6Var4.q0();
                                        org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                        if (m1Var3 != null && m1Var3.isShowing()) {
                                            f6Var4.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        f6 f6Var5 = f6Var;
                                        f6Var5.C0(null, true);
                                        rg.j jVar5 = jVar;
                                        f6Var5.K0((rg.t0) jVar5, new ai.q5(6, f6Var5, jVar5));
                                        org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                        if (m1Var4 != null && m1Var4.isShowing()) {
                                            f6Var5.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        f6 f6Var6 = f6Var;
                                        f6Var6.C0(null, true);
                                        f6Var6.J0((rg.q0) jVar);
                                        org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                        if (m1Var5 != null && m1Var5.isShowing()) {
                                            f6Var6.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        rg.j jVar6 = jVar;
                                        if (jVar6 instanceof rg.o2) {
                                            ((rg.o2) jVar6).r(true);
                                        } else if (jVar6 instanceof rg.a2) {
                                            ((rg.a2) jVar6).r(true);
                                        } else if (jVar6 instanceof rg.b2) {
                                            rg.b2 b2Var = (rg.b2) jVar6;
                                            b2Var.r0 = !b2Var.r0;
                                            b2Var.invalidate();
                                        } else {
                                            ((rg.x1) jVar6).r(true);
                                        }
                                        f6 f6Var7 = f6Var;
                                        org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                        if (m1Var6 != null && m1Var6.isShowing()) {
                                            f6Var7.H1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        f6 f6Var8 = f6Var;
                                        f6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                        if (m1Var7 != null && m1Var7.isShowing()) {
                                            f6Var8.H1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        f6 f6Var9 = f6Var;
                                        z5 z5Var2 = f6Var9.R0;
                                        rg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF P0 = f6Var9.P0(jVar7);
                                            if (jVar7 instanceof rg.o2) {
                                                rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar7, P0);
                                                o2Var.setDelegate(f6Var9);
                                                z5Var2.addView(o2Var);
                                                f6Var9.f0();
                                                jVar2 = o2Var;
                                            } else if (jVar7 instanceof rg.v2) {
                                                rg.v2 v2Var = new rg.v2(f6Var9.getContext(), (rg.v2) jVar7, P0);
                                                v2Var.setDelegate(f6Var9);
                                                v2Var.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                                z5Var2.addView(v2Var, w7.z5.d(-2.0f, -2));
                                                f6Var9.f0();
                                                jVar2 = v2Var;
                                            }
                                            f6Var9.A0(jVar2);
                                            f6Var9.C0(null, true);
                                            f6Var9.d0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                        if (m1Var8 != null && m1Var8.isShowing()) {
                                            f6Var9.H1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, w7.z5.n(-2, 44));
                } else if (jVar instanceof rg.t0) {
                    TextView g02 = f6Var.g0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i13 = 3;
                    g02.setOnClickListener(new View.OnClickListener() { // from class: ei.a5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            rg.j jVar2;
                            switch (i13) {
                                case 0:
                                    rg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof rg.b2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    rg.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar5 = jVar;
                                    f6Var5.K0((rg.t0) jVar5, new ai.q5(6, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    rg.j jVar6 = jVar;
                                    if (jVar6 instanceof rg.o2) {
                                        ((rg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.a2) {
                                        ((rg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.b2) {
                                        rg.b2 b2Var = (rg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((rg.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF P0 = f6Var9.P0(jVar7);
                                        if (jVar7 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar7, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof rg.v2) {
                                            rg.v2 v2Var = new rg.v2(f6Var9.getContext(), (rg.v2) jVar7, P0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, w7.z5.d(-2.0f, -2));
                                            f6Var9.f0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.A0(jVar2);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(g02, w7.z5.n(-2, 44));
                } else if (jVar instanceof rg.q0) {
                    TextView g03 = f6Var.g0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i14 = 4;
                    g03.setOnClickListener(new View.OnClickListener() { // from class: ei.a5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            rg.j jVar2;
                            switch (i14) {
                                case 0:
                                    rg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof rg.b2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    rg.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar5 = jVar;
                                    f6Var5.K0((rg.t0) jVar5, new ai.q5(6, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    rg.j jVar6 = jVar;
                                    if (jVar6 instanceof rg.o2) {
                                        ((rg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.a2) {
                                        ((rg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.b2) {
                                        rg.b2 b2Var = (rg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((rg.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF P0 = f6Var9.P0(jVar7);
                                        if (jVar7 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar7, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof rg.v2) {
                                            rg.v2 v2Var = new rg.v2(f6Var9.getContext(), (rg.v2) jVar7, P0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, w7.z5.d(-2.0f, -2));
                                            f6Var9.f0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.A0(jVar2);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(g03, w7.z5.n(-2, 44));
                }
                if ((jVar instanceof rg.o2) || (jVar instanceof rg.b2) || (jVar instanceof rg.x1) || (jVar instanceof rg.a2)) {
                    TextView g04 = f6Var.g0(4, LocaleController.getString(R.string.Flip));
                    final int i15 = 5;
                    g04.setOnClickListener(new View.OnClickListener() { // from class: ei.a5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            rg.j jVar2;
                            switch (i15) {
                                case 0:
                                    rg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof rg.b2;
                                    f6 f6Var2 = f6Var;
                                    if (z11) {
                                        lb lbVar = ((xa) f6Var2).A2.c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    rg.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar5 = jVar;
                                    f6Var5.K0((rg.t0) jVar5, new ai.q5(6, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    rg.j jVar6 = jVar;
                                    if (jVar6 instanceof rg.o2) {
                                        ((rg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.a2) {
                                        ((rg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.b2) {
                                        rg.b2 b2Var = (rg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((rg.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF P0 = f6Var9.P0(jVar7);
                                        if (jVar7 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar7, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof rg.v2) {
                                            rg.v2 v2Var = new rg.v2(f6Var9.getContext(), (rg.v2) jVar7, P0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, w7.z5.d(-2.0f, -2));
                                            f6Var9.f0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.A0(jVar2);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(g04, w7.z5.n(-2, 44));
                }
                boolean z11 = jVar instanceof rg.x1;
                if (z5Var.indexOfChild(jVar) != z5Var.getChildCount() - 1 && !(jVar instanceof rg.a2)) {
                    TextView textView3 = new TextView(f6Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, t5Var));
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
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: ei.a5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            rg.j jVar2;
                            switch (i16) {
                                case 0:
                                    rg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof rg.b2;
                                    f6 f6Var2 = f6Var;
                                    if (z112) {
                                        lb lbVar = ((xa) f6Var2).A2.c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    rg.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar5 = jVar;
                                    f6Var5.K0((rg.t0) jVar5, new ai.q5(6, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    rg.j jVar6 = jVar;
                                    if (jVar6 instanceof rg.o2) {
                                        ((rg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.a2) {
                                        ((rg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.b2) {
                                        rg.b2 b2Var = (rg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((rg.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF P0 = f6Var9.P0(jVar7);
                                        if (jVar7 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar7, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof rg.v2) {
                                            rg.v2 v2Var = new rg.v2(f6Var9.getContext(), (rg.v2) jVar7, P0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, w7.z5.d(-2.0f, -2));
                                            f6Var9.f0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.A0(jVar2);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, w7.z5.n(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof rg.b2) && !(jVar instanceof rg.t0) && !(jVar instanceof rg.w2) && !(jVar instanceof rg.q0) && !(jVar instanceof rg.a2)) {
                    TextView textView4 = new TextView(f6Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, t5Var));
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
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: ei.a5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            rg.j jVar2;
                            switch (i17) {
                                case 0:
                                    rg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof rg.b2;
                                    f6 f6Var2 = f6Var;
                                    if (z112) {
                                        lb lbVar = ((xa) f6Var2).A2.c1;
                                        if (lbVar != null) {
                                            lbVar.B();
                                        }
                                    } else {
                                        f6Var2.B0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var = f6Var2.H1;
                                    if (m1Var != null && m1Var.isShowing()) {
                                        f6Var2.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    rg.j jVar4 = jVar;
                                    f6 f6Var3 = f6Var;
                                    f6Var3.getClass();
                                    try {
                                        ((rg.v2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var2 = f6Var3.H1;
                                    if (m1Var2 != null && m1Var2.isShowing()) {
                                        f6Var3.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    f6 f6Var4 = f6Var;
                                    f6Var4.C0(jVar, true);
                                    f6Var4.q0();
                                    org.telegram.ui.ActionBar.m1 m1Var3 = f6Var4.H1;
                                    if (m1Var3 != null && m1Var3.isShowing()) {
                                        f6Var4.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    f6 f6Var5 = f6Var;
                                    f6Var5.C0(null, true);
                                    rg.j jVar5 = jVar;
                                    f6Var5.K0((rg.t0) jVar5, new ai.q5(6, f6Var5, jVar5));
                                    org.telegram.ui.ActionBar.m1 m1Var4 = f6Var5.H1;
                                    if (m1Var4 != null && m1Var4.isShowing()) {
                                        f6Var5.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    f6 f6Var6 = f6Var;
                                    f6Var6.C0(null, true);
                                    f6Var6.J0((rg.q0) jVar);
                                    org.telegram.ui.ActionBar.m1 m1Var5 = f6Var6.H1;
                                    if (m1Var5 != null && m1Var5.isShowing()) {
                                        f6Var6.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    rg.j jVar6 = jVar;
                                    if (jVar6 instanceof rg.o2) {
                                        ((rg.o2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.a2) {
                                        ((rg.a2) jVar6).r(true);
                                    } else if (jVar6 instanceof rg.b2) {
                                        rg.b2 b2Var = (rg.b2) jVar6;
                                        b2Var.r0 = !b2Var.r0;
                                        b2Var.invalidate();
                                    } else {
                                        ((rg.x1) jVar6).r(true);
                                    }
                                    f6 f6Var7 = f6Var;
                                    org.telegram.ui.ActionBar.m1 m1Var6 = f6Var7.H1;
                                    if (m1Var6 != null && m1Var6.isShowing()) {
                                        f6Var7.H1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    f6 f6Var8 = f6Var;
                                    f6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.m1 m1Var7 = f6Var8.H1;
                                    if (m1Var7 != null && m1Var7.isShowing()) {
                                        f6Var8.H1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    f6 f6Var9 = f6Var;
                                    z5 z5Var2 = f6Var9.R0;
                                    rg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF P0 = f6Var9.P0(jVar7);
                                        if (jVar7 instanceof rg.o2) {
                                            rg.j o2Var = new rg.o2(f6Var9.getContext(), (rg.o2) jVar7, P0);
                                            o2Var.setDelegate(f6Var9);
                                            z5Var2.addView(o2Var);
                                            f6Var9.f0();
                                            jVar2 = o2Var;
                                        } else if (jVar7 instanceof rg.v2) {
                                            rg.v2 v2Var = new rg.v2(f6Var9.getContext(), (rg.v2) jVar7, P0);
                                            v2Var.setDelegate(f6Var9);
                                            v2Var.setMaxWidth(f6Var9.R1 - AndroidUtilities.dp(32.0f));
                                            z5Var2.addView(v2Var, w7.z5.d(-2.0f, -2));
                                            f6Var9.f0();
                                            jVar2 = v2Var;
                                        }
                                        f6Var9.A0(jVar2);
                                        f6Var9.C0(null, true);
                                        f6Var9.d0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.m1 m1Var8 = f6Var9.H1;
                                    if (m1Var8 != null && m1Var8.isShowing()) {
                                        f6Var9.H1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, w7.z5.n(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, t5Var);
                    int i19 = 8;
                    int i20 = i18 == 0 ? 8 : 0;
                    int i21 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    childAt.setBackground(org.telegram.ui.ActionBar.h6.b0(w02, i20, i21, i22, i19));
                    i18++;
                }
                f6Var.I1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
