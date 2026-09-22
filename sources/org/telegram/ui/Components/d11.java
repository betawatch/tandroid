package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d11 extends ll0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.X2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean E0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.X2.E) + AndroidUtilities.statusBarHeight));
    }
}
