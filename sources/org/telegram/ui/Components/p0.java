package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((org.telegram.ui.tf) obj).run();
                break;
            case 1:
                org.telegram.messenger.g0.v1((s4) obj);
                break;
            case 2:
                org.telegram.messenger.g0.v1((z3) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).M0 = null;
                break;
            case 4:
                ((bi) obj).x4 = false;
                break;
            case 5:
                hk hkVar = (hk) obj;
                hkVar.U0 = null;
                hkVar.T.post(new bk(hkVar, 2));
                break;
            case 6:
                xs xsVar = (xs) obj;
                xsVar.W1 = null;
                xsVar.requestFocus();
                break;
            case 7:
                float[] fArr = FragmentContextView.X0;
                ((FragmentContextView) obj).c(false);
                break;
            case 8:
                tl0.I = null;
                ((View) obj).requestFocus();
                break;
            case 9:
                org.telegram.messenger.g0.v1((nl0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((dz0) obj).d;
                themeEditorView.n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.y3(themeEditorView.j, themeEditorView.c, themeEditorView.i);
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
