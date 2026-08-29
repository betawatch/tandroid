package nh;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;
    public final /* synthetic */ bg.k c;

    public /* synthetic */ o4(t5 t5Var, bg.k kVar, int i10) {
        this.a = i10;
        this.b = t5Var;
        this.c = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C0(this.c);
                break;
            default:
                final t5 t5Var = this.b;
                n5 n5Var = t5Var.N0;
                z4 z4Var = t5Var.K1;
                h5 h5Var = t5Var.C1;
                LinearLayout linearLayout = new LinearLayout(t5Var.getContext());
                linearLayout.setOrientation(0);
                final bg.k kVar = this.c;
                boolean z10 = kVar instanceof bg.d2;
                if (!z10) {
                    TextView textView = new TextView(t5Var.getContext());
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, h5Var));
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
                    textView.setOnClickListener(new View.OnClickListener() { // from class: nh.r4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bg.k kVar2;
                            switch (i10) {
                                case 0:
                                    bg.k kVar3 = kVar;
                                    boolean z11 = kVar3 instanceof bg.f3;
                                    t5 t5Var2 = t5Var;
                                    if (z11) {
                                        wa waVar = ((ja) t5Var2).w2.Y0;
                                        if (waVar != null) {
                                            waVar.B();
                                        }
                                    } else {
                                        t5Var2.C0(kVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = t5Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        t5Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    bg.k kVar4 = kVar;
                                    t5 t5Var3 = t5Var;
                                    t5Var3.getClass();
                                    try {
                                        ((bg.f4) kVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = t5Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        t5Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    t5 t5Var4 = t5Var;
                                    t5Var4.D0(kVar, true);
                                    t5Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = t5Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        t5Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t5 t5Var5 = t5Var;
                                    t5Var5.D0(null, true);
                                    bg.k kVar5 = kVar;
                                    t5Var5.L0((bg.o1) kVar5, new bh.v(9, t5Var5, kVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = t5Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        t5Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    t5 t5Var6 = t5Var;
                                    t5Var6.D0(null, true);
                                    t5Var6.K0((bg.k1) kVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = t5Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        t5Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    bg.k kVar6 = kVar;
                                    if (kVar6 instanceof bg.v3) {
                                        ((bg.v3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.e3) {
                                        ((bg.e3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.f3) {
                                        bg.f3 f3Var = (bg.f3) kVar6;
                                        f3Var.n0 = !f3Var.n0;
                                        f3Var.invalidate();
                                    } else {
                                        ((bg.y2) kVar6).r(true);
                                    }
                                    t5 t5Var7 = t5Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = t5Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        t5Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    t5 t5Var8 = t5Var;
                                    t5Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = t5Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        t5Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t5 t5Var9 = t5Var;
                                    n5 n5Var2 = t5Var9.N0;
                                    bg.k kVar7 = kVar;
                                    if (kVar7 != null) {
                                        PointF Q0 = t5Var9.Q0(kVar7);
                                        if (kVar7 instanceof bg.v3) {
                                            bg.k v3Var = new bg.v3(t5Var9.getContext(), (bg.v3) kVar7, Q0);
                                            v3Var.setDelegate(t5Var9);
                                            n5Var2.addView(v3Var);
                                            t5Var9.g0();
                                            kVar2 = v3Var;
                                        } else if (kVar7 instanceof bg.f4) {
                                            bg.f4 f4Var = new bg.f4(t5Var9.getContext(), (bg.f4) kVar7, Q0);
                                            f4Var.setDelegate(t5Var9);
                                            f4Var.setMaxWidth(t5Var9.N1 - AndroidUtilities.dp(32.0f));
                                            n5Var2.addView(f4Var, i7.f6.c(-2.0f, -2));
                                            t5Var9.g0();
                                            kVar2 = f4Var;
                                        }
                                        t5Var9.B0(kVar2);
                                        t5Var9.D0(null, true);
                                        t5Var9.d0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = t5Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        t5Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView, i7.f6.n(-2, 44));
                }
                if (kVar instanceof bg.f4) {
                    TextView textView2 = new TextView(t5Var.getContext());
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, h5Var));
                    textView2.setGravity(16);
                    textView2.setLines(1);
                    textView2.setSingleLine();
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTypeface(AndroidUtilities.bold());
                    textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                    textView2.setTextSize(1, 14.0f);
                    if ((!z4Var.c() || z4Var.d) && t5Var.p2 <= 0) {
                        textView2.setTag(1);
                        textView2.setText(LocaleController.getString(R.string.PaintEdit));
                        final int i11 = 2;
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: nh.r4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                bg.k kVar2;
                                switch (i11) {
                                    case 0:
                                        bg.k kVar3 = kVar;
                                        boolean z11 = kVar3 instanceof bg.f3;
                                        t5 t5Var2 = t5Var;
                                        if (z11) {
                                            wa waVar = ((ja) t5Var2).w2.Y0;
                                            if (waVar != null) {
                                                waVar.B();
                                            }
                                        } else {
                                            t5Var2.C0(kVar3);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var = t5Var2.D1;
                                        if (o1Var != null && o1Var.isShowing()) {
                                            t5Var2.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        bg.k kVar4 = kVar;
                                        t5 t5Var3 = t5Var;
                                        t5Var3.getClass();
                                        try {
                                            ((bg.f4) kVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var2 = t5Var3.D1;
                                        if (o1Var2 != null && o1Var2.isShowing()) {
                                            t5Var3.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        t5 t5Var4 = t5Var;
                                        t5Var4.D0(kVar, true);
                                        t5Var4.r0();
                                        org.telegram.ui.ActionBar.o1 o1Var3 = t5Var4.D1;
                                        if (o1Var3 != null && o1Var3.isShowing()) {
                                            t5Var4.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        t5 t5Var5 = t5Var;
                                        t5Var5.D0(null, true);
                                        bg.k kVar5 = kVar;
                                        t5Var5.L0((bg.o1) kVar5, new bh.v(9, t5Var5, kVar5));
                                        org.telegram.ui.ActionBar.o1 o1Var4 = t5Var5.D1;
                                        if (o1Var4 != null && o1Var4.isShowing()) {
                                            t5Var5.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        t5 t5Var6 = t5Var;
                                        t5Var6.D0(null, true);
                                        t5Var6.K0((bg.k1) kVar);
                                        org.telegram.ui.ActionBar.o1 o1Var5 = t5Var6.D1;
                                        if (o1Var5 != null && o1Var5.isShowing()) {
                                            t5Var6.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        bg.k kVar6 = kVar;
                                        if (kVar6 instanceof bg.v3) {
                                            ((bg.v3) kVar6).r(true);
                                        } else if (kVar6 instanceof bg.e3) {
                                            ((bg.e3) kVar6).r(true);
                                        } else if (kVar6 instanceof bg.f3) {
                                            bg.f3 f3Var = (bg.f3) kVar6;
                                            f3Var.n0 = !f3Var.n0;
                                            f3Var.invalidate();
                                        } else {
                                            ((bg.y2) kVar6).r(true);
                                        }
                                        t5 t5Var7 = t5Var;
                                        org.telegram.ui.ActionBar.o1 o1Var6 = t5Var7.D1;
                                        if (o1Var6 != null && o1Var6.isShowing()) {
                                            t5Var7.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        t5 t5Var8 = t5Var;
                                        t5Var8.getClass();
                                        kVar.bringToFront();
                                        org.telegram.ui.ActionBar.o1 o1Var7 = t5Var8.D1;
                                        if (o1Var7 != null && o1Var7.isShowing()) {
                                            t5Var8.D1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        t5 t5Var9 = t5Var;
                                        n5 n5Var2 = t5Var9.N0;
                                        bg.k kVar7 = kVar;
                                        if (kVar7 != null) {
                                            PointF Q0 = t5Var9.Q0(kVar7);
                                            if (kVar7 instanceof bg.v3) {
                                                bg.k v3Var = new bg.v3(t5Var9.getContext(), (bg.v3) kVar7, Q0);
                                                v3Var.setDelegate(t5Var9);
                                                n5Var2.addView(v3Var);
                                                t5Var9.g0();
                                                kVar2 = v3Var;
                                            } else if (kVar7 instanceof bg.f4) {
                                                bg.f4 f4Var = new bg.f4(t5Var9.getContext(), (bg.f4) kVar7, Q0);
                                                f4Var.setDelegate(t5Var9);
                                                f4Var.setMaxWidth(t5Var9.N1 - AndroidUtilities.dp(32.0f));
                                                n5Var2.addView(f4Var, i7.f6.c(-2.0f, -2));
                                                t5Var9.g0();
                                                kVar2 = f4Var;
                                            }
                                            t5Var9.B0(kVar2);
                                            t5Var9.D0(null, true);
                                            t5Var9.d0(kVar2);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var8 = t5Var9.D1;
                                        if (o1Var8 != null && o1Var8.isShowing()) {
                                            t5Var9.D1.d(true);
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
                        textView2.setOnClickListener(new View.OnClickListener() { // from class: nh.r4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                bg.k kVar2;
                                switch (i12) {
                                    case 0:
                                        bg.k kVar3 = kVar;
                                        boolean z11 = kVar3 instanceof bg.f3;
                                        t5 t5Var2 = t5Var;
                                        if (z11) {
                                            wa waVar = ((ja) t5Var2).w2.Y0;
                                            if (waVar != null) {
                                                waVar.B();
                                            }
                                        } else {
                                            t5Var2.C0(kVar3);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var = t5Var2.D1;
                                        if (o1Var != null && o1Var.isShowing()) {
                                            t5Var2.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        bg.k kVar4 = kVar;
                                        t5 t5Var3 = t5Var;
                                        t5Var3.getClass();
                                        try {
                                            ((bg.f4) kVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var2 = t5Var3.D1;
                                        if (o1Var2 != null && o1Var2.isShowing()) {
                                            t5Var3.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        t5 t5Var4 = t5Var;
                                        t5Var4.D0(kVar, true);
                                        t5Var4.r0();
                                        org.telegram.ui.ActionBar.o1 o1Var3 = t5Var4.D1;
                                        if (o1Var3 != null && o1Var3.isShowing()) {
                                            t5Var4.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        t5 t5Var5 = t5Var;
                                        t5Var5.D0(null, true);
                                        bg.k kVar5 = kVar;
                                        t5Var5.L0((bg.o1) kVar5, new bh.v(9, t5Var5, kVar5));
                                        org.telegram.ui.ActionBar.o1 o1Var4 = t5Var5.D1;
                                        if (o1Var4 != null && o1Var4.isShowing()) {
                                            t5Var5.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 4:
                                        t5 t5Var6 = t5Var;
                                        t5Var6.D0(null, true);
                                        t5Var6.K0((bg.k1) kVar);
                                        org.telegram.ui.ActionBar.o1 o1Var5 = t5Var6.D1;
                                        if (o1Var5 != null && o1Var5.isShowing()) {
                                            t5Var6.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 5:
                                        bg.k kVar6 = kVar;
                                        if (kVar6 instanceof bg.v3) {
                                            ((bg.v3) kVar6).r(true);
                                        } else if (kVar6 instanceof bg.e3) {
                                            ((bg.e3) kVar6).r(true);
                                        } else if (kVar6 instanceof bg.f3) {
                                            bg.f3 f3Var = (bg.f3) kVar6;
                                            f3Var.n0 = !f3Var.n0;
                                            f3Var.invalidate();
                                        } else {
                                            ((bg.y2) kVar6).r(true);
                                        }
                                        t5 t5Var7 = t5Var;
                                        org.telegram.ui.ActionBar.o1 o1Var6 = t5Var7.D1;
                                        if (o1Var6 != null && o1Var6.isShowing()) {
                                            t5Var7.D1.d(true);
                                            break;
                                        }
                                        break;
                                    case 6:
                                        t5 t5Var8 = t5Var;
                                        t5Var8.getClass();
                                        kVar.bringToFront();
                                        org.telegram.ui.ActionBar.o1 o1Var7 = t5Var8.D1;
                                        if (o1Var7 != null && o1Var7.isShowing()) {
                                            t5Var8.D1.d(true);
                                            break;
                                        }
                                        break;
                                    default:
                                        t5 t5Var9 = t5Var;
                                        n5 n5Var2 = t5Var9.N0;
                                        bg.k kVar7 = kVar;
                                        if (kVar7 != null) {
                                            PointF Q0 = t5Var9.Q0(kVar7);
                                            if (kVar7 instanceof bg.v3) {
                                                bg.k v3Var = new bg.v3(t5Var9.getContext(), (bg.v3) kVar7, Q0);
                                                v3Var.setDelegate(t5Var9);
                                                n5Var2.addView(v3Var);
                                                t5Var9.g0();
                                                kVar2 = v3Var;
                                            } else if (kVar7 instanceof bg.f4) {
                                                bg.f4 f4Var = new bg.f4(t5Var9.getContext(), (bg.f4) kVar7, Q0);
                                                f4Var.setDelegate(t5Var9);
                                                f4Var.setMaxWidth(t5Var9.N1 - AndroidUtilities.dp(32.0f));
                                                n5Var2.addView(f4Var, i7.f6.c(-2.0f, -2));
                                                t5Var9.g0();
                                                kVar2 = f4Var;
                                            }
                                            t5Var9.B0(kVar2);
                                            t5Var9.D0(null, true);
                                            t5Var9.d0(kVar2);
                                        }
                                        org.telegram.ui.ActionBar.o1 o1Var8 = t5Var9.D1;
                                        if (o1Var8 != null && o1Var8.isShowing()) {
                                            t5Var9.D1.d(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView2, i7.f6.n(-2, 44));
                } else if (kVar instanceof bg.o1) {
                    TextView h02 = t5Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i13 = 3;
                    h02.setOnClickListener(new View.OnClickListener() { // from class: nh.r4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bg.k kVar2;
                            switch (i13) {
                                case 0:
                                    bg.k kVar3 = kVar;
                                    boolean z11 = kVar3 instanceof bg.f3;
                                    t5 t5Var2 = t5Var;
                                    if (z11) {
                                        wa waVar = ((ja) t5Var2).w2.Y0;
                                        if (waVar != null) {
                                            waVar.B();
                                        }
                                    } else {
                                        t5Var2.C0(kVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = t5Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        t5Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    bg.k kVar4 = kVar;
                                    t5 t5Var3 = t5Var;
                                    t5Var3.getClass();
                                    try {
                                        ((bg.f4) kVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = t5Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        t5Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    t5 t5Var4 = t5Var;
                                    t5Var4.D0(kVar, true);
                                    t5Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = t5Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        t5Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t5 t5Var5 = t5Var;
                                    t5Var5.D0(null, true);
                                    bg.k kVar5 = kVar;
                                    t5Var5.L0((bg.o1) kVar5, new bh.v(9, t5Var5, kVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = t5Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        t5Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    t5 t5Var6 = t5Var;
                                    t5Var6.D0(null, true);
                                    t5Var6.K0((bg.k1) kVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = t5Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        t5Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    bg.k kVar6 = kVar;
                                    if (kVar6 instanceof bg.v3) {
                                        ((bg.v3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.e3) {
                                        ((bg.e3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.f3) {
                                        bg.f3 f3Var = (bg.f3) kVar6;
                                        f3Var.n0 = !f3Var.n0;
                                        f3Var.invalidate();
                                    } else {
                                        ((bg.y2) kVar6).r(true);
                                    }
                                    t5 t5Var7 = t5Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = t5Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        t5Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    t5 t5Var8 = t5Var;
                                    t5Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = t5Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        t5Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t5 t5Var9 = t5Var;
                                    n5 n5Var2 = t5Var9.N0;
                                    bg.k kVar7 = kVar;
                                    if (kVar7 != null) {
                                        PointF Q0 = t5Var9.Q0(kVar7);
                                        if (kVar7 instanceof bg.v3) {
                                            bg.k v3Var = new bg.v3(t5Var9.getContext(), (bg.v3) kVar7, Q0);
                                            v3Var.setDelegate(t5Var9);
                                            n5Var2.addView(v3Var);
                                            t5Var9.g0();
                                            kVar2 = v3Var;
                                        } else if (kVar7 instanceof bg.f4) {
                                            bg.f4 f4Var = new bg.f4(t5Var9.getContext(), (bg.f4) kVar7, Q0);
                                            f4Var.setDelegate(t5Var9);
                                            f4Var.setMaxWidth(t5Var9.N1 - AndroidUtilities.dp(32.0f));
                                            n5Var2.addView(f4Var, i7.f6.c(-2.0f, -2));
                                            t5Var9.g0();
                                            kVar2 = f4Var;
                                        }
                                        t5Var9.B0(kVar2);
                                        t5Var9.D0(null, true);
                                        t5Var9.d0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = t5Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        t5Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h02, i7.f6.n(-2, 44));
                } else if (kVar instanceof bg.k1) {
                    TextView h03 = t5Var.h0(1, LocaleController.getString(R.string.PaintEdit));
                    final int i14 = 4;
                    h03.setOnClickListener(new View.OnClickListener() { // from class: nh.r4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bg.k kVar2;
                            switch (i14) {
                                case 0:
                                    bg.k kVar3 = kVar;
                                    boolean z11 = kVar3 instanceof bg.f3;
                                    t5 t5Var2 = t5Var;
                                    if (z11) {
                                        wa waVar = ((ja) t5Var2).w2.Y0;
                                        if (waVar != null) {
                                            waVar.B();
                                        }
                                    } else {
                                        t5Var2.C0(kVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = t5Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        t5Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    bg.k kVar4 = kVar;
                                    t5 t5Var3 = t5Var;
                                    t5Var3.getClass();
                                    try {
                                        ((bg.f4) kVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = t5Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        t5Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    t5 t5Var4 = t5Var;
                                    t5Var4.D0(kVar, true);
                                    t5Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = t5Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        t5Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t5 t5Var5 = t5Var;
                                    t5Var5.D0(null, true);
                                    bg.k kVar5 = kVar;
                                    t5Var5.L0((bg.o1) kVar5, new bh.v(9, t5Var5, kVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = t5Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        t5Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    t5 t5Var6 = t5Var;
                                    t5Var6.D0(null, true);
                                    t5Var6.K0((bg.k1) kVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = t5Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        t5Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    bg.k kVar6 = kVar;
                                    if (kVar6 instanceof bg.v3) {
                                        ((bg.v3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.e3) {
                                        ((bg.e3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.f3) {
                                        bg.f3 f3Var = (bg.f3) kVar6;
                                        f3Var.n0 = !f3Var.n0;
                                        f3Var.invalidate();
                                    } else {
                                        ((bg.y2) kVar6).r(true);
                                    }
                                    t5 t5Var7 = t5Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = t5Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        t5Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    t5 t5Var8 = t5Var;
                                    t5Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = t5Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        t5Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t5 t5Var9 = t5Var;
                                    n5 n5Var2 = t5Var9.N0;
                                    bg.k kVar7 = kVar;
                                    if (kVar7 != null) {
                                        PointF Q0 = t5Var9.Q0(kVar7);
                                        if (kVar7 instanceof bg.v3) {
                                            bg.k v3Var = new bg.v3(t5Var9.getContext(), (bg.v3) kVar7, Q0);
                                            v3Var.setDelegate(t5Var9);
                                            n5Var2.addView(v3Var);
                                            t5Var9.g0();
                                            kVar2 = v3Var;
                                        } else if (kVar7 instanceof bg.f4) {
                                            bg.f4 f4Var = new bg.f4(t5Var9.getContext(), (bg.f4) kVar7, Q0);
                                            f4Var.setDelegate(t5Var9);
                                            f4Var.setMaxWidth(t5Var9.N1 - AndroidUtilities.dp(32.0f));
                                            n5Var2.addView(f4Var, i7.f6.c(-2.0f, -2));
                                            t5Var9.g0();
                                            kVar2 = f4Var;
                                        }
                                        t5Var9.B0(kVar2);
                                        t5Var9.D0(null, true);
                                        t5Var9.d0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = t5Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        t5Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h03, i7.f6.n(-2, 44));
                }
                if ((kVar instanceof bg.v3) || (kVar instanceof bg.f3) || (kVar instanceof bg.y2) || (kVar instanceof bg.e3)) {
                    TextView h04 = t5Var.h0(4, LocaleController.getString(R.string.Flip));
                    final int i15 = 5;
                    h04.setOnClickListener(new View.OnClickListener() { // from class: nh.r4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bg.k kVar2;
                            switch (i15) {
                                case 0:
                                    bg.k kVar3 = kVar;
                                    boolean z11 = kVar3 instanceof bg.f3;
                                    t5 t5Var2 = t5Var;
                                    if (z11) {
                                        wa waVar = ((ja) t5Var2).w2.Y0;
                                        if (waVar != null) {
                                            waVar.B();
                                        }
                                    } else {
                                        t5Var2.C0(kVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = t5Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        t5Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    bg.k kVar4 = kVar;
                                    t5 t5Var3 = t5Var;
                                    t5Var3.getClass();
                                    try {
                                        ((bg.f4) kVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = t5Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        t5Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    t5 t5Var4 = t5Var;
                                    t5Var4.D0(kVar, true);
                                    t5Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = t5Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        t5Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t5 t5Var5 = t5Var;
                                    t5Var5.D0(null, true);
                                    bg.k kVar5 = kVar;
                                    t5Var5.L0((bg.o1) kVar5, new bh.v(9, t5Var5, kVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = t5Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        t5Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    t5 t5Var6 = t5Var;
                                    t5Var6.D0(null, true);
                                    t5Var6.K0((bg.k1) kVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = t5Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        t5Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    bg.k kVar6 = kVar;
                                    if (kVar6 instanceof bg.v3) {
                                        ((bg.v3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.e3) {
                                        ((bg.e3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.f3) {
                                        bg.f3 f3Var = (bg.f3) kVar6;
                                        f3Var.n0 = !f3Var.n0;
                                        f3Var.invalidate();
                                    } else {
                                        ((bg.y2) kVar6).r(true);
                                    }
                                    t5 t5Var7 = t5Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = t5Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        t5Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    t5 t5Var8 = t5Var;
                                    t5Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = t5Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        t5Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t5 t5Var9 = t5Var;
                                    n5 n5Var2 = t5Var9.N0;
                                    bg.k kVar7 = kVar;
                                    if (kVar7 != null) {
                                        PointF Q0 = t5Var9.Q0(kVar7);
                                        if (kVar7 instanceof bg.v3) {
                                            bg.k v3Var = new bg.v3(t5Var9.getContext(), (bg.v3) kVar7, Q0);
                                            v3Var.setDelegate(t5Var9);
                                            n5Var2.addView(v3Var);
                                            t5Var9.g0();
                                            kVar2 = v3Var;
                                        } else if (kVar7 instanceof bg.f4) {
                                            bg.f4 f4Var = new bg.f4(t5Var9.getContext(), (bg.f4) kVar7, Q0);
                                            f4Var.setDelegate(t5Var9);
                                            f4Var.setMaxWidth(t5Var9.N1 - AndroidUtilities.dp(32.0f));
                                            n5Var2.addView(f4Var, i7.f6.c(-2.0f, -2));
                                            t5Var9.g0();
                                            kVar2 = f4Var;
                                        }
                                        t5Var9.B0(kVar2);
                                        t5Var9.D0(null, true);
                                        t5Var9.d0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = t5Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        t5Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(h04, i7.f6.n(-2, 44));
                }
                boolean z11 = kVar instanceof bg.y2;
                if (n5Var.indexOfChild(kVar) != n5Var.getChildCount() - 1 && !(kVar instanceof bg.e3)) {
                    TextView textView3 = new TextView(t5Var.getContext());
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, h5Var));
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
                    textView3.setOnClickListener(new View.OnClickListener() { // from class: nh.r4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bg.k kVar2;
                            switch (i16) {
                                case 0:
                                    bg.k kVar3 = kVar;
                                    boolean z112 = kVar3 instanceof bg.f3;
                                    t5 t5Var2 = t5Var;
                                    if (z112) {
                                        wa waVar = ((ja) t5Var2).w2.Y0;
                                        if (waVar != null) {
                                            waVar.B();
                                        }
                                    } else {
                                        t5Var2.C0(kVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = t5Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        t5Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    bg.k kVar4 = kVar;
                                    t5 t5Var3 = t5Var;
                                    t5Var3.getClass();
                                    try {
                                        ((bg.f4) kVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = t5Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        t5Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    t5 t5Var4 = t5Var;
                                    t5Var4.D0(kVar, true);
                                    t5Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = t5Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        t5Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t5 t5Var5 = t5Var;
                                    t5Var5.D0(null, true);
                                    bg.k kVar5 = kVar;
                                    t5Var5.L0((bg.o1) kVar5, new bh.v(9, t5Var5, kVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = t5Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        t5Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    t5 t5Var6 = t5Var;
                                    t5Var6.D0(null, true);
                                    t5Var6.K0((bg.k1) kVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = t5Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        t5Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    bg.k kVar6 = kVar;
                                    if (kVar6 instanceof bg.v3) {
                                        ((bg.v3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.e3) {
                                        ((bg.e3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.f3) {
                                        bg.f3 f3Var = (bg.f3) kVar6;
                                        f3Var.n0 = !f3Var.n0;
                                        f3Var.invalidate();
                                    } else {
                                        ((bg.y2) kVar6).r(true);
                                    }
                                    t5 t5Var7 = t5Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = t5Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        t5Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    t5 t5Var8 = t5Var;
                                    t5Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = t5Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        t5Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t5 t5Var9 = t5Var;
                                    n5 n5Var2 = t5Var9.N0;
                                    bg.k kVar7 = kVar;
                                    if (kVar7 != null) {
                                        PointF Q0 = t5Var9.Q0(kVar7);
                                        if (kVar7 instanceof bg.v3) {
                                            bg.k v3Var = new bg.v3(t5Var9.getContext(), (bg.v3) kVar7, Q0);
                                            v3Var.setDelegate(t5Var9);
                                            n5Var2.addView(v3Var);
                                            t5Var9.g0();
                                            kVar2 = v3Var;
                                        } else if (kVar7 instanceof bg.f4) {
                                            bg.f4 f4Var = new bg.f4(t5Var9.getContext(), (bg.f4) kVar7, Q0);
                                            f4Var.setDelegate(t5Var9);
                                            f4Var.setMaxWidth(t5Var9.N1 - AndroidUtilities.dp(32.0f));
                                            n5Var2.addView(f4Var, i7.f6.c(-2.0f, -2));
                                            t5Var9.g0();
                                            kVar2 = f4Var;
                                        }
                                        t5Var9.B0(kVar2);
                                        t5Var9.D0(null, true);
                                        t5Var9.d0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = t5Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        t5Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView3, i7.f6.n(-2, 44));
                } else if (!z11 && !z10 && !(kVar instanceof bg.f3) && !(kVar instanceof bg.o1) && !(kVar instanceof bg.g4) && !(kVar instanceof bg.k1) && !(kVar instanceof bg.e3)) {
                    TextView textView4 = new TextView(t5Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, h5Var));
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
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: nh.r4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            bg.k kVar2;
                            switch (i17) {
                                case 0:
                                    bg.k kVar3 = kVar;
                                    boolean z112 = kVar3 instanceof bg.f3;
                                    t5 t5Var2 = t5Var;
                                    if (z112) {
                                        wa waVar = ((ja) t5Var2).w2.Y0;
                                        if (waVar != null) {
                                            waVar.B();
                                        }
                                    } else {
                                        t5Var2.C0(kVar3);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var = t5Var2.D1;
                                    if (o1Var != null && o1Var.isShowing()) {
                                        t5Var2.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 1:
                                    bg.k kVar4 = kVar;
                                    t5 t5Var3 = t5Var;
                                    t5Var3.getClass();
                                    try {
                                        ((bg.f4) kVar4).getEditText().onTextContextMenuItem(android.R.id.pasteAsPlainText);
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var2 = t5Var3.D1;
                                    if (o1Var2 != null && o1Var2.isShowing()) {
                                        t5Var3.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 2:
                                    t5 t5Var4 = t5Var;
                                    t5Var4.D0(kVar, true);
                                    t5Var4.r0();
                                    org.telegram.ui.ActionBar.o1 o1Var3 = t5Var4.D1;
                                    if (o1Var3 != null && o1Var3.isShowing()) {
                                        t5Var4.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 3:
                                    t5 t5Var5 = t5Var;
                                    t5Var5.D0(null, true);
                                    bg.k kVar5 = kVar;
                                    t5Var5.L0((bg.o1) kVar5, new bh.v(9, t5Var5, kVar5));
                                    org.telegram.ui.ActionBar.o1 o1Var4 = t5Var5.D1;
                                    if (o1Var4 != null && o1Var4.isShowing()) {
                                        t5Var5.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 4:
                                    t5 t5Var6 = t5Var;
                                    t5Var6.D0(null, true);
                                    t5Var6.K0((bg.k1) kVar);
                                    org.telegram.ui.ActionBar.o1 o1Var5 = t5Var6.D1;
                                    if (o1Var5 != null && o1Var5.isShowing()) {
                                        t5Var6.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 5:
                                    bg.k kVar6 = kVar;
                                    if (kVar6 instanceof bg.v3) {
                                        ((bg.v3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.e3) {
                                        ((bg.e3) kVar6).r(true);
                                    } else if (kVar6 instanceof bg.f3) {
                                        bg.f3 f3Var = (bg.f3) kVar6;
                                        f3Var.n0 = !f3Var.n0;
                                        f3Var.invalidate();
                                    } else {
                                        ((bg.y2) kVar6).r(true);
                                    }
                                    t5 t5Var7 = t5Var;
                                    org.telegram.ui.ActionBar.o1 o1Var6 = t5Var7.D1;
                                    if (o1Var6 != null && o1Var6.isShowing()) {
                                        t5Var7.D1.d(true);
                                        break;
                                    }
                                    break;
                                case 6:
                                    t5 t5Var8 = t5Var;
                                    t5Var8.getClass();
                                    kVar.bringToFront();
                                    org.telegram.ui.ActionBar.o1 o1Var7 = t5Var8.D1;
                                    if (o1Var7 != null && o1Var7.isShowing()) {
                                        t5Var8.D1.d(true);
                                        break;
                                    }
                                    break;
                                default:
                                    t5 t5Var9 = t5Var;
                                    n5 n5Var2 = t5Var9.N0;
                                    bg.k kVar7 = kVar;
                                    if (kVar7 != null) {
                                        PointF Q0 = t5Var9.Q0(kVar7);
                                        if (kVar7 instanceof bg.v3) {
                                            bg.k v3Var = new bg.v3(t5Var9.getContext(), (bg.v3) kVar7, Q0);
                                            v3Var.setDelegate(t5Var9);
                                            n5Var2.addView(v3Var);
                                            t5Var9.g0();
                                            kVar2 = v3Var;
                                        } else if (kVar7 instanceof bg.f4) {
                                            bg.f4 f4Var = new bg.f4(t5Var9.getContext(), (bg.f4) kVar7, Q0);
                                            f4Var.setDelegate(t5Var9);
                                            f4Var.setMaxWidth(t5Var9.N1 - AndroidUtilities.dp(32.0f));
                                            n5Var2.addView(f4Var, i7.f6.c(-2.0f, -2));
                                            t5Var9.g0();
                                            kVar2 = f4Var;
                                        }
                                        t5Var9.B0(kVar2);
                                        t5Var9.D0(null, true);
                                        t5Var9.d0(kVar2);
                                    }
                                    org.telegram.ui.ActionBar.o1 o1Var8 = t5Var9.D1;
                                    if (o1Var8 != null && o1Var8.isShowing()) {
                                        t5Var9.D1.d(true);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(textView4, i7.f6.n(-2, 44));
                }
                int i18 = 0;
                while (i18 < linearLayout.getChildCount()) {
                    View childAt = linearLayout.getChildAt(i18);
                    int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, h5Var);
                    int i19 = 8;
                    int i20 = i18 == 0 ? 8 : 0;
                    int i21 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    int i22 = i18 == linearLayout.getChildCount() - 1 ? 8 : 0;
                    if (i18 != 0) {
                        i19 = 0;
                    }
                    childAt.setBackground(org.telegram.ui.ActionBar.g6.a0(v02, i20, i21, i22, i19));
                    i18++;
                }
                t5Var.E1.addView(linearLayout);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                linearLayout.setLayoutParams(layoutParams);
                break;
        }
    }
}
