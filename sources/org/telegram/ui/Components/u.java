package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class u extends d79 {
    public final /* synthetic */ ThemeEditorView.EditorAlert f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f3 = editorAlert;
    }

    @Override // d79
    public final boolean G0(float f) {
        return f >= ((float) ((hl.L(48.0f) + this.f3.y1) + hl.m));
    }
}
