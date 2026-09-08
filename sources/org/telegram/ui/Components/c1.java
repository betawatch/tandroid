package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.ug) obj).run();
                break;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) obj);
                break;
            case 2:
                AndroidUtilities.hideKeyboard((f4) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                break;
            case 4:
                ((vi) obj).z2 = false;
                break;
            case 5:
                zt.i((zt) obj);
                break;
            case 6:
                float[] fArr = FragmentContextView.M0;
                ((FragmentContextView) obj).c(false);
                break;
            case 7:
                hn0.H = null;
                ((View) obj).requestFocus();
                break;
            case 8:
                AndroidUtilities.hideKeyboard((bn0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((x01) obj).d;
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
