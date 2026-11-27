package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
