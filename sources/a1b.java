// default package

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.NumberTextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class a1b {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, d dVar, wjb wjbVar) {
        int i = y6c.t0;
        Context context = dVar.getContext();
        ew3 ew3Var = new ew3(wjbVar, context, true, false);
        ew3Var.y1 = new zf(i, context, tL_messages_stickerSet);
        if (dVar.visibleDialog != null) {
            ew3Var.show();
        } else {
            dVar.showDialog(ew3Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, wjb wjbVar, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
            String M0 = k96.M0(2131744622, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131744623, null);
            alertDialog$Builder.j(k96.M0(2131751586, null), new kq8(runnable, stickerSet, (byte) 20));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            hdVar.show();
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, wjbVar);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, wjb wjbVar, Context context, i8c i8cVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        boolean z = stickerSet != null;
        String M0 = k96.M0(z ? 2131751210 : 2131748070, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131744627, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(gl.L(24.0f), 0, gl.L(20.0f), 0);
        y0b y0bVar = new y0b(context);
        int i = bkb.i5;
        zkb.X(y0bVar, i, wjbVar);
        y0bVar.setInputType(16385);
        y0bVar.setTextSize(1, 16.0f);
        zkb.X(y0bVar, i, wjbVar);
        zkb.l(y0bVar, 36, bkb.lg, wjbVar);
        zkb.l(y0bVar, 35, bkb.K6, wjbVar);
        y0bVar.setSingleLine(true);
        y0bVar.setFocusable(true);
        y0bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new g32(y0bVar, (byte) 2)});
        zkb.F(y0bVar, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        y0bVar.setImeOptions(6);
        y0bVar.setBackground(null);
        y0bVar.requestFocus();
        y0bVar.setPadding(gl.L(k96.a0 ? 28.0f : 0.0f), 0, gl.L(k96.a0 ? 0.0f : 28.0f), 0);
        frameLayout.addView(y0bVar);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(bkb.w0(null, bkb.A6, false));
        numberTextView.setImportantForAccessibility(2);
        frameLayout.addView(numberTextView, nme.d(26, 20.0f, (k96.a0 ? 3 : 5) | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        y0bVar.addTextChangedListener(new z0b(numberTextView, y0bVar));
        if (z) {
            y0bVar.setText(stickerSet.title);
            y0bVar.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        hdVar.H = (byte) 4;
        alertDialog$Builder.j(k96.M0(z ? 2131751342 : 2131751741, null), new xf(y0bVar, i8cVar, context, z));
        alertDialog$Builder.g(k96.M0(2131752577, null), new hza(y0bVar, (byte) 3));
        hd o = alertDialog$Builder.o();
        o.k0 = false;
        y0bVar.setOnEditorActionListener(new cn9(o, (byte) 1));
    }
}
