package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.kg) obj).run();
                break;
            case 1:
                AndroidUtilities.hideKeyboard((e5) obj);
                break;
            case 2:
                AndroidUtilities.hideKeyboard((f4) obj);
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
                iu.i((iu) obj);
                break;
            case 7:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                break;
            case 8:
                jo0.H = null;
                ((View) obj).requestFocus();
                break;
            case 9:
                AndroidUtilities.hideKeyboard((do0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((z11) obj).d;
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
