package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n21 extends nm0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.f3 = editorAlert;
    }

    @Override // org.telegram.ui.Components.nm0
    public final boolean E0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.f3.E) + AndroidUtilities.statusBarHeight));
    }
}
