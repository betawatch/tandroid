package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.xg) obj).run();
                break;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                break;
            case 2:
                AndroidUtilities.hideKeyboard((h4) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                break;
            case 4:
                ((vi) obj).C2 = false;
                break;
            case 5:
                cl clVar = (cl) obj;
                clVar.Q0 = null;
                clVar.P.post(new wk(clVar, 2));
                break;
            case 6:
                nu.i((nu) obj);
                break;
            case 7:
                float[] fArr = FragmentContextView.Q0;
                ((FragmentContextView) obj).c(false);
                break;
            case 8:
                ko0.H = null;
                ((View) obj).requestFocus();
                break;
            case 9:
                AndroidUtilities.hideKeyboard((eo0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((a21) obj).d;
                themeEditorView.l = null;
                if (themeEditorView.b != null) {
                    AndroidUtilities.setPreferredMaxRefreshRate(themeEditorView.h, themeEditorView.a, themeEditorView.g);
                    try {
                        themeEditorView.h.addView(themeEditorView.a, themeEditorView.g);
                        themeEditorView.d();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
