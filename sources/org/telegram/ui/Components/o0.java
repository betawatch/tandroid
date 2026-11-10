package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.xf) obj).run();
                break;
            case 1:
                org.telegram.messenger.g0.v1((t4) obj);
                break;
            case 2:
                org.telegram.messenger.g0.v1((a4) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                break;
            case 4:
                ((ci) obj).z4 = false;
                break;
            case 5:
                hk hkVar = (hk) obj;
                hkVar.T0 = null;
                hkVar.S.post(new bk(hkVar, 2));
                break;
            case 6:
                ys ysVar = (ys) obj;
                ysVar.V1 = null;
                ysVar.requestFocus();
                break;
            case 7:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                break;
            case 8:
                ql0.H = null;
                ((View) obj).requestFocus();
                break;
            case 9:
                org.telegram.messenger.g0.v1((kl0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((ez0) obj).d;
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
