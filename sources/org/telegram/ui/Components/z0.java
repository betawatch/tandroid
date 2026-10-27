package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ig) obj).run();
                break;
            case 1:
                AndroidUtilities.hideKeyboard((f5) obj);
                break;
            case 2:
                AndroidUtilities.hideKeyboard((h4) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                break;
            case 4:
                ((ti) obj).F2 = false;
                break;
            case 5:
                al alVar = (al) obj;
                alVar.T0 = null;
                alVar.S.post(new uk(alVar, 2));
                break;
            case 6:
                ju.i((ju) obj);
                break;
            case 7:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                break;
            case 8:
                po0.H = null;
                ((View) obj).requestFocus();
                break;
            case 9:
                AndroidUtilities.hideKeyboard((jo0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((i21) obj).d;
                themeEditorView.n = null;
                if (themeEditorView.d != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.j, themeEditorView.c, themeEditorView.i);
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
