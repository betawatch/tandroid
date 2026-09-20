package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class r11 extends vl0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.X2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean F0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.X2.E) + AndroidUtilities.statusBarHeight));
    }
}
