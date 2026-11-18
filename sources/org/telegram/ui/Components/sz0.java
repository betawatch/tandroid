package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class sz0 extends ck0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f3 = editorAlert;
    }

    @Override // org.telegram.ui.Components.ck0
    public final boolean E0(float f10) {
        return f10 >= ((float) ((org.telegram.messenger.g0.L(48.0f) + this.f3.z1) + org.telegram.messenger.g0.m));
    }
}
