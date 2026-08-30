package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ((org.telegram.ui.ng) obj).run();
                break;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                break;
            case 2:
                AndroidUtilities.hideKeyboard((a4) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).I0 = null;
                break;
            case 4:
                ((li) obj).w2 = false;
                break;
            case 5:
                vt.i((vt) obj);
                break;
            case 6:
                float[] fArr = FragmentContextView.J0;
                ((FragmentContextView) obj).c(false);
                break;
            case 7:
                on0.E = null;
                ((View) obj).requestFocus();
                break;
            case 8:
                AndroidUtilities.hideKeyboard((in0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((b11) obj).d;
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
