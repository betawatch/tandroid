package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a7 {
    public static volatile a7[] g = new a7[4];
    public static final Object[] h = new Object[4];
    public static org.telegram.ui.ActionBar.x1 i;
    public final int a;
    public final LongSparseArray b = new LongSparseArray();
    public final LongSparseArray c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final a e = new a(this, 7);
    public boolean f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public a7(int i10) {
        this.a = i10;
    }

    public static a7 b(int i10) {
        a7 a7Var;
        a7 a7Var2 = g[i10];
        if (a7Var2 != null) {
            return a7Var2;
        }
        synchronized (h[i10]) {
            try {
                a7Var = g[i10];
                if (a7Var == null) {
                    a7[] a7VarArr = g;
                    a7 a7Var3 = new a7(i10);
                    a7VarArr[i10] = a7Var3;
                    a7Var = a7Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(jj jjVar, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (!TextUtils.isEmpty(tL_textWithEntities.text)) {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = vp.r1(this.a).i1(jj.B0(jjVar.k));
            tL_editFactCheck2.msg_id = jjVar.f1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        } else {
            if (z10) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = vp.r1(this.a).i1(jj.B0(jjVar.k));
            tL_deleteFactCheck.msg_id = jjVar.f1();
            tL_editFactCheck = tL_deleteFactCheck;
        }
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = w0.b;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, context, null);
        x1Var.r(320L);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_editFactCheck, new s6(this, tL_textWithEntities, z10, x1Var, 0));
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, jj jjVar) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        Activity W = i0.W(activity);
        final View currentFocus = W != null ? W.getCurrentFocus() : null;
        final int i10 = 1;
        final int i11 = 0;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof uu0) && ((uu0) Q.getFragmentView()).Q() > i0.L(20.0f);
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        AlertDialog$Builder a2Var = z10 ? new org.telegram.ui.ActionBar.a2(0, activity, p6Var) : new AlertDialog$Builder(0, activity, p6Var);
        TextView[] textViewArr = new TextView[1];
        boolean z11 = jjVar == null || (message = jjVar.k) == null || message.factcheck == null;
        String L0 = cd.L0(2131750853, null);
        org.telegram.ui.ActionBar.x1 x1Var = a2Var.a;
        x1Var.R = L0;
        int i12 = this.a;
        int i13 = vp.r1(i12).R5;
        final w6 w6Var = new w6(activity, p6Var, i13, p6Var);
        w6Var.r0 = true;
        boolean z12 = z11;
        w6Var.setOnEditorActionListener(new x6(this, w6Var, i13, jjVar, z12, x1VarArr, currentFocus));
        ui.b0(i12).M(i0.G0(), true);
        w6Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.a7.V(w6Var, org.telegram.ui.ActionBar.t6.j5, p6Var);
        org.telegram.ui.ActionBar.a7.m(w6Var, 34, org.telegram.ui.ActionBar.t6.Li, p6Var);
        w6Var.setHintText(cd.L0(2131750850, null));
        w6Var.setFocusable(true);
        w6Var.setInputType(147457);
        org.telegram.ui.ActionBar.a7.G(w6Var, org.telegram.ui.ActionBar.t6.k6, org.telegram.ui.ActionBar.t6.l6, org.telegram.ui.ActionBar.t6.p7, p6Var);
        w6Var.setImeOptions(6);
        w6Var.setBackgroundDrawable(null);
        w6Var.setPadding(0, i0.L(6.0f), 0, i0.L(6.0f));
        TLRPC.TL_factCheck R0 = jjVar.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            jj.b(valueOf, R0.text.entities, false, true, false, false, 0);
            w6Var.setText(valueOf);
        }
        w6Var.addTextChangedListener(new y6(i13, w6Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(w6Var, w7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        a2Var.c();
        a2Var.o(linearLayout);
        x1Var.a = i0.L(292.0f);
        a2Var.k(cd.L0(2131751355, null), new u6(this, w6Var, i13, jjVar, z12));
        a2Var.h(cd.L0(2131752589, "Cancel"), new m4.v0(29));
        if (z10) {
            i = x1Var;
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.v6
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            a7.i = null;
                            currentFocus.requestFocus();
                            break;
                        default:
                            i0.v1((w6) currentFocus);
                            break;
                    }
                }
            });
            i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.messenger.q6
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            w6 w6Var2 = w6Var;
                            w6Var2.requestFocus();
                            i0.J3(w6Var2);
                            break;
                        default:
                            w6 w6Var3 = w6Var;
                            w6Var3.requestFocus();
                            i0.J3(w6Var3);
                            break;
                    }
                }
            });
            i.r(250L);
        } else {
            x1VarArr[0] = x1Var;
            x1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.v6
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            a7.i = null;
                            w6Var.requestFocus();
                            break;
                        default:
                            i0.v1((w6) w6Var);
                            break;
                    }
                }
            });
            x1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.messenger.q6
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i11) {
                        case 0:
                            w6 w6Var2 = w6Var;
                            w6Var2.requestFocus();
                            i0.J3(w6Var2);
                            break;
                        default:
                            w6 w6Var3 = w6Var;
                            w6Var3.requestFocus();
                            i0.J3(w6Var3);
                            break;
                    }
                }
            });
            x1VarArr[0].show();
        }
        org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr[0];
        x1Var2.j0 = false;
        View d = x1Var2.d(-1);
        if (d instanceof TextView) {
            textViewArr[0] = (TextView) d;
        }
        w6Var.setSelection(w6Var.getText().length());
    }
}
