package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class jz0 extends pj0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.e3 = editorAlert;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean E0(float f10) {
        return f10 >= ((float) ((org.telegram.messenger.g0.L(48.0f) + this.e3.v1) + org.telegram.messenger.g0.m));
    }
}
