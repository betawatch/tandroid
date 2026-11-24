// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e94 {
    public static volatile e94[] g = new e94[4];
    public static final Object[] h = new Object[4];
    public static he i;
    public final int a;
    public final LongSparseArray b = new LongSparseArray();
    public final LongSparseArray c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final a14 e = new a14((Object) this, (byte) 8);
    public boolean f;

    static {
        for (int i2 = 0; i2 < 4; i2++) {
            h[i2] = new Object();
        }
    }

    public e94(int i2) {
        this.a = i2;
    }

    public static e94 b(int i2) {
        e94 e94Var;
        e94 e94Var2 = g[i2];
        if (e94Var2 != null) {
            return e94Var2;
        }
        synchronized (h[i2]) {
            e94Var = g[i2];
            if (e94Var == null) {
                e94[] e94VarArr = g;
                e94 e94Var3 = new e94(i2);
                e94VarArr[i2] = e94Var3;
                e94Var = e94Var3;
            }
        }
        return e94Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k47 k47Var, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        TLRPC.TL_editFactCheck tL_editFactCheck;
        if (!TextUtils.isEmpty(tL_textWithEntities.text)) {
            TLRPC.TL_editFactCheck tL_editFactCheck2 = new TLRPC.TL_editFactCheck();
            tL_editFactCheck2.peer = oc7.r1(this.a).i1(k47.B0(k47Var.k));
            tL_editFactCheck2.msg_id = k47Var.e1();
            tL_editFactCheck2.text = tL_textWithEntities;
            tL_editFactCheck = tL_editFactCheck2;
        } else {
            if (z) {
                return;
            }
            TLRPC.TL_deleteFactCheck tL_deleteFactCheck = new TLRPC.TL_deleteFactCheck();
            tL_deleteFactCheck.peer = oc7.r1(this.a).i1(k47.B0(k47Var.k));
            tL_deleteFactCheck.msg_id = k47Var.e1();
            tL_editFactCheck = tL_deleteFactCheck;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        he heVar = new he(3, null, context);
        heVar.q(320L);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_editFactCheck, new rj1((Object) this, (Object) tL_textWithEntities, z, (Object) heVar, (byte) 6));
    }

    public final void c(Activity activity, ylb ylbVar, k47 k47Var) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message;
        d Q = LaunchActivity.Q();
        Activity W = gm.W(activity);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        final byte b = 1;
        final byte b2 = 0;
        boolean z = Q != null && (Q.getFragmentView() instanceof ela) && ((ela) Q.getFragmentView()).Q() > gm.L(20.0f);
        he[] heVarArr = new he[1];
        AlertDialog$Builder meVar = z ? new me(0, ylbVar, activity) : new AlertDialog$Builder(0, ylbVar, activity);
        TextView[] textViewArr = new TextView[1];
        boolean z2 = k47Var == null || (message = k47Var.k) == null || message.factcheck == null;
        String M0 = jb6.M0(2131750789, null);
        he heVar = meVar.a;
        heVar.S = M0;
        int i2 = this.a;
        int f = oc7.r1(i2).l4.W2.f();
        final a94 a94Var = new a94(activity, ylbVar, f, ylbVar);
        a94Var.s0 = true;
        boolean z3 = z2;
        a94Var.setOnEditorActionListener(new b94(this, a94Var, f, k47Var, z3, heVarArr, currentFocus));
        hs6.d0(i2).O(gm.F0(), true);
        a94Var.setTextSize(1, 18.0f);
        anb.X(a94Var, cmb.i5, ylbVar);
        anb.l(a94Var, 34, cmb.Ni, ylbVar);
        a94Var.setHintText(jb6.M0(2131750786, null));
        a94Var.setFocusable(true);
        a94Var.setInputType(147457);
        anb.F(a94Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        a94Var.setImeOptions(6);
        a94Var.setBackgroundDrawable(null);
        a94Var.setPadding(0, gm.L(6.0f), 0, gm.L(6.0f));
        TLRPC.TL_factCheck R0 = k47Var.R0();
        if (R0 != null && (tL_textWithEntities = R0.text) != null) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(tL_textWithEntities.text);
            k47.b(valueOf, R0.text.entities, false, true, false, false, 0);
            a94Var.setText(valueOf);
        }
        a94Var.addTextChangedListener(new c94(f, a94Var, textViewArr, R0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(a94Var, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        meVar.b();
        meVar.n(linearLayout);
        heVar.a = gm.L(292.0f);
        meVar.j(jb6.M0(2131751291, null), new sv1(this, a94Var, f, k47Var, z3));
        meVar.g(jb6.M0(2131752542, "Cancel"), new h64((byte) 8));
        if (z) {
            i = heVar;
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new i51(currentFocus, (byte) 1));
            i.setOnShowListener(new DialogInterface.OnShowListener() { // from class: z84
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b3 = b;
                    a94 a94Var2 = a94Var;
                    switch (b3) {
                        case 0:
                            a94Var2.requestFocus();
                            gm.E3(a94Var2);
                            break;
                        default:
                            a94Var2.requestFocus();
                            gm.E3(a94Var2);
                            break;
                    }
                }
            });
            i.q(250L);
        } else {
            heVarArr[0] = heVar;
            heVar.setOnDismissListener(new n1(a94Var, (byte) 20));
            heVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() { // from class: z84
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b3 = b2;
                    a94 a94Var2 = a94Var;
                    switch (b3) {
                        case 0:
                            a94Var2.requestFocus();
                            gm.E3(a94Var2);
                            break;
                        default:
                            a94Var2.requestFocus();
                            gm.E3(a94Var2);
                            break;
                    }
                }
            });
            heVarArr[0].show();
        }
        he heVar2 = heVarArr[0];
        heVar2.k0 = false;
        View c = heVar2.c(-1);
        if (c instanceof TextView) {
            textViewArr[0] = (TextView) c;
        }
        a94Var.setSelection(a94Var.getText().length());
    }
}
