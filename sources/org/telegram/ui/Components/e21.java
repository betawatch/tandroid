package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
