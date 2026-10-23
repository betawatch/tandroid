package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
