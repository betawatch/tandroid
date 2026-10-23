package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class e21 extends mm0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.Y2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean E0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.Y2.E) + AndroidUtilities.statusBarHeight));
    }
}
