package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n01 extends tk0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.e3 = editorAlert;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean E0(float f7) {
        return f7 >= ((float) ((org.telegram.messenger.i0.L(48.0f) + this.e3.v1) + org.telegram.messenger.i0.m));
    }
}
