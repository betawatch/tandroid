package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.vf) obj).run();
                break;
            case 1:
                org.telegram.messenger.g0.v1((a5) obj);
                break;
            case 2:
                org.telegram.messenger.g0.v1((h4) obj);
                break;
            case 3:
                ((si) obj).A4 = false;
                break;
            case 4:
                xk xkVar = (xk) obj;
                xkVar.U0 = null;
                xkVar.T.post(new rk(xkVar, 2));
                break;
            case 5:
                mt mtVar = (mt) obj;
                mtVar.b2 = null;
                mtVar.requestFocus();
                break;
            case 6:
                float[] fArr = FragmentContextView.X0;
                ((FragmentContextView) obj).c(false);
                break;
            case 7:
                cm0.I = null;
                ((View) obj).requestFocus();
                break;
            case 8:
                org.telegram.messenger.g0.v1((wl0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((nz0) obj).d;
                themeEditorView.n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.w3(themeEditorView.j, themeEditorView.c, themeEditorView.i);
                    try {
                        themeEditorView.j.addView(themeEditorView.c, themeEditorView.i);
                        themeEditorView.e();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
