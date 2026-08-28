package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                ((org.telegram.ui.jg) obj).run();
                break;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                break;
            case 2:
                AndroidUtilities.hideKeyboard((z3) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).H0 = null;
                break;
            case 4:
                ((ki) obj).v2 = false;
                break;
            case 5:
                mt.i((mt) obj);
                break;
            case 6:
                float[] fArr = FragmentContextView.I0;
                ((FragmentContextView) obj).c(false);
                break;
            case 7:
                sm0.D = null;
                ((View) obj).requestFocus();
                break;
            case 8:
                AndroidUtilities.hideKeyboard((mm0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((e01) obj).d;
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
