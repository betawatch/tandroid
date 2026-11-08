package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0(Object obj, int i7) {
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
                org.telegram.messenger.g0.v1((u4) obj);
                break;
            case 2:
                org.telegram.messenger.g0.v1((b4) obj);
                break;
            case 3:
                ((ChatActivityEnterView) obj).L0 = null;
                break;
            case 4:
                ((di) obj).w4 = false;
                break;
            case 5:
                ik ikVar = (ik) obj;
                ikVar.T0 = null;
                ikVar.S.post(new ck(ikVar, 2));
                break;
            case 6:
                zs zsVar = (zs) obj;
                zsVar.V1 = null;
                zsVar.requestFocus();
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
