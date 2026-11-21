package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.vf) obj).run();
                break;
            case 1:
                org.telegram.messenger.g0.v1((b5) obj);
                break;
            case 2:
                org.telegram.messenger.g0.v1((i4) obj);
                break;
            case 3:
                ((ui) obj).A4 = false;
                break;
            case 4:
                zk zkVar = (zk) obj;
                zkVar.U0 = null;
                zkVar.T.post(new tk(zkVar, 2));
                break;
            case 5:
                ot otVar = (ot) obj;
                otVar.b2 = null;
                otVar.requestFocus();
                break;
            case 6:
                float[] fArr = FragmentContextView.X0;
                ((FragmentContextView) obj).c(false);
                break;
            case 7:
                em0.I = null;
                ((View) obj).requestFocus();
                break;
            case 8:
                org.telegram.messenger.g0.v1((yl0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((pz0) obj).d;
                themeEditorView.n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.w3(themeEditorView.j, themeEditorView.c, themeEditorView.i);
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
