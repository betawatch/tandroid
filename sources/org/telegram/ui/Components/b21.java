package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class b21 extends jm0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b21(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.V2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.jm0
    public final boolean E0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.V2.E) + AndroidUtilities.statusBarHeight));
    }
}
