// default package

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class c3b {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, d dVar, ylb ylbVar) {
        int i = z8c.t0;
        Context context = dVar.getContext();
        px3 px3Var = new px3(ylbVar, context, true, false);
        px3Var.y1 = new yg(i, context, tL_messages_stickerSet);
        if (dVar.visibleDialog != null) {
            px3Var.show();
        } else {
            dVar.showDialog(px3Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, ylb ylbVar, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
            String M0 = jb6.M0(2131744548, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131744549, null);
            alertDialog$Builder.j(jb6.M0(2131751535, null), new xr8(runnable, stickerSet, (byte) 21));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            heVar.show();
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, ylbVar);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, ylb ylbVar, Context context, jac jacVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        boolean z = stickerSet != null;
        String M0 = jb6.M0(z ? 2131751159 : 2131748019, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131744553, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(gm.L(24.0f), 0, gm.L(20.0f), 0);
        a3b a3bVar = new a3b(context);
        int i = cmb.i5;
        anb.X(a3bVar, i, ylbVar);
        a3bVar.setInputType(16385);
        a3bVar.setTextSize(1, 16.0f);
        anb.X(a3bVar, i, ylbVar);
        anb.l(a3bVar, 36, cmb.lg, ylbVar);
        anb.l(a3bVar, 35, cmb.K6, ylbVar);
        a3bVar.setSingleLine(true);
        a3bVar.setFocusable(true);
        a3bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new s42(a3bVar, (byte) 2)});
        anb.F(a3bVar, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        a3bVar.setImeOptions(6);
        a3bVar.setBackground(null);
        a3bVar.requestFocus();
        a3bVar.setPadding(gm.L(jb6.a0 ? 28.0f : 0.0f), 0, gm.L(jb6.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(a3bVar);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(cmb.w0(null, cmb.A6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, qoe.d(26, 20.0f, (jb6.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        a3bVar.addTextChangedListener(new b3b(numberTextView, a3bVar));
        if (z) {
            a3bVar.setText(stickerSet.title);
            a3bVar.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        heVar.H = (byte) 4;
        alertDialog$Builder.j(jb6.M0(z ? 2131751291 : 2131751690, null), new wg(a3bVar, jacVar, context, z));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new wta(a3bVar, (byte) 7));
        he o = alertDialog$Builder.o();
        o.k0 = false;
        a3bVar.setOnEditorActionListener(new dp9(o, (byte) 1));
    }
}
