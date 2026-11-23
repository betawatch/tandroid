package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                ((ti) obj).A4 = false;
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
                em0.I = null;
                ((View) obj).requestFocus();
                break;
            case 8:
                org.telegram.messenger.g0.v1((yl0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((oz0) obj).d;
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
