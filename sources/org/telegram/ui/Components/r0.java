package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((org.telegram.ui.lg) obj).run();
                break;
            case 1:
                org.telegram.messenger.i0.v1((r4) obj);
                break;
            case 2:
                org.telegram.messenger.i0.v1((y3) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                break;
            case 4:
                ((bi) obj).w4 = false;
                break;
            case 5:
                kk kkVar = (kk) obj;
                kkVar.T0 = null;
                kkVar.S.post(new ek(kkVar, 2));
                break;
            case 6:
                mt mtVar = (mt) obj;
                mtVar.V1 = null;
                mtVar.requestFocus();
                break;
            case 7:
                float[] fArr = FragmentContextView.W0;
                ((FragmentContextView) obj).c(false);
                break;
            case 8:
                rm0.H = null;
                ((View) obj).requestFocus();
                break;
            case 9:
                org.telegram.messenger.i0.v1((lm0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((i01) obj).d;
                themeEditorView.n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.i0.x3(themeEditorView.j, themeEditorView.c, themeEditorView.i);
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
