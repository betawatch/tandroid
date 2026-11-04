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
import org.telegram.ui.Components.qt0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x6 {
    public static volatile x6[] g = new x6[4];
    public static final Object[] h = new Object[4];
    public static org.telegram.ui.ActionBar.s1 i;
    public final int a;
    public final LongSparseArray b = new LongSparseArray();
    public final LongSparseArray c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final a e = new a(this, 7);
    public boolean f;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            h[i3] = new Object();
        }
    }

    public x6(int i3) {
        this.a = i3;
    }

    public static x6 b(int i3) {
        x6 x6Var;
        x6 x6Var2 = g[i3];
        if (x6Var2 != null) {
            return x6Var2;
        }
        synchronized (h[i3]) {
            try {
                x6Var = g[i3];
                if (x6Var == null) {
                    x6[] x6VarArr = g;
                    x6 x6Var3 = new x6(i3);
                    x6VarArr[i3] = x6Var3;
                    x6Var = x6Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(zi ziVar, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (!TextUtils.isEmpty(tL_textWithEntities.text)) {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = hp.s1(this.a).j1(zi.B0(ziVar.k));
            tL_editFactCheck2.msg_id = ziVar.f1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        } else {
            if (z10) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = hp.s1(this.a).j1(zi.B0(ziVar.k));
            tL_deleteFactCheck.msg_id = ziVar.f1();
            tL_editFactCheck = tL_deleteFactCheck;
        }
        Context context = LaunchActivity.K1;
        if (context == null) {
            context = t0.b;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
        s1Var.r(320L);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_editFactCheck, new ci.o3(this, tL_textWithEntities, z10, s1Var, 2));
    }

    public final void c(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, zi ziVar) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        Activity W = g0.W(activity);
        final View currentFocus = W != null ? W.getCurrentFocus() : null;
        final int i3 = 1;
        final int i10 = 0;
        boolean z10 = Q != null && (Q.getFragmentView() instanceof qt0) && ((qt0) Q.getFragmentView()).Q() > g0.L(20.0f);
        org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
        AlertDialog$Builder u1Var = z10 ? new org.telegram.ui.ActionBar.u1(0, activity, e6Var) : new AlertDialog$Builder(0, activity, e6Var);
        TextView[] textViewArr = new TextView[1];
        boolean z11 = ziVar == null || (message = ziVar.k) == null || message.factcheck == null;
        String M0 = bd.M0(2131750853, null);
        org.telegram.ui.ActionBar.s1 s1Var = u1Var.a;
        s1Var.S = M0;
        int i11 = this.a;
        int i12 = hp.s1(i11).Q5;
        final t6 t6Var = new t6(activity, e6Var, i12, e6Var);
        t6Var.s0 = true;
        boolean z12 = z11;
        t6Var.setOnEditorActionListener(new u6(this, t6Var, i12, ziVar, z12, s1VarArr, currentFocus));
        li.b0(i11).M(g0.G0(), true);
        t6Var.setTextSize(1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(t6Var, org.telegram.ui.ActionBar.k6.j5, e6Var);
        org.telegram.ui.ActionBar.r6.m(t6Var, 34, org.telegram.ui.ActionBar.k6.Li, e6Var);
        t6Var.setHintText(bd.M0(2131750850, null));
        t6Var.setFocusable(true);
        t6Var.setInputType(147457);
        org.telegram.ui.ActionBar.r6.G(t6Var, org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, e6Var);
        t6Var.setImeOptions(6);
        t6Var.setBackgroundDrawable(null);
        t6Var.setPadding(0, g0.L(6.0f), 0, g0.L(6.0f));
        TLRPC.TL_factCheck R0 = ziVar.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            zi.b(valueOf, R0.text.entities, false, true, false, false, 0);
            t6Var.setText(valueOf);
        }
        t6Var.addTextChangedListener(new v6(i12, t6Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(t6Var, b8.mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        u1Var.c();
        u1Var.o(linearLayout);
        s1Var.a = g0.L(292.0f);
        u1Var.k(bd.M0(2131751355, null), new r6(this, t6Var, i12, ziVar, z12));
        u1Var.h(bd.M0(2131752589, "Cancel"), new o4.v0(12));
        if (z10) {
            i = s1Var;
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.s6
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            x6.i = null;
                            currentFocus.requestFocus();
                            break;
                        default:
                            g0.v1((t6) currentFocus);
                            break;
                    }
                }
            });
            i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.messenger.p6
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i3) {
                        case 0:
                            t6 t6Var2 = t6Var;
                            t6Var2.requestFocus();
                            g0.K3(t6Var2);
                            break;
                        default:
                            t6 t6Var3 = t6Var;
                            t6Var3.requestFocus();
                            g0.K3(t6Var3);
                            break;
                    }
                }
            });
            i.r(250L);
        } else {
            s1VarArr[0] = s1Var;
            s1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.messenger.s6
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    switch (i3) {
                        case 0:
                            x6.i = null;
                            t6Var.requestFocus();
                            break;
                        default:
                            g0.v1((t6) t6Var);
                            break;
                    }
                }
            });
            s1VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: org.telegram.messenger.p6
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i10) {
                        case 0:
                            t6 t6Var2 = t6Var;
                            t6Var2.requestFocus();
                            g0.K3(t6Var2);
                            break;
                        default:
                            t6 t6Var3 = t6Var;
                            t6Var3.requestFocus();
                            g0.K3(t6Var3);
                            break;
                    }
                }
            });
            s1VarArr[0].show();
        }
        org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
        s1Var2.k0 = false;
        View d = s1Var2.d(-1);
        if (d instanceof TextView) {
            textViewArr[0] = (TextView) d;
        }
        t6Var.setSelection(t6Var.getText().length());
    }
}
