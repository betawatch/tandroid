package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u extends o39 {
    public final /* synthetic */ ThemeEditorView.EditorAlert f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f3 = editorAlert;
    }

    @Override // o39
    public final boolean F0(float f) {
        return f >= ((float) ((gl.L(48.0f) + this.f3.y1) + gl.m));
    }
}
