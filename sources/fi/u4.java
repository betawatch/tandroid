package fi;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;
    public final /* synthetic */ sg.j c;

    public /* synthetic */ u4(e6 e6Var, sg.j jVar, int i10) {
        this.a = i10;
        this.b = e6Var;
        this.c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z0(this.c);
                break;
            default:
                final e6 e6Var = this.b;
                y5 y5Var = e6Var.G0;
                h5 h5Var = e6Var.D1;
                s5 s5Var = e6Var.v1;
                LinearLayout linearLayout = new LinearLayout(e6Var.getContext());
                linearLayout.setOrientation(0);
                final sg.j jVar = this.c;
                boolean z10 = jVar instanceof sg.g1;
                if (!z10) {
                    TextView textView = new TextView(e6Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.E8, s5Var);
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
                    textView.setOnClickListener(new View.OnClickListener() { // from class: fi.z4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            sg.j jVar2;
                            switch (i10) {
                                case 0:
                                    sg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof sg.d2;
                                    e6 e6Var2 = e6Var;
                                    if (z11) {
                                        ib ibVar = ((ta) e6Var2).p2.c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    sg.j jVar4 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.x2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar5 = jVar;
                                    e6Var5.I0((sg.u0) jVar5, new bi.m5(6, e6Var5, jVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.r0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    sg.j jVar6 = jVar;
                                    if (jVar6 instanceof sg.q2) {
                                        ((sg.q2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.c2) {
                                        ((sg.c2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.d2) {
                                        sg.d2 d2Var = (sg.d2) jVar6;
                                        d2Var.r0 = !d2Var.r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((sg.z1) jVar6).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.w1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF N0 = e6Var9.N0(jVar7);
                                        if (jVar7 instanceof sg.q2) {
                                            sg.j q2Var = new sg.q2(e6Var9.getContext(), (sg.q2) jVar7, N0);
                                            q2Var.setDelegate(e6Var9);
                                            y5Var2.addView(q2Var);
                                            e6Var9.d0();
                                            jVar2 = q2Var;
                                        } else if (jVar7 instanceof sg.x2) {
                                            sg.x2 x2Var = new sg.x2(e6Var9.getContext(), (sg.x2) jVar7, N0);
                                            x2Var.setDelegate(e6Var9);
                                            x2Var.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(x2Var, gb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            jVar2 = x2Var;
                                        }
                                        e6Var9.y0(jVar2);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.w1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, gb1.r(-2, 44));
                }
                if (jVar instanceof sg.x2) {
                    TextView textView2 = new TextView(e6Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.E8, s5Var);
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!h5Var.c() || h5Var.d) && e6Var.i2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        final int i11 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: fi.z4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                sg.j jVar2;
                                switch (i11) {
                                    case 0:
                                        sg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof sg.d2;
                                        e6 e6Var2 = e6Var;
                                        if (z11) {
                                            ib ibVar = ((ta) e6Var2).p2.c1;
                                            if (ibVar != null) {
                                                ibVar.B();
                                            }
                                        } else {
                                            e6Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var = e6Var2.w1;
                                        if (o1Var != null && o1Var.isShowing()) {
                                            e6Var2.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        sg.j jVar4 = jVar;
                                        e6 e6Var3 = e6Var;
                                        e6Var3.getClass();
                                        try {
                                            ((sg.x2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.w1;
                                        if (o1Var2 != null && o1Var2.isShowing()) {
                                            e6Var3.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        e6 e6Var4 = e6Var;
                                        e6Var4.A0(jVar, true);
                                        e6Var4.o0();
                                        org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.w1;
                                        if (o1Var3 != null && o1Var3.isShowing()) {
                                            e6Var4.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        e6 e6Var5 = e6Var;
                                        e6Var5.A0(null, true);
                                        sg.j jVar5 = jVar;
                                        e6Var5.I0((sg.u0) jVar5, new bi.m5(6, e6Var5, jVar5));
                                        org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.w1;
                                        if (o1Var4 != null && o1Var4.isShowing()) {
                                            e6Var5.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        e6 e6Var6 = e6Var;
                                        e6Var6.A0(null, true);
                                        e6Var6.H0((sg.r0) jVar);
                                        org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.w1;
                                        if (o1Var5 != null && o1Var5.isShowing()) {
                                            e6Var6.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        sg.j jVar6 = jVar;
                                        if (jVar6 instanceof sg.q2) {
                                            ((sg.q2) jVar6).r(true);
                                        } else if (jVar6 instanceof sg.c2) {
                                            ((sg.c2) jVar6).r(true);
                                        } else if (jVar6 instanceof sg.d2) {
                                            sg.d2 d2Var = (sg.d2) jVar6;
                                            d2Var.r0 = !d2Var.r0;
                                            d2Var.invalidate();
                                        } else {
                                            ((sg.z1) jVar6).r(true);
                                        }
                                        e6 e6Var7 = e6Var;
                                        org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.w1;
                                        if (o1Var6 != null && o1Var6.isShowing()) {
                                            e6Var7.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        e6 e6Var8 = e6Var;
                                        e6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.w1;
                                        if (o1Var7 != null && o1Var7.isShowing()) {
                                            e6Var8.w1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        e6 e6Var9 = e6Var;
                                        y5 y5Var2 = e6Var9.G0;
                                        sg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF N0 = e6Var9.N0(jVar7);
                                            if (jVar7 instanceof sg.q2) {
                                                sg.j q2Var = new sg.q2(e6Var9.getContext(), (sg.q2) jVar7, N0);
                                                q2Var.setDelegate(e6Var9);
                                                y5Var2.addView(q2Var);
                                                e6Var9.d0();
                                                jVar2 = q2Var;
                                            } else if (jVar7 instanceof sg.x2) {
                                                sg.x2 x2Var = new sg.x2(e6Var9.getContext(), (sg.x2) jVar7, N0);
                                                x2Var.setDelegate(e6Var9);
                                                x2Var.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                                y5Var2.addView(x2Var, gb1.g(-2.0f, -2));
                                                e6Var9.d0();
                                                jVar2 = x2Var;
                                            }
                                            e6Var9.y0(jVar2);
                                            e6Var9.A0(null, true);
                                            e6Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.w1;
                                        if (o1Var8 != null && o1Var8.isShowing()) {
                                            e6Var9.w1.d(true);
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
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: fi.z4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                sg.j jVar2;
                                switch (i12) {
                                    case 0:
                                        sg.j jVar3 = jVar;
                                        boolean z11 = jVar3 instanceof sg.d2;
                                        e6 e6Var2 = e6Var;
                                        if (z11) {
                                            ib ibVar = ((ta) e6Var2).p2.c1;
                                            if (ibVar != null) {
                                                ibVar.B();
                                            }
                                        } else {
                                            e6Var2.z0(jVar3);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var = e6Var2.w1;
                                        if (o1Var != null && o1Var.isShowing()) {
                                            e6Var2.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        sg.j jVar4 = jVar;
                                        e6 e6Var3 = e6Var;
                                        e6Var3.getClass();
                                        try {
                                            ((sg.x2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.w1;
                                        if (o1Var2 != null && o1Var2.isShowing()) {
                                            e6Var3.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        e6 e6Var4 = e6Var;
                                        e6Var4.A0(jVar, true);
                                        e6Var4.o0();
                                        org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.w1;
                                        if (o1Var3 != null && o1Var3.isShowing()) {
                                            e6Var4.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        e6 e6Var5 = e6Var;
                                        e6Var5.A0(null, true);
                                        sg.j jVar5 = jVar;
                                        e6Var5.I0((sg.u0) jVar5, new bi.m5(6, e6Var5, jVar5));
                                        org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.w1;
                                        if (o1Var4 != null && o1Var4.isShowing()) {
                                            e6Var5.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        e6 e6Var6 = e6Var;
                                        e6Var6.A0(null, true);
                                        e6Var6.H0((sg.r0) jVar);
                                        org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.w1;
                                        if (o1Var5 != null && o1Var5.isShowing()) {
                                            e6Var6.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        sg.j jVar6 = jVar;
                                        if (jVar6 instanceof sg.q2) {
                                            ((sg.q2) jVar6).r(true);
                                        } else if (jVar6 instanceof sg.c2) {
                                            ((sg.c2) jVar6).r(true);
                                        } else if (jVar6 instanceof sg.d2) {
                                            sg.d2 d2Var = (sg.d2) jVar6;
                                            d2Var.r0 = !d2Var.r0;
                                            d2Var.invalidate();
                                        } else {
                                            ((sg.z1) jVar6).r(true);
                                        }
                                        e6 e6Var7 = e6Var;
                                        org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.w1;
                                        if (o1Var6 != null && o1Var6.isShowing()) {
                                            e6Var7.w1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        e6 e6Var8 = e6Var;
                                        e6Var8.getClass();
                                        jVar.bringToFront();
                                        org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.w1;
                                        if (o1Var7 != null && o1Var7.isShowing()) {
                                            e6Var8.w1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        e6 e6Var9 = e6Var;
                                        y5 y5Var2 = e6Var9.G0;
                                        sg.j jVar7 = jVar;
                                        if (jVar7 != null) {
                                            PointF N0 = e6Var9.N0(jVar7);
                                            if (jVar7 instanceof sg.q2) {
                                                sg.j q2Var = new sg.q2(e6Var9.getContext(), (sg.q2) jVar7, N0);
                                                q2Var.setDelegate(e6Var9);
                                                y5Var2.addView(q2Var);
                                                e6Var9.d0();
                                                jVar2 = q2Var;
                                            } else if (jVar7 instanceof sg.x2) {
                                                sg.x2 x2Var = new sg.x2(e6Var9.getContext(), (sg.x2) jVar7, N0);
                                                x2Var.setDelegate(e6Var9);
                                                x2Var.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                                y5Var2.addView(x2Var, gb1.g(-2.0f, -2));
                                                e6Var9.d0();
                                                jVar2 = x2Var;
                                            }
                                            e6Var9.y0(jVar2);
                                            e6Var9.A0(null, true);
                                            e6Var9.b0(jVar2);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.w1;
                                        if (o1Var8 != null && o1Var8.isShowing()) {
                                            e6Var9.w1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, gb1.r(-2, 44));
                } else if (jVar instanceof sg.u0) {
                    TextView e02 = e6Var.e0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i13 = 3;
                    e02.setOnClickListener(new View.OnClickListener() { // from class: fi.z4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            sg.j jVar2;
                            switch (i13) {
                                case 0:
                                    sg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof sg.d2;
                                    e6 e6Var2 = e6Var;
                                    if (z11) {
                                        ib ibVar = ((ta) e6Var2).p2.c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    sg.j jVar4 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.x2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar5 = jVar;
                                    e6Var5.I0((sg.u0) jVar5, new bi.m5(6, e6Var5, jVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.r0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    sg.j jVar6 = jVar;
                                    if (jVar6 instanceof sg.q2) {
                                        ((sg.q2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.c2) {
                                        ((sg.c2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.d2) {
                                        sg.d2 d2Var = (sg.d2) jVar6;
                                        d2Var.r0 = !d2Var.r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((sg.z1) jVar6).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.w1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF N0 = e6Var9.N0(jVar7);
                                        if (jVar7 instanceof sg.q2) {
                                            sg.j q2Var = new sg.q2(e6Var9.getContext(), (sg.q2) jVar7, N0);
                                            q2Var.setDelegate(e6Var9);
                                            y5Var2.addView(q2Var);
                                            e6Var9.d0();
                                            jVar2 = q2Var;
                                        } else if (jVar7 instanceof sg.x2) {
                                            sg.x2 x2Var = new sg.x2(e6Var9.getContext(), (sg.x2) jVar7, N0);
                                            x2Var.setDelegate(e6Var9);
                                            x2Var.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(x2Var, gb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            jVar2 = x2Var;
                                        }
                                        e6Var9.y0(jVar2);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.w1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e02, gb1.r(-2, 44));
                } else if (jVar instanceof sg.r0) {
                    TextView e03 = e6Var.e0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i14 = 4;
                    e03.setOnClickListener(new View.OnClickListener() { // from class: fi.z4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            sg.j jVar2;
                            switch (i14) {
                                case 0:
                                    sg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof sg.d2;
                                    e6 e6Var2 = e6Var;
                                    if (z11) {
                                        ib ibVar = ((ta) e6Var2).p2.c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    sg.j jVar4 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.x2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar5 = jVar;
                                    e6Var5.I0((sg.u0) jVar5, new bi.m5(6, e6Var5, jVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.r0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    sg.j jVar6 = jVar;
                                    if (jVar6 instanceof sg.q2) {
                                        ((sg.q2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.c2) {
                                        ((sg.c2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.d2) {
                                        sg.d2 d2Var = (sg.d2) jVar6;
                                        d2Var.r0 = !d2Var.r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((sg.z1) jVar6).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.w1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF N0 = e6Var9.N0(jVar7);
                                        if (jVar7 instanceof sg.q2) {
                                            sg.j q2Var = new sg.q2(e6Var9.getContext(), (sg.q2) jVar7, N0);
                                            q2Var.setDelegate(e6Var9);
                                            y5Var2.addView(q2Var);
                                            e6Var9.d0();
                                            jVar2 = q2Var;
                                        } else if (jVar7 instanceof sg.x2) {
                                            sg.x2 x2Var = new sg.x2(e6Var9.getContext(), (sg.x2) jVar7, N0);
                                            x2Var.setDelegate(e6Var9);
                                            x2Var.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(x2Var, gb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            jVar2 = x2Var;
                                        }
                                        e6Var9.y0(jVar2);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.w1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e03, gb1.r(-2, 44));
                }
                if ((jVar instanceof sg.q2) || (jVar instanceof sg.d2) || (jVar instanceof sg.z1) || (jVar instanceof sg.c2)) {
                    TextView e04 = e6Var.e0(4, LocaleController.getString(R.string.Flip));
                    final int i15 = 5;
                    e04.setOnClickListener(new View.OnClickListener() { // from class: fi.z4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            sg.j jVar2;
                            switch (i15) {
                                case 0:
                                    sg.j jVar3 = jVar;
                                    boolean z11 = jVar3 instanceof sg.d2;
                                    e6 e6Var2 = e6Var;
                                    if (z11) {
                                        ib ibVar = ((ta) e6Var2).p2.c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    sg.j jVar4 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.x2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar5 = jVar;
                                    e6Var5.I0((sg.u0) jVar5, new bi.m5(6, e6Var5, jVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.r0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    sg.j jVar6 = jVar;
                                    if (jVar6 instanceof sg.q2) {
                                        ((sg.q2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.c2) {
                                        ((sg.c2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.d2) {
                                        sg.d2 d2Var = (sg.d2) jVar6;
                                        d2Var.r0 = !d2Var.r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((sg.z1) jVar6).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.w1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF N0 = e6Var9.N0(jVar7);
                                        if (jVar7 instanceof sg.q2) {
                                            sg.j q2Var = new sg.q2(e6Var9.getContext(), (sg.q2) jVar7, N0);
                                            q2Var.setDelegate(e6Var9);
                                            y5Var2.addView(q2Var);
                                            e6Var9.d0();
                                            jVar2 = q2Var;
                                        } else if (jVar7 instanceof sg.x2) {
                                            sg.x2 x2Var = new sg.x2(e6Var9.getContext(), (sg.x2) jVar7, N0);
                                            x2Var.setDelegate(e6Var9);
                                            x2Var.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(x2Var, gb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            jVar2 = x2Var;
                                        }
                                        e6Var9.y0(jVar2);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.w1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(e04, gb1.r(-2, 44));
                }
                boolean z11 = jVar instanceof sg.z1;
                if (y5Var.indexOfChild(jVar) != y5Var.getChildCount() - 1 && !(jVar instanceof sg.c2)) {
                    TextView textView3 = new TextView(e6Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.E8, s5Var);
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
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: fi.z4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            sg.j jVar2;
                            switch (i16) {
                                case 0:
                                    sg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof sg.d2;
                                    e6 e6Var2 = e6Var;
                                    if (z112) {
                                        ib ibVar = ((ta) e6Var2).p2.c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    sg.j jVar4 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.x2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar5 = jVar;
                                    e6Var5.I0((sg.u0) jVar5, new bi.m5(6, e6Var5, jVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.r0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    sg.j jVar6 = jVar;
                                    if (jVar6 instanceof sg.q2) {
                                        ((sg.q2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.c2) {
                                        ((sg.c2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.d2) {
                                        sg.d2 d2Var = (sg.d2) jVar6;
                                        d2Var.r0 = !d2Var.r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((sg.z1) jVar6).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.w1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF N0 = e6Var9.N0(jVar7);
                                        if (jVar7 instanceof sg.q2) {
                                            sg.j q2Var = new sg.q2(e6Var9.getContext(), (sg.q2) jVar7, N0);
                                            q2Var.setDelegate(e6Var9);
                                            y5Var2.addView(q2Var);
                                            e6Var9.d0();
                                            jVar2 = q2Var;
                                        } else if (jVar7 instanceof sg.x2) {
                                            sg.x2 x2Var = new sg.x2(e6Var9.getContext(), (sg.x2) jVar7, N0);
                                            x2Var.setDelegate(e6Var9);
                                            x2Var.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(x2Var, gb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            jVar2 = x2Var;
                                        }
                                        e6Var9.y0(jVar2);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.w1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, gb1.r(-2, 44));
                } else if (!z11 && !z10 && !(jVar instanceof sg.d2) && !(jVar instanceof sg.u0) && !(jVar instanceof sg.y2) && !(jVar instanceof sg.r0) && !(jVar instanceof sg.c2)) {
                    TextView textView4 = new TextView(e6Var.getContext());
                    org.telegram.ui.ActionBar.f7.V(textView4, org.telegram.ui.ActionBar.y6.E8, s5Var);
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
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: fi.z4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            sg.j jVar2;
                            switch (i17) {
                                case 0:
                                    sg.j jVar3 = jVar;
                                    boolean z112 = jVar3 instanceof sg.d2;
                                    e6 e6Var2 = e6Var;
                                    if (z112) {
                                        ib ibVar = ((ta) e6Var2).p2.c1;
                                        if (ibVar != null) {
                                            ibVar.B();
                                        }
                                    } else {
                                        e6Var2.z0(jVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = e6Var2.w1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        e6Var2.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    sg.j jVar4 = jVar;
                                    e6 e6Var3 = e6Var;
                                    e6Var3.getClass();
                                    try {
                                        ((sg.x2) jVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = e6Var3.w1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        e6Var3.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    e6 e6Var4 = e6Var;
                                    e6Var4.A0(jVar, true);
                                    e6Var4.o0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = e6Var4.w1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        e6Var4.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    e6 e6Var5 = e6Var;
                                    e6Var5.A0(null, true);
                                    sg.j jVar5 = jVar;
                                    e6Var5.I0((sg.u0) jVar5, new bi.m5(6, e6Var5, jVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = e6Var5.w1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        e6Var5.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    e6 e6Var6 = e6Var;
                                    e6Var6.A0(null, true);
                                    e6Var6.H0((sg.r0) jVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = e6Var6.w1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        e6Var6.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    sg.j jVar6 = jVar;
                                    if (jVar6 instanceof sg.q2) {
                                        ((sg.q2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.c2) {
                                        ((sg.c2) jVar6).r(true);
                                    } else if (jVar6 instanceof sg.d2) {
                                        sg.d2 d2Var = (sg.d2) jVar6;
                                        d2Var.r0 = !d2Var.r0;
                                        d2Var.invalidate();
                                    } else {
                                        ((sg.z1) jVar6).r(true);
                                    }
                                    e6 e6Var7 = e6Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = e6Var7.w1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        e6Var7.w1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    e6 e6Var8 = e6Var;
                                    e6Var8.getClass();
                                    jVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = e6Var8.w1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        e6Var8.w1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    e6 e6Var9 = e6Var;
                                    y5 y5Var2 = e6Var9.G0;
                                    sg.j jVar7 = jVar;
                                    if (jVar7 != null) {
                                        PointF N0 = e6Var9.N0(jVar7);
                                        if (jVar7 instanceof sg.q2) {
                                            sg.j q2Var = new sg.q2(e6Var9.getContext(), (sg.q2) jVar7, N0);
                                            q2Var.setDelegate(e6Var9);
                                            y5Var2.addView(q2Var);
                                            e6Var9.d0();
                                            jVar2 = q2Var;
                                        } else if (jVar7 instanceof sg.x2) {
                                            sg.x2 x2Var = new sg.x2(e6Var9.getContext(), (sg.x2) jVar7, N0);
                                            x2Var.setDelegate(e6Var9);
                                            x2Var.setMaxWidth(e6Var9.G1 - AndroidUtilities.dp(32.0f));
                                            y5Var2.addView(x2Var, gb1.g(-2.0f, -2));
                                            e6Var9.d0();
                                            jVar2 = x2Var;
                                        }
                                        e6Var9.y0(jVar2);
                                        e6Var9.A0(null, true);
                                        e6Var9.b0(jVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = e6Var9.w1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        e6Var9.w1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, gb1.r(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int i19 = org.telegram.ui.ActionBar.y6.i6;
                    int w02 = org.telegram.ui.ActionBar.y6.w0(i19, s5Var);
                    int i20 = 8;
                    int i21 = i18 == 0 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i23 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i20 = 0;
                    }
                    org.telegram.ui.ActionBar.f7.R(childAt, org.telegram.ui.ActionBar.y6.b0(w02, i21, i22, i23, i20), null, org.telegram.ui.ActionBar.f7.N(i19), s5Var);
                    i18++;
                }
                e6Var.x1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
