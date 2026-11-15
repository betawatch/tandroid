package org.telegram.ui.Components;

import android.content.DialogInterface;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((org.telegram.ui.uf) obj).run();
                break;
            case 1:
                org.telegram.messenger.g0.v1((s4) obj);
                break;
            case 2:
                org.telegram.messenger.g0.v1((z3) obj);
                break;
            case 3:
                ((ki) obj).A4 = false;
                break;
            case 4:
                qk qkVar = (qk) obj;
                qkVar.U0 = null;
                qkVar.T.post(new kk(qkVar, 2));
                break;
            case 5:
                ft ftVar = (ft) obj;
                ftVar.b2 = null;
                ftVar.requestFocus();
                break;
            case 6:
                float[] fArr = FragmentContextView.X0;
                ((FragmentContextView) obj).c(false);
                break;
            case 7:
                ul0.I = null;
                ((View) obj).requestFocus();
                break;
            case 8:
                org.telegram.messenger.g0.v1((ol0) obj);
                break;
            default:
                ThemeEditorView themeEditorView = ((gz0) obj).d;
                themeEditorView.n = null;
                if (themeEditorView.d != null) {
                    org.telegram.messenger.g0.x3(themeEditorView.j, themeEditorView.c, themeEditorView.i);
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
